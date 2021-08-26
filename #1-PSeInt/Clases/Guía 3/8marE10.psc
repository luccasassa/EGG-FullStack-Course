//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
//numero es primo o no. Un número es primo cuando es divisible sólo por 1 y por sí
//mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo ejercicio10
	
	Definir num Como Entero
	Definir resultado Como Caracter
	
	Escribir "Ingrese un número"
	Leer num
	
	resultado=nombre(num)
	Escribir resultado
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(num)
	
	Definir retorno Como Caracter
	Definir i,cant_divisiones como Entero
	
	cant_divisiones=0    //funciona como contador
	
	Para i=1 Hasta num Hacer
		si num mod i=0 Entonces
			cant_divisiones=cant_divisiones+1
		FinSi
	FinPara
	
	si cant_divisiones=2 Entonces
		retorno = "Es número primo"
	SiNo
		retorno = "Es número compuesto"
	FinSi
	
FinFuncion
	