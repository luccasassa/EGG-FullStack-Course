//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
//y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados.

Algoritmo ejercicio3
	
	Definir i,num,suma,resta,mult Como Real
	Dimension num[10]
	
	suma=0
	resta=0
	mult=1
	
	Para i=0 Hasta 9 Hacer
		Leer num[i]
		
		suma=suma+num[i]
		resta=resta-num[i]
		mult=mult*num[i]
	FinPara
	
	Escribir 'La suma es: ', suma
	Escribir 'La resta es: ', resta
	Escribir 'La multiplicación es: ', mult
	
FinAlgoritmo
