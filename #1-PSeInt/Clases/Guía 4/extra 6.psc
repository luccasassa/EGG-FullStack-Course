Algoritmo extra6
	
	Definir i, k, vector, vectorM, vectorR Como Entero
	
	Dimension vector(3,3), vectorM(3,3), vectorR(3)
	
	para i=0 hasta 2 Con Paso 1 Hacer
		para k=0 hasta 2 con paso 1 Hacer
			vector(i,k)=Aleatorio(1,10)
			vectorM(i,k)=Aleatorio(1,10)
		FinPara
	FinPara
	
	para i=0 hasta 2 con paso 1 Hacer
		vectorR(i)=(vector(i,0)*vectorM(i,0))+(vector(i,1)*vectorM(i,1))+(vector(i,2)*vectorM(i,2))
	FinPara

	para i=0 hasta 2 con paso 1 Hacer
		para k=0 hasta 2 con paso 1 Hacer
			Escribir Sin Saltar vector(i,k) ", "
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
	
	para i=0 hasta 2 con paso 1 Hacer
		para k=0 hasta 2 con paso 1 Hacer
			Escribir Sin Saltar vectorM(i,k) ", "
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
	
	para i=0 hasta 2 con paso 1 Hacer
		Escribir Sin Saltar vectorR(i) ", "
	FinPara
	
	Escribir ""
	
FinAlgoritmo
