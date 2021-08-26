//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: S o s para la suma, R o r para la resta, M
//o m para la multiplicación y D o d para la división.

Algoritmo ejercicio16
	
	Definir num1,num2 Como Entero
	Definir operacion Como Caracter
	
	Escribir "Ingrese los numeros a trabajar"
	Leer num1,num2
	Escribir "Qué operación desea realizar?"
	Leer operacion
	
	
	Segun operacion hacer
		"s","S": Escribir "El resultado es ", (num1 + num2)
		"r","R": Escribir "El resultado es ", (num1 - num2)
		"m","M": Escribir "El resultado es ", (num1 * num2)
		"d","D": Escribir "El resultado es ", (num1 / num2)
		De Otro Modo:
			Escribir "Operación no válida, no se tomará en cuenta"
	FinSegun
	
FinAlgoritmo
