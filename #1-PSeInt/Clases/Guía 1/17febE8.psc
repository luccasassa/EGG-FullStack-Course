//A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado
//se debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
//Ayuda: 1 pulgada equivale a 2.54 centímetros.

Algoritmo ejercicio8
	Definir mts, cm, mm Como Entero
	Definir pulgadas Como Real
	
	Escribir "Ingresar cantidad de metros"
	Leer mts
	
	cm=mts*100
	mm=cm*100
	pulgadas=(mts*100)/2.54
	
	Escribir "en ", mts " metro, hay ", cm " centímetros, ", mm " milímetros, y ", pulgadas " pulgadas"
	
	
FinAlgoritmo
