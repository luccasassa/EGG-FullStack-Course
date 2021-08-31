Algoritmo diagonales	
	Definir matriz Como Entero
	Dimension matriz(3, 3)
	
	rellenarMatriz(matriz)
	mostrarMatriz(matriz)
	sumarDiagonales(matriz)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz)
	Definir i, j Como Entero
	Escribir "Ingrese valores para rellenar la matriz"
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Leer matriz(i, j)
		FinPara
	FinPara
	Escribir ""
FinSubProceso

SubProceso mostrarMatriz(matriz)
	Definir i, j Como Entero
	Escribir "La matriz se ve así: "
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir Sin Saltar matriz(i, j) " "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso	


SubProceso sumarDiagonales(matriz)
	
	Definir i, j, diagonal, diagonalInversa, contadorColumna Como Entero
	diagonal = 0
	diagonalInversa = 0
	contadorColumna = 0
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Si i = j Entonces
				diagonal = diagonal + matriz(i, j)
		FinSi
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Si j = (2 - contadorColumna) Entonces		// Indica solo las posiciones de J que se requieren para formar la diagonal inversa
				diagonalInversa = diagonalInversa + matriz(i, j)
				contadorColumna = contadorColumna + 1
			FinSi
		FinPara
	FinPara
	
	Escribir "La suma de la diagonal positiva es: " diagonal
	Escribir "La suma de la diagonal inversa es: " diagonalInversa 
FinSubProceso