//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
//llenarla con números aleatorios entre 1 y 100 y mostrar su TRASPUESTA.
//https://es.wikipedia.org/wiki/Matriz_transpuesta

Algoritmo ejercicio18
	
	Definir n,m ,matriz ,i,j como Entero
	
	Escribir "INGRESE LAS DIMENSIONES DE LA MATRIZ"
	Escribir "FILAS = " Sin Saltar
	Leer n 
	Escribir "COLUMNAS = " Sin Saltar
	Leer m
	Dimension matriz(n,m)
	
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz(i,j)=Aleatorio(0,9)
		FinPara
	FinPara
	
	
	Escribir ""
	Escribir "Matriz Normal"
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir matriz(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
	Escribir "Matriz Traspuesta"
	
	Para i=0 Hasta m-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Escribir matriz(j,i) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
