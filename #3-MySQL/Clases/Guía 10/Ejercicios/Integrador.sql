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