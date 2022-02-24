# Comunicação entre microsserviços com gRPC

Configurações na nuvem usando Spring Cloud, explorando padrões e conceitos essenciais para,
um arquitetura baseada em Microsserviços efetiva. 
Na prática como os microsserviços tem revolucionado o desenvolvimento de aplicações


## O io.grpc
O gRPC é uma estrutura de chamada de procedimento remoto (RPC) de código aberto e de alto desempenho moderna que pode ser executada em qualquer ambiente. 
Ele pode conectar serviços de forma eficiente dentro e entre data centers com suporte conectável para balanceamento de carga, rastreamento, verificação de integridade e autenticação. 
Também é aplicável na última milha de computação distribuída para conectar dispositivos, aplicativos móveis e navegadores a serviços de back-end.
```java
syntax = "proto3";

 package com.avande.grpc;

 option java_multiple_files = true;
 option java_package = "com.avanade.grpc.product.lib";
 option java_outer_classname = "ProductProto";

 service ProductService {

 rpc ProductsByDescription(ProductRequest) returns (ProductResponse) {
 }

}
 message ProductRequest {
 string id = 1;
 string description = 2;
}

 message ProductResponse {
 string id = 1;
 string description = 2;
}
```

## Product Service com MongoDB
O Product Catalog é uma API Rest que fornece um catalogo de produtos salvos no MongoDB

## Cart Service
O Shopping Cart é uma API Rest  que se conecta ao Product Service por gRPC


# collection do postman

```sh
Microserviços com gRPC.postman_collection.json
```

## Docker

```sh
docker-compose -f docker-compose-elasticsearch-redis.yml up -d
```

### Conclusão
Vimos uma implementação simples de uma arquitetura de miscroserviços. Um padrão bem difundido e muito utilizado.
Em um ambiente de produção, é preciso também criar novos nós para o Load balance e utilizar pattern circuit breaker.



