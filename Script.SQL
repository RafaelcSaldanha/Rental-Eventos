create database rental_db;

create table funcionario (
	funcionario_id serial primary key,
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
	funcionario_id int, foreign key (funcionario_id) references funcionario(funcionario_id)
);


-- ============================================
-- INSERTS - FUNCIONARIO
-- ============================================

INSERT INTO funcionario (nome, email, senha, cargo) VALUES
('João Silva', 'joao.silva@email.com', 'senha123', 'Administrador'),
('Maria Oliveira', 'maria.oliveira@email.com', 'senha456', 'Gerente'),
('Carlos Souza', 'carlos.souza@email.com', 'senha789', 'Atendente'),
('Ana Santos', 'ana.santos@email.com', 'ana123', 'Atendente'),
('Pedro Costa', 'pedro.costa@email.com', 'pedro456', 'Estoquista');


-- ============================================
-- INSERTS - CATEGORIA
-- ============================================

INSERT INTO categoria (nome, descricao) VALUES
('Ferramentas Elétricas', 'Equipamentos elétricos utilizados em obras, reformas e serviços de manutenção.'),
('Equipamentos de Construção', 'Equipamentos utilizados em atividades de construção civil.'),
('Jardinagem', 'Equipamentos destinados à manutenção e cuidados de jardins e áreas verdes.'),
('Limpeza', 'Equipamentos utilizados para limpeza residencial, comercial e industrial.'),
('Equipamentos de Medição', 'Equipamentos utilizados para medição e controle em obras e serviços técnicos.');


-- ============================================
-- INSERTS - MARCA
-- ============================================

INSERT INTO marca (nome, ativo, observacao) VALUES
('Bosch', true, 'Marca especializada em ferramentas e equipamentos profissionais.'),
('Makita', true, 'Marca reconhecida por ferramentas elétricas de alta qualidade.'),
('DeWalt', true, 'Marca voltada para ferramentas profissionais.'),
('Vonder', true, 'Marca brasileira de ferramentas e equipamentos.'),
('Tramontina', true, 'Fabricante de ferramentas e equipamentos diversos.');


-- ============================================
-- INSERTS - EQUIPAMENTO
-- ============================================

INSERT INTO equipamento (
    nome,
    modelo,
    potencia,
    material,
    peso,
    dimensoes,
    cor,
    quantidade_disponivel,
    quantidade_minima,
    descricao,
    valor_diaria,
    estado,
    categoria_id,
    marca_id
) VALUES
(
    'Furadeira de Impacto',
    'GSB 550 RE',
    '550W',
    'Plástico e metal',
    '1.8 kg',
    '25 x 8 x 20 cm',
    'Azul',
    '10',
    '2',
    'Furadeira de impacto indicada para perfurações em madeira, metal e concreto.',
    35.00,
    'Disponível',
    1,
    1
),
(
    'Parafusadeira',
    'DF330D',
    '10.8V',
    'Plástico e metal',
    '1.0 kg',
    '19 x 6 x 22 cm',
    'Verde',
    '8',
    '2',
    'Parafusadeira compacta para montagem de móveis e pequenos reparos.',
    30.00,
    'Disponível',
    1,
    2
),
(
    'Serra Circular',
    'DWE560',
    '1400W',
    'Metal e plástico',
    '3.7 kg',
    '35 x 25 x 30 cm',
    'Amarela',
    '5',
    '1',
    'Serra circular profissional para cortes em madeira.',
    55.00,
    'Disponível',
    1,
    3
),
(
    'Betoneira',
    'CS 400',
    '2 CV',
    'Aço',
    '180 kg',
    '140 x 80 x 150 cm',
    'Laranja',
    '3',
    '1',
    'Betoneira indicada para preparação de concreto e argamassa.',
    120.00,
    'Disponível',
    2,
    4
),
(
    'Compactador de Solo',
    'CS 70',
    '5.5 HP',
    'Aço',
    '70 kg',
    '100 x 50 x 110 cm',
    'Amarelo',
    '2',
    '1',
    'Compactador de solo utilizado em obras de construção e pavimentação.',
    150.00,
    'Disponível',
    2,
    3
),
(
    'Roçadeira',
    'FS 55',
    '1.0 HP',
    'Metal e plástico',
    '7.2 kg',
    '180 x 30 x 25 cm',
    'Laranja',
    '6',
    '2',
    'Roçadeira para corte de grama, mato e vegetação.',
    65.00,
    'Disponível',
    3,
    5
),
(
    'Lavadora de Alta Pressão',
    'K3.30',
    '1500W',
    'Plástico',
    '6.5 kg',
    '30 x 25 x 50 cm',
    'Amarela',
    '7',
    '2',
    'Lavadora de alta pressão indicada para limpeza de pisos, veículos e áreas externas.',
    50.00,
    'Disponível',
    4,
    1
),
(
    'Aspirador de Pó',
    'NT 20/1',
    '1400W',
    'Plástico e metal',
    '5.5 kg',
    '40 x 40 x 55 cm',
    'Cinza',
    '4',
    '1',
    'Aspirador profissional para limpeza de ambientes e áreas de trabalho.',
    45.00,
    'Disponível',
    4,
    4
),
(
    'Trena a Laser',
    'GLM 40',
    'Laser Classe 2',
    'Plástico',
    '0.09 kg',
    '10 x 4 x 2 cm',
    'Azul',
    '10',
    '3',
    'Trena a laser para medições rápidas e precisas.',
    25.00,
    'Disponível',
    5,
    1
),
(
    'Nível a Laser',
    'DW088K',
    '3V',
    'Plástico e metal',
    '0.5 kg',
    '12 x 7 x 10 cm',
    'Vermelho',
    '5',
    '1',
    'Nível a laser para alinhamento e nivelamento em obras.',
    40.00,
    'Disponível',
    5,
    3
);


-- ============================================
-- INSERTS - MOVIMENTACAO
-- ============================================

INSERT INTO movimentacao (
    tipo,
    quantidade,
    data_movimentacao,
    equipamento_id,
    funcionario_id
) VALUES
(
    'Entrada',
    '5',
    '2026-09-01',
    1,
    5
),
(
    'Saída',
    '2',
    '2026-09-02',
    1,
    3
),
(
    'Entrada',
    '3',
    '2026-09-02',
    2,
    5
),
(
    'Saída',
    '1',
    '2026-09-03',
    3,
    4
),
(
    'Entrada',
    '2',
    '2026-09-03',
    4,
    5
),
(
    'Saída',
    '1',
    '2026-09-04',
    6,
    3
),
(
    'Entrada',
    '4',
    '2026-09-05',
    7,
    5
),
(
    'Saída',
    '2',
    '2026-09-06',
    7,
    4
),
(
    'Entrada',
    '2',
    '2026-09-07',
    8,
    5
),
(
    'Saída',
    '1',
    '2026-09-08',
    9,
    3
),
(
    'Entrada',
    '3',
    '2026-09-09',
    10,
    5
),
(
    'Saída',
    '1',
    '2026-09-10',
    10,
    4
);

ALTER TABLE equipamento
ALTER COLUMN quantidade_disponivel
TYPE INTEGER
USING quantidade_disponivel::INTEGER;

ALTER TABLE equipamento
ALTER COLUMN quantidade_minima
TYPE INTEGER
USING quantidade_minima::INTEGER;
