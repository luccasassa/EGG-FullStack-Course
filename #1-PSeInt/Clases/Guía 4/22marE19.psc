//Escribir un programa que realice la b�squeda lineal de un n�mero entero ingresado por
//el usuario en una matriz de 5x5, llena de n�meros aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra.
//En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo ejercicio19
	
	Definir i,j,matriz,num,contador Como Entero
	Dimension matriz[5,5]
	
	Escribir 'Qu� n�mero desea buscar en su matriz?' Sin Saltar
	Leer num
	
	contador=0
	
	Para i=0 hasta 4 Hacer
		Para j=0 hasta 4 Hacer
			matriz[i,j]=Azar(10)
		FinPara
	FinPara
	
	Escribir ''
	
	Para i=0 Hasta 4 Hacer
		Para j=0 hasta 4 Hacer
			Escribir Sin Saltar '[',matriz[i,j], ']', ''
		FinPara
		Escribir ''	
	FinPara
	
	Escribir ''
	
	Para i=0 Hasta 4 Hacer
		Para j=0 hasta 4 Hacer
			Si num=matriz[i,j] Entonces
				contador=contador+1
				Escribir 'El n�mero se encuentra en la posici�n: ', i, ',', j
			FinSi
		FinPara
	FinPara
	
	Si contador=0 Entonces
		Escribir 'Tu n�mero no se encontr� en la matriz'	
	FinSi
	
FinAlgoritmo
