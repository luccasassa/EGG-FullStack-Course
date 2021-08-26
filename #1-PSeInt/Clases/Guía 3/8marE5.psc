//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo ejercicio5
	
	Definir num, resultado Como Real
	
	Escribir "Ingrese un número"
	Leer num
	
	resultado= mifuncion(num)
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=mifuncion(num)
	
	Definir retorno,i,suma Como Real
	suma=0
	
	Para i=1 Hasta num-1 Hacer
		si num mod i = 0 Entonces
			Escribir i " es divisor de ", num
			suma=suma+i
		FinSi
	FinPara
	
	Escribir "La suma de todos los divisores de ", num, " es igual a ", suma
FinFuncion
