
create schema if not exists testDb;

CREATE TABLE produto
( id INT(11) NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  preco_sugerido DECIMAL(10,2) NOT NULL,
  CONSTRAINT produto_pk PRIMARY KEY (id)
);

CREATE TABLE cliente
( id INT(11) NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  cpf char(11) NOT NULL,
  data_nascimento date,
  CONSTRAINT produto_pk PRIMARY KEY (id),
  CONSTRAINT CK_CPF check (LENGTH(cpf)=11)
);

CREATE TABLE pedido
( id INT(11) NOT NULL AUTO_INCREMENT,
  id_cliente INT(11) NOT NULL,
  valor DECIMAL(10,2) NOT NULL,
  CONSTRAINT pedido_pk PRIMARY KEY (id),
  CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

CREATE TABLE item_pedido
( id INT(11) NOT NULL AUTO_INCREMENT,
  id_pedido INT(11) NOT NULL,
  id_produto INT(11) NOT NULL,
  quantidade DECIMAL(10,2) NOT NULL,
  preco DECIMAL(10,2) NOT NULL,
  CONSTRAINT item_pedido_pk PRIMARY KEY (id),
  CONSTRAINT fk_pedido FOREIGN KEY (id_pedido) REFERENCES pedido(id),
  CONSTRAINT fk_produto FOREIGN KEY (id_produto) REFERENCES produto(id)
);










