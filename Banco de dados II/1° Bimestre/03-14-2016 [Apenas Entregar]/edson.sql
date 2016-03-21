desc Fita;
--1
--A
ALTER TABLE FITA MODIFY ( COD_PRECO VARCHAR(6) NULL ); 
desc Fita;
/*
A)Resp:  Sim, porque ao colocar como o campo null, ele se torna opicional, 
assim tanto faze se tem numero ou nao naquela coluna.
*/

--B
ALTER TABLE FITA ADD( DAT_CADASTRO DATE NOT NULL );
desc FITA;
/*
B)Resp: Não, porque a tabela não está vazia e estamos querendo colocar 
uma nova coluna que não está preenchida ainda, sendo que ele nao aceita
ficar vazia.
*/

/*----------------------------------------------------------------*/

--2
ALTER TABLE PRECO MODIFY( DES_PRECO VARCHAR2(5) );
desc Preco;
/*
A) Resp: Não, porque já contém dados com valores maior do que varchar(5), 
não sendo possível diminui-la
*/

ALTER TABLE PRECO MODIFY( DES_PRECO VARCHAR2(30) );
desc Preco;
/*
B) Resp: Sim, porque alterar o tamanho do aceitável da coluna para maior
não tém problema, não causando perda de dados, caso aceitasse colocar menor.
*/

/*----------------------------------------------------------------*/

--3
--Resp:
SELECT DES_PRECO AS Descricao, VAL_PRECO AS Preco
FROM PRECO ORDER BY VAL_PRECO ASC ;

/*----------------------------------------------------------------*/

--4
--Resp:
SELECT MAX(VAL_PRECO) AS MAIOR_PRECO,MIN(VAL_PRECO) AS MENOR_PRECO
FROM PRECO;

/*----------------------------------------------------------------*/

--5
--Resp:
SELECT SUM(VAL_PRECO)AS SOMATORIA, AVG(VAL_PRECO) AS MEDIA FROM PRECO 
WHERE UPPER(COD_PRECO) = 'B' OR UPPER(COD_PRECO) = 'C' OR UPPER(COD_PRECO) = 'D';


/*----------------------------------------------------------------*/

--6
--Resp:
SELECT
  f.COD_GENERO            AS GENERO,
  SUM( p.VAL_PRECO )      AS MENOR,
  f.QTD_FITA              AS MAIOR,
FROM 
  FITA f
  INNER JOIN GENERO g ON ( f.COD_GENERO = g.COD_GENERO )
  INNER JOIN PRECO p ON  ( f.COD_PRECO  = p.COD_PRECO  );
/*----------------------------------------------------------------*/

--7
--Resp:
SELECT COD_GENERO AS ID, NOM_GENERO AS NOMES_GENEROS
FROM GENERO ORDER BY NOM_GENERO;

/*----------------------------------------------------------------*/

--8
--Resp:
clear sql;
desc GENERO;
desc FITA;
desc PRECO;

SELECT
  g.NOM_GENERO            AS GENERO,
  SUM( p.VAL_PRECO )      AS SOMA,
  f.QTD_FITA              AS QTD,
  AVG( p.VAL_PRECO )      AS MEDIA
FROM 
  FITA f
  INNER JOIN GENERO g ON ( f.COD_GENERO = g.COD_GENERO )
  INNER JOIN PRECO p ON  ( f.COD_PRECO  = p.COD_PRECO  );
  
--FROM 
--FROM GENERO g,FITA f,PRECO P 
--WHERE g.COD_GENERO = f.COD_GENERO AND p.COD_PRECO = f.COD_PRECO;

/*----------------------------------------------------------------*/