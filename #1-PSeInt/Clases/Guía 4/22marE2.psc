//Realizar un programa que rellene dos vectores a la misma vez, con 5 valores aleatorios
//y los muestre por pantalla.

Algoritmo ejercicio2
	
	Definir i,num1,num2 Como Entero
	Dimension num1[5],num2[5]
	
	Escribir 'Introduciendo los valores aleatorios del arreglo num1'
	
	Para i=0 hasta 4 Hacer
		num1[i]=Aleatorio(0,10)
		
		Si i = 4 Entonces
			Escribir Sin Saltar num1[4]                       //�sto me lee el �ltimo n�mero, �sta condici�n es para no colocar la �ltima coma (,)
		SiNo
			Escribir Sin Saltar num1[i], ', '                 //�sto me lee los primeros 4 n�meros
		FinSi
	FinPara
	
	Escribir ' '
	//---------------------------------------------------------
	Escribir 'Introduciendo los valores del arreglo num2'
	
	Para i=0 hasta 4 Hacer
		num2[i]=Aleatorio(0,10)
		
		Si i = 4 Entonces
			Escribir Sin Saltar num2[4]                       //�sto me lee el �ltimo n�mero, �sta condici�n es para no colocar la �ltima coma (,)
		SiNo
			Escribir Sin Saltar num2[i], ', '                 //�sto me lee los primeros 4 n�meros
		FinSi
	FinPara
	
	Escribir ' '
	
FinAlgoritmo
