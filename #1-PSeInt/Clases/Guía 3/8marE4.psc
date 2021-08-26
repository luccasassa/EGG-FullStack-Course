//Crea una función EsMultiplo que reciba los dos números pasados por el usuario,
//validando que el primer numero sea mayor que el segundo y devuelva si el primer
//numero es múltiplo del segundo.

Algoritmo ejercicio4
	
	Definir num1,num2 Como Real
	Definir respuesta Como Logico
	
	Escribir "Ingrese los números"
	Leer num1,num2
	
	respuesta=nombre(num1,num2)
	
FinAlgoritmo

//----------------------------------------------------------------

Funcion EsMultiplo=nombre(num1,num2)
	Definir EsMultiplo Como logico
	
	Si num1>num2 Entonces
		Escribir "El primer número es mayor al segundo? ", Verdadero
	SiNo
		Escribir "El primer número es mayor al segundo? ", Falso
	FinSi
	
	Si num1 mod num2 = 0 Entonces
		Escribir "Es múltiplo? ", Verdadero
	SiNo
		Escribir "Es múltiplo? ", Falso
	FinSi
	
Fin Funcion

