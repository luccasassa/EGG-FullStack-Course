//Realizar un programa que rellene dos vectores a la misma vez, con 5 valores aleatorios
//y los muestre por pantalla.

Algoritmo ejercicio2
	
	Definir i,num1,num2 Como Entero
	Dimension num1[5],num2[5]
	
	Escribir 'Introduciendo los valores aleatorios del arreglo num1'
	
	Para i=0 hasta 4 Hacer
		num1[i]=Aleatorio(0,10)
		
		Si i = 4 Entonces
			Escribir Sin Saltar num1[4]                       //ésto me lee el último número, ésta condición es para no colocar la última coma (,)
		SiNo
			Escribir Sin Saltar num1[i], ', '                 //ésto me lee los primeros 4 números
		FinSi
	FinPara
	
	Escribir ' '
	//---------------------------------------------------------
	Escribir 'Introduciendo los valores del arreglo num2'
	
	Para i=0 hasta 4 Hacer
		num2[i]=Aleatorio(0,10)
		
		Si i = 4 Entonces
			Escribir Sin Saltar num2[4]                       //ésto me lee el último número, ésta condición es para no colocar la última coma (,)
		SiNo
			Escribir Sin Saltar num2[i], ', '                 //ésto me lee los primeros 4 números
		FinSi
	FinPara
	
	Escribir ' '
	
FinAlgoritmo
