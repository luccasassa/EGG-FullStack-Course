//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deberá mostrar:
//	*****
//	****
//	***
//	**
//	*

Algoritmo ejercicio40
	
	Definir num,i,n Como Entero
	
	Escribir "Ingrese el tamaño (proporción) del dibujo"
	Leer num
	
	Para i=num hasta 1 Con Paso -1 Hacer
		Para n=num hasta 1 Con Paso -1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		num=num-1
		Escribir " "
	FinPara
	
FinAlgoritmo
