# 🖥️ Sistema de Atendimentos de Informática

Este é um sistema web simples desenvolvido com **Spring Boot** e **PostgreSQL**, que permite o **registro, gerenciamento e geração de relatórios de atendimentos técnicos de TI**.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
    - Spring Web
    - Spring Data JPA
- PostgreSQL
- Maven
- Lombok (opcional)

## 🗃️ Funcionalidades

- Registro de atendimentos técnicos
- Listagem de atendimentos com filtros
- Atualização e remoção de registros
- Geração de relatórios simples
- Integração com banco de dados PostgreSQL
- API RESTful

## 🏗️ Estrutura do Projeto
```bash
src/
├── main/
│ ├── java/
│ │ └── com.iago.servi-track/
│ │ ├── controllers/
│ │ ├── entities/
│ │ ├── repositories/
│ │ └── services/
│ └── resources/
│ ├── application.yml
```

## 📡 Endpoints da API (exemplo)

| Método | Rota                | Descrição |
|--------|---------------------|-----------|
| GET    | `/`     | TODO      |
| POST   | `/`     | TODO      |
| PUT    | `/`| TODO      |
| DELETE | `/`| TODO      |

## 🧪 Como rodar o projeto localmente
1 - Clone este repositório:

```bash
git clone https://github.com//.git
cd 
Configure o banco de dados no application.yml.
```
Rode a aplicação com o Maven ou pela sua IDE:

```bash
./mvnw spring-boot:run
Acesse:

bash
Copiar
Editar
http://localhost:8080/atendimentos
