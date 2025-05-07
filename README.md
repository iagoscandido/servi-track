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
- [x] Implementar repositório JPA (`ServicesCallRepository`)
- [x] Criar controller REST para operações CRUD
- [x] Adicionar camada de serviço (`Service`) para regras de negócio
- [x] Validar dados de entrada com `@Valid`
- [x] Implementar DTOs para entrada/saída de dados
- [ ] Criar filtros de busca por status, técnico, data, etc.
- [ ] Gerar relatórios simples (ex: atendimentos por período)

### 🧪 Testes

- [x] Criar testes unitários para a camada de serviço
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
│ │ ├── config/
│ │ ├── controllers/
│ │ ├── dto/
│ │ ├── entities/
│ │ ├── enums/
│ │ ├── exceptions/
│ │ ├── repositories/
│ │ └── services/
│ └── resources/
│ ├── application.yml
├── test/
| ├── java/
│ │ └── com.iago.servi-track/
| │ │ └── services/
```

## 📡 Endpoints da API (exemplo)

| Método | Rota                            | Descrição                      |
|--------|---------------------------------|--------------------------------|
| GET    | `/`                             | TODO                           |
| POST   | `/service-call-schedule/create` | cria um agendamento de chamado |
| PUT    | `/`                             | TODO                           |
| DELETE | `/`                             | TODO                           |

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
