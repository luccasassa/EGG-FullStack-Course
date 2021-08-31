///18. Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
///llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta. NOTA: si no
///	conoces lo que es una traspuesta, mirar el siguiente link: Matriz Traspuesta
Algoritmo sin_titulo
	
	definir n,m ,matriz ,i,j como entero
	Escribir "INGRESE LAS DIMENSIONES DE LA MATRIZ"
	Escribir "FILAS = " Sin Saltar
	leer n 
	Escribir "COLUMNAS = " Sin Saltar
	leer m
	
	Dimension matriz(n,m)
	
	para i=0 hasta n-1
		para j=0 hasta m-1
			matriz(i,j)=Aleatorio(0,9)
		FinPara
	FinPara

	para i=0 hasta n-1
		para j=0 hasta m-1
			Escribir matriz(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	Escribir "TRANSPUESTA"
	Escribir ""
	
	para i=0 hasta m-1
		para j=0 hasta n-1
			Escribir matriz(j,i) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
