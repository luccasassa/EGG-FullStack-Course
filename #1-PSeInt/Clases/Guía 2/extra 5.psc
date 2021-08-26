///Escriba un programa que solicite al usuario números decimales mientras el usuario
///escriba números mayores que el primero que se ingresó. Por ejemplo: si el usuario
///ingresa como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un
///tercer número. El programa continuará solicitando valores sucesivamente mientras los
///valores ingresados sean mayores que 3.1, caso contrario, el programa finaliza

Algoritmo extra5
	
	Definir limite, num Como Real
	
	Escribir "ingrese un numero"
	leer limite
	
	Escribir "inngrese numeros mayores al anterior, cuando ingrese uno menor el programa finalizara"
	leer num
	
	
	Mientras limite<num
		Escribir "ingrese nuevamente un numero"
		leer num
	FinMientras
	
	
FinAlgoritmo
