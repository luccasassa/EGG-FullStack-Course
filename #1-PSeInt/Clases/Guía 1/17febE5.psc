//Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar
//al usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.

Algoritmo ejrcicio5
	Definir volumen, radio, altura Como Real
	
	Escribir "El radio del cilindro es de "
	Leer radio
	Escribir "La altura del cilindro es de "
	Leer altura
	
	volumen=PI*(radio^2)*altura
	
	Escribir "El volumen total del cilindro es de ", volumen
	
FinAlgoritmo
