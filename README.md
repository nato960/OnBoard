# OndBoard

A kanban-style board management application with support for columns, cards, and blocking reasons. It allows full CRUD operations using JDBC, with MySQL as the relational database for data persistence.


## Diagrama de Classes

``` mermaid
classDiagram

  class Board {
    +long id
    +String name
  }

  class BoardColumn {
    +long id
    +String name
    +String kind
    +int order
  }

  class Card {
    +long id
    +String title
    +String description
    +OffsetDateTime createdAt
  }

  class Block {
    +long id
    +String blockCause
    +OffsetDateTime blockln
    +String unBlockCause
    +OffsetDateTime unBlockln
  }

  %% --- Relacionamentos ---
  Board "1" --> "n" BoardColumn
  BoardColumn "1" --> "n" Card
  Card "1" --> "n" Block

```
