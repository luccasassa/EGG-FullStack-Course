///Escriba un programa que solicite al usuario n�meros decimales mientras el usuario
///escriba n�meros mayores que el primero que se ingres�. Por ejemplo: si el usuario
///ingresa como primer n�mero un 3.1, y luego ingresa un 4, el programa debe solicitar un
///tercer n�mero. El programa continuar� solicitando valores sucesivamente mientras los
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
