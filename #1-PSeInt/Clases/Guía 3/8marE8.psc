//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//funci�n debe devolver la cantidad de veces que encontr� la letra. Nota: recordar el uso
//de la funci�n Subcadena().

Algoritmo ejercicio8
	
	Definir palabra,letra Como Caracter
	Definir resultado Como Entero
	
	Escribir "Ingrese una palabra"
	Leer palabra
	Escribir "Ingrese una letra a buscar dentro de la palabra"
	Leer letra
	
	resultado=nombre(palabra,letra)
	Escribir "La letra ", letra, " se encontr� ", resultado, " veces"
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(palabra,letra)
	
	Definir retorno,i como Entero
	retorno=0
	
	Para i=0 Hasta Longitud(palabra)-1 Hacer
		si Subcadena(palabra,i,i) = letra Entonces
			retorno=retorno+1
		FinSi
	FinPara
	
FinFuncion
	