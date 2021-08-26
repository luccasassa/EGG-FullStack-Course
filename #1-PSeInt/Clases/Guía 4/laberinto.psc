Algoritmo complementario1
	
	Definir i, k, num como entero
	Definir vector Como Caracter
	
	Dimension  vector(9,9)
	
	para i=0 hasta 8 Con Paso 1 Hacer
		para k=0 hasta 8 Con Paso 1 Hacer
			vector(i,k)="X"
		FinPara
	FinPara
	
	para i=0 hasta 8 con paso 1 Hacer
		vector(i,0)="!"
		vector(i,8)="!"
		vector(i,6)="!"
		vector(i,4)="!"
		vector(i,2)="!"
	FinPara
	
	para i=0 hasta 8 con paso 1 Hacer
		vector(0,i)="_"
		vector(8,i)="¯"
	FinPara
	
	vector(6,2)="X"
	vector(1,4)="X"
	vector(5,6)="X"
	vector(0,1)="X"
	vector(8,8)="X"
	vector(7,8)="X"
	vector(0,0)="Y"
	
	para i=0 hasta 8 Con Paso 1 Hacer
		para k=0 hasta 8 Con Paso 1 Hacer
			Escribir Sin Saltar vector(i,k) "  "
		FinPara
		Escribir ""
	FinPara
	
	Escribir "Mueva el personaje, 1 izquierda, 2 abajo, 3 derecha y 5 arriba"
	leer num
	
	Repetir
		Limpiar Pantalla
		para i=0 hasta 8 Con Paso 1 Hacer
			para k=0 hasta 8 Con Paso 1 Hacer
				si vector(i,k)="Y"
					Segun num
						1:
							si vector(i,k-1)="X" Entonces								
								vector(i,k-1)="Y"
								vector(i,k)="X"
								i=8
								k=8
							SiNo
								Escribir "hay una pared !!!!!!!!"
							FinSi
						2:
							si vector(i+1,k)="X" Entonces
								vector(i+1,k)="Y"
								vector(i,k)="X"
								i=8
								k=8
							SiNo
								Escribir "hay una pared !!!!!!!!"
							FinSi
						3:
							si k+1>8
								Escribir "hay una pared !!!!!!!!"
							SiNo
								si vector(i,k+1)="X" Entonces
									vector(i,k+1)="Y"
									vector(i,k)="X"
									i=8
									k=8
								SiNo
									Escribir "hay una pared !!!!!!!!"
								FinSi
							FinSi
						5:
							si vector(i-1,k)="X" Entonces
								vector(i-1,k)="Y"
								vector(i,k)="X"
								i=8
								k=8
							SiNo
								Escribir "hay una pared !!!!!!!!"
							FinSi
					FinSegun
				FinSi
			FinPara
		FinPara
		para i=0 hasta 8 Con Paso 1 Hacer
			para k=0 hasta 8 Con Paso 1 Hacer
				Escribir Sin Saltar vector(i,k) "  "
			FinPara
			Escribir ""
		FinPara
		leer num
	Hasta Que vector(8,8)="Y"
	
	Escribir "LLEGASTE!!!!"
	
FinAlgoritmo
