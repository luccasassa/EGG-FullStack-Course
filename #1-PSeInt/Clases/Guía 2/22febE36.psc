//Realizar un programa que pida una frase y el programa deber� mostrar la frase en con
//un espacio entre cada letra. La frase se mostrara as�: H o l a. 
//	Nota: recordar el funcionamiento de la funci�n Subcadena().
//	NOTA:. En PSeInt, si queremos escribir sin que haya saltos de l�nea, al final de la
//			operaci�n escribir escribimos sin saltar. Por ejemplo:
//			Escribir sin saltar Hola,
//			Escribir sin saltar c�mo est�s?
//			Imprimir� por pantalla: Hola, c�mo est�s?

Algoritmo ejercicio36
	
	Definir palabra Como Caracter;
	Definir i Como Entero;
	
	Escribir "Escriba su palabra favorita";
	Leer palabra;
	
	Para i = 0 hasta Longitud(palabra) Con Paso 1 Hacer;
		Escribir Sin Saltar Subcadena(palabra,i,i);         //letra por letra
		Escribir Sin Saltar " ";                            //espacio entre cada letra
	FinPara;
	
	Escribir " ";
	
FinAlgoritmo
