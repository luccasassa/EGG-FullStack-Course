//La funci�n factorial se aplica a n�meros enteros positivos. El factorial de un n�mero
//entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:

//	   n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n

//Escriba un programa que calcule los factoriales de todos los n�meros enteros desde el 1
//hasta el 5. El programa deber� mostrar la siguiente salida:

//    !1 = 1
//    !2 = 1*2 = 2
//    ...
//    !5 = 1*2*3*4*5 = 120

//Nota: si necesitas saber m�s sobre la funci�n factorial revise el link del PDF

Algoritmo ejercicio42
	
	Definir i,factorial Como Entero
	Definir n como cadena
	
	n="!=1"
	factorial=1
	
	Para i=1 hasta 5 Hacer
		factorial=factorial*i
		si i=1 Entonces
			Escribir "1",n
		SiNo
			n=n+"*"+ConvertirATexto(i)
			Escribir i,n, "=", factorial
		FinSi
	FinPara

FinAlgoritmo
