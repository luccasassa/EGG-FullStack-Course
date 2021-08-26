///Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
///ingresará diez números.

Algoritmo extra7
	
	Definir num, n, par, impar Como Entero
	
	Escribir "ingrese un numero"
	leer num
	
	n=0
	par=0
	impar=0
	
	Hacer
		Escribir "ingrese un numero"
		leer num
		n=n+1
			si num mod 2= 0
				par=par+1
			SiNo
				impar=impar+1
			FinSi
		
	Hasta Que n=10
	
	
	Escribir "ingreso " par " veces un numero par " impar " veces un numero impar"
	

	
FinAlgoritmo
