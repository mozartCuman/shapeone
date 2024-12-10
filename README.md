# ShapeOne - Documentação do Sistema de Aplicativo Fitness Personalizado 🏋️‍♂️

## Introdução 📖

ShapeOne é um sistema de planejamento fitness que permite o gerenciamento de usuários, treinos e exercícios. O sistema inclui funcionalidades de CRUD (Create, Read, Update, Delete) e consultas específicas para atender às necessidades de personalização e acompanhamento fitness.

---

## Entidades 🗂️

### 1. Usuário 👤

Representa a coleção de dados relacionados aos usuários cadastrados, com relacionamento bidirecional com a tabela de treinos (OneToMany).

**Atributos:**
- **id** (Long): Chave Primária, identificador do usuário.
- **nome** (String): Nome do usuário.
- **celular** (String): Contato do usuário.
- **email** (String): Email do usuário.
- **senha** (String): Senha do usuário.

---

### 2. Treino 🏋️‍♀️

Representa os dados relacionados aos treinos, com relacionamento bidirecional com os usuários (ManyToOne).

**Atributos:**
- **id** (Long): Chave Primária, identificador do treino.
- **nome** (String): Nome do treino.
- **grupoMuscular** (String): Grupo muscular trabalhado no treino.
- **tipoTreino** (String): Tipo do treino.
- **duracao** (String): Duração do treino.
- **status** (String): Status do treino.
- **id_usuario** (Long): Chave Estrangeira, identificador do usuário relacionado ao treino.

---

### 3. Exercício 🏃‍♂️

Representa os dados relacionados aos exercícios, com relacionamento bidirecional com os treinos (ManyToOne).

**Atributos:**
- **id** (Long): Chave Primária, identificador do exercício.
- **nome** (String): Nome do exercício.
- **repeticao** (Int): Número de repetições do exercício.
- **series** (Int): Número de séries do exercício.
- **tempoPausa** (Int): Tempo de pausa entre séries (em segundos).
- **id_treino** (Long): Chave Estrangeira, identificador do treino relacionado.

---

## Endpoints 🌐

### 1. Usuário 👤
CRUD e consultas de dados dos usuários:
- `GET /usuario`: Lista todos os usuários.
- `GET /usuario/{id}`: Retorna um usuário pelo ID.
- `POST /usuario`: Cria um novo usuário.
- `PUT /usuario/{id}`: Atualiza um usuário existente.
- `DELETE /usuario/{id}`: Remove um usuário pelo ID.
- `GET /usuario/tipo/{tipo}`: Retorna usuários por tipo.

---

### 2. Treino 🏋️‍♀️
CRUD e consultas de dados dos treinos:
- `GET /treino`: Lista todos os treinos.
- `GET /treino/{id}`: Retorna um treino pelo ID.
- `POST /treino`: Cria um novo treino.
- `PUT /treino/{id}`: Atualiza um treino existente.
- `DELETE /treino/{id}`: Remove um treino pelo ID.

---

### 3. Exercício 🏃‍♂️
CRUD e consultas de dados dos exercícios:
- `GET /exercicio`: Lista todos os exercícios.
- `GET /exercicio/{id}`: Retorna um exercício pelo ID.
- `POST /exercicio`: Cria um novo exercício.
- `PUT /exercicio/{id}`: Atualiza um exercício existente.
- `DELETE /exercicio/{id}`: Remove um exercício pelo ID.

---

### 4. Funcionalidade Especial do Service 🧮

#### Cálculo do IMC do Usuário:
- Endpoint: `calculoIMC(Long id)`
- Função destinada a calcular o IMC (Índice de Massa Corporal) de um usuário com base nos dados fornecidos.

---

## Tecnologias Utilizadas 🛠️
- **Linguagem:** Java
- **Framework:** Spring Boot
- **Ferramentas:** Git, GitHub, Insomnia
- **Dependências:**
  - Spring Data JPA
  - MySQL Driver
  - Spring Web
  - Validation
  - Maven

---

## Desenvolvedores 👩‍💻👨‍💻

- Eduarda
- Felix
- Lyncoln
- Mozart
- Sandy
