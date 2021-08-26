//Dada una secuencia de números ingresados por teclado que finaliza con un -1,
//realizar un programa que calcule el promedio de los numeros ingresados
//Suponemos que el usuario no insertará número negativos.

Algoritmo ejercicio26
	
	Definir num,contador,suma,promedio Como Real
	
	suma=0;
	contador=0;
	
	Escribir "Ingrese un número";
	Leer num;
	
	Mientras num <> -1 Hacer
		contador=contador+1;
		suma=suma+num;
		promedio=suma/contador;
		
		Escribir "Ingrese un número";
		Leer num;
	FinMientras
	
	Escribir "El promedio de los números es ", promedio;
	
FinAlgoritmo
