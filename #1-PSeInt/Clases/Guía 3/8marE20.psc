//Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2.
//Chequear que si N es impar se muestre un mensaje de error.

Algoritmo ejercicio20
	
	Definir num,resultado Como Entero
	
	Escribir "Ingrese un n�mero"
	Leer num
	
	Si num mod 2 <> 0 Entonces
		Escribir "IMPOSIBLE DE EJECUTAR. El n�mero que ud ingres� es impar."
	SiNo
		resultado=sumatoria(num)
		Escribir "La sumatoria de primeros ", num, " n�meros es ", resultado
	FinSi
	
FinAlgoritmo
// ----------------------------------------------------------------
Funcion recursion=sumatoria(num)
	
	Definir recursion Como Entero
	
	Si num=1 Entonces
		recursion=2
	SiNo
		recursion = 2 * num + sumatoria(num-1)   //para impares es "2*num-1+sumatoria(num-1)"
	FinSi
	Escribir "+ ", 2*num, " = ", recursion

FinFuncion
