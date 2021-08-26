//Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree
//un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
//		* * * *
//		*     *
//		*     *
//		* * * *
//Nota: recordar el uso del escribir sin saltar en Pseint.

Algoritmo ejercicio39
	
	Definir i,lado,espacio Como Entero
	
	Escribir "Ingrese el tamaño del lado del cuadrado"
	Leer lado
	
	Para i=1 hasta lado Con Paso 1                              //parte superior
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
	Para i=1 hasta lado-2 Con Paso 1                           //centro con espacios
		Escribir Sin Saltar "*"
		
		Para espacio=1 hasta lado-2 Con Paso 1
			Escribir Sin Saltar " "
		FinPara
		
		Escribir Sin Saltar "*"
		Escribir " " 
	FinPara
	
	Para i=1 hasta lado Con Paso 1                             //parte inferior
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir " "
	
FinAlgoritmo
