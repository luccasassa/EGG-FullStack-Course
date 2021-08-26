Algoritmo ejercicio23
	
	Definir num, vector, i, k, sumaA, sumaB, sumaC, sumaD Como Entero
	
	Escribir "Ingrese el tamaño del cuadrado"
	leer num
	
	Dimension vector(num, num)
	
	sumaA=0
	sumaB=0
	sumaC=0
	sumaD=0
	
	Escribir "Ingrese los numeros en el cuadrado"
	
	para i=0 hasta num-1 Con Paso 1 Hacer
		para k=0 hasta num-1 con paso 1 Hacer
			Leer vector(i, k)
		FinPara
	FinPara
	
	Para i=0 Hasta num-1 con paso 1 Hacer
		sumaA=sumaA+vector(0, i)
		sumaB=sumaB+vector(i, 0)
		sumaC=sumaC+vector(i, num-1)
		sumaD=sumaD+vector(num-1, i)
	FinPara
	
	si sumaA=sumaB y sumaC=sumaD y sumaA=sumaC
		para i=0 hasta num-1 Con Paso 1 Hacer
			para k=0 hasta num-1 con paso 1 Hacer
				Escribir Sin Saltar vector(i, k) ", "
			FinPara
			Escribir ""
		FinPara
		Escribir "Es mahicooo"
	SiNo
		Escribir "No es mahicooo"		
	FinSi
	
FinAlgoritmo
