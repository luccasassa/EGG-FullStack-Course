Algoritmo extra10
	
	Definir n, num, suma Como Entero
	Definir resultado Como Real
	
	Escribir "ingrese la cantidad de factoriales que desea calcular"
	leer num
	
	suma=1
	resultado=0
	
	Para n=1 Hasta num-1 Con Paso 1 Hacer
		Escribir Sin Saltar "1/" suma "!+" 
		suma=suma+1
		
		resultado=resultado+(1/suma)
	Fin Para
	
	Escribir "1/" suma "!" 
	Escribir "resultado final" resultado
	
FinAlgoritmo
