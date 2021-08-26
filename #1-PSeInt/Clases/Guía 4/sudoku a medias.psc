Algoritmo sudoku
	
	Definir matriz,i,j Como Entero
	Dimension matriz[3,3];
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j]=azar(3)+1
		FinPara
	FinPara
	
//	Para i<-0 Hasta 2 Con Paso 1 Hacer
//		Para j<-0 Hasta 2 Con Paso 1 Hacer
//			matriz[j,i]=azar(3)+1
//		FinPara
//	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Escribir ""
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
	FinPara
	
	Escribir ""
	
FinAlgoritmo