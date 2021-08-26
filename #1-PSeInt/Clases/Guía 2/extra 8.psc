///Escribir un programa que calcule la suma de los N primeros números naturales. El valor
///de N se leerá por teclado.

Algoritmo extra8
	
	Definir n, num, acum, suma Como Entero
	
	Escribir "Ingrese cuantos numeros naturales desea sumar"
	leer num
	
	n=0
	acum=0
	
	Para n=1 Hasta num Con Paso 1 Hacer
		Escribir "ingrese su numero a sumar"
		leer suma
		
		acum=acum+suma
	Fin Para
	
	Escribir "la suma total de todo es de " acum
	
	
FinAlgoritmo
