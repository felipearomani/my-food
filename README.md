# MyFood

Este é um projeto pessoal para fins de teste de um projeto de pedido online de comida.

Este projeto é a API REST que fornece os dados para o forntend. 

## Instruções de uso

### Requisitos
1) Usar Java JDK 11

### Executar o o projeto
1) Faça o clone do repositório
2) Execute "mvn spring-boot:run"
3) Use os endpoints abaixo

### Executar os testes
Execute "mvn test"

## Endpoints

### Listagem de comidas
[GET] http://localhost:8080/foods

#### Query Parameters
| Parâmetro | Tipo  | Descrição |
|:---------:|:-----:|:---------:|
| page      | int   | Número da página para listar |
| size      | int   | Número de elementos na página |

#### Response 200 ok
```json
{
    "content": [
        {
            "name": "MCCHICKEN",
            "id": "1",
            "description": "Frango empanado e dourado com molho suave e cremoso, acompanhado de alface crocante num pão com gergelim.",
            "price": 14.9
        },
        {
            "name": "BIG TASTY",
            "id": "2",
            "description": "O maior hambúrguer de carne 100% bovina do McDonald’s, 3 deliciosas fatias de queijo, tomate, alface crocante, cebola e o saboroso molho tasty",
            "price": 21.9
        },
        {
            "name": "CHEDDAR MCMELT",
            "id": "3",
            "description": "Feito com carne bovina, delicioso queijo tipo cheddar derretido, cebola grelhada ao molho shoyu e para completar um pão escuro com gergelim.",
            "price": 14.9
        },
        {
            "name": "BIG MAC",
            "id": "4",
            "description": "Dois hambúrgueres, alface, queijo e molho especial, cebola e picles num pão com gergelim.",
            "price": 18.9
        }
    ],
    "pageable": {
        "sort": {
            "sorted": false,
            "unsorted": true,
            "empty": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "paged": true,
        "unpaged": false
    },
    "totalElements": 4,
    "totalPages": 1,
    "last": true,
    "size": 20,
    "first": true,
    "numberOfElements": 4,
    "number": 0,
    "sort": {
        "sorted": false,
        "unsorted": true,
        "empty": true
    },
    "empty": false
}
```

#### Response 404 
Caso não existe comidas cadastradas

```json
{}
```