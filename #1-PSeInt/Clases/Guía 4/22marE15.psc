//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el
//usuario y los muestre por pantalla
//https://www.youtube.com/watch?v=XaMeXLV6C48&list=PLgwlfcqa5h3ylvRO50_SJGlMnwqbgKZWR&index=4&ab_channel=EggEducaci%C3%B3n

Algoritmo ejercicio15
	
	Definir i,j,matriz Como Entero
	Dimension matriz[3,3]
	
	Para i=0 hasta 2 Hacer
		Para j=0 hasta 2 Hacer
			Leer matriz[i,j]
		FinPara
	FinPara
	
	Escribir 'Ubicados en su correspondiente casilla, quedaría.......'
	
	Para i=0 hasta 2 Hacer
		Para j=0 hasta 2 Hacer
			Escribir Sin Saltar matriz[i,j], ' '
		FinPara
		Escribir ''
	FinPara
	
FinAlgoritmo
