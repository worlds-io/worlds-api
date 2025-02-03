# Worlds Public API Schema

This repository defines the schema for the Worlds Public API

## Repository Structure

The APIs are expected to be a separate[ layer that works on top of the
business logic layer][graphql-bll]. Therefore, each API type should have its own folder.

The `./graphql` directory contains all the schema elements. There are various `.graphqls` files
at the roof of the `/api` subdirectory that define basic primitives that are used across the schema.

Each API type should have its own `./graphql/api/domain/<api-type>` folder.

Within each `domain` folder, the structure should be:

- `./<api-type>.graphqls`: The types and inputs that represent the object
- `./filter.graphqls`: Any filters that are used in this API's mutations and subscriptions
- `./query.graphqls`: Any queries defined for the API
- `./mutation.graphqls`: Any mutations defined for the API
- `./subscription.graphqls`: Any subscriptions defined for the API
- `./util.graphqls`: Any miscellaneous or auxiliary inputs and types needed by the API.

## Development

A few considerations must be taken into account when modifying the schema in order to provide 
our clients with a painless development experience.

### Committing Changes

The change log in our developer portal is built off of the commit messages in this repository. In order to provide a 
useful description of all the changes to the schema, please ensure to commit often and appropriately.

When committing, the following format should be used to ensure the change log displays your change correctly:

```
git commit -m "<type>(!): <description>"
```

For the time being the `type` tag should be one of two values:
* `feat`: A new feature or element is introduced to the schema
* `fix`: An existing feature or element was modified

Optionally, the `!` character can be specified after the type signify a breaking change.

The description clearly describe the change that was made to the schema. Please specify what type of element was 
updated (`field`, `type`, `input`, `enum`, `query`, `mutation`, etc.)

Examples:
```
git commit -m "feat: Add 'User' type"
git commit -m "feat: Add 'email' field to 'User' type"
git commit -m "feat: Add 'users' query"
git commit -m "feat: Add 'email' argument to 'users' query"

git commit -m "fix: Make 'phoneNumber' field in 'User' type nullable
git commit -m "fix: Deprecate 'emailAddress' field in 'User' type
git commit -m "fix!: Remove 'emailAddress' field in 'User' type
git commit -m "fix!: Remove `users` query
```

If you must commit a change that doesn't fall under one of the above categories, simply commit your message without 
the `fix:` or `feat:` prefixes. We can provide support for more tags in the future if need be.

### Breaking Changes

Introducing breaking changes into the schema can disrupt our clients processes that have 
been built against the Public API. These types of changes must be made carefully and safely to prevent
disruptions.

Breaking Changes include and are not limited to:
- Renaming an element of the schema
- Removing an element of the schema
- Making a previously nullable argument or input non-nullable


#### Deprecation
To deprecate an element, mark it by adding an `@deprecated` directive to the element that is being modified and include 
a reason. The reason should consist of three parts:
* A reference to the element that is being deprecated.
* A reference to the element that will replace this element (if applicable).
* A date six months in the future, indicating when this element will be removed


Example:
```graphql
   type User {
        id: String!
        email: String!
        emailAddress: String! @deprecated(reason: "The 'emailAddress' field in the 'User' type is deprecated and will be removed on 01/01/2026. Please use the 'email' field in the 'User' type instead") 
   }
  ```

Please ensure that the underlying implementation can still support the deprecated element until it is removed.
  
When it is time to remove the deprecated element, be sure to take the necessary steps to ensure that the element is no 
longer being used by our clients. Once that is done, remove it if possible or extend the removal deadline.

#### Removing Elements
When removing an element, simply mark the element for deprecation using the guidelines mentioned above. 

#### Renaming Elements
When renaming an element, introduce the renamed element as a new element and mark the old one for deprecation. 
Use the example provided above for reference.

#### Requiring Previously Non-Required Elements
Making previously nullable elements non-nullable is a breaking change. This could mean that a previously optional argument
in a query or a mutation _must_ be provided now. It could also mean that a previously nullable return value will now 
always return a value. This is the hardest breaking change to safely introduce because it's usually not feasible to rename 
the element as a non-nullable field.

In order to safely introduce this change, mark the element for deprecation and use the reason to express that this element
will soon be required.

Example:
```graphql
   input CreateUserInput {
        id: String!
        phoneNumber: String @deprecated(reason: "The 'phoneNumber' field in the 'CreateUserInput' input will be a required field starting on 01/01/2026. Please provide a `phoneNumber` value.")
   }
  ```

Please ensure that the underlying implementation can still support a `null` value by defaulting to an appropriate value if
one isn't provided. 

## Documentation

Our documentation repository is located at [worlds-io/public-api-portal](https://github.com/worlds-io/public-api-portal). 
Please be sure to correctly document every element that is introduced into the schema and update elements' 
documentation when they are modified.

[graphql-bll]: https://graphql.org/learn/thinking-in-graphs/#business-logic-layer