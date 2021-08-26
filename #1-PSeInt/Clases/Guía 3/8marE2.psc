//Recordando el ejercicio 16 de la guía 2, ahora deberemos agregarle funciones a
//nuestro ejercicio. Deberemos llamar una función para cada operación aritmética que
//devuelva el resultado de dicha operación y en el algoritmo principal se mostrará el
//resultado dependiendo de la operación.

Algoritmo ejercicio2
	
	Definir num1,num2,orden Como Entero
	Definir operacion Como Caracter
	
	Escribir "Ingrese los numeros a trabajar"
	Leer num1,num2
	Escribir "Qué operación desea realizar?"
	Leer operacion
	
	Segun operacion hacer
		"s": orden=mando1(num1,num2)
			Escribir orden
		"r": orden=mando2(num1,num2)
			Escribir orden
		"m": orden=mando3(num1,num2)
			Escribir orden
		"d": orden=mando4(num1,num2)
			Escribir orden
	FinSegun
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion operaciones=mando1(a,b)
	Definir operaciones1 Como entero
	operaciones1=a+b
FinFuncion

Funcion operaciones=mando2(a,b)
	Definir operaciones Como entero
	operaciones=a-b
FinFuncion

Funcion operaciones=mando3(a,b)
	Definir operaciones Como entero
	operaciones=a*b
FinFuncion

Funcion operaciones=mando4(a,b)
	Definir operaciones Como entero
	operaciones=a/b
FinFuncion
