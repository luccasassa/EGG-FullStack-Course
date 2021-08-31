Algoritmo ej_20
	Definir matriz Como Entero
	Dimension matriz(5, 15)
	
	rellenarMatriz1(matriz)
	rellenarMatriz0(matriz)
	mostrarMatriz(matriz)
	
FinAlgoritmo

SubProceso rellenarMatriz1(matriz)
	Definir i, j Como Entero
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 14 Hacer
			matriz(i, j) = 1
		FinPara
	FinPara
FinSubProceso

SubProceso rellenarMatriz0(matriz)
	Definir i, j Como Entero
	Para i = 1 Hasta 3 Hacer
		Para j = 1 Hasta 13 Hacer
			matriz(i, j) = 0
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz)
	Definir i, j Como Entero
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 14 Hacer
			Escribir matriz(i, j) Sin Saltar "" 
		FinPara
		Escribir ""
	FinPara
FinSubProceso