//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el
//valor m�s grande del vector.

Algoritmo ejercicio5
	
	Definir i,num,mayor Como Real
	Dimension num[5]
	
	mayor=0
	
	Para i=0 hasta 4 Hacer
		Leer num[i]
		
		Si num[i]>mayor Entonces
			mayor=num[i];
		FinSi
	FinPara
	
	Escribir 'El mayor de los n�meros ingresados es ', mayor
	
FinAlgoritmo
