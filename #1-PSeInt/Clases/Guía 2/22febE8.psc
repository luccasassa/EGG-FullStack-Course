//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//caracteres de largo, el programa le sumar� un signo de exclamaci�n al final, y si no es
//de 4 caracteres el programa le sumar� un signo de interrogaci�n al final. El programa
//mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y Concatenar().

Algoritmo ejercicio8
	
	Definir palabra Como Caracter
	
	Escribir "Ingrese una palabra"
	Leer palabra
	
	si Longitud(palabra) = 4 Entonces
		palabra=Concatenar(palabra, "!")
		Escribir palabra
	SiNo
		palabra=Concatenar(palabra, "?")
		Escribir palabra
	FinSi
	
FinAlgoritmo
