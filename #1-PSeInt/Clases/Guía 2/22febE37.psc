//Siguiendo el ejercicio anterior, ahora deberemos hacer lo mismo pero que la cadena se
//muestre al revés. Por ejemplo, si tenemos la cadena: Hola, deberemos mostrar a l o H.

Algoritmo ejercicio37
	
	Definir palabra Como Caracter
	Definir i Como Entero
	
	Escribir "Escriba su palabra favorita"
	Leer palabra
	
	Para i = Longitud(palabra) hasta 0 Con Paso -1 Hacer
		Escribir Sin Saltar Subcadena(palabra,i,i)         //letra por letra
		Escribir Sin Saltar " "                            //espacio entre cada letra
	FinPara
	
	Escribir " "
	
FinAlgoritmo
