//Programe una funci�n recursiva que calcule la suma de un arreglo de n�meros enteros.

Algoritmo ejercicio14
	
	Definir i,num,vector,resultado Como Entero
	
	Escribir 'Ingrese el tama�o de su vector'
	Leer num
	Dimension vector[num]
	
	Para i=0 hasta num-1 Hacer
		vector[i]=Aleatorio(1,10)
		Escribir '[', vector(i), ']'
	FinPara
	
	resultado=sumatoria(vector,num)
	Escribir 'El resultado de la suma de los �ndices del vector es igual a: ', resultado
	
FinAlgoritmo
// ----------------------------------------------------------------
Funcion retorno=sumatoria(vector,num)
	
	Definir retorno Como Entero
	
	Si num=1 Entonces
		retorno=vector[num-1]
	SiNo
		retorno=vector[num-1]+sumatoria(vector,num-1)
	FinSi
	
FinFuncion
