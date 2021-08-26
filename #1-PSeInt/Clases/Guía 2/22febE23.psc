//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
//nota se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo ejercicio23
	
	Definir num Como Entero
	
	Escribir "Ingrese un número"
	Leer num
	
	Mientras num<0 o num>10 Hacer
		Escribir "INCORRECTO, vuelva a ingresar un número"
		Leer num
	FinMientras
	
	Escribir "CORRECTO, el número que usted ingresó es ", num
	
FinAlgoritmo
