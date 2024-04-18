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
        - Feature[] features
        - News[] news
    }

    class Acount {
        - String number
        - String agency
        - String balance
        - Number limit
    }

    class Card {
        - String number
        - Number limit
    }

    class Feature {
        - String icon
        - String description
    }

    class News {
        - String icon
        - String description
    }

    Usuario "1" *-- "1" Acount
    Usuario "1" *-- "1" Card
    Usuario "1" *-- "*" Feature
    Usuario "1" *-- "*" News

```



## Tecnologias Utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-000?style=for-the-badge&logo=postgresql)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/SEUUSERNAME)

## Principais Tecnologias
- **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
- **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.
