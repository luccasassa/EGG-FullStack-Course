//Implemente de forma recursiva una función que le dé la vuelta a una cadena de caracteres. 
//NOTA: Si la cadena es un palíndromo, la cadena y su inversa coincidirán.

Algoritmo ejercicio21
	
	Definir palabra Como Cadena
	Definir largo Como Entero
	
	Escribir "Ingrese una palabra:"
	Leer palabra
	
	largo = Longitud(palabra)
	Escribir vuelta(palabra,largo)
	
FinAlgoritmo
// ----------------------------------------------------------------
Funcion retorno = vuelta(palabra, largo)
	Definir retorno Como Cadena
	
	//retorno = ""                               // no es necesario
	
	Si (largo < 0) Entonces
		retorno = ""
	SiNo
		retorno = Subcadena(palabra,largo,largo) + vuelta(palabra, (largo - 1))
	FinSi
	
FinFuncion

