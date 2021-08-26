
DROP DATABASE IF EXISTS personal;
CREATE DATABASE personal CHARACTER SET utf8mb4;
USE personal;

CREATE TABLE departamentos (
    codDepto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombreDpto VARCHAR(20) NOT NULL,
    ciudad VARCHAR(15) NULL,
    codDirector VARCHAR(12) NULL);

CREATE TABLE empleados (
  nDIEmp INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nomEmp CHAR(30) NOT NULL,
  sexEmp CHAR(1) NOT NULL,
  fecNac DATE NOT NULL,
  fecIncorporacion DATE NOT NULL,
  salEmp FLOAT NOT NULL,
  comisionE FLOAT NOT NULL,
  cargoE VARCHAR(15) NOT NULL,
  jefeID VARCHAR(12) NULL,  
  codDepto INT UNSIGNED NOT NULL,
  FOREIGN KEY (codDepto) REFERENCES departamentos(codDepto));
  
		-- Insertar datos en la tabla `departamentos`
INSERT INTO `departamentos` VALUES (1000,'GERENCIA','CIUDAD REAL','31.840.269');
INSERT INTO `departamentos` VALUES (1500,'PRODUCCIÓN','CIUDAD REAL','16.211.383');
INSERT INTO `departamentos` VALUES (2000,'VENTAS','CIUDAD REAL','31.178.144');
INSERT INTO `departamentos` VALUES (2100,'VENTAS','BARCELONA','16.211.383');
INSERT INTO `departamentos` VALUES (2200,'VENTAS','VALENCIA','16.211.383');
INSERT INTO `departamentos` VALUES (2300,'VENTAS','MADRID','16.759.060');
INSERT INTO `departamentos` VALUES (3000,'INVESTIGACIÓN','CIUDAD REAL','16.759.060');
INSERT INTO `departamentos` VALUES (3500,'MERCADEO','CIUDAD REAL','22.222.222');
INSERT INTO `departamentos` VALUES (4000,'MANTENIMIENTO','CIUDAD REAL','333.333.333');
INSERT INTO `departamentos` VALUES (4100,'MANTENIMIENTO','BARCELONA','16.759.060');
INSERT INTO `departamentos` VALUES (4200,'MANTENIMIENTO','VALENCIA','16.759.060');
INSERT INTO `departamentos` VALUES (4300,'MANTENIMIENTO','MADRID','16.759.060');

		-- Insertar datos en la tabla `empleados`
INSERT INTO `empleados` VALUES (222,'José Giraldo','M','1985-01-20','2000-11-01',1200000,400000,'Asesor','22.222.222',3500);
INSERT INTO `empleados` VALUES (333,'Pedro Blanco','M','1987-10-28','2000-10-01',800000,3000000,'Vendedor','31.178.144',2000);
INSERT INTO `empleados` VALUES (444,'Jesús Alfonso','M','1988-03-14','2000-10-01',800000,3500000,'Vendedor','31.178.144',2000);
INSERT INTO `empleados` VALUES (555,'Julián Mora','M','1989-07-03','2000-10-01',800000,3100000,'Vendedor','31.178.144',2200);
INSERT INTO `empleados` VALUES (666,'Manuel Millán','M','1990-12-08','2004-06-01',800000,3700000,'Vendedor','31.178.144',2300);
INSERT INTO `empleados` VALUES (777,'Marcos Cortez','M','1986-06-23','2000-04-16',2550000,500000,'Mecánico','333.333.333',4000);
INSERT INTO `empleados` VALUES (782,'Antonio Gil','M','1980-01-23','2010-04-16',850000,1500000,'Técnico','16.211.383',1500);
INSERT INTO `empleados` VALUES (219,'Melissa Roa','F','1960-06-19','2001-03-16',2250000,2500000,'Vendedor','31.178.144',2100);
INSERT INTO `empleados` VALUES (111,'Irene Díaz','F','1979-09-28','2004-06-01',1050000,200000,'Mecánico','333.333.333',4200);
INSERT INTO `empleados` VALUES (383,'Luis Pérez','M','1956-02-25','2000-01-01',5050000,0,'Director','31.840.269',1500);
INSERT INTO `empleados` VALUES (060,'Darío Casas','M','1960-04-05','1992-11-01',4500000,500000,'Investigador','31.840.269',3000);
INSERT INTO `empleados` VALUES (802,'William Daza','M','1982-10-09','1999-12-16',2250000,1000000,'Investigador','16.759.060',3000);
INSERT INTO `empleados` VALUES (221,'Carla López','F','1975-05-11','2005-07-16',4500000,500000,'Jefe Mercadeo','31.840.269',3500);
INSERT INTO `empleados` VALUES (331,'Carlos Rozo','M','1975-05-11','2001-09-16',750000,500000,'Vigilante','31.840.269',3500);
INSERT INTO `empleados` VALUES (099,'Diana Solarte','F','1957-11-19','1990-05-16',1250000,500000,'Secretaria','31.840.269',1000);
INSERT INTO `empleados` VALUES (144,'Rosa Angulo','F','1957-03-15','1998-08-16',3250000,3500000,'Jefe Ventas','31.840.269',2000);
INSERT INTO `empleados` VALUES (269,'María Rojas','F','1959-01-15','1990-05-16',6250000,1500000,'Gerente',NULL,1000);
INSERT INTO `empleados` VALUES (343,'Elisa Rojas','F','1979-09-28','2004-06-01',3000000,1000000,'Jefe Mecánicos','31.840.269',4000);
INSERT INTO `empleados` VALUES (334,'Marisol Pulido','F','1979-10-01','1990-05-16',3250000,1000000,'Investigador','16.759.060',3000);
INSERT INTO `empleados` VALUES (335,'Ana Moreno','F','1992-01-05','2004-06-01',1200000,400000,'Secretaria','16.759.060',3000);
INSERT INTO `empleados` VALUES (336,'Carolina Ríos','F','1992-02-15','2000-10-01',1250000,500000,'Secretaria','16.211.383',1500);
INSERT INTO `empleados` VALUES (337,'Edith Muñoz','F','1992-03-31','2000-10-01',800000,3600000,'Vendedor','31.178.144',2100);
INSERT INTO `empleados` VALUES (338,'Abel Gómez','M','1939-12-24','2000-10-01',1050000,200000,'Mecánico','333.333.333',4300);
INSERT INTO `empleados` VALUES (689,'Mario Llano','M','1945-08-30','1990-05-16',2250000,2500000,'Vendedor','31.178.144',2300);
INSERT INTO `empleados` VALUES (785,'Joaquín Rosas','M','1947-07-07','1990-05-16',2250000,2500000,'Vendedor','31.178.144',2200);
INSERT INTO `empleados` VALUES (898,'Iván Duarte','M','1955-08-12','1998-05-16',1050000,200000,'Mecánico','333.333.333',4100);


-- 1. Obtener los datos completos de los empleados.
select * from empleados;
-- 2. Obtener los datos completos de los departamentos.
select * from departamentos;
-- 3. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
select * from empleados where lower(cargoE) = 'secretaria';
-- 4. Obtener el nombre y salario de los empleados.
select nomemp, salemp from empleados;
-- 5. Obtener los datos de los empleados vendedores, ordenado por nombre.
select * from personal.empleados where lower(cargoE) = 'vendedor'order by nomEmp asc;
-- 6. Listar el nombre de los departamentos.
select distinct nombreDPto from departamentos;
-- 7. Obtener el nombre y cargo de todos los empleados, ordenado por salario.
select nomEmp, cargoE, salemp from empleados order by salemp;
-- 8. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión.
select salemp, comisione from empleados order by comisione;
-- 9. Listar todas las comisiones.
select distinct comisione from empleados;
-- 10. Obtener el valor total a pagar que resulta de sumar a los empleados del departamento 3000 una bonificación +500 k, en orden alfabético del empleado.
select nomemp, salemp, (salemp + 500000) as 'pago estimado' from empleados where codDepto = '3000' order by nomemp;
-- 11. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
select nomemp, salemp, comisione from empleados where comisionE > salEmp;
-- 12. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
select nomemp, salemp, comisione from empleados where comisionE <= (salEmp*0.3);
-- 13. Elabore un listado donde para cada fila, figure ‘Nombre’ y ‘Cargo’ antes del valor respectivo para cada empleado.
select nomemp as 'Nombre', cargoe as 'Cargo' from empleados;
-- 14. Hallar el salario y la comisión de aquellos empleados cuyo número de documento de identidad es superior al ‘19.709.802’.
select nDIEmp, salemp, comisione from empleados where jefeID > '19.709.802';
-- 15. Muestra los empleados cuyo nombre empiece entre las letras J y Z (rango). Liste estos empleados y su cargo por orden alfabético.
select nomemp, cargoe from empleados where lower(nomemp) > 'j' and lower(nomemp) < 'z' order by nomemp;
select nomemp, cargoe from empleados where nomemp between 'j%' and 'z%' order by nomemp, cargoe asc; #solo cuando se repita el primer parámetro.
-- 16. Listar el salario, la comisión, el salario total (salario + comisión), documento de identidad del empleado y nombre, de aquellos empleados que tienen comisión superior a 1.000.000, ordenar el informe por el número del documento de identidad.
select salemp, comisione, (salemp + comisione) as 'Salario total', ndiemp from empleados where comisione > 1000000 order by ndiemp;
-- 17. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
select salemp, comisione, (salemp + comisione) as 'Salario total', ndiemp from empleados where comisione = 0 order by ndiemp;
-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”.
select nomEmp from empleados where lower(nomEmp) not like '%ma%';
-- 19. Obtener los nombres de los departamentos que no sean “Ventas”, “Investigación” ni ‘MANTENIMIENTO’.
select nombreDpto from departamentos where lower(nombreDpto) not in ('ventas', 'investigación', 'mantenimiento');
-- 20. Obtener el nombre y el departamento de los empleados con cargo ‘Secretaria’ o ‘Vendedor’, que no trabajan en el departamento de “PRODUCCION”, cuyo salario es superior a $1.000, ordenados por fecha de incorporación.
select e.nomemp, cargoe, d.nombreDpto from empleados e, departamentos d where e.codDepto = d.codDepto and (e.cargoE = 'secretaria' or e.cargoE ='vendedor') and d.nombreDpto <> 'produccion' and e.salEmp > 1000 order by e.fecIncorporacion;
-- 21. Obtener información de los empleados cuyo nombre tiene exactamente 11 caracteres
select * from empleados where char_length(nomemp) = 11 order by nomemp asc;
-- 22. Obtener información de los empleados cuyo nombre tiene al menos 11 caracteres
select * from empleados where char_length(nomemp) >= 11 order by nomemp asc;
-- 23. Listar los datos de los empleados cuyo nombre inicia por la letra ‘M’, su salario es mayor a $800.000 o reciben comisión y trabajan para el departamento de ‘VENTAS’
select e.nomEmp, d.nombreDpto, e.salEmp from empleados e, departamentos d where e.codDepto = d.codDepto and lower(e.nomEmp) like 'm%' and (e.salEmp > 800000 or e.comisionE>0) and lower(d.nombreDpto)<>'ventas' order by e.nomemp;
-- 24. Obtener los nombres, salarios y comisiones de los empleados que reciben un salario situado entre la mitad de la comisión la propia comisión.
select nomEmp, salEmp, comisionE from empleados where salEmp between (comisionE/2) and comisionE;
-- 25. Mostrar el salario más alto de la empresa.
select nomemp, max(salEmp) as 'Salario mayor' from empleados;
-- 26. Mostrar cada una de las comisiones y el número de empleados que las reciben. Solo si tiene comision.
select comisionE, count(*) as 'Num empleados' from empleados group by comisionE having comisionE > 0;
-- 27. Mostrar el nombre del último empleado de la lista por orden alfabético.
select max(nomemp) as 'Último de la lista (alfabeticamente)' from empleados;
-- 28. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
select max(salemp) as 'Salario mayor', min(salemp) as 'Salario menor',  max(salemp) - min(salemp) as 'Diferencia' from empleados;
-- 29. Mostrar el número de empleados de sexo femenino y de sexo masculino, por departamento.
select codDepto, sexemp, count(*) from empleados group by codDepto, sexemp;
-- 30. Hallar el salario promedio por departamento.
select codDepto, avg(salemp) from empleados group by codDepto;
-- 31. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
select nDIEmp, salEmp from empleados where salemp >= avg(e.salemp);
select nDIEmp, salEmp from empleados where salemp >= (select avg(salemp) from empleados);
-- 32. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
select d.codDepto, d.nombreDpto, count(*) as 'Num empleados'from departamentos d, empleados e where d.codDepto=e.codDepto group by d.codDepto having count(*) >= 3;
-- 33. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan mas de dos empleados (2 incluido).
select d.nDIEmp, d.nomEmp, count(*) as 'Num Empleados'from empleados e, empleados d where e.codDepto = d.codDepto group by d.nomEmp having count(*)>=2 order by count(*) desc;
-- 34. Hallar los departamentos que no tienen empleados
select d.codDepto, d.nombreDpto from departamentos d, empleados e where d.codDepto=e.codDepto group by d.codDepto having count(*) = 1;
-- 35. Mostrar el nombre del departamento cuya suma de salarios sea la más alta, indicando el valor de la suma.
select d.nombreDpto, sum(e.salEmp) 
from departamentos d, empleados e 
where d.codDepto = e.codDepto 
group by d.nombreDpto 
order by sum(e.salEmp) 
desc limit 1;

