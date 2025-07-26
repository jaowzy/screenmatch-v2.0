## 🎬 ScreenMatch API

API desenvolvida em Java com Spring Boot para uma plataforma de streaming fictícia. 
Permite visualizar séries, temporadas, episódios, avaliações e realizar traduções de conteúdo por meio de uma API externa.

---

## 🚀 Funcionalidades

- [x] Listagem de séries com dados detalhados;
- [x] Consulta de temporadas e episódios por série;
- [x] Ranking das top 5 séries com base em avaliações;
- [x] Integração com API externa para tradução de informações;
- [x] Persistência de dados com PostgreSQL;

---

## 🧱 Estrutura do Projeto

src/
    └── main/
        └── java/br/com/alura/screenmatch/
            ├── model/                  # Entidades e DTOs (DadosSerie, Episodio, etc.)
            ├── principal/              # Classe Principal para execução
            ├── repository/             # Interface de acesso ao banco (Spring Data JPA)
            ├── service/
            │   └── traducao/           # Serviços para tradução de dados via API externa
            └── ScreenmatchApplication.java

---

## 🗃 Banco de Dados

- [x] Sistema Gerenciador: PostgreSQL
- [x] Tabelas principais:
        └── serie: armazena dados das séries
          └── episodio: armazena dados dos episódios relacionados a séries e temporadas

---

## 🔧 Tecnologias Utilizadas

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Spring Data JPA](https://docs.spring.io/spring-data/jpa)**
- **[PostgreSQL](https://www.postgresql.org)**
- **[Maven](https://maven.apache.org)**
- **[API MyMemory (tradução)](https://mymemory.translated.net/)**

---
