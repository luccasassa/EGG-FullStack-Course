//Recordando el ejercicio 13 de la guía 2, ahora vamos a sumar una función que se
//encargue de ver si la primera letra de nuestra frase y la ultima son la misma. La función
//nos devolverá en mensaje de Correcto o Incorrecto para mostrarlo en nuestro algorimo.

Algoritmo ejercicio1
	
	Definir palabra,resultado Como Caracter
	
	Escribir "Escriba una palabra"
	Leer palabra
	
	resultado=calcularletra(palabra)
	Escribir resultado
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion letra = calcularletra(palabra)
	Definir letra,a,b Como Caracter
	
	a=Subcadena(palabra,0,0)
	b=Subcadena(palabra,Longitud(palabra)-1, Longitud(palabra)-1)
	
	si a=b Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinFuncion
