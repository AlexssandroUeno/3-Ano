--1

/* TABLE PESSOA */
CREATE TABLE PESSOA (
  IDPESSOA NUMBER  (4 ) NOT NULL,
  NOME     VARCHAR2(40) NOT NULL,
  ENDERECO VARCHAR2(40) NOT NULL
);

/* TABLE REPUBLICA */
CREATE TABLE REPUBLICA (
  IDREP    NUMBER  (4 ) NOT NULL,
  NOME     VARCHAR2(40) NOT NULL,
  ENDERECO VARCHAR2(40) NOT NULL
);

/* TABLE ESTUDANTE */
CREATE TABLE ESTUDANTE (
  IDESTUDANTE NUMBER  (4 ) NOT NULL,
  EMAIL       VARCHAR2(40) NOT NULL,
  IDPESSOA    NUMBER  (4 ) NOT NULL,
  IDREP       NUMBER  (4 )
);

/* TABLE FONEPESSOA*/
CREATE TABLE FONEPESSOA (
  IDPESSOA NUMBER   (4 ) NOT NULL,
  DDD      VARCHAR2 (2 ) NOT NULL,
  PREFIXO  VARCHAR2 (4 ) NOT NULL,
  NUMERO   VARCHAR2 (4 ) NOT NULL
);

--2
/* PRIMARY KEYS */
ALTER TABLE PESSOA ADD CONSTRAINT PK_IDPESSOA
PRIMARY KEY ( IDPESSOA );

ALTER TABLE REPUBLICA ADD CONSTRAINT PK_IDREP
PRIMARY KEY ( IDREP );
DESC FONEPESSOA;
ALTER TABLE FONEPESSOA ADD CONSTRAINT PK_IDPESSOA
PRIMARY KEY ( IDPESSOA,DDD,PREFIXO,NUMERO );

ALTER TABLE ESTUDANTE ADD CONSTRAINT PK_IDESTUDATE
PRIMARY KEY ( IDESTUDANTE );

/* FOREING KEY */
--IDPESSOA
ALTER TABLE ESTUDANTE ADD CONSTRAINT FK_IDPESSOA
 FOREIGN KEY ( IDPESSOA ) REFERENCES PESSOA ( IDPESSOA );
 --IDREP
 ALTER TABLE ESTUDANTE ADD CONSTRAINT FK_IDREP
 FOREIGN KEY ( IDREP ) REFERENCES REPUBLICA ( IDREP );
 
 --FONEPESSOA
 ALTER TABLE FONEPESSOA ADD CONSTRAINT FK_IDPESSOA
 FOREIGN KEY ( IDPESSOA ) REFERENCES PESSOA( IDPESSOA );
 
 --3
 
-- [ Pessoa  minímo 4 registros ]
DESC PESSOA;

  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 0, 'Jose Ricardo'              , 'rua 10'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 1, 'Tiagozan'                  , 'rua 20'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 2, 'Gabrrielzan'               , 'rua 30'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 3, 'HugZan'                    , 'rua 40'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 4, 'Edsonzan'                  , 'rua 50'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 5, 'Patrickzan'                , 'rua 60'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 6, 'Dogzan'                    , 'rua 70'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 7, 'Pedrozan'                  , 'rua 80'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 8, 'Roberto'                   , 'rua 90'  );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 9, 'Andrea Correa'             , 'rua 100' );
  INSERT INTO PESSOA ( IDPESSOA, NOME, ENDERECO ) VALUES ( 10, 'PROGRESS NETWORK CONTROL' , 'rua 110' );
 
 SELECT * FROM PESSOA;
 
--[ Republica 2 registros ] 
 DESC REPUBLICA;
 
  INSERT INTO REPUBLICA ( IDREP, NOME, ENDERECO ) VALUES ( 100, 'Republica 80' , 'endereco 1' );
  INSERT INTO REPUBLICA ( IDREP, NOME, ENDERECO ) VALUES ( 101, 'Republica 90' , 'endereco 2' );
  INSERT INTO REPUBLICA ( IDREP, NOME, ENDERECO ) VALUES ( 102, 'Republica 100', 'endereco 3' );

SELECT * FROM REPUBLICA;

--  FONEPESSOA[ Mínimo 5 registros, sendo 1 telefone para cada pessoa e algumas pessoas com mais de um telefone ]
DESC FONEPESSOA;
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES (1, 43, 1234 , 4321 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES (1, 21, 4321 , 1234 );
  
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 2, 13, 1313 , 1313 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 2, 12, 1212 , 1212 );
  
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 3, 70, 9999, 2492 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 3, 55, 3698, 6542 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 3, 22, 2568, 1132 );
  
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 4, 66, 1254, 6854 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 4, 74, 7581, 5214);
  
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 5, 77, 6549, 6355 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 5, 79, 5421, 2444 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 5, 46, 6845, 1435 );
  
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 6,  10, 3348, 4089 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 7,  25, 0254, 2540 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 8,  27, 1250, 5780 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 9,  85, 1870, 6548 );
  INSERT INTO FONEPESSOA ( IDPESSOA, DDD, PREFIXO, NUMERO ) VALUES ( 10, 11, 3059, 6129 );
  
  SELECT * FROM FONEPESSOA;
  
 --ESTUDANTE 	Estudante – um registro para cada pessoa, para os estudantes moram em casa, o campo idRep será null.
 DESC ESTUDANTE;
 
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 500, 'jose@hotmail.com'      , 0 , 100 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 501, 'tiago@gmail.com'       , 1 , 100 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 502, 'gabriel@live.com.br'   , 2 , 100 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 503, 'hug9000@gmail.com'     , 3 , 101 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 504, 'esdon@unifil.br'       , 4 , 101 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 505, 'patrickn@hotmail.com'  , 5 , 102 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 506, 'dog@pet.com.br'        , 6 , 100 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 507, 'pedro@zan.com'         , 7 , 102 );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 508, 'roberto@atos.com'      , 8 , NULL );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 509, 'andrea@atos.com'       , 9 , NULL );
  INSERT INTO ESTUDANTE ( IDESTUDANTE, EMAIL, IDPESSOA, IDREP ) VALUES ( 510, 'pnc@gmail.com'         , 10, NULL );
  
SELECT * FROM ESTUDANTE;
SELECT * FROM PESSOA;
SELECT * FROM REPUBLICA;

--4

SELECT R.NOME, COUNT(E.IDESTUDANTE) QTD FROM REPUBLICA R, ESTUDANTE E
WHERE R.IDREP = E.IDREP
GROUP BY NOME;

SELECT IDPESSOA,NOME,ENDERECO FROM PESSOA
WHERE UPPER(NOME) LIKE '%zan%';

SELECT E.IDESTUDANTE,E.EMAIL, P.NOME,P.ENDERECO FROM ESTUDANTE E, PESSOA P
WHERE P.IDPESSOA = E.IDPESSOA AND E.IDREP IS NULL
ORDER BY P.NOME;

SELECT P.NOME, F.PREFIXO,F.DDD,F.NUMERO FROM PESSOA P, FONEPESSOA F
WHERE P.IDPESSOA = F.IDPESSOA
ORDER BY P.NOME;
