# rws-batch-fiap-credit-card

## Pré-requisitos para execução do rws-batch-fiap-credit-card

1 - Para executar o projeto é necessário ter o JRE 8 ou JDK 8 instalado.

2 - Possuir uma IDE para execução.


## Spring Framework

- Spring Web
- Spring Data JPA
- Spring Security
- H2 Database
- JUnit (testes)
- Swagger (documentação)

## Heroku

Foi realizado o deploy da aplicação rws-batch-fiap-credit-card no Heroku que é uma plataforma em nuvem, onde é possível realizar o acesso através da mesma.

Acesso sem Swagger - https://rws-batch-fiap-credit-card.herokuapp.com

Acesso com Swagger - https://rws-batch-fiap-credit-card.herokuapp.com/swagger-ui.html


## Instalação e execução do rws-batch-fiap-credit-card

1 - Realizar o clone `$ git clone https://github.com/eduardosukeda/rws-batch-fiap-credit-card.git`

2 - Importar o projeto em sua IDE e realizar Update Maven

3 - Selecionar a classe principal RwsBatchFiapCreditCardApplication

4 - Run

5 - A aplicação possui o módulo Spring Security implementado, para acessar é necessário informar um login e senha basic auth.

Login - rws

Senha - rwsbatchfiapcreditcard

## Swagger
Pode ser acessado através da seguinte URL: localhost:8080/swagger-ui.html


## Massa para teste

A massa para realizar teste unitários se encontra em formar JSON na pasta src/main/resource/massa/teste. Para realizar os teste unitários pode ser usado o swagger ou Postman para requisições Rest.
