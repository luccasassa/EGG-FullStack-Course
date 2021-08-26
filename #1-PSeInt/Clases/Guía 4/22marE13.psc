//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios.
//Despu�s, hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son
//iguales o no. La funci�n debe devolver el resultado de est� validaci�n, para mostrar el
//mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo l�gico.

Algoritmo ejercicio13
	
	Definir vectorA,vectorB,num Como Entero
	Definir respuesta Como Logico
	Escribir 'Ingrese la cantidad de �ndices de su vector a analizar'
	Leer num
	Dimension vectorA[num],vectorB[num]
	
	rellenador(vectorA,vectorB,num)               //Procedimiento
	respuesta=valores(vectorA,vectorB,num)        //Funci�n
	
	Escribir 'Los valores de ambos arreglos son iguales?: ', respuesta
	
FinAlgoritmo
// ----------------------------------------------------------------
SubProceso rellenador(vectorA,vectorB,num)
	
	Definir i Como Entero
	
	Escribir 'Los valores de los �ndices de VectorA son:'
	Para i=0 hasta num-1 Hacer
		vectorA(i)=azar(3)
		Escribir '[', vectorA(i), ']'
	FinPara
	
	Escribir 'Los valores de los �ndices de VectorB son:'
	Para i=0 hasta num-1 Hacer
		vectorB(i)=azar(3)
		Escribir '[', vectorB(i), ']'
	FinPara
	
FinSubProceso
// ----------------------------------------------------------------
Funcion retorno=valores(vectorA,vectorB,num)
	
	Definir retorno Como Logico
	Definir i Como Entero
	
	Para i=0 hasta num-1 Hacer
		Si vectorA[i]=vectorB[i] Entonces
			retorno=Verdadero
			Escribir retorno
		SiNo
			retorno=Falso
			Escribir retorno
		FinSi
	FinPara
	
FinFuncion
