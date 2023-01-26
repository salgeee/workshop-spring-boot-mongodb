# API Restful com Spring Boot e MongoDB (web services + NoSQL)
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/salgeee/workshop-spring-boot-mongodb/blob/main/LICENSE) 

# Sobre o projeto


Web Services com Spring Boot e MongoDB é uma API Restful , construída durante o curso Java COMPLETO 2023 Programação Orientada a Objetos + Projetos, evento ministrado por Nelio Alves pela [DevSuperior](https://devsuperior.com.br/ "Site da DevSuperior").

A aplicação consiste em um web service, onde é divido em camadas quais são, Resource Layer(rest controllers) recebe as requisições e respondem de acordo com o comportamento do sistema, existe também a Service Layer e a Data Access Layer, toda essa pilha de camadas conversa com as entidades do projeto, Post, User, Comments.

## Sobre o projeto na minha perspectiva
Primeira vez utilizando MongoDB, foi bem desafiador, adorei o primeiro contato com um banco de dados NoSQL. Gostei bastante desse desafio e da didática do Prof. Nelio Alves.


## Modelo de dominio 
![Modelo 1](https://raw.githubusercontent.com/salgeee/workshop-spring-boot-mongodb/main/assets/modelo.png) 


## Requisições
## Get
![Get](https://raw.githubusercontent.com/salgeee/workshop-spring-boot-mongodb/main/assets/Screenshot_1.png)
## Get by Id
![Get by id](https://raw.githubusercontent.com/salgeee/workshop-spring-boot-mongodb/main/assets/get%20by%20id.png)
## Post
![Post](https://raw.githubusercontent.com/salgeee/workshop-spring-boot-mongodb/main/assets/post.png)
## Delete
![Delete](https://raw.githubusercontent.com/salgeee/workshop-spring-boot-mongodb/main/assets/delete.png)
## Update
![Update](https://raw.githubusercontent.com/salgeee/workshop-spring-boot-mongodb/main/assets/update.png)
## Consulta com vários critérios
Data miníma e data Maxima, e procurar uma palavra que pode estar no título ou comentário.
![Consulta](https://raw.githubusercontent.com/salgeee/workshop-spring-boot-mongodb/main/assets/variasRequi.png)


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- MongoDB


# Como executar o projeto

## Back end
Pré-requisitos: Java 17+

```bash
# clonar repositório
git clone https://github.com/salgeee/workshop-spring-boot-mongodb.git

# entrar na pasta do projeto 
git bash here

# executar o projeto
./mvnw spring-boot:run

# no postman:
get http://localhost:8080/users

# MongoDB Compass:
new connection: mongodb://localhost:27017
workshop_mongo -> post -> user


```

# Autor

Leonardo Ferreira Salge

https://www.linkedin.com/in/leonardosalge/

