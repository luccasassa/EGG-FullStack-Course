//Realiza un programa que s�lo permita introducir los caracteres S y N. Si el usuario
//ingresa alguno de esos dos caracteres se deber� de imprimir un mensaje por pantalla
//que diga CORRECTO, en caso contrario, se deber� imprimir INCORRECTO.

Algoritmo ejercicio4
	
	Definir resp Como Caracter
	
	Escribir "Ingresar una letra"
	Leer resp
	
	resp=Minusculas(resp)
	
	si resp = "s" o resp = "n" Entonces
		Escribir "Es correcto"
	SiNo
		Escribir "Es incorrecto"
	FinSi
	
FinAlgoritmo
