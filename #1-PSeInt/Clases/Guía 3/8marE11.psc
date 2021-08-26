//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
//número tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a
//tener que separar el numero en partes (si es un numero de más de un digito) y ver si
//cada numero es par o impar. Nota: recordar el uso de la función Mod y Trunc(). No
//podemos pasar el numero a cadena para realizar el ejercicio.

Algoritmo ejercicio11
	
	Definir num Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese un número y averigüe si tiene todos sus dígitos impares"
	Leer num
	
	resultado=nombre(num)
	Escribir "Todos los dígitos del número son impares?: ", resultado
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(num)
	
	Definir retorno Como Logico
	Definir i Como Real
	
	retorno=Verdadero
	
	Repetir
		i=num mod 10
		
		Si i mod 2=0 Entonces
			retorno=Falso
		FinSi
		
		num=trunc(num/10)
	Hasta Que num < 0.1 o retorno=Falso
	
FinFuncion
