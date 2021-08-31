-- a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
SELECT * FROM Familias WHERE num_hijos <=3 AND edad_maxima <10;
-- b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
SELECT * FROM Casas WHERE fecha_desde = date '2020/08/1' AND fecha_hasta = date '2020/08/31' AND pais = 'reino unido';
-- c) Como cliente, estás interesado en mandar a tu hijo a una familia, de la que únicamente recuerdas que su nombre familiar terminaba en ‘y’.
SELECT * FROM Familias WHERE nombre LIKE '%y';
-- d) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
SELECT * FROM Familias WHERE email LIKE '%hotmail%';
-- e) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.
SELECT * FROM Casas WHERE fecha_desde = date '2020/08/1' AND tiempo_minimo <= 'dias' AND tiempo_maximo >= 'dias';
-- f) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.
UPDATE Casas SET precio_habitacion = round(precio_habitacion * 1.05,2) WHERE id_casa != 7 AND 8 AND pais IN ('reino unido');
SELECT id_casa, precio_habitacion, pais FROM Casas;
-- g) Obtener el número de casas que existen para cada uno de los países diferentes.
SELECT * ,count(id_casa) as cant FROM casas GROUP BY pais;
-- h) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’.
select * from casas c1 inner join comentarios c2 on c2.id_casa = c1.id_casa where c2.comentario like '%limpia%' and c1.pais like '%reino unido%';
-- i) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
