
insert into produto (nome,preco_sugerido) values ('PC',2000.0);
insert into produto (nome,preco_sugerido) values ('MOUSE',197.5);

insert into cliente (nome,cpf,data_nascimento) 
values ('lucas','12345678900',now());
insert into cliente (nome,cpf,data_nascimento) 
values ('Claudio','12345678900',STR_TO_DATE('08/12/1985', '%d/%m/%Y'));

insert into pedido (id_cliente,valor) values (1,2000);
insert into pedido (id_cliente,valor) values (2,4187.5);

insert into item_pedido (id_pedido,id_produto,quantidade,preco) 
values (1,1,1,2000);
insert into item_pedido (id_pedido,id_produto,quantidade,preco) 
values (2,1,2,2000);
insert into item_pedido (id_pedido,id_produto,quantidade,preco) 
values (2,2,1,187.5);

