Algoritmo Arreglos_VECTORES
	Definir i,suma, valores Como Entero	
	Definir palabra Como Caracter
	palabra= "dimension"
	
	i= 0
	suma=0
	Dimension valores(4) // 4 seria el tamaño del arreglo
	
	Escribir "ingresar los valores a sumar"
	
	Para i= 0 Hasta 3 Hacer
		leer valores(i)
	FinPara
	
	Para i=0 Hasta 3 Hacer
		suma = suma + valores(i)
	FinPara
	
	Escribir "La suma de los valores es: ", suma
	Escribir "--------------------------------------"
	Escribir "VECTOR COMPLETO:"
	Para i=0 hasta 3 Hacer
		Escribir valores(i), " , " sin saltar
	FinPara
	Escribir ""
	
	Escribir "VECTOR INVERTIDO:"
	Para i=3 hasta 0 Hacer
		Escribir valores(i), " , " sin saltar
	FinPara
	
FinAlgoritmo
