//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deberá mostrar:
//	*****
//	****
//	***
//	**
//	*

Algoritmo ejercicio40
	
	Definir num,i,j Como Entero
	
	Escribir "Ingrese un número"
	Leer num
	
	Para i=1 hasta num Hacer
		para j= (1+num-i) Hasta 1 Con Paso -1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		
		Escribir " "
	FinPara
	
FinAlgoritmo
