# API Brainstorming and Definition

This repository is currently intended to be a location for brainstorming API
definitions, including a set of standards for use with the chosen API.

## Repository layout

The public APIs are expected to be a [separate layer that works on top of the
business logic layer][graphql-bll]. As a result, each API type should
have its own folder.

Within each API type, the structure would be:
- `./api` - The working concept for the API
- `./templates/*` - Templates for different patterns, since API specifications
  don't support generics.

[graphql-bll]: https://graphql.org/learn/thinking-in-graphs/#business-logic-layer
