//Dada una secuencia de n�meros ingresados por teclado que finaliza con un -1,
//realizar un programa que calcule el promedio de los numeros ingresados
//Suponemos que el usuario no insertar� n�mero negativos.

Algoritmo ejercicio26
	
	Definir num,contador,suma,promedio Como Real
	
	suma=0;
	contador=0;
	
	Escribir "Ingrese un n�mero";
	Leer num;
	
	Mientras num <> -1 Hacer
		contador=contador+1;
		suma=suma+num;
		promedio=suma/contador;
		
		Escribir "Ingrese un n�mero";
		Leer num;
	FinMientras
	
	Escribir "El promedio de los n�meros es ", promedio;
	
FinAlgoritmo
