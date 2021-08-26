//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
//correctamente.

Algoritmo ejercicio29
	
	Definir clave Como Caracter
	Definir contador Como Real
	
	contador = 0
	
	Repetir
		Escribir "Por favor introduzca la clave"
		Leer clave
		contador=contador+1
		si clave="eureka" Entonces
			Escribir "Usted ha ingresado al sistema"
		SiNo
			Escribir "Clave incorrecta, ingrese nuevamente la clave"
		FinSi
		
	Hasta Que contador=3 o clave="eureka"
	
	si contador>=3 y clave<>"eureka" Entonces
		Escribir "Se han acabado los intentos"
	FinSi
FinAlgoritmo
