# Pagination

Pagination in GraphQL has a well-defined pattern called "Connections" for
objects with a "-to-many" relationship and for top-level queries. This standard
allows for implementation-specific cursors to allow for paging info, saving
server-side processing by reducing the need to re-execute queries with custom
filters. This pattern does not allow users to jump to specific pages, but
instead scan a list in an infini-scroll style.

[For more detailed information, see the specification via Relay.][connection-spec]

The specification allows for an arbitrary cursor type. For most applications, I
recommend using `String` types, as it allows for any information to be encoded
within the cursor, including WHERE clauses or lookups to the stored result set.

## Implementation

Implementation involves:
- a shared `PageInfo` type
- shared filter input types for scalars
- a field on the source object to provide the linked objects with parameters for
  the filter and paging
    - `filter` parameter of custom `FilterInput` type
    - `first` parameter of `Int` type
    - `after` parameter of cursor type
    - `last` parameter of `Int` type
    - `before` parameter of cursor type
- a custom filter input for the linked object type
- a custom "Connection" type
- a custom "Edge" type

Each target object type only needs one connection, edge, and filter type.

### Connection type

The connection is essentially the "paginated list" type. It includes a list of
the objects, called "edges", and the pagination info.

### Edge type

The Edge type represents each edge in the graph model; since additional cursor
information may be requested, a type to represent the edge is provided. 

## Client implementation

Clients call the field in one of the following ways:

- Provide `filter` and `first` to get the first N entries that match `filter`.
- Provide `filter` and `last` to get the last N entries that match `filter`.
- Provide `first` and `after` to get the next N entries that match the
  previously provided `filter` after the indicated object.
- Provide `last` and `before` to get the previous N entries that match the
  previously provided `filter` before the indicated object.

Clients should request the desired data from each Edge Node, the data they need
from the pagination info, and any cursors that may be used.

## Template use

In the template document, `ConnectedToExample` is the type that has a link to
many `Example` objects.

- Copy the field from the `ConnectedToExample` type and rename appropriately
- If this is the first time creating a paginated field for the type, copy the
  `ExampleFilterInput`, `ExampleConnection`, and `ExampleEdge`, replacing
  `Example` with the name of the actual type.

[connection-spec]: https://relay.dev/graphql/connections.htm#sec-Connection-Types.Fields
