//Crear una procedimiento que calcule la temperatura media de un d�a a partir de la
//temperatura m�xima y m�nima. Crear un programa principal, que utilizando el
//procedimiento anterior, vaya pidiendo la temperatura m�xima y m�nima de cada d�a y
//vaya mostrando la media. El programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo ejercicio15
	
	Definir dias Como Entero
	
	Escribir "Ingrese la cantidad de d�as a calcular el pron�stico"
	Leer dias
	
	procedimiento(dias)
	
FinAlgoritmo
//----------------------------------------------------------------
SubProceso procedimiento(dias)
	
	Definir i,min,max,media Como Entero
	
	Para i=1 Hasta dias Hacer
		Escribir "Cu�l es la temp m�nima?"
		Leer min
		Escribir "Cu�l es la temp m�xima?"
		Leer max
		media=(min+max)/2
		Escribir "La temp media es de ", media, " grados cent�grados"
	FinPara
	
FinSubProceso
	