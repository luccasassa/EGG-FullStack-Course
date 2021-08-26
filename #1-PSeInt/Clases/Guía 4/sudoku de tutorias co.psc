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
	
	Definir matriz,i,j,vector,contador Como Entero
	Definir respuesta como Logico
	Dimension matriz[3,3]
	Dimension vector[8]
	
	contador=0
	respuesta=Verdadero
	
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			matriz[i,j]=Aleatorio(1,9)
		FinPara
	FinPara
	
	Para i=0 hasta 7 Hacer
		vector[i]=0
	FinPara
	
	Para i=0 hasta 2 Hacer
		contador=contador+1
		Para j=0 hasta 2 Hacer
			vector[contador] = vector[contador] + matriz[i,j]
			vector[contador+3] = vector[contador+3] + matriz[j,i]
		FinPara
	FinPara
	
	Para i=0 hasta 2 Hacer
		vector[6] = vector[6] + matriz[i,i]
		vector[7] = vector[7] + matriz[i,(4-i)]
	FinPara
	
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
	i=0
	Mientras respuesta=Verdadero y i<7 Hacer
		Si vector[i] <> vector[i+1] Entonces
			respuesta=Falso
		FinSi
		i=i+1
	FinMientras
	
	Si respuesta=Verdadero Entonces
		Escribir 'La matriz es mágica'
	SiNo
		Escribir 'La matriz NO es mágica'
	FinSi
	
FinAlgoritmo

