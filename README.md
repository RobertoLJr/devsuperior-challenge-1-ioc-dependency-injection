# DESAFIO: Componentes e injeção de dependência

Projeto simples com Java e Spring Boot para prática de conceitos de **Inversão de Controle** e **Injeção de Dependência**.

## Desafio

O sistema implementado deve calcular o **valor total** de um pedido, considerando uma
porcentagem de desconto e o frete. O cálculo do **valor total** do pedido consiste em
aplicar o desconto ao valor básico do pedido e adicionar o valor do frete.

### Regras de Frete

|  Valor Básico do Pedido (R$)  | Frete (R$) |
|:-----------------------------:|:----------:|
|         Abaixo de 100         |     20     |
| Entre 100 e 200 (não incluso) |     12     |
|          200 e acima          |   Grátis   |

## Implementação

- **Order**: Entidade com código, valor base e desconto.
- **OrderService**: Serviço contendo a lógica do valor total de um pedido.
  - Cálculos feitos com BigDecimal para maior precisão em valores monetários.
- **ShippingService**: Serviço contendo a lógica do valor do frete de um pedido.

## Exemplo de saída

```aiignore
Pedido código 1034
Valor total: R$ 132.0
```

## Tecnologias
- Java
- Spring Boot
- IoC/DI com componentes `@Service`.

---
_Desafio 01 da [Escola DevSuperior](https://devsuperior.com.br/)_