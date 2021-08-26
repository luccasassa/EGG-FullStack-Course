//Realiza un programa que sólo permita introducir los caracteres S y N. Si el usuario
//ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
//que diga CORRECTO, en caso contrario, se deberá imprimir INCORRECTO.

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
