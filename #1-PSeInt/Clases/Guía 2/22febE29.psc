//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. S�lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber�
//mostrar un mensaje indic�ndonos que hemos agotado esos 3 intentos. Si acertamos la
//clave se deber� mostrar un mensaje que indique que se ha ingresado al sistema
//correctamente.

Algoritmo ejercicio29
	
	Definir clave Como Caracter
	Definir contador Como Real
	
	contador = 0
	
	Hacer
		Escribir "Por favor escriba la clave"
		Leer clave
		si clave="eureka" Entonces
			Escribir "Usted ha ingresado al sistema"
		FinSi
		contador=contador+1
	Hasta Que clave="eureka" o contador>=3
	
	si contador>=3 y clave<>"eureka" Entonces
		Escribir "Se han acabado los intentos"
	FinSi
	
FinAlgoritmo
