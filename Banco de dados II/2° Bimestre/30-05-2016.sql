Create table produto (
	Cod_produto	varchar2(5)	not null,
	Des_produto	varchar2(30)	not null,
	Qtd_produto   number(6,2)    not null,
	Val_produto   number(8,2) not null,
Constraint pk_produto primary key (cod_produto));

Create table nota_fiscal (
	Num_nf	number(5)	not null,
	Dat_emissao	date		not null,
	Cod_cliente	varchar2(11)	not null,
Constraint pk_nf primary key (num_nf));
Create table item_nota (
	Num_nf		number(5)	not null,
	Num_item		number(2)	not null,
	Cod_produto		varchar2(5)	not null,
Qtd_produto            number(6,2)    not null,
Val_produto		number(8,2) not null,
Constraint pk_itnf primary key (num_nf, num_item));

Alter Table nota_fiscal Add Constraint fk_cliente Foreign Key (cod_cliente) References cliente(codigo);

Alter Table item_nota Add Constraint fk_produto Foreign Key (cod_produto) References produto(cod_produto);

Alter Table item_nota Add Constraint fk_nf Foreign Key (num_nf) References nota_fiscal(num_nf);

desc nota_fiscal;
desc item_nota;
desc produto;

--------------produtos----------------------------
INSERT INTO produto VALUES(140,'banana',99);
INSERT INTO produto VALUES(141,'Arroz',44);
INSERT INTO produto VALUES(142,'Melão',33);
INSERT INTO produto VALUES(143,'Maça',22);
INSERT INTO produto VALUES(144,'Abacate',55);
INSERT INTO produto VALUES(145,'Feijoada',66);
------------------------------------------------

------------notafiscal------------------------------
INSERT INTO nota_fiscal VALUES(55,'30/05/2016',10);
INSERT INTO nota_fiscal VALUES(65,'30/05/2016',11);
-- 
  ------ item nota fiscal
    INSERT INTO ITEM_NOTA VALUES(55,1,143,1);
    INSERT INTO ITEM_NOTA VALUES(55,2,145,10);
    INSERT INTO ITEM_NOTA VALUES(55,3,141,5);

-----------------------------------------
---------BAIXA DE ESTOQUE-------
Select * from produto;

UPDATE PRODUTO set QTD_PRODUTO = QTD_PRODUTO - 1 WHERE COD_PRODUTO = 143;
UPDATE PRODUTO set QTD_PRODUTO = QTD_PRODUTO - 10 WHERE COD_PRODUTO = 145;
UPDATE PRODUTO set QTD_PRODUTO = QTD_PRODUTO - 5 WHERE COD_PRODUTO = 141;

Select * from produto;


desc nota_fiscal;

SELECT pt.COD_PRODUTO, count(*)
FROM 
PRODUTO pt, 
ITEM_NOTA inf
WHERE pt.cod_PRODUTO = inf.cod_PRODUTO
GROUP BY (pt.cod_PRODUTO)
HAVING (count(*) > 5);

/*8*/
select * from cliente c left join nota_fiscal n on(c.cod_cliente = n.COD_CLIENTE) where n.cod_cliente is null

/*9*/
select (CASE WHEN n.COD_CLIENTE is null then c.nome else c.nome || ' ' || n.num_nf end ) 
from cliente c left join nota_fiscal n on(c.cod_cliente = n.COD_CLIENTE)

/*10*/ 
select n.num_nf, n.dat_emissao, c.nome, p.DES_PRODUTO, p.QTD_PRODUTO
from nota_fiscal n 
inner join cliente c on(c.cod_cliente = n.COD_CLIENTE)
inner join item_nota i on(n.num_nf = i.num_nf)
inner join produto p on(i.cod_produto = p.cod_produto)

commit;
