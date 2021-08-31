//El apocalipsis Zombie se ha desatado, pero a�n hay esperanza.
//El Dr. Galard ha conseguido aislar el gen Z analizando muestras gen�ticas codificadas.
//Una muestra se corresponde con una secuencia de caracteres compuesta de cuatro posibles bases (A,B,C,D), por ejemplo: �ACDDCADBCDABDBBA�.
//Para poder detectar el gen Z, se representa la muestra como una matriz cuadrada (MxM) y se busca en las dos diagonales principales que todas las bases sean iguales.
//Siguiendo el ejemplo de la muestra anterior la matriz resultante es
//A  C  D  D
//C  A  D  B
//C  D  A  B
//D  B  B  A
//	Galard aclara que para que la muestra sea v�lida el orden de la matriz (el valor de M) debe ser 3x3, 4x4 o 37x37 (seg�n la muestra).
//	Por desgracia, de antemano no es posible saber el orden de la matriz y el mismo debe ser inferido de la muestra ingresada.
//	Tu misi�n: hacer un programa que permita ingresar una muestra completa, detectar si es v�lida,
//	y de ser as�, que imprima la matriz y muestre un mensaje que indique si se ha detectado o no el gen Z
//Reglas de Resoluci�n:
//		a)Identifique con un comentario al inicio del programa su nombre y apellido. Guarde el examen con el nombre:Apellido-Nombre.psc
//		b)A continuaci�n identifique con un comentario las variables de entrada y de salida.
//		c)Es obligatorio el uso de al menos una variable N-dimensional.
//		d)Subdivida el problema de tal forma de utilizar al menos dos subprogramas.

Algoritmo Integrador
	
	Definir matriz,muestra Como Caracter
	Definir cantidad,i,j,contador Como Entero
	
	Repetir
		Escribir 'Ingresar una muestra con A,B,C o D y de tama�o 9,16 o 1369'
		Leer muestra
		
		muestra=Mayusculas(muestra)  //  lo exige la consigna
		cantidad=Longitud(muestra)
		contador=0
		
		Para i = 0 hasta cantidad-1 Hacer
			Si(subCadena(muestra,i,i)='A' o subCadena(muestra,i,i)='B' o subCadena(muestra,i,i)='C' o subCadena(muestra,i,i)='D') Entonces
				contador = contador+1
			Fin Si
		Fin para
		
		Si (cantidad=9 o cantidad=16 o cantidad=1369) y (contador=cantidad) Entonces
			Escribir 'La muestra a procesar es: ', muestra
		FinSi
		
	Hasta Que (cantidad=9 o cantidad=16 o cantidad=1369) y (contador=cantidad)
	
	indroduccion(cantidad)
	exposicion(matriz,muestra)
	
FinAlgoritmo
// ----------------------------------------------------------------
SubProceso indroduccion(cantidad Por Referencia)
	Definir matriz Como Entero
	
	//Asignaci�n de Dimension 
	
	Si cantidad=9 Entonces
		Dimension matriz[3,3]
	FinSi
	
	Si cantidad=16 Entonces
		Dimension matriz[4,4]
	FinSi
	
	Si cantidad=1369 Entonces
		Dimension matriz[37,37]
	FinSi

FinSubProceso
// ----------------------------------------------------------------
SubProceso exposicion(matriz,muestra)
	Definir i,j Como Entero
	
	Para i = 0 Hasta cantidad-1 Hacer
		Para j = 0 Hasta cantidad-1 Hacer
			Escribir matriz(i,j) Sin Saltar ""
		FinPara
		Escribir ""
	FinPara
	
	Para i = 0 Hasta cantidad-1 Hacer
		Para j = 0 Hasta cantidad-1 Hacer
			Si i=j Entonces // me falta la diagonal secundaria (tambi�n tiene que ser igual)
				Escribir 'S� se ha detectado el GEN-Z'
			SiNo
				Escribir 'No se ha detectado el GEN-Z'
			FinSi
		FinPara
	FinPara
	
FinSubProceso


