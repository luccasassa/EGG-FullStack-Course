//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
//Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son
//iguales o no. La función debe devolver el resultado de está validación, para mostrar el
//mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.

Algoritmo ejercicio13
	
	Definir vectorA,vectorB,num Como Entero
	Definir respuesta Como Logico
	Escribir 'Ingrese la cantidad de índices de su vector a analizar'
	Leer num
	Dimension vectorA[num],vectorB[num]
	
	rellenador(vectorA,vectorB,num)               //Procedimiento
	respuesta=valores(vectorA,vectorB,num)        //Función
	
	Escribir 'Los valores de ambos arreglos son iguales?: ', respuesta
	
FinAlgoritmo
// ----------------------------------------------------------------
SubProceso rellenador(vectorA,vectorB,num)
	
	Definir i Como Entero
	
	Escribir 'Los valores de los índices de VectorA son:'
	Para i=0 hasta num-1 Hacer
		vectorA(i)=azar(3)
		Escribir '[', vectorA(i), ']'
	FinPara
	
	Escribir 'Los valores de los índices de VectorB son:'
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
