create database rental_db;

create table funcionario (
	usuario_id serial primary key,
	nome varchar(50) not null,
	email varchar(50) not null,
	senha varchar(30) not null,
	cargo varchar(30) not null
);

create table categoria (
	categoria_id serial primary key,
	nome varchar(50) not null,
	descricao text not null
);

create table marca (
	marca_id serial primary key,
	nome varchar (50) not null unique,
	ativo boolean not null,
	observacao text
);

create table equipamento (
	equipamento_id serial primary key,
	nome varchar(50) not null,
	modelo varchar(50) not null,
	potencia varchar(50) not null, 
	material varchar(50) not null,
	peso varchar(50) not null,
	dimensoes varchar(50) not null,
	cor varchar(50) not null,
	quantidade_disponivel varchar(10) not null,
	quantidade_minima varchar(3) not null,
	descricao text not null,
	valor_diaria numeric(5,2) not null,
	estado varchar(50) not null,
	categoria_id int, foreign key (categoria_id) references categoria(categoria_id),
	marca_id int, foreign key (marca_id) references marca(marca_id)
);

create table movimentacao(
	movimentacao_id serial primary key,
	tipo varchar(50) not null,
	quantidade varchar(50) not null,
	data_movimentacao date not null,
	equipamento_id int, foreign key (equipamento_id) references equipamento(equipamento_id),
	funcionario_id int, foreign key (funcionario_id) references funcionario(usuario_id)
);
