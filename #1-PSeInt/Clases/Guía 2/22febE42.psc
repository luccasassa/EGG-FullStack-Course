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
	
	Definir i,u,factorial Como Real
	
	i=0
	u=0
	factorial=1
	
	Para i=1 hasta 5 con paso 1 Hacer
		Escribir Sin Saltar "!", i, "="
		
		Para u=1 Hasta i Con Paso 1 Hacer
			factorial=factorial*u
			
			si u=i Entonces
				Escribir u, "=", factorial
			SiNo
				Escribir Sin Saltar u, "*"
			FinSi
		FinPara
		
		factorial=1
	FinPara
	
FinAlgoritmo
