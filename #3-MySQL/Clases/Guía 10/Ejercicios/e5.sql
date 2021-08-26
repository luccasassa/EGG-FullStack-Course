#equipos -> PRIMARY KEY (Nombre);
#jugadores ->  PRIMARY KEY (codigo), FOREIGN KEY (Nombre_equipo) References equipos(Nombre);
#estadisticas -> PRIMARY KEY (temporada,jugador), FOREIGN KEY (jugador) REFERENCES Jugadores(Codigo);
#partidos -> PRIMARY KEY (codigo), FOREIGN KEY (equipo_local) REFERENCES equipos(nombre), FOREIGN KEY (equipo_visitante) REFERENCES equipos(nombre);


-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre asc;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre, posicion, peso from jugadores where posicion = 'c' and peso > 200 order by nombre asc;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select * from equipos order by nombre asc;
-- 4. Mostrar el nombre de los equipos del este (East).
select nombre, conferencia from equipos where conferencia = 'east';
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select nombre, ciudad from equipos where ciudad like 'c%' order by nombre asc;
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select nombre_equipo as 'equipo', nombre from jugadores order by Nombre_equipo asc;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select nombre, nombre_equipo from  jugadores where Nombre_equipo = 'raptors' order by nombre;
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select j.nombre, e.puntos_por_partido from estadisticas e inner join jugadores j on j.codigo = e.jugador where j.nombre = 'pau gasol';
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select j.nombre, e.puntos_por_partido, e.temporada from estadisticas e  inner join jugadores j on j.codigo = e.jugador where j.nombre = 'pau gasol' and temporada = '04/05';
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select j.nombre, sum(e.Puntos_por_partido) as 'Puntos en Total' from estadisticas e inner join jugadores j on j.codigo = e.jugador group by e.jugador, j.nombre order by j.nombre;
-- 11. Mostrar el número de jugadores de cada equipo.
select nombre_equipo, count(*) from jugadores group by Nombre_equipo;
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select j.nombre, sum(e.puntos_por_partido) from estadisticas e inner join jugadores j on j.codigo = e.jugador group by e.jugador order by e.puntos_por_partido desc limit 1;
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select j.nombre, j.altura, e.nombre as 'equipo', e.conferencia, e.division from jugadores j inner join equipos e on e.nombre = j.Nombre_equipo order by j.Altura desc limit 1;
-- 14. Mostrar la suma de los puntos por partido de todos los jugadores españoles donde el equipo donde juegan este en ‘Los Angeles’.
select j.nombre, sum(e1.Puntos_por_partido) from estadisticas e1 join jugadores j on j.codigo = e1.jugador join equipos e2 on e2.nombre = j.nombre_equipo where j.procedencia = 'spain' and e2.Ciudad = 'los angeles';
-- 15. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
			#PROMEDIO PUNTOS POR PARTIDO POR EQUIPO
select avg(puntos_local + puntos_visitante) / 2 from partidos as P join equipos e on e.Nombre = P.equipo_local where E.Division = 'PACIFIC';
			#PROMEDIO PUNTOS POR PARTIDO AMBOS EQUIPOS
select avg(puntos_local + puntos_visitante) from partidos as P join equipos e on e.Nombre = P.equipo_local where E.Division = 'PACIFIC';
-- 16. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select equipo_local, equipo_visitante, abs(puntos_visitante - puntos_local) from partidos where abs(puntos_visitante - puntos_local) = (select max(abs(puntos_local - puntos_visitante)) from partidos);
-- 17. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
			#PROMEDIO PUNTOS POR EQUIPO EN PARTIDOS
select avg(puntos_local + puntos_visitante) / 2 from partidos as P join equipos e on e.Nombre = P.equipo_local where E.Division = 'PACIFIC';
			#PROMEDIO PUNTOS POR PARTIDO
select avg(puntos_local + puntos_visitante) from partidos as P join equipos e on e.Nombre = P.equipo_local where E.Division = 'PACIFIC';
-- 18. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
			#PUNTOS TOTALES DE CADA EQUIPO, TANTO DE LOCAL COMO DE VISITANTE
SELECT Equipo, SUM(Total)
FROM (SELECT equipo_local AS Equipo,
             SUM(puntos_local) AS Total
      FROM partidos
      GROUP BY Equipo
      UNION
      SELECT equipo_visitante      AS Equipo,
             SUM(puntos_visitante) AS Total
      FROM partidos
      GROUP BY Equipo) AS TEMP
GROUP BY Equipo;
			#PUNTOS DE CADA EQUIPO POR PARTIDO, TANTO DE LOCAL COMO VISITANTE
SELECT codigo, equipo_local AS Equipo, puntos_local AS Puntos
FROM partidos
UNION ALL SELECT codigo, equipo_visitante AS Equipo, puntos_visitante AS Puntos
FROM partidos
ORDER BY Equipo, codigo;
			#PUNTOS POR PARTIDO
SELECT equipo_local, equipo_visitante, puntos_local, puntos_visitante FROM partidos ORDER BY equipo_local, equipo_visitante;
-- 19. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT codigo, equipo_local, equipo_visitante,
CASE
	WHEN puntos_local > puntos_visitante THEN equipo_local
    WHEN puntos_local < puntos_visitante THEN equipo_visitante
    WHEN puntos_local = puntos_visitante THEN NULL
    END AS Ganador
FROM partidos
ORDER BY codigo;


-- ////////////////////////////////////////////////////////////////////////////////////////////

#CANDADO A
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
SELECT count(*) AS 'Cantidad' 
FROM jugadores j 
INNER JOIN equipos e ON j.Nombre_equipo = e.Nombre 
WHERE e.Conferencia ='West' 
AND j.procedencia = 'michigan'; #2

-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
SELECT count(j.codigo) AS 'total' 
FROM jugadores j 
WHERE j.peso >= (195);
#La posición del candado A es (2/362)+0.9945 = 1.000024.

-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.
SELECT sum(j.peso) AS 'Suma total de peso' 
FROM jugadores j INNER JOIN equipos e ON e.nombre = j.nombre_equipo 
WHERE e.conferencia = 'east' 
AND j.Posicion LIKE '%c%'; #14043


#CANDADO B
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat (16).
SELECT COUNT(j.codigo) 
FROM jugadores j 
INNER JOIN estadisticas e 
ON j.codigo = e.jugador 
WHERE e.Asistencias_por_partido > (SELECT count(e.Nombre) AS 'Total' 
									FROM jugadores j 
									INNER JOIN equipos e 
									ON e.Nombre = j.Nombre_equipo 
									WHERE e.nombre = 'heat');
#La posición del candado B es 3.

-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
SELECT count(p.codigo) AS 'Total' 
FROM partidos p 
WHERE p.temporada LIKE '%99%'; #3480


#CANDADO C
-- Muestre cuántas veces los jugadores lograron tener más o la misma cantidad de asistencias por partido, que el máximo de asistencias por partido.
SELECT count(j.codigo) 
FROM jugadores j INNER JOIN estadisticas e on j.codigo = e.jugador where e.Asistencias_por_partido >= (select max(e.asistencias_por_partido) from estadisticas e);

-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea central.
SELECT floor(AVG(e.Puntos_por_partido)+ COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)) AS 'Total'
FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo
INNER JOIN equipos q ON q.Nombre = j.Nombre_equipo
WHERE q.Division = 'central';


#CANDADO D
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este resultado debe ser redondeado.
SELECT ROUND(e.tapones_por_partido) FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo WHERE j.Nombre = 'Corey Maggette' AND e.temporada = '00/01'; #4

-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido de todos los jugadores de procedencia argentina.
SELECT FLOOR(SUM(e.puntos_por_partido)) AS 'Puntos totales' FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo WHERE j.Procedencia = 'argentina'; #191








