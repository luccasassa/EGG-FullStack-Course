Algoritmo Integrador
	Definir muestra,matriz Como Caracter
	Definir m Como Entero
	
	Repetir
		Escribir 'Por favor introducir una muestra con A,B,C o D y de Longitud 9,16 o 1369'
		Leer muestra
		muestra=Mayusculas(muestra)
	Mientras Que !(validarCaracteres(muestra) y validarLongitud(muestra))
	
	m=rc(Longitud(muestra))
	Dimension matriz[m,m]
	Escribir 'La muestra a procesar es: ', muestra
	
	llenarMatriz(muestra,matriz,m)
	mostrarMatriz(matriz,m)
	
	Si evaluarDiagonales(matriz,m) Entonces
		Escribir 'Se ha detectado el GEN-Z'
	SiNo
		Escribir 'No se ha detectado el GEN-Z'
	FinSi
FinAlgoritmo
//---------------------------------------------------
Funcion resp=evaluarDiagonales(matriz,m)
	Definir i,j Como Entero
	Definir resp Como Logico
	Definir letra0,letraM Como Caracter
	
	letra0=matriz[0,0]
	letraM=matriz[m-1,m-1]
	
	resp=Verdadero
	
	Para i=0 Hasta m-1 Hacer
		Para j=0 hasta m-1 Hacer
			Si i=j Entonces
				Si letra0<>matriz[i,j] Entonces
					resp=Falso
					i=m-1
					j=m-1
				FinSi
			FinSi
			
			Si i+j=m-1 Entonces
				Si letraM<>matriz[i,j] Entonces
					resp=Falso
					i=m-1
					j=m-1
				FinSi
			FinSi
		FinPara
	FinPara	
FinFuncion
//---------------------------------------------------
SubProceso llenarMatriz(muestra,matriz,m)
	Definir i,j,cont Como Entero
	cont=0
	
	Para i=0 hasta m-1 Hacer
		para j=0 hasta m-1 Hacer
			matriz[i,j]=Subcadena(muestra,cont,cont)
			cont=cont+1
		FinPara
	FinPara
FinSubProceso
//---------------------------------------------------
SubProceso mostrarMatriz(matriz,m)
	Definir i,j Como Entero
	
	Para i=0 hasta m-1 Hacer
		para j=0 hasta m-1 Hacer
			Escribir matriz[i,j], '  ' Sin Saltar
		FinPara
		Escribir ''
	FinPara
FinSubProceso
//---------------------------------------------------
Funcion resp=validarCaracteres(muestra)
	Definir resp Como Logico
	Definir letra Como Caracter
	Definir i Como Entero
	resp=Verdadero
	
	Para i=0 hasta (Longitud(muestra)-1) Hacer
		letra=Subcadena(muestra,i,i)
		si letra<>'A' y letra<>'B' y letra<>'C' y letra<>'D' Entonces
			resp=Falso
			i=Longitud(muestra)-1			
		FinSi
		FinPara
FinFuncion
//---------------------------------------------------
Funcion resp=validarLongitud(muestra)
	Definir resp como Logico
	Definir long Como Entero
	long=Longitud(muestra)
	
	si long=9 o long=16 o long=1369 Entonces
		resp=Verdadero
	SiNo
		resp=Falso
	FinSi
FinFuncion
//---------------------------------------------------