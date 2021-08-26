//	31-03-2021
//	Integrador_PSeInt
//	Variable de Entrada: muestra
//	Variable de Salida: matriz

Algoritmo Integrador_Sassaroli_Luca
	
	Definir matriz como Cadena
	Definir muestra Como Caracter
	Definir i,j,n,cantidad,contador Como Entero
	
	Hacer
		Escribir 'Ingresar una muestra con A,B,C ó D y de longitud 9,16 o 1369'
		Leer muestra
		
		muestra=Mayusculas(muestra)  //  lo exige la consigna
		cantidad=Longitud(muestra)
		contador=0
		
		Para i = 0 hasta cantidad-1 Hacer  //  condición de letras
			Si(subCadena(muestra,i,i)='A' o subCadena(muestra,i,i)='B' o subCadena(muestra,i,i)='C' o subCadena(muestra,i,i)='D') Entonces
				contador = contador+1
			Fin Si
		Fin para
		
		Si (cantidad=9 o cantidad=16 o cantidad=1369) y (contador=cantidad) Entonces  //  condición de límite de caracteres
			Escribir '------------------------------------'
			Escribir 'La muestra a procesar es: ', muestra
		FinSi
		
	Hasta Que (cantidad=9 o cantidad=16 o cantidad=1369) y (contador=cantidad)
	
	n = rc(cantidad)  //  asignación de dimensión a la matriz calculando la raíz cuadrada del total de mis caracteres
	Dimension matriz[n,n]
	
	relleno(matriz,n,muestra)  //  invocación de mi primer subproceso
	validacion(matriz,n)  //  invocación de mi segundo subproceso

FinAlgoritmo
// ----------------------------------------------------------------
SubProceso relleno(matriz,n,muestra)
	
	Definir contador,i,j Como Entero
	
	contador=0
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta n-1 Hacer
			matriz[i,j]=Subcadena(muestra,contador,contador)  //  relleno de la matriz
			contador=contador+1
		FinPara
	FinPara
	
	Escribir ''
	Escribir '.........Analizando muestra.........'
	Escribir ''
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta n-1 Hacer
			Escribir matriz[i,j] Sin Saltar "  "  //  exposición de la matriz
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
// ----------------------------------------------------------------
SubProceso validacion(matriz,n)
	
	Definir i,j,contador1,contador2 Como Entero
	Definir aux1,aux2 Como Caracter
	
	contador1=0
	contador2=0
	//es importante en el bucle Para poner: "aux1=matriz..." porque sino luego me pide inicializar aux1
	
	Escribir ''
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta n-1 Hacer
			Si i=j Entonces
				aux1=matriz[0,0]  //  diagonal primaria  //  aux1 almacena el valor del primer casillero para después compararlo con el resto de los casilleros
				Si aux1<>matriz[i,j] Entonces
					contador1=contador1+1
				FinSi
			FinSi
		FinPara
	FinPara
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta n-1 Hacer
			Si i+j=n-1 Entonces  //la suma de 'i' y 'j' va dar igual a la dimensión de uno de los ejes-1 
				aux2=matriz[0,n-1]  //  diagonal secundaria  //  aux2 almacena el valor del último casillero para después compararlo con el resto de los casilleros
				Si aux2<>matriz[i,j] Entonces
					contador2=contador2+1
				FinSi
			FinSi
		FinPara
	FinPara
	
	Si contador1=0 y contador2=0 Entonces
		Escribir 'Sí se encontró el GEN-Z'
	SiNo
		Escribir 'No se encontró el GEN-Z'
	FinSi

FinSubProceso
	