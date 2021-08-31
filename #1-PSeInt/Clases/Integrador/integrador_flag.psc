Algoritmo Integrador_flag
	
	Definir matriz como Cadena
	Definir muestra Como Caracter
	Definir i,j,n,cantidad Como Entero
	Definir flag como Logico
	
	Repetir
		Escribir 'Ingresar una muestra con A,B,C o D y de tamaño 9,16 o 1369'
		Leer muestra
		
		muestra=Mayusculas(muestra)  //  lo exige la consigna
		cantidad=Longitud(muestra)
		flag=Verdadero
		
		Para i = 0 hasta cantidad-1 hacer
			Si(subCadena(muestra,i,i)='A' o subCadena(muestra,i,i)='B' o subCadena(muestra,i,i)='C' o subCadena(muestra,i,i)='D') Entonces
				flag = flag y Verdadero  //  es redundante ya que el valor predeterminado de flag es Verdadero
			SiNo
				flag = flag y Falso
			Fin Si
		Fin para
		
		Si (cantidad=9 o cantidad=16 o cantidad=1369) y (flag) Entonces
			Escribir 'La muestra a procesar es: ', muestra
		FinSi
		
	Hasta Que (cantidad=9 o cantidad=16 o cantidad=1369) y (flag)
	
	n = rc(cantidad)
	
	Segun cantidad Hacer
		9: Dimension matriz[n,n]
		16: Dimension matriz[n,n]
		1369: Dimension matriz[n,n]
	FinSegun
	
	relleno(matriz,n,muestra)
	validacion(matriz,n)
	
FinAlgoritmo
// ----------------------------------------------------------------
SubProceso relleno(matriz,n,muestra)
	
	Definir contador,i,j Como Entero
	
	contador=0
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta n-1 Hacer
			matriz[i,j]=Subcadena(muestra,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta n-1 Hacer
			Escribir matriz[i,j] Sin Saltar "  "
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
			Si i+j=n-1 Entonces
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
	
