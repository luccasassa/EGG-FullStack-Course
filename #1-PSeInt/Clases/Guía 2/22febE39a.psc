//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
//		* * * *
//		*     *
//		*     *
//		* * * *
//Nota: recordar el uso del escribir sin saltar en Pseint.

Algoritmo ejercicio39a
	
	Definir num,i,n Como Entero
	
	Escribir "Ingrese la cantidad de asteriscos que va a tener el techo y base del cuadrado"
	Leer num
	
	Para i=1 Hasta num Con Paso 1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
	Para i=1 Hasta num-2 Con Paso 1 Hacer
		Escribir Sin Saltar "*"
		Para n desde 3 hasta num Con Paso 1 Hacer
			Escribir Sin Saltar " "
		FinPara
		Escribir "*"
	FinPara
	
	Para i=1 Hasta num Con Paso 1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
FinAlgoritmo
