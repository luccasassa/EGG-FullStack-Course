//Construir un programa que simule un men� de opciones para realizar las cuatro
//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: S o s para la suma, R o r para la resta, M
//o m para la multiplicaci�n y D o d para la divisi�n.

Algoritmo ejercicio16
	
	Definir num1,num2 Como Entero
	Definir operacion Como Caracter
	
	Escribir "Ingrese los numeros a trabajar"
	Leer num1,num2
	Escribir "Qu� operaci�n desea realizar?"
	Leer operacion
	
	
	Segun operacion hacer
		"s","S": Escribir "El resultado es ", (num1 + num2)
		"r","R": Escribir "El resultado es ", (num1 - num2)
		"m","M": Escribir "El resultado es ", (num1 * num2)
		"d","D": Escribir "El resultado es ", (num1 / num2)
		De Otro Modo:
			Escribir "Operaci�n no v�lida, no se tomar� en cuenta"
	FinSegun
	
FinAlgoritmo
