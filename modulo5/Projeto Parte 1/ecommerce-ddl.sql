create table produto(
	id serial,
	descricao varchar(1000) not null,
	codigo_barras varchar(44) not null,
	valor numeric(12,2) not null
);

alter table produto add constraint pk_produto primary key(id);
alter table produto add constraint uk_produto_codigo_barras unique(codigo_barras);


create table endereco(
	id serial,
	cep char(8) not null,
	logradouro varchar(1000) not null,
	numero varchar(30) not null,
	cidade varchar(200) not null,
	uf char(2) not null,
	constraint pk_endereco primary key(id) 
);


create table cliente(
	id serial constraint pk_cliente primary key,
	nome varchar(895) not null,
	id_endereco int not null,
	foreign key(id_endereco) references endereco(id)
);

alter table cliente add cpf char(11) unique not null;
alter table cliente add constraint uk_cliente_endereco unique(id_endereco);


create table cupom(
	id serial primary key,
	data_expiracao date not null,
	valor numeric(12,2) not null,
	descricao varchar(1000) not null
);


create table pedido(
	id serial primary key,
	previsao_entrega date not null,
	meio_pagamento varchar(200) not null,
	status varchar(100) not null,
	id_cliente int not null,
	data_criacao timestamp not null,
	id_cupom int,
	foreign key(id_cupom) references cupom(id),
	foreign key(id_cliente) references cliente(id)
);


create table item_pedido(
	id_pedido int not null,
	id_produto int not null,
	quantidade int not null,
	valor numeric(12,2) not null,
	primary key(id_pedido, id_produto),
	foreign key(id_pedido) references pedido,
	foreign key(id_produto) references produto
);


create table estoque(
	id serial primary key,
	id_endereco int not null,
	foreign key(id_endereco) references endereco(id)
);


create table produto_estoque(
	id_estoque int not null,
	id_produto int not null,
	quantidade int not null,
	primary key(id_estoque, id_produto),
	foreign key(id_estoque) references estoque(id),
	foreign key(id_produto) references produto(id)
);


create table fornecedor(
	id serial primary key,
	nome varchar(200) not null,
	id_endereco int not null,
	cnpj char(14) unique,
	foreign key(id_endereco) references endereco(id)
);


create table fornecedor_produto(
	id_produto int not null,
	id_fornecedor int not null,
	primary key(id_produto,id_fornecedor),
	foreign key(id_produto) references produto(id),
	foreign key(id_fornecedor) references fornecedor(id)
);
