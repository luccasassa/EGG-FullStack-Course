//Programe una función que calcule el producto de un arreglo de números enteros. Para
//	esto imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los
//		valores es igual a (V[1]*V[2]*V[3]*V[4])

Algoritmo extra3
	
	Definir tam, cuenta, vector, i Como Entero
	
	Escribir "Ingrese el tamaño del vector"
	leer tam
	
	Dimension vector(tam)
	cuenta=1
	
	Escribir "Ingrese los numeros con que rellenara el vector"
	para i=0 hasta tam-1 Con Paso 1 Hacer
		leer vector(i)
	FinPara
	
	para i=0 hasta tam-1 Con Paso 1 Hacer
		cuenta=cuenta*vector(i)
	FinPara
	
	para i=0 hasta tam-2 Con Paso 1 Hacer
		Escribir Sin Saltar vector(i) "*"
	FinPara
	
	Escribir vector(tam-1) "=" cuenta
	
FinAlgoritmo
