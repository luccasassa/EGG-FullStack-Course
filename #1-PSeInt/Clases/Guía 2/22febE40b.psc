//Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deber� mostrar:
//	*****
//	****
//	***
//	**
//	*

Algoritmo ejercicio40
	
	Definir num,i Como Entero
	
	Escribir "Ingrese el tama�o (proporci�n) del dibujo"
	Leer num
	
	Para i=1 Hasta num Con Paso 1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
	Para i=1 Hasta num-1 Con Paso 1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
	Para i=1 Hasta num-2 Con Paso 1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
	Para i=1 hasta num-3 Con Paso 1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
	Para i=1 hasta num-4 Con Paso 1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
FinAlgoritmo
