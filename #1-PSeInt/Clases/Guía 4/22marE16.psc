//Realizar un programa que rellene de n�meros aleatorios una matriz a trav�s de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo ejercicio16
	
	Definir matriz,num1,num2 Como Entero
	
	Escribir 'Ingrese la cantidad de �ndices de su matriz a analizar'
	Leer num1,num2
	Dimension matriz[num1,num2]
	
	Escribir 'Rellenando �ndices aleatoriamente......'
	rellenador(matriz,num1,num2)
	Escribir 'Ahora se mostrar�n por pantalla:'
	mostrador(matriz,num1,num2)
	
FinAlgoritmo
// ----------------------------------------------------------------
SubProceso rellenador(matriz,num1,num2)
	
	Definir i,j Como Entero
	
	Para i=0 Hasta num1-1 Hacer
		Para j=0 hasta num2-1 Hacer
			matriz[i,j]=Azar(10)
		FinPara
	FinPara
	
FinSubProceso
// ----------------------------------------------------------------
SubProceso mostrador(matriz,num1,num2)
	
	Definir i,j Como Entero
	
	Para i=0 Hasta num1-1 Hacer
		Para j=0 hasta num2-1 Hacer
			Escribir Sin Saltar '[',matriz[i,j], ']', ''
		FinPara
		Escribir ''	
	FinPara
	
FinSubProceso
