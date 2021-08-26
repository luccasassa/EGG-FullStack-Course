//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas
//de tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas
//variables y mostrar el resultado final por pantalla.
//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
//programa deberá mostrar: num1 = 3 y num2 = 9

Algoritmo ejercicio11
	Definir num1, num2, num3 Como Entero
	
	Escribir "El valor del primer número es de "
	Leer num1
	Escribir "El valor del segundo número es de "
	Leer num2
	
	num3=num1
	num1=num2
	num2=num3
	
	Escribir "El valor de num1 es: ", num1 " y el valor de num2 es: ", num2
	
FinAlgoritmo
