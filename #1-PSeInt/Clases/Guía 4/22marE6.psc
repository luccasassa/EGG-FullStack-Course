//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a
//buscar tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n
//donde se encuentra el valor. En caso que el n�mero se encuentre repetido dentro del
//arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar
//un mensaje.

Algoritmo ejercicio6
	
	Definir i,num,x Como Entero
	Definir resultado Como Logico
	Dimension num[5]
	
	resultado=Falso
	
	Escribir 'Rellene los sub�ndices de su vector'
	Para i=0 Hasta 4 Hacer
		Leer num[i]
	FinPara
	
	Escribir 'Qu� n�mero desea buscar?'
	Leer x
	
	Para i=0 hasta 4 Hacer
		Si x = num[i] Entonces
			Escribir 'El n�mero se encontr� en la posici�n ', i
			resultado=Verdadero
		FinSi
	FinPara
	
	Si resultado=Falso Entonces
		Escribir 'Tu n�mero no se encuentra en el vector'
	FinSi
	
FinAlgoritmo
