//Se debe realizar un programa que:
//	1�) Pida por teclado un n�mero (entero positivo).
//	2�) Pregunte al usuario si desea introducir o no otro n�mero.
//	3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
//	4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario.

Algoritmo ejercicio30
	
	Definir num,suma Como Entero
	Definir respuesta Como Caracter
	
	suma=0
	
	Escribir "Ingrese S o N si desea ingresar un n�mero"
	Leer respuesta
	
	Hacer
		si respuesta="s" Entonces
			Escribir "Ingrese un n�mero"
			Leer num
		FinSi
		
		Escribir "Desea ingresar otro n�mero? Ingrese S o N"
		Leer respuesta
		suma=suma+num
	Hasta Que respuesta="n"
	
	si respuesta="n" Entonces
		Escribir "La suma de los n�meros introducidos da como resultado ", suma
	FinSi
	
FinAlgoritmo
