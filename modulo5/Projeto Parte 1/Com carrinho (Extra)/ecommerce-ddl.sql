create schema ecommerce;

set schema 'ecommerce';

--table cliente
create table cliente ( 
	id serial not null,
	nome varchar(895) not null,
	cpf char(11) not null,
	email varchar(100),
	constraint unq_cliente_cpf unique (cpf),
	constraint pk_cliente primary key (id)
);



--table produto
create table produto ( 
	id serial not null,
	descricao varchar(1000) not null,
	codigo_barras varchar(44) not null,
	valor numeric not null,
	constraint pk_produto primary key (id),
	constraint unq_produto_codigo_barras unique (codigo_barras) 
 );

--table endereco
create table endereco ( 
	id serial not null,
	cep char(8)  not null,
	logradouro varchar(1000) not null  ,
	estado varchar(100) not null  ,
	cidade varchar(150) not null  ,
	uf char(2) not null  ,
	constraint pk_endereco primary key (id)
 );

--table fornecedor
create  table fornecedor ( 
	id serial  not null,
	cnpj char(14) not null,
	razao_social varchar(500) not null,
	constraint pk_fornecedor primary key (id),
	constraint unq_fornecedor_cnpj unique (cnpj) 
 );

--table cupom
create table cupom ( 
	id serial not null,
	data_expiracao date,
	data_inicio date default current_date not null,
	valor numeric not null,
	descricao varchar(2000) not null,
	codigo_cupom integer not null,
	constraint pk_cupom primary key (id),
	constraint unq_cupom_codigo_cupom unique (codigo_cupom) 
 );


--table endereco_cliente 
create table endereco_cliente ( 
	id serial  not null  ,
	id_cliente integer not null,
	id_endereco integer not null,
	numero_residencia varchar(20) default 'sem numero' not null,
	constraint pk_endereco_cliente primary key (id)
 );

alter table endereco_cliente add constraint fk_endereco_cliente_cliente 
	foreign key	(id_cliente) references cliente(id);


alter table endereco_cliente add constraint fk_endereco_cliente_endereco 
	foreign key (id_endereco) references endereco(id);

--table pedido 
create table pedido ( 
	id serial not null,
	previsao_entrega date not null,
	meio_pagamento varchar(200) not null,
	status varchar(100) not null,
	id_cliente integer  not null,
	id_endereco_entrega integer not null,
	id_cupom integer,
	constraint pk_pedido primary key (id),
	constraint unq_pedido_cliente_cupom unique (id_cliente, id_cupom) 
 );

alter table pedido add constraint fk_pedido_cliente 
	foreign key (id_cliente) references cliente(id);

alter table pedido add constraint fk_pedido_endereco 
	foreign key (id_endereco_entrega) references endereco_cliente(id);

alter table pedido add constraint fk_pedido_cupom 
	foreign key (id_cupom) references cupom(id);

--table item_pedido
create table item_pedido ( 
	id_pedido integer not null,
	id_produto integer not null,
	quantidade integer not null,
	valor numeric not null,
	constraint pk_item_pedido primary key (id_pedido, id_produto)
 );

alter table item_pedido add constraint fk_item_pedido_pedido 
	foreign key (id_pedido) references pedido(id);

alter table item_pedido add constraint fk_item_pedido_produto 
	foreign key (id_produto) references produto(id);

--table carrinho
create table carrinho ( 
	id serial not null,
	id_cliente integer not null,
	constraint pk_carrinho primary key (id),
	constraint unq_carrinho_cliente unique (id_cliente) 
 );

alter table carrinho add constraint fk_carrinho_cliente 
	foreign key (id_cliente) references cliente(id);




--table carrinho_produto
create table carrinho_produto ( 
	id serial not null,
	id_carrinho integer not null,
	id_produto integer not null,
	constraint pk_carrinho_produto primary key (id)
 );

alter table carrinho_produto add constraint fk_carrinho_produto_carrinho 
	foreign key (id_carrinho) references carrinho(id);

alter table carrinho_produto add constraint fk_carrinho_produto_produto 
	foreign key (id_produto) references produto(id);

--table estoque
create table estoque ( 
	id serial  not null,
	id_endereco integer not null,
	numero_localizacao integer not null,
	constraint pk_estoque primary key (id),
	constraint unq_estoque_numero_localizacao unique (numero_localizacao) 
 );


alter table estoque add constraint fk_estoque_endereco 
	foreign key (id_endereco) references endereco(id);

--table estoque_produto
create table estoque_produto ( 
	id serial not null ,
	id_estoque integer not null,
	id_produto integer not null,
	quantidade integer default 0 not null,
	constraint pk_estoque_produto primary key (id)
 );

alter table estoque_produto add constraint fk_estoque_produto_estoque 
	foreign key (id_estoque) references estoque(id);

alter table estoque_produto add constraint fk_estoque_produto_produto 
	foreign key (id_produto) references produto(id);

--table endereco_fornecedor
create table endereco_fornecedor ( 
	id serial  not null,
	id_fornecedor integer not null,
	id_endereco integer not null,
	constraint pk_endereco_fornecedor primary key (id)
 );

alter table endereco_fornecedor add constraint fk_endereco_fornecedor_endereco 
	foreign key (id_endereco) references endereco(id);

alter table endereco_fornecedor add constraint fk_endereco_fornecedor_fornecedor 
	foreign key (id_fornecedor) references fornecedor(id);

--table fornecedor_produto
create table fornecedor_produto ( 
	id serial not null,
	id_fornecedor integer not null,
	id_produto integer not null,
	constraint pk_fornecedor_produto primary key (id)
 );

alter table fornecedor_produto add constraint fk_fornecedor_produto_fornecedor 
	foreign key (id_fornecedor) references fornecedor(id);

alter table fornecedor_produto add constraint fk_fornecedor_produto_produto 
	foreign key (id_produto) references produto(id);

--table endereco_fornecedor
create table endereco_fornecedor ( 
	id serial not null,
	id_fornecedor integer not null,
	id_endereco integer not null,
	constraint pk_endereco_fornecedor primary key (id)
 );

alter table endereco_fornecedor add constraint fk_endereco_fornecedor_endereco 
	foreign key (id_endereco) references endereco(id);

alter table endereco_fornecedor add constraint fk_endereco_fornecedor_fornecedor 
	foreign key (id_fornecedor) references fornecedor(id);
 







