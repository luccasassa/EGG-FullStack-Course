//Una docente de programación tiene un listado de 3 notas por cada uno de sus N estudiantes.
//La nota final está compuesta por: Integrador(35%), Exposicion(25%) y  Parcial(40%).
//El docente requiere los siguientes informes de los estudiantes:
//	-Nota promedio fianl de los estudiantes que reprobaron el curso (inferior a 6.5)
//	-Porcentaje de alumnos que tienen en Integrador más de 7.5
//	-La mayor nota obtenida en Exposición
//	-Total de estudiantes que obtuvieron en Parcial entre 4 y 7.5
//El programa pedirá la cantidad de alumnos y las 3 notas que le corresponde a cada uno,
//luego calculará todos los informes claves que requiere el docente.

Algoritmo ejercicio38
	
	Definir alumnos, integrador, exposicion, parcial, notaFinal, i, cant1, cant2, max como Real;
	
	Escribir "Introduce la cantidad de alumnos";
	Leer alumnos;
	
	cant1 = 0;
	cant2 = 0;
	
	Para i = 1 Hasta alumnos Hacer
		Escribir "Introduce las notas del alumno (Integrador, Exposicion y Parcial)";
		Leer integrador, exposicion, parcial;
		
		max = exposicion;
		notaFinal = (integrador*0.35)+(exposicion*0.25)+(parcial*0.4);
		
		Si notaFinal > 6.5
			Escribir "El promedio final del alumno es ", notaFinal, ". Esta aprobado!";
		SiNo
			Escribir "El promedio final del alumno es ", notaFinal, ". Tendra que recursar";
		FinSi
		
		Si notaFinal >= 7.5
			cant1 = cant1 +1;
		FinSi
		
		Si (parcial >= 4) Y (parcial <= 7.5)
			cant2 = cant2+1;
		FinSi
		
		Si exposicion > max
			max = exposicion;
		FinSi
	FinPara
	
	Escribir ''
	Escribir "La mayor nota obtenida en las exposiciones fue ", max;
	Escribir "El porcentaje de alumnos que obtuvieron una nota final de 7.5 o mayor es de ", (cant1/alumnos)*100, "%";
	Escribir "El total de estudiantes que en la nota del parcial obtuvieron entre (4 y 7.5) fueron ", cant2;
	
FinAlgoritmo
