desc COUNTRIES;
desc DEPARTMENTS;
desc REGIONS;

-- lista o nome de todos os países e cidades que possuem departamentos localizados.
SELECT c.COUNTRY_NAME, l.CITY FROM COUNTRIES c, LOCATIONS l
WHERE c.COUNTRY_ID = l.COUNTRY_ID; 

-- lista o nome de todos os países e cidades que possuem departamentos localizados.
-- Caso o país não tenha nenhum departamento localizado, deseja-se exibi-lo mesmo assim.
SELECT c.COUNTRY_NAME, l.CITY FROM COUNTRIES c
LEFT OUTER JOIN LOCATIONS l ON (c.COUNTRY_ID=l.COUNTRY_ID);

-- Buscar o primeiro e o último nome e o salário do empregado com o
-- maior salário
select e.first_name, e.last_name, e.salary
from EMPLOYEES e
where salary = any (select max(salary) from employees);

-- Buscar o primeiro e o último nome dos empregados e o código do
-- departamento cujo nome do departamento comece com a letra 'A'.
select e.first_name, e.last_name, e.department_id
from EMPLOYEES e
where department_id = any (select department_id from DEPARTMENTS where department_name like 'A%');

-- Buscar o código do departamento, o primeiro e o último nome e o
-- salário do empregado com o maior salário do seu departamento.
select e.department_id, e.first_name, e.last_name, e.salary
from employees e
where salary = any (select max(salary) from employees e group by e.department_id);
