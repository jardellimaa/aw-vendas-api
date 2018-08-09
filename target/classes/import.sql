insert into Cliente (id, nome) values (1, 'Eletrônicos Eletro');
insert into Cliente (id, nome) values (2, 'Smart Compras');

insert into Produto (id, nome, valor) values (1, 'Notebook', 2950.0);
insert into Produto (id, nome, valor) values (2, 'SmarthPhone', 1800.0);
insert into Produto (id, nome, valor) values (3, 'Tablet', 1100.0);

insert into Venda (id, cliente_id, frete, total, cadastro) values (1, 1, 15.0, 2965.0, sysdate());

insert into Item (id, venda_id, produto_id, quantidade) values (1, 1, 1, 1);