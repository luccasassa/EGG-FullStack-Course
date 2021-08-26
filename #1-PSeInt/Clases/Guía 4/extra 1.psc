//Realizar un programa que lea N temperaturas y las almacene en un vector.
//Posteriormente calcular el promedio de todas las temperaturas y emitir un listado de
//todas aquellas que sean mayores o iguales al promedio.

Algoritmo extra1
	
	Definir N, i, suma, vector Como Entero
	Definir prom Como Real
	
	Escribir "Ingrese cuantas temperaturas promediará"
	leer N
	
	Dimension vector(N)
	
	suma=0
	
	Escribir "Ingrese las temperaturas"
	para i=0 hasta N-1 con paso 1 Hacer
		leer vector(i)
		suma=suma+vector(i)
	FinPara
	
	prom=suma/N
	
	para i=0 hasta N-1 Con Paso 1 Hacer
		si vector(i)>=prom
			
			Escribir "La temperatura " i " que es de " vector(i) " es mayor al promedio " prom
			
		FinSi
	FinPara
	
FinAlgoritmo
