Create table produto (
	Cod_produto	varchar2(5)	not null,
	Des_produto	varchar2(30)	not null,
	Qtd_produto   number(6,2)    not null,
Constraint pk_produto primary key (cod_produto));

Create table nota_fiscal (
	Num_nf	number(5)	not null,
	Dat_emissao	date		not null,
	Cod_cliente	number(5)	not null,
Constraint pk_nf primary key (num_nf));

Create table item_nota (
	Num_nf		number(5)	not null,
	Num_item		number(2)	not null,
	Cod_produto		varchar2(5)	not null,
Qtd_produto               number(6,2)    not null,
Constraint pk_itnf primary key (num_nf, num_item));

Alter Table item_nota Add Constraint fk_produto Foreign Key (cod_produto) References produto(cod_produto);

Alter Table item_nota Add Constraint fk_nf Foreign Key (num_nf) References nota_fiscal(num_nf);


desc PRODUTO;
/* Inserido produtos*/
INSERT INTO PRODUTO(COD_PRODUTO, DES_PRODUTO,QTD_PRODUTO) VALUES(100,'produto1',10);
INSERT INTO PRODUTO(COD_PRODUTO, DES_PRODUTO,QTD_PRODUTO) VALUES(110,'produto2',10);
INSERT INTO PRODUTO(COD_PRODUTO, DES_PRODUTO,QTD_PRODUTO) VALUES(120,'produto3',10);
INSERT INTO PRODUTO(COD_PRODUTO, DES_PRODUTO,QTD_PRODUTO) VALUES(130,'produto4',10);

/* Inserindo notafiscal */
desc NOTA_FISCAL;
INSERT INTO NOTA_FISCAL(NUM_NF, DAT_EMISSAO, COD_CLIENTE) VALUES (500, '20/01/2015', 40);
INSERT INTO NOTA_FISCAL(NUM_NF, DAT_EMISSAO, COD_CLIENTE) VALUES (501, '24/02/2015', 41);

/* Inserindo Item Nota*/
desc ITEM_NOTA;
INSERT INTO ITEM_NOTA (NUM_NF,NUM_ITEM, COD_PRODUTO, QTD_PRODUTO) VALUES(500,1,120, 2);
INSERT INTO ITEM_NOTA (NUM_NF,NUM_ITEM, COD_PRODUTO, QTD_PRODUTO) VALUES(500,2,130, 5);


/*Fazendo baixo do estoque do produto*/
UPDATE PRODUTO SET QTD_PRODUTO = QTD_PRODUTO - 2 WHERE COD_PRODUTO = 120;
UPDATE PRODUTO SET QTD_PRODUTO = QTD_PRODUTO - 5 WHERE COD_PRODUTO = 130;


COMMIT;
  CREATE INDEX MYINDEX ON PRODUTO(COD_PRODUTO);
COMMIT;