///Hacer un algoritmo que lea un número por el teclado y determinar si tiene tres dígitos.

Algoritmo extra1
	
	Definir num Como Real
	Definir cont Como Entero
	
	Escribir "ingrese un numero"
	leer num
	
	cont=0
	
	Mientras num>1
		
		num=num/10
		cont=cont+1
		
	FinMientras
	
	si cont=3
		Escribir "tiene 3 digitos"
		
	SiNo
		
		Escribir "no tiene 3 digitos"
		
	FinSi
	
	
FinAlgoritmo
