//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor
//	o igual a 70; y reprueba en caso contrario.

Algoritmo ejercicio6
	
	Definir resultado,nota1,nota2,nota3 Como real
	
	Escribir "Notas de Panchito en todo el año"
	Leer nota1,nota2,nota3
	
	resultado=(nota1+nota2+nota3)/3
	
	si resultado>=7 Entonces
		Escribir "Panchito aprueba el año"
	SiNo
		Escribir "Panchito reprueba el año"
	FinSi
	
FinAlgoritmo
