//Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la
//nota se pedir� de nuevo hasta que la nota sea correcta.

Algoritmo ejercicio23
	
	Definir num Como Entero
	
	Escribir "Ingrese un n�mero"
	Leer num
	
	Mientras num<0 o num>10 Hacer
		Escribir "INCORRECTO, vuelva a ingresar un n�mero"
		Leer num
	FinMientras
	
	Escribir "CORRECTO, el n�mero que usted ingres� es ", num
	
FinAlgoritmo
