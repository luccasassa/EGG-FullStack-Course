//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una �A�. Si la primera letra es una �A�, se deber� de imprimir un mensaje por pantalla
//que diga �CORRECTO�, en caso contrario, se deber� imprimir �INCORRECTO�. 
//Nota: investigar la funci�n Subcadena de Pseint.

Algoritmo ejercicio12
	
	Definir palabra Como Caracter
	Escribir "Escriba la palabra"
	Leer palabra
	
	si Subcadena(palabra,0,0) = "a" Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"		
	FinSi
	
FinAlgoritmo
