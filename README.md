# rws-batch-fiap-credit-card

Microserviço onde é possível realizar as operação de CREATE, READ, UPDATE e DELETE da tabela TB_LEMBRETES, e também está implementado um serviço produtor para envio das informações a um consumidor onde o objetivo final é realizar o envio de e-mail para o usuário, informando que seu lembrete foi adicionado/editado. 


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

1 - Realizar o clone `$ git clone https://github.com/eduardosukeda/rws-fiap-lembretes.git`

2 - Importar o projeto em sua IDE e realizar Update Maven

3 - Selecionar a classe principal RwsFiapLembretesApplication

4 - Run


## Swagger
Pode ser acessado através da seguinte URL: localhost:8080/swagger-ui.html
