//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el
//valor más grande del vector.

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
	
	Escribir 'El mayor de los números ingresados es ', mayor
	
FinAlgoritmo
