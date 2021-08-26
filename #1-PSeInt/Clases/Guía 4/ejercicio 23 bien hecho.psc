Algoritmo ejercicio23
	
	Definir matriz, num, suma, base, cont, total, i, k Como Entero
	
	Escribir "Ingrese el tamaño del cuadrado"
	leer num
	
	Dimension matriz(num,num)
	
	Escribir "Ingrese los numeros en el cuadrado"
	
	para i=0 hasta num-1 con paso 1 Hacer
		Para k=0 hasta num-1 con paso 1 hacer
			leer matriz(i,k)
		FinPara
	FinPara
	
	suma=0
	total=0
	cont=0
	base=0
	
	Para i=0 hasta num-1 Con Paso 1 Hacer
		base=base+matriz(0,i)
	FinPara
	
	para i=0 hasta num-1 Con Paso 1 Hacer
		suma=0
		para k=0 hasta num-1 con paso 1 Hacer
			suma=suma+matriz(i,k)
			si suma=base
				cont=cont+1
			FinSi
		FinPara
		Escribir suma
	FinPara
	
	si cont=num
		total=total+1
	FinSi
	
	cont=0
	para i=0 hasta num-1 Con Paso 1 Hacer
		suma=0
		para k=0 hasta num-1 con paso 1 Hacer
			suma=suma+matriz(k,i)
			si suma=base
				cont=cont+1
			FinSi
		FinPara
	FinPara
	
	si cont=num
		total=total+1
	FinSi
	
	suma=0
	para i=0 hasta num-1 Con Paso 1 Hacer
		suma=suma+matriz(i,i)
	FinPara
	
	si suma=base
		total=total+1
	FinSi
	
	suma=0
	k=0
	para i=num-1 hasta 0 Con Paso -1 Hacer
		suma=suma+matriz(i,k)
		k=k+1
	FinPara
	
	si suma=base
		total=total+1
	FinSi
	
	si total=4
		Escribir "Es magico y la suma es " base
	SiNo
		Escribir "no es magico"		
	FinSi
	
	para i=0 hasta num-1 Con Paso 1 Hacer
		para k=0 hasta num-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz(i,k) ", "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
