//Recordando el ejercicio 16 de la gu�a 2, ahora deberemos agregarle funciones a
//nuestro ejercicio. Deberemos llamar una funci�n para cada operaci�n aritm�tica que
//devuelva el resultado de dicha operaci�n y en el algoritmo principal se mostrar� el
//resultado dependiendo de la operaci�n.

Algoritmo ejercicio2
	
	Definir num1,num2,orden Como Entero
	Definir operacion Como Caracter
	
	Escribir "Ingrese los numeros a trabajar"
	Leer num1,num2
	Escribir "Qu� operaci�n desea realizar?"
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
