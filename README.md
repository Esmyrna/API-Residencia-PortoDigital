# 📚 API de Cursos

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de cursos, utilizando **Spring Data JPA** e banco de dados **H2**.

O projeto foi desenvolvido como prática dos principais conceitos de construção de uma API REST com Spring Boot, incluindo criação de endpoints, persistência de dados e operações de CRUD.

## 🚀 Tecnologias

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

## 📌 Funcionalidades

A API permite:

* ✅ Cadastrar cursos
* ✅ Listar todos os cursos
* ✅ Buscar um curso por ID
* ✅ Atualizar um curso
* ✅ Excluir um curso

## 🔗 Endpoints

### Listar cursos

```http
GET /cursos
```

Retorna todos os cursos cadastrados.

### Buscar curso por ID

```http
GET /cursos/{id}
```

Exemplo:

```http
GET /cursos/1
```

### Cadastrar curso

```http
POST /cursos
```

Exemplo de corpo da requisição:

```json
{
  "nome": "Java",
  "descricao": "Fundamentos de Java"
}
```

### Atualizar curso

```http
PUT /cursos/{id}
```

Exemplo:

```http
PUT /cursos/1
```

```json
{
  "nome": "Java Avançado",
  "descricao": "Fundamentos e conceitos avançados de Java"
}
```

### Excluir curso

```http
DELETE /cursos/{id}
```

Exemplo:

```http
DELETE /cursos/1
```

## 🗄️ Banco de dados

O projeto utiliza o **H2 Database**, um banco de dados em memória utilizado para facilitar o desenvolvimento e os testes da aplicação.

O console do H2 pode ser acessado em:

```text
http://localhost:8080/h2-console
```

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/Esmyrna/API-Residencia-PortoDigital.git
```

### 2. Acesse o diretório

```bash
cd <NOME_DO_PROJETO>
```

### 3. Execute a aplicação

Com Maven:

```bash
./mvnw spring-boot:run
```

No Windows:

mvnw.cmd spring-boot:run

A API estará disponível em:

http://localhost:8080

### 4. Collection no Bruno:

[Crud Cursos.zip](https://github.com/user-attachments/files/32835121/Crud.Cursos.zip)

