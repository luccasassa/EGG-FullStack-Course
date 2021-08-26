//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las
//dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 3
//columna se deberá almacenar el resultado de sumar el número de la primera y segunda
//columna. Mostrar la matriz de la siguiente forma:

Algoritmo extra4
	
	Definir i, k, vector, fila Como Entero
	
	Escribir "Ingrese la cantidad de filas que desea que tenga el vector"
	leer fila
	
	Dimension vector(3,fila)
	
	Escribir "Ingrese los numero de a sumar"
	para k=0 hasta fila-1 Con Paso 1 Hacer
		para i=0 hasta 1 con paso 1 Hacer
			leer vector(i,k)
		FinPara
	FinPara
	
	para k=0 hasta fila-1 Con Paso 1 Hacer
		vector(2,k)=vector(0,k)+vector(1,k)
	FinPara
	
	para k=0 hasta fila-1 Con Paso 1 Hacer
		Escribir vector(0,k) "+" vector(1,k) "=" vector(2,k)
	FinPara
	
FinAlgoritmo