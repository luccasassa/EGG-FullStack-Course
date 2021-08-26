//Se debe realizar un programa que:
//	1º) Pida por teclado un número (entero positivo).
//	2º) Pregunte al usuario si desea introducir o no otro número.
//	3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
//	4º) Muestre por pantalla la suma de los números introducidos por el usuario.

Algoritmo ejercicio30
	
	Definir num,suma Como Entero
	Definir respuesta Como Caracter
	
	suma=0
	
	Escribir "Ingrese S o N si desea ingresar un número"
	Leer respuesta
	
	Hacer
		si respuesta="s" Entonces
			Escribir "Ingrese un número"
			Leer num
		FinSi
		
		Escribir "Desea ingresar otro número? Ingrese S o N"
		Leer respuesta
		suma=suma+num
	Hasta Que respuesta="n"
	
	si respuesta="n" Entonces
		Escribir "La suma de los números introducidos da como resultado ", suma
	FinSi
	
FinAlgoritmo
