//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y ceros.
//Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de ceros.
//Por ejemplo, nuestro matriz final debería verse así:

//111111111111111
//100000000000001
//100000000000001
//100000000000001
//111111111111111

//	Usar subprogramas tanto para llenar la matriz como para mostrarla.

Algoritmo ejercicio20
	
	Definir i,j,matriz Como Entero
	Dimension matriz(5, 15)
	
	Para i = 0 Hasta 4 Hacer                        //relleno de marco
		Para j = 0 Hasta 14 Hacer
			matriz(i, j) = 1
		FinPara
	FinPara
	
	Para i = 1 Hasta 3 Hacer                       //relleno del centro
		Para j = 1 Hasta 13 Hacer
			matriz(i, j) = 0
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer                       //se muestra por pantalla
		Para j = 0 Hasta 14 Hacer
			Escribir matriz(i, j) Sin Saltar "" 
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
