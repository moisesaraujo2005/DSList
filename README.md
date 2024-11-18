DSList - Lista de Games 🎮
Este é o projeto DSList, desenvolvido durante o Intensivão Java Spring oferecido pela DevSuperior. O objetivo do projeto foi criar uma aplicação backend para gerenciar uma lista de games utilizando Java, Spring Boot e outras tecnologias modernas.

🔗 Tecnologias Utilizadas
Java 21
Spring Boot (Data JPA, Web)
Banco de Dados H2 (em memória)
Postman (para testes de API)

🛠️ Funcionalidades
Listar todos os games cadastrados
Criar e organizar listas personalizadas de games
Ordenar games em uma lista
Consultar detalhes de um game específico

🏗️ Como Executar o Projeto
Clone o repositório:
bash
Copiar código
git clone https://github.com/seu-usuario/dslist.git
cd dslist
Importe o projeto em sua IDE favorita (Eclipse, IntelliJ, etc.).

Configure o arquivo application.properties para utilizar o banco H2 (configuração padrão já inclusa):

properties
Copiar código
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:dslist
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
Execute o projeto como uma aplicação Spring Boot.

Acesse a aplicação pelo navegador em http://localhost:8080.

📋 Endpoints da API
GET /games
Retorna a lista de todos os games cadastrados.

GET /games/{id}
Retorna os detalhes de um game específico.

GET /lists
Retorna todas as listas de games.

POST /lists/{listId}/replacement
Atualiza a ordem dos games em uma lista.

🖼️ Modelo de Dados

Game
id: Identificador único
title: Nome do jogo
platform: Plataforma (PC, PlayStation, Xbox, etc.)
score: Nota do jogo
imageUrl: URL da imagem do jogo
shortDescription: Breve descrição
longDescription: Descrição detalhada

GameList
id: Identificador único
name: Nome da lista

![Captura de tela 2024-11-16 170623](https://github.com/user-attachments/assets/59bc8a7b-9385-4942-804f-51f410e03d85)


🌟 Agradecimentos
Agradeço à DevSuperior pelo conteúdo de qualidade e pela oportunidade de aprofundar meus conhecimentos em Java e Spring Boot.

