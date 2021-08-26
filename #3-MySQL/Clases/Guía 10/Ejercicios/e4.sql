DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo));

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);


-- 1. Lista el nombre de todos los productos que hay en la tabla producto.
select nombre from producto;
-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.
select nombre, precio from producto;
-- 3. Lista todas las columnas de la tabla producto.
select * from producto;
-- 4. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).
select nombre, precio, (precio / 90.4) as 'USD', (precio / 120) as 'EUR' from producto;
-- 5. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a mayúscula.
select UCASE(nombre) as 'nombre', precio from producto;
-- 6. Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en mayúsculas los dos primeros caracteres del nombre del fabricante.
select nombre, UCASE(SUBSTRING(nombre, 3)) AS 'nombre con 2 MAYUS' from fabricante;
-- 7. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
select nombre, round(precio) as 'precio' from producto; #para arriba
-- 8. Lista los nombres y los precios de todos los productos de la tabla producto, truncando el valor del precio para mostrarlo sin ninguna cifra decimal.
select nombre, truncate(precio, 0) as precio from producto; #para abajo
-- 9. Lista el código de los fabricantes que tienen productos en la tabla producto.
select f.nombre, f.codigo from producto p, fabricante f where p.codigo_fabricante = f.codigo;
-- 10. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
select distinctrow p.codigo_fabricante from producto p, fabricante f where p.codigo_fabricante = f.codigo;
-- 11. Lista los nombres de los fabricantes ordenados de forma ascendente.
select nombre from fabricante order by nombre asc;
-- 12. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
select nombre, precio from producto order by nombre asc, precio desc; #precio se ordena en casod e haber 2 nombres iguales
-- 13. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
select * from fabricante limit 5;
-- 14. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre, precio from producto order by precio asc limit 5;
-- 15. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre, precio from producto order by precio desc limit 5;
-- 16. Lista el nombre de todos los productos del fabricante cuyo código de fabricante es igual a 2.
select nombre, codigo_fabricante from producto where codigo_fabricante = 2;
-- 17. Lista el nombre de los productos que tienen un precio menor o igual a $120.
select nombre, precio from producto where precio <= 120;
-- 18. Lista todos los productos que tengan un precio entre $80 y $300. Sin utilizar el operador BETWEEN.
select nombre, precio from producto where precio < 300 and precio > 80;
-- 19. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
select nombre, precio from producto where precio between 60 and 200;
-- 20. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Sin utilizar el operador IN.
select * from producto where codigo_fabricante = 1 or codigo_fabricante = 3 or codigo_fabricante = 5;
-- 21. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
select * from producto where codigo_fabricante in (1,3,5);
-- 22. Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar por 100 el valor del precio). Cree un alias para la columna que contiene el precio que se llame céntimos.
select nombre, (precio * 100) as 'Céntimos' from producto;
-- 23. Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres.
select nombre from fabricante where char_length(nombre) = 4;
-- 24. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
select nombre from producto where nombre like '%Portátil%';

#Consultas multitabla (Composición interna)
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
select p.codigo, p.nombre, f.codigo, f.nombre from producto p inner join fabricante f on p.codigo_fabricante = f.codigo;
-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético.
select p.nombre, p.precio, f.nombre from producto p inner join fabricante f on p.codigo_fabricante = f.codigo order by f.nombre asc;
-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
select p.nombre, p.precio, f.nombre from producto p inner join fabricante f on p.codigo_fabricante = f.codigo order by p.precio asc limit 1;
-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
select * from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where f.nombre like '%Lenovo%';
-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
select * from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where f.nombre like '%crucial%' and p.precio > 200;
-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Sin utilizar el operador IN.
select * from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where f.nombre like '%asus%' or f.nombre like '%Hewlett-Packard%';
-- 7. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
select * from producto p inner join fabricante f where f.nombre in('asus', 'Hewlett-Packard');
-- 8. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
select p.nombre, p.precio, f.nombre from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where p.precio >= 180 order by p.precio desc, p.nombre asc;


#Consultas multitabla (Composición externa)
# Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que no tienen productos asociados.
select p.nombre, f.nombre, f.codigo from fabricante f left join producto p on f.codigo = p.codigo_fabricante;
select p.nombre, f.nombre, f.codigo from producto p right join fabricante f on f.codigo = p.codigo_fabricante;
-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.
select p.nombre, f.nombre from fabricante f left join producto p on f.codigo = p.codigo_fabricante where p.codigo_fabricante is null;


#Subconsultas (En la cláusula WHERE)
#Con operadores básicos de comparación
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
select * from fabricante f, producto p where f.codigo = p.codigo_fabricante and f.nombre like 'lenovo';
-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
select * from producto where precio = (select max(p.precio) from producto p, fabricante f where f.codigo = p.codigo_fabricante and f.nombre like 'lenovo') and codigo_fabricante != 2;
-- 3. Lista el nombre del producto más caro del fabricante Lenovo.
select p.nombre from producto p inner join fabricante f on p.codigo_fabricante = f.codigo where f.nombre like 'lenovo' order by p.precio desc limit 1;
-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
select * from producto where codigo_fabricante = (select codigo from fabricante where nombre like 'asus') and precio > (select avg(precio) from producto where codigo_fabricante in (select codigo from fabricante where nombre = 'asus'));


#Subconsultas con ALL y ANY
-- 1. Devuelve el producto más caro que existe en la tabla producto sin hacer uso de MAX, ORDER BY ni LIMIT.
SELECT * FROM producto WHERE precio >= ALL (SELECT precio FROM producto);
-- 2. Devuelve el producto más barato que existe en la tabla producto sin hacer uso de MIN, ORDER BY ni LIMIT.
select * from producto where precio <= all (select precio from producto);
-- 3. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando ALL o ANY).
select nombre from fabricante where codigo = any (select codigo_fabricante from producto);
-- 4. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando ALL o ANY).
select nombre from fabricante where codigo != any (select codigo_fabricante from producto);


#Subconsultas con IN y NOT IN
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
select nombre from fabricante where codigo in (select codigo_fabricante from producto);
-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
select nombre from fabricante where codigo not in (select codigo_fabricante from producto);


#Subconsultas con EXISTS y NOT EXISTS
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando EXISTS o NOT EXISTS).
SELECT nombre FROM fabricante WHERE EXISTS (SELECT * FROM producto WHERE codigo_fabricante = fabricante.codigo);
-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando EXISTS o NOT EXISTS).
SELECT nombre FROM fabricante WHERE  NOT EXISTS (SELECT * FROM producto WHERE codigo_fabricante = fabricante.codigo);


#Subconsultas (En la cláusula HAVING)
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.
SELECT F.nombre
FROM producto AS P
         JOIN fabricante f on f.codigo = P.codigo_fabricante
WHERE F.nombre != 'lenovo'
GROUP BY P.codigo_fabricante
HAVING COUNT(*) = (SELECT COUNT(*)
                   FROM producto AS P2
                            JOIN fabricante f2 on f2.codigo = P2.codigo_fabricante
                   WHERE codigo_fabricante = 2)







