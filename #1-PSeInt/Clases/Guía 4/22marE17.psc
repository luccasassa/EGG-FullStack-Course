//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario)
//realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos
//otro subprograma que calcule y muestre la suma de los números pares y la suma de los
//números impares. Mostrar la matriz y los resultados por pantalla.

Algoritmo ejercicio17
	
	Definir matriz,num1,num2 Como Entero
	
	Escribir 'Ingrese la cantidad de índices de su matriz a analizar'
	Leer num1,num2
	Dimension matriz[num1,num2]
	
	Escribir 'Rellenando índices aleatoriamente......'
	rellenador(matriz,num1,num2)
	Escribir 'Ahora se mostrarán por pantalla y se sumarán los números pares e ipares:'
	calculador(matriz,num1,num2)
	
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
SubProceso calculador(matriz,num1,num2)
	
	Definir i,j,pares,impares Como Entero
	
	Para i=0 Hasta num1-1 Hacer
		Para j=0 hasta num2-1 Hacer
			Escribir Sin Saltar '[',matriz[i,j], ']', ''
		FinPara
		Escribir ''	
	FinPara
	
	pares=0
	impares=0
	Para i=0 Hasta num1-1 Hacer
		Para j=0 hasta num2-1 Hacer
			Si matriz[i,j] mod 2=0 Entonces
				pares=pares+matriz[i,j]
			SiNo
				impares=impares+matriz[i,j]
			FinSi
		FinPara
	FinPara
	Escribir 'La suma de los índices pares es igual a ', pares
	Escribir 'La suma de los índices pares es igual a ', impares
	
FinSubProceso
