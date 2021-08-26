/*DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(20) NOT NULL
);

CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador));
  */
USE superheroes;
insert into creador (id_creador,nombre) values (1,'Marvel');
insert into creador (id_creador,nombre) values (2,'DC');

insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (1,'Bruce Banner','Hulk',160,600000,75,98,1962,'Físico Nuclear',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (2,'Tony Stark','Iron Man',170,200000,70,123,1963,'Inventor Industrial',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (3,'Thor Odinson','Thor',145,999999,100,235,1962,'Rey de Asgard',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (4,'Wanda Maximoff','Bruja Escarlata',170,100000,90,345,1964,'Bruja',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (5,'Carol Danvers','Capitana Marvel',157,250000,85,128,1968,'Oficial de inteligencia',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (6,'Thanos','Thanos',170,999999,40,306,1973,'Adorador de la muerte',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (7,'Peter Parker','Spiderman',165,25000,80,75,1962,'Fotógrafo',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (8,'Steve Roger','Capitán América',145,600000,45,60,1941,'Oficial federal',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (9,'Bobby Drake','Ice Man',140,2000,64,122,1963,'Contador',1);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (10,'Barry Allen','Flash',160,10000,120,168,1956,'Científico forense',2);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (11,'Bruce Wayne','Batman',170,500,32,47,1939,'Hombre de negocios',2);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (12,'Carck Kent','Superman',165,999999,120,182,1948,'Reportero',2);
insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (13,'Diana Price','Mujer Maravilla',160,999999,95,127,1949,'Princesa guerrera',2);

-- b) Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman. A continuación, realizar un listado de toda la tabla para verificar que el personaje haya sido actualizado.
update personajes set aparicion = 1938 where id_personaje = 12;

-- c) El registro que contiene al personaje Flash. A continuación, mostrar toda la tabla para verificar que el registro haya sido eliminado.
delete from personajes where id_personaje = 10;

/* SELECCIONAR SOLO ÉSTO SI LA TABLA YA ESTÁ CREADA */
use superheroes; 
select * from personajes; /* pa mostrar la tabla */
