//Realizar una función que valide si un numero es impar o no. Si es impar la función debe
//devolver un resultado, si no es impar debe devolver otro. Nota: la función no debe
//tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo ejercicio3
	
	Definir num,resultado Como Entero
	
	Escribir "Ingrese un número"
	Leer num
	
	resultado=nombre(num)
	
	si resultado=1 Entonces
		Escribir "EL NÚMERO ES IMPAR"
	SiNo
		Escribir "EL NÚMERO ES PAR"
	FinSi
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(num)
	Definir retorno Como Real
	retorno=num mod 2
	
	Si retorno<>0 Entonces
		retorno=1
	FinSi
	
FinFuncion
	