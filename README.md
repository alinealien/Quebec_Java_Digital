## Quebec Java Digital



##### Realizando Deploy na Nuvem de um Conjunto de API’s Desenvolvida em Spring Boot

***Descrição do Desafio:***

Neste projeto você terá o desafio de desenvolver um conjunto de API’s  utilizando Spring Boot para controlar um estacionamento de veículos.  Serão controlados a entrada, saída e valor a ser cobrado do cliente. Iremos aplicar todas as boas práticas de desenvolvimento de API’s incluindo segurança com Spring Security e acesso a banco de dados PostgreSQL. Serão realizados testes e relatórios de cobertura de testes. Após finalizarmos a aplicação e termos enviado para o Github, vamos fazer o deploy na cloud do Heroku a fim de disponibilizar nossa API para a Internet.



***Aula I - Apresentação***

**Spring Boot**

O Spring Boot é um projeto do Spring Framework que veio para facilitar o processo de configuração e publicação de nossas aplicações. A intenção é ter o seu projeto rodando o mais rápido possível e sem complicações.

Ele surgiu da necessidade de se diminuir a complexidade de aplicações JavaEE, que em 2003 eram bem complexas. Podemos dizer então que o Spring veio para complementar o JEE, pois também faz uso das especificações da plataforma Java Enterprise.



**Módulos utilizados no projeto e curso**

-  Spring Data

- Spring Cloud

- Spring Security

  ​

***Aula II - Pom.xml e Dependência***

Foi apresentado a estrutura do pom.xml e foram adicionados dependencias ao nosso projeto:

- Spring Boot Dev Tools

  | Dependencia Adicionada ao pom.xml        |
  | ---------------------------------------- |
  | <dependency>                                                                                  <groupId>org.springframework.boot</groupId>                                                             <artifactId>spring-boot-devtools</artifactId>                                                                 <scope>runtime</scope>                                                                                                  <optional>true</optional>                                                                                                                 </dependency> |



***Aula III - Outras formas de iniciar o projeto e Github***

**Podemos startar via console:**

Teremos que acessar o local do nosso projeto via cmd (sugiro pesquisar comando cmd). 

**Podemos startar por fora(Geralmente em produção):**

Empacotamos em um docker e roda ele. 

**GitHub:**

Foi criado o repositório no GitHub **cloud-parking**. 



***Aula IV- Heroku e System Propeties***

Papiline : Ele é o build e o deployment.

 nesta aula subimos nossa aplicação para a nuvem, foi realizado todo o passo a passo da aula, sem um erro.

***Aula V- Conceitos de REST e Verbos HTTP***

- **REST** É uma abreviação para **representational state transfer**, transferência do estado representacional. Arquitetura para sistemas **distribuidos**. REST utiliza o protocolo HTTP que além de utilizar recurso atraves de URIs, utiliza os verbos HTTP.
- ***URL:** Endereço completo, quando tem o dominio e o URI = Depois do dominio (quando temos o /clientes - /usuarios) 
- ***Verbos HTTP:*** **GET** = Recuperar representação/informação de recursos apenas. (ex: @GetMapping). **POST** = Criar novos recursos subordinados. **PUT** = Atualizar recursos existentes. **DELETE** = Conforme o nome se aplica, são usadas para excluir recursos. **PATCH** = Fazem atualizações parcial em recurso. 

Criado pacote Model e parkingController.

***Aula VI- Design Patterns DTO - Representando a View - Finalizando o Endpoint de cadastro***