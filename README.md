# 🖥️ Sistema de Atendimentos de Informática

Este é um sistema web simples desenvolvido com **Spring Boot** e **PostgreSQL**, que permite o **registro, gerenciamento e geração de relatórios de atendimentos técnicos de TI**.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
    - Spring Web
    - Spring Data JPA
- PostgreSQL
- Gradle
- Lombok

## ✅ TODO List

### 📋 Funcionalidades Principais

- [x] Criar estrutura básica do projeto com Spring Boot
- [x] Configurar conexão com banco de dados PostgreSQL
- [x] Criar entidade `ServicesCall`
- [ ] Implementar repositório JPA (`ServicesCallRepository`)
- [ ] Criar controller REST para operações CRUD
- [ ] Adicionar camada de serviço (`Service`) para regras de negócio
- [ ] Validar dados de entrada com `@Valid`
- [ ] Implementar DTOs para entrada/saída de dados
- [ ] Criar filtros de busca por status, técnico, data, etc.
- [ ] Gerar relatórios simples (ex: atendimentos por período)

### 🧪 Testes

- [ ] Criar testes unitários para a camada de serviço
- [ ] Criar testes de integração para os endpoints REST

### 💅 Melhorias Futuras

- [ ] Adicionar paginação e ordenação
- [ ] Incluir autenticação (ex: JWT ou basic auth)
- [ ] Implementar dashboard com estatísticas
- [ ] Criar interface web (ex: com React ou Thymeleaf)

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
1. Clone este repositório:
   ```bash
    git clone https://github.com/iagoscandido/servi-track.git
    cd servi-track
    ```
2. Configure o banco de dados no `application.yml`.
3. Rode a aplicação com o Maven ou pela sua IDE:
    ```bash
    ./mvnw spring-boot:run
    ```
4. Acesse:
    ```bash
    http://localhost:8080/
    ```
📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
