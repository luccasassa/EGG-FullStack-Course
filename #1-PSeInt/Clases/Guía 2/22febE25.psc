//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el
//l�mite inicial.

Algoritmo ejercicio25
	
	Definir suma,num,max Como Entero
	
	Escribir "Ingrese el n�mero l�mite"
	Leer max
	
	suma=0
	
	Mientras suma<max Hacer
		Escribir "Ingrese un n�mero que desea sumar hasta llegar al l�mite"
		Leer num
		suma=suma+num
	FinMientras
	
	Escribir "La suma ya igual� o super� al n�mero l�mite"
	
FinAlgoritmo
