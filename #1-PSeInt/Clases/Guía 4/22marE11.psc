//Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un
//arreglo y su valor m�s grande.

Algoritmo ejercicio11
	
	Definir i,num,vector,resultado Como Entero
	
	Escribir 'Ingrese la cantidad de �ndices de su vector a analizar'
	Leer num
	Dimension vector[num]
	
	Para i=0 hasta num-1 Hacer
		vector[i] =aleatorio(0,100)                            //o sino =azar(101)
	FinPara
	
	i=num                                                      //es obligatorio asignar la 'i' porque sino te tira error
	resultado=diferencia(num,i,vector)
	Escribir 'La resta del m�ximo y el m�nimo es: ',resultado
	
FinAlgoritmo
// ----------------------------------------------------------------
Funcion retorno=diferencia(num,i,vector)
	Definir retorno,min,max como entero
	
	min=vector[0]
	max=vector[0]
	
	Para i=0 hasta num-1 hacer
		Escribir '[',vector[i],']'
	FinPara
	
	Para i=0 hasta num-1 hacer
		Si vector[i]>max entonces
			max=vector[i]
		FinSi
		
		Si vector[i]<min entonces
			min=vector[i]
		FinSi
	FinPara
	
	Escribir 'El n�mero m�ximo es: [',max,']'
	Escribir 'El n�mero m�nimo es: [',min,']'
	retorno=max-min
	
FinFuncion

	