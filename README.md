# DEV-WEEK

Java RESTful API 

## Diagrama de Classes 

```mermaid

classDiagram
    class Usuario {
        - int id
        - string nome
        - string cpf
        - string email
        - Endereco endereco
        - Conta[] contas
    }

    class Endereco {
        - string logradouro
        - string numero
        - string bairro
        - string cidade
        - string estado
        - string cep
    }

    class Conta {
        - string numero
        - string tipo
        - float saldo
        + depositar(valor: float): void
        + sacar(valor: float): boolean
    }

    class ContaCorrente {
        - float limiteChequeEspecial
        + calcularTaxaManutencao(): float
    }

    class ContaPoupanca {
        - float taxaRendimento
        + calcularRendimento(): float
    }

    class Transacao {
        - int id
        - string tipo
        - float valor
        - string descricao
        - Date data
    }

    Usuario "1" *-- "1..*" Conta
    Usuario "1" --> "1" Endereco
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Transacao "1" --> "1..2" Conta
```
