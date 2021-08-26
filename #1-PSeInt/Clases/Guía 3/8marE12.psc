//Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La
//sucesión de Fibonacci es la sucesión de los siguientes números:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ...

//youtube.com/watch?v=W01yzwoskOo&ab_channel=DiloenTutosPc

Algoritmo ejercicio12
	
	Definir num,resultado Como Entero
	
	Escribir "Ingrese un número (cantidad de cálculos)"    //colocar 9 para llegar al 34 (ejemplo en la expicación)
	Leer num
	
	resultado=nombre(num)
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(num)
	
	Definir i,retorno,a,b,c Como Entero
	
	a=0
	b=1
	
	Para i=1 Hasta num Hacer
		Escribir b
		c=a+b
		a=b
		b=c
	FinPara
	
FinFuncion
	