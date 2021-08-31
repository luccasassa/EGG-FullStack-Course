
Algoritmo ej13guia4
	
	Definir n,v1,v2,i Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingresar el tamaño de los vectores."
	Leer n
	Dimension v1(n),v2(n)
	arreglos(v1,v2,n)
	resultado=comparacion(v1,v2,n)
	Escribir "¿Los valores de los vectores son iguales? " ,resultado

FinAlgoritmo


SubProceso arreglos(vector1 Por Referencia,vector2 Por Referencia,n)
	Definir i Como Entero
	Para i=0 hasta n-1 Hacer
		vector1(i)=Aleatorio(0,100)
		vector2(i)=Aleatorio(0,100)
	FinPara
	vector1(2)=3
	vector2(2)=3
	Para i=0 hasta n-1 Hacer
		Escribir Sin Saltar "[" , vector1(i) , "]"
	FinPara
	Escribir ""
	Para i=0 hasta n-1 Hacer
		Escribir Sin Saltar "[" , vector2(i) , "]"
	FinPara
	Escribir ""
FinSubProceso


Funcion iguales=comparacion(vector1 Por Referencia,vector2 Por Referencia,n)
	Definir i Como Entero
	Definir iguales Como Logico
	
	
	Para i=0 hasta n-1 Hacer
		Si vector1(i) = vector2(i) Entonces
			iguales=Verdadero
			Escribir iguales
		SiNo
			iguales=Falso
			Escribir iguales
		FinSi
	FinPara
	
FinFuncion
	