//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario,
//validando que el primer numero sea mayor que el segundo y devuelva si el primer
//numero es m�ltiplo del segundo.

Algoritmo ejercicio4
	
	Definir num1,num2 Como Real
	Definir respuesta Como Logico
	
	Escribir "Ingrese los n�meros"
	Leer num1,num2
	
	respuesta=nombre(num1,num2)
	
FinAlgoritmo

//----------------------------------------------------------------

Funcion EsMultiplo=nombre(num1,num2)
	Definir EsMultiplo Como logico
	
	Si num1>num2 Entonces
		Escribir "El primer n�mero es mayor al segundo? ", Verdadero
	SiNo
		Escribir "El primer n�mero es mayor al segundo? ", Falso
	FinSi
	
	Si num1 mod num2 = 0 Entonces
		Escribir "Es m�ltiplo? ", Verdadero
	SiNo
		Escribir "Es m�ltiplo? ", Falso
	FinSi
	
Fin Funcion

