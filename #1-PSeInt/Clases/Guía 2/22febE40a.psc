//Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deber� mostrar:
//	*****
//	****
//	***
//	**
//	*

Algoritmo ejercicio40
	
	Definir num,i,j Como Entero
	
	Escribir "Ingrese un n�mero"
	Leer num
	
	Para i=1 hasta num Hacer
		para j= (1+num-i) Hasta 1 Con Paso -1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		
		Escribir " "
	FinPara
	
FinAlgoritmo
