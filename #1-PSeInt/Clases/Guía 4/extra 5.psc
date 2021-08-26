//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado.

Algoritmo extra5
	
	Definir i, k, vector, vectorM, vectorR Como Entero
	
	Dimension vector(3,3), vectorM(3), vectorR(3)
	
	para i=0 hasta 2 Con Paso 1 Hacer
		para k=0 hasta 2 con paso 1 Hacer
			vector(i,k)=Aleatorio(1,10)
		FinPara
	FinPara
	para i=0 hasta 2 Con Paso 1 Hacer
		vectorM(i)=Aleatorio(1,10)
	FinPara
	
	para i=0 hasta 2 con paso 1 Hacer
		vectorR(i)=(vector(i,0)*vectorM(i))+(vector(i,1)*vectorM(i))+(vector(i,2)*vectorM(i))
	FinPara
	
	para i=0 hasta 2 Con Paso 1 Hacer
		para k=0 hasta 2 con paso 1 Hacer
			Escribir Sin Saltar vector(i,k) ", "
		FinPara
		Escribir ""
	FinPara
	
	para i=0 hasta 2 con paso 1 Hacer
		Escribir Sin Saltar vectorM(i) ", "
	FinPara
	
	Escribir ""
	
	para i=0 hasta 2 con paso 1 hacer 
		Escribir Sin Saltar vectorR(i) ", "
	FinPara
	
	Escribir ""
	
FinAlgoritmo
