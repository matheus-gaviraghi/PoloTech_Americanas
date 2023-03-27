set schema 'ecommerce';

insert into cliente (id, nome, cpf, email) values
	(default, 'Fernando', '60899443001', 'teste@teste.com.br'),
	(default, 'Ana Maria', '56749219039', 'teste2@teste.com.br'),
	(default, 'Juliana', '76149942058', 'teste3@teste.com.br'),
	(default, 'Juliano', '24759727000', 'teste4@teste.com.br'),
	(default, 'Josefina', '88084882090', 'teste5@teste.com.br');

insert into carrinho (id_cliente) 
	select id from cliente;

insert into produto (id, descricao,codigo_barras,valor) values 
	(default, 'Carrinho de Controlee Remoto', '558534037291', 50.00),
	(default, 'Boneca da Barbie', '946649472388', 45.99),
	(default, 'Jogo da Memoria', '488094762624', 60.00),
	(default, 'War', '735254781293', 150.00),
	(default, 'Banco Imobiliário', '214026648390', 125.00);

insert into carrinho_produto (id,id_carrinho,id_produto) values 
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '60899443001'),(select p.id from produto p where p.codigo_barras  = '558534037291')),
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '60899443001'),(select p.id from produto p where p.codigo_barras = '488094762624')),
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '24759727000'),(select p.id from produto p where p.codigo_barras = '946649472388')),
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '24759727000'),(select p.id from produto p where p.codigo_barras = '214026648390')),
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '24759727000'),(select p.id from produto p where p.codigo_barras = '488094762624')),
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '76149942058'),(select p.id from produto p where p.codigo_barras = '558534037291')),
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '56749219039'),(select p.id from produto p where p.codigo_barras = '214026648390')),
	(default, (select c.id from carrinho c join cliente cli on cli.id = c.id_cliente where cli.cpf = '56749219039'),(select p.id from produto p where p.codigo_barras = '735254781293'));

insert into cupom (id, data_expiracao,data_inicio,valor,descricao,codigo_cupom) values
	(default, '2023-05-05', '2023-03-27', 20.00, 'Primeira compra no APP', 'APP20'),
	(default, '2023-11-25', '2023-01-01', 35.00, 'Descontro Black Friday', 'BLACK35'),
	(default, '2023-12-25', '2023-01-01', 25.00, 'Desconto de Natal', 'NATAL25');

insert into endereco (id, cep, logradouro, estado, cidade, uf) values
	(default, '29200100','Avenida Trajano Lino Gonçalves','Espírito Santo','Guarapari','ES'),
	(default, '74893160','Rua 3 Unidade 207','Goiás','Goiânia','GO'),
	(default, '69021525','Rua Surucuá','Amazonas','Manaus','AM');

insert into endereco_cliente (id, id_cliente, id_endereco, numero_residencia) values 
	(default, (select c.id from cliente c where c.cpf='60899443001'),(select e.id from endereco e where e.cep='29200100'),'57'),
	(default, (select c.id from cliente c where c.cpf='56749219039'),(select e.id from endereco e where e.cep='74893160'),'57'),
	(default, (select c.id from cliente c where c.cpf='76149942058'),(select e.id from endereco e where e.cep='69021525'),'57'),
	(default, (select c.id from cliente c where c.cpf='60899443001'),(select e.id from endereco e where e.cep='29200100'),'65');

insert into pedido (id, previsao_entrega, meio_pagamento, status, id_cliente, id_endereco_entrega,id_cupom) values
	(default, '2023-04-24', 'PIX', 'Preparando', 
		(select c.id from cliente c where c.cpf='60899443001'), 
		(select max(ec.id) from endereco_cliente ec join cliente cli on cli.id = ec.id_cliente where cli.cpf='60899443001'), 
		(select cp.id from cupom cp where cp.codigo_cupom='APP20')),
	(default, '2023-04-01', 'PIX', 'Em Rota de Entrega', 
		(select c.id from cliente c where c.cpf='76149942058'), 
		(select max(ec.id) from endereco_cliente ec join cliente cli on cli.id = ec.id_cliente where cli.cpf='76149942058'), 
		(select cp.id from cupom cp where cp.codigo_cupom='APP20'));
		
insert into fornecedor (id, cnpj, razao_social) values 
	(default,'81133458000110','Submarino'),
	(default,'42563116000189','Americanas');

insert into fornecedor_produto (id, id_fornecedor,id_produto) values
	(default, (select f.id from fornecedor f where f.cnpj='81133458000110'),(select p.id from produto p where p.codigo_barras = '735254781293')),
	(default, (select f.id from fornecedor f where f.cnpj='42563116000189'),(select p.id from produto p where p.codigo_barras = '558534037291')),
	(default, (select f.id from fornecedor f where f.cnpj='42563116000189'),(select p.id from produto p where p.codigo_barras = '488094762624')),
	(default, (select f.id from fornecedor f where f.cnpj='81133458000110'),(select p.id from produto p where p.codigo_barras = '735254781293')),
	(default, (select f.id from fornecedor f where f.cnpj='81133458000110'),(select p.id from produto p where p.codigo_barras = '214026648390'));

insert into estoque (id,id_endereco,numero_localizacao) values 
	(default, (select e.id from endereco e where e.cep='29200100'), '35'),
	(default, (select e.id from endereco e where e.cep='74893160'), '99');

insert into estoque_produto (id,id_produto,id_estoque,quantidade) values
	(default, (select p.id from produto p where p.codigo_barras = '214026648390'), 1, 40),
	(default, (select p.id from produto p where p.codigo_barras = '735254781293'), 1, 140),
	(default, (select p.id from produto p where p.codigo_barras = '488094762624'), 2, 100),
	(default, (select p.id from produto p where p.codigo_barras = '558534037291'), 2, 60),
	(default, (select p.id from produto p where p.codigo_barras = '735254781293'), 1, 200),
	(default, (select p.id from produto p where p.codigo_barras = '558534037291'), 1, 50);












