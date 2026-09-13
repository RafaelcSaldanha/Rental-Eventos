# Rental-Eventos

f# Rental Eventos API

API REST desenvolvida em **Java com Spring Boot** para gerenciamento e rastreabilidade de equipamentos da empresa fictícia **Rental Eventos**, voltada à locação de equipamentos para eventos.

O sistema foi criado para substituir o controle manual por planilhas, permitindo gerenciar **equipamentos, categorias, marcas, funcionários e movimentações de estoque**, além de registrar entradas e saídas com responsável e data.

## 🛠️ Tecnologias

* Java
* Spring Boot
* Spring Data JPA / Hibernate
* PostgreSQL
* Maven
* Swagger / OpenAPI
* DBeaver

## ⚙️ Funcionalidades

* Cadastro, consulta, atualização e exclusão de equipamentos
* Controle de quantidade disponível e quantidade mínima
* Gerenciamento de categorias e marcas
* Registro de movimentações de estoque
* Persistência dos dados em PostgreSQL
* Documentação e testes da API através do Swagger UI
* Arquitetura organizada em **Model, Repository, Service e Controller**

## 🔌 Endpoints

A API disponibiliza operações CRUD para equipamentos, incluindo:

* `GET` — Listar equipamentos
* `GET` — Buscar equipamento por ID
* `GET` — Contar equipamentos
* `POST` — Cadastrar equipamento
* `PUT` — Atualizar equipamento
* `DELETE` — Excluir equipamento

## 📚 Documentação

A API utiliza **Swagger UI** para documentação e testes interativos dos endpoints, substituindo a necessidade de um Front-end neste projeto.

## 🗄️ Banco de Dados

O projeto utiliza **PostgreSQL**, com o banco `rental_db` e tabelas relacionadas para funcionários, categorias, marcas, equipamentos e movimentações.

## 🎯 Objetivo

Projeto desenvolvido com foco na prática de **desenvolvimento de APIs REST, arquitetura em camadas, integração com banco de dados e documentação de APIs**, utilizando Spring Boot e PostgreSQL.
