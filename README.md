# DEV-WEEK

Java RESTful API 

## Diagrama de Classes 

```mermaid
classDiagram
    class Usuario {
        - Long id
        - String name
        - Acount acount
        - Card card
        - List<Feature> features
        - List<News> news
    }

    class Acount {
        - Long id
        - String number
        - String agency
        - String balance
        - String limit
    }

    class Card {
        - Long id
        - String number
        - BigDecimal limit
    }

    class Feature {
        - Long id
        - String icon
        - String description
    }

    class News {
        - Long id
        - String icon
        - String description
    }

    Usuario "1" --> "1" Acount
    Usuario "1" --> "1" Card
    Usuario "1" --> "*" Feature
    Usuario "1" --> "*" News

```
