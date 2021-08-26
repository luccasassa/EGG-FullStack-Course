//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el
//numero es primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s�
//mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo ejercicio10
	
	Definir num Como Entero
	Definir resultado Como Caracter
	
	Escribir "Ingrese un n�mero"
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
		retorno = "Es n�mero primo"
	SiNo
		retorno = "Es n�mero compuesto"
	FinSi
	
FinFuncion
	