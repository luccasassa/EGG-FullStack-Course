//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a
//buscar también debe ser ingresado por el usuario). El programa debe indicar la posición
//donde se encuentra el valor. En caso que el número se encuentre repetido dentro del
//arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar
//un mensaje.

Algoritmo ejercicio6
	
	Definir i,num,x Como Entero
	Definir resultado Como Logico
	Dimension num[5]
	
	resultado=Falso
	
	Escribir 'Rellene los subíndices de su vector'
	Para i=0 Hasta 4 Hacer
		Leer num[i]
	FinPara
	
	Escribir 'Qué número desea buscar?'
	Leer x
	
	Para i=0 hasta 4 Hacer
		Si x = num[i] Entonces
			Escribir 'El número se encontró en la posición ', i
			resultado=Verdadero
		FinSi
	FinPara
	
	Si resultado=Falso Entonces
		Escribir 'Tu número no se encuentra en el vector'
	FinSi
	
FinAlgoritmo
