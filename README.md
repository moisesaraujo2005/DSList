DSList - Lista de Games 🎮
Este é o projeto DSList, desenvolvido durante o Intensivão Java Spring oferecido pela DevSuperior. O objetivo do projeto foi criar uma aplicação backend para gerenciar uma lista de games utilizando Java, Spring Boot e outras tecnologias modernas.

🔗 Tecnologias Utilizadas
Java 21 <br>
Spring Boot (Data JPA, Web) <br>
Banco de Dados H2 (em memória) <br>
Postman (para testes de API) <br>
🛠️ Funcionalidades
Listar todos os games cadastrados <br>
Criar e organizar listas personalizadas de games <br>
Ordenar games em uma lista <br>
Consultar detalhes de um game específico <br>
🏗️ Como Executar o Projeto
Clone o repositório: <br>

bash
Copiar código
git clone https://github.com/seu-usuario/dslist.git
cd dslist
Importe o projeto em sua IDE favorita (Eclipse, IntelliJ, etc.). <br>

Configure o arquivo application.properties para utilizar o banco H2 (configuração padrão já inclusa): <br>

properties
Copiar código
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:dslist
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
Execute o projeto como uma aplicação Spring Boot. <br>

Acesse a aplicação pelo navegador em http://localhost:8080. <br>

📋 Endpoints da API
GET /games
Retorna a lista de todos os games cadastrados. <br>

GET /games/{id}
Retorna os detalhes de um game específico. <br>

GET /lists
Retorna todas as listas de games. <br>

POST /lists/{listId}/replacement
Atualiza a ordem dos games em uma lista. <br>

🖼️ Modelo de Dados
Game
id: Identificador único <br>
title: Nome do jogo <br>
platform: Plataforma (PC, PlayStation, Xbox, etc.) <br>
score: Nota do jogo <br>
imageUrl: URL da imagem do jogo <br>
shortDescription: Breve descrição <br>
longDescription: Descrição detalhada <br>
GameList
id: Identificador único <br>
name: Nome da lista <br>

![Captura de tela 2024-11-16 170623](https://github.com/user-attachments/assets/aff20d09-d147-4a5a-9fa3-88f529134dc3)

🌟 Agradecimentos
Agradeço à DevSuperior pelo conteúdo de qualidade e pela oportunidade de aprofundar meus conhecimentos em Java e Spring Boot.

