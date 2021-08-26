//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de
//3 comprendidos entre 1 y 100.

Algoritmo ejercicio35
	
	Definir i,contadorPares,contadorImpares,contadorAmbos Como Entero
	
	contadorPares=0
	contadorImpares=0
	contadorAmbos=0
	
	Escribir ''
	
	Para i=1 Hasta 100 Hacer
		Si i mod 2=0 Entonces
			Escribir i, ' es múltiplo de 2'
			contadorPares=contadorPares+1
		FinSi
	FinPara
	
	Escribir ''
	Escribir 'El total de los múltiplos de 2 es ',contadorPares
	Escribir ''
	Escribir '****************************************************'
	
	Para i=1 Hasta 100 Hacer
		Si i mod 3=0 Entonces
			Escribir i, ' es múltiplo de 3'
			contadorImpares=contadorImpares+1
		FinSi
	FinPara
	
	Escribir ''
	Escribir 'El total de los múltiplos de 3 es ',contadorImpares
	Escribir ''
	Escribir '****************************************************'
	
	Para i = 1 hasta 100 Hacer
		Si (i mod 2 = 0) y (i mod 3 = 0) Entonces
			contadorAmbos=contadorAmbos+1
			Escribir i, ' es múltiplo de 2 y 3 a la vez'
		FinSi
	FinPara
	
	Escribir ''
	Escribir 'El total de números que son múltiplos tanto de 2 como de 3 es ',contadorAmbos
	
FinAlgoritmo
