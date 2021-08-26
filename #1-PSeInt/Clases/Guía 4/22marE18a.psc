//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
//llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta. NOTA: si no
//conoces lo que es una traspuesta, mirar el siguiente link:
//https://es.wikipedia.org/wiki/Matriz_transpuesta

Algoritmo ejercicio18
	
	Definir matrizA,n,m,matrizAt Como Entero
	
	Escribir 'Ingrese la cantidad de subíndices de su matriz'
	Leer n,m
	
	Dimension matrizA(n,m)
	rellearMatriz(matrizA,n,m)
	Escribir "La matriz generada es: "
	imprimirMatriz(matrizA,n,m)
	Dimension matrizAt(m,n)
	trasponerMatriz(matrizA,n,m,matrizAt)
	Escribir "La matriz traspuesta de la generada es: "
	imprimirMatrizT(matrizAt,n,m)
	
FinAlgoritmo
// ----------------------------------------------------------------
SubProceso rellearMatriz(matrizA Por Referencia,n,m)
	Definir i,j Como Entero
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matrizA[i,j]=Aleatorio(0,10)
		FinPara
	FinPara
FinSubProceso
// ----------------------------------------------------------------
SubProceso imprimirMatriz(matrizA Por Referencia,n,m)
	Definir i,j Como Entero
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			Escribir matrizA[i,j]," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
// ----------------------------------------------------------------
SubProceso trasponerMatriz(matrizA Por Referencia,n,m,matrizAt Por Referencia)
	Definir i,j Como Entero
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matrizAt[j,i] = matrizA[i,j]
		FinPara
	FinPara
FinSubProceso
// ----------------------------------------------------------------
SubProceso imprimirMatrizT(matrizAt,n,m)
	Definir i,j Como Entero
	Para i=0 hasta m-1 Hacer
		Para j=0 hasta n-1 Hacer
			Escribir matrizAt[i,j]," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
