-- Adicionando 5 endereços
insert into endereco(logradouro, numero, cep, cidade, uf)
	values ('Rua Springboot', 455, '98765432', 'Santa Rosa', 'RS'),
	('Rua dos Java Fans', 1080, '12121244', 'Sao Paulo', 'SP'),
	('SQL street', 10, '12151232', 'Bragança', 'SP'),
	('SQL street', 19, '12151234', 'Bragança', 'SP'),
	('SQL street', 20, '12151235', 'Bragança', 'SP');

-- Adicionando 5 clientes
insert into cliente (nome, cpf, id_endereco) values  
	('Matheus', '01013232544', 6), ('José', '91013232523', 7),
	('Felipe', '01013654544', 8), ('Alonso', '01013654000', 9),
	('Valtteri', '01013654599', 10);

-- Adicionando 5 produtos
insert into produto(descricao, codigo_barras, valor) values 
('shampoo palmolive azul', 'ABC0001', 2.99),
('shampoo palmolive vermelho', 'ABC0002', 2.99),
('shampoo palmolive amarelo', 'ABC0003', 2.99),
('shampoo palmolive verde', 'ABC0004', 2.99),
('shampoo palmolive rosa', 'ABC0005', 2.99);

-- Adicionando 3 cupons
insert into cupom(data_expiracao, descricao, valor) values
	('27/03/2023', 'Vale páscoa', 1.99),
	('29/03/2023', 'Cuide de si mesmo', 5.99),
	('29/06/2023', 'Economize mais com a gente', 8.99);

-- Criando os pedidos
insert into pedido(previsao_entrega, meio_pagamento,status,id_cliente,data_criacao,id_cupom) values
	('30/03/2023', 'Dinheiro', 'Em trânsito', 11, '30/03/2023 10:00:00', null),
	('27/03/2023', 'PIX', 'Saiu para entrega', 12, '20/03/2023 10:00:00', 1),
	('24/03/2023', 'PIX', 'Entregue', 14, '18/03/2023 10:00:00', 3),
	('24/03/2023', 'PIX', 'Entregue', 13, '18/03/2023 12:00:00', 3),
	('24/03/2023', 'Cartao', 'Entregue', 15, '18/03/2023 08:00:00', 2),
	('29/03/2023', 'PIX', 'Em preparo', 15, '29/03/2023 11:00:00', null);

-- Atualizando infos de um determinado pedido
update pedido set meio_pagamento = 'Boleto' where id = 1;
update pedido set data_criacao  = '24/03/2023 10:00:00' where id = 1;

-- Inserindo fornecedores
insert into fornecedor(nome, cnpj, id_endereco) values
	('Shampoos da hora', '01234567898765', 6),
	('Cabelos em dia', '98765432101234', 7);

-- Definindo a relação entre produtos e pedidos
insert into item_pedido(id_pedido, id_produto, quantidade, valor) values
	(5,1,2,'5.98'), (5,2,1,'2.99'),
	(6,1,2,'5.98'), (6,2,1,'2.99'),
	(7,2,2,'5.98'), (7,3,1,'2.99'),
	(8,3,2,'5.98'), (8,2,1,'2.99'),
	(9,4,2,'5.98'), (9,2,1,'2.99'),
	(10,5,2,'5.98'), (10,2,1,'2.99');

-- Definição da relação fornecedor-produto
insert into fornecedor_produto (id_produto, id_fornecedor) values
	(1,5), (2,5), (3,5), (4,6), (5,6);

-- Definindo endereços de estoque
insert into estoque(id_endereco) values (7), (8);

-- Criando relação entre produto e estoque
insert into produto_estoque(id_estoque, id_produto, quantidade) values
	(1,1,30), (1,2,40), (1,3,30), (2,4,8), (2,5,2);

-- Atualizando cliente que fez pedido para poder deletar um que não fez nenhum
update pedido set id_cliente = 14 where id = 9;
delete from cliente where id = 13;

-- Atualizando descrição e valor de produto
update produto set descricao = 'Shampoo anti-caspa', valor ='6.99' where id = 4;