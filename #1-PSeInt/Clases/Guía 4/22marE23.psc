//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas)
//que tiene como propiedad especial que la suma de las filas, las columnas y las
//diagonales es igual. Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8

//En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir
//un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso
//de que sea mágica escribir la suma. Además, el programa deberá comprobar que los
//números introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el
//tamaño de la matriz que no debe superar orden igual a 10.

Algoritmo ejercicio23
	
	Definir matriz,i,j Como Entero
	Dimension matriz[3,3]
	
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			matriz[i,j]=azar(9)+1
		FinPara
	FinPara
	
	//	Para i<-0 Hasta 2 Hacer
	//		Para j<-0 Hasta 2 Hacer
	//			matriz[j,i]=azar(9)+1
	//		FinPara
	//	FinPara
	
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo

