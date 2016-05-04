/*lista o nome de todos os países e cidades que possuem departamentos localizados.
*/
select p.COUNTRY_NAME, l.CITY from COUNTRIES p, LOCATIONS l
where p.COUNTRY_ID = l.COUNTRY_ID;

/*lista o nome de todos os países e cidades que possuem departamentos localizados.
Caso o país não tenha nenhum departamento localizado, deseja-se exibi-lo mesmo assim.
*/
select p.COUNTRY_NAME, l.CITY from COUNTRIES p, LOCATIONS l
where p.COUNTRY_ID = l.COUNTRY_ID (+)
order by p.COUNTRY_ID;

select p.COUNTRY_NAME, l.CITY
from COUNTRIES p left outer join LOCATIONS l
on p.COUNTRY_ID = l. COUNTRY_ID
order by p.COUNTRY_ID;


/*
Buscar o primeiro e o último nome e o salário do empregado com o
maior salário
*/
select e.FIRST_NAME, e.LAST_NAME, e.SALARY
from EMPLOYEES e
where e.SALARY = (select max(SALARY) from EMPLOYEES);

*/ Buscar o primeiro e o último nome dos empregados e o código do
departamento cujo nome do departamento comece com a letra 'A'.
*/
select e.FIRST_NAME, e.LAST_NAME, e.DEPARTMENT_ID
from EMPLOYEES e
where e.DEPARTMENT_ID IN
(select DEPARTMENT_ID from DEPARTMENTS
where DEPARTMENT_NAME like 'A%');

select * from departments
order by DEPARTMENT_NAME;

*/ 
Buscar o código do departamento, o primeiro e o último nome e o
salário do empregado com o maior salário do seu departamento.
*/
select e.DEPARTMENT_ID,
e.FIRST_NAME, e.LAST_NAME, e.SALARY
from EMPLOYEES e
where e.SALARY = any 
(select max(ei.SALARY) from EMPLOYEES ei
where ei.DEPARTMENT_ID = e.DEPARTMENT_ID)
order by e.DEPARTMENT_ID;

select salary from employees
where department_id = 20;
