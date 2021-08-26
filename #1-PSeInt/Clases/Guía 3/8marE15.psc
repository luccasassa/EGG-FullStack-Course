//Crear una procedimiento que calcule la temperatura media de un día a partir de la
//temperatura máxima y mínima. Crear un programa principal, que utilizando el
//procedimiento anterior, vaya pidiendo la temperatura máxima y mínima de cada día y
//vaya mostrando la media. El programa pedirá el número de días que se van a introducir.

Algoritmo ejercicio15
	
	Definir dias Como Entero
	
	Escribir "Ingrese la cantidad de días a calcular el pronóstico"
	Leer dias
	
	procedimiento(dias)
	
FinAlgoritmo
//----------------------------------------------------------------
SubProceso procedimiento(dias)
	
	Definir i,min,max,media Como Entero
	
	Para i=1 Hasta dias Hacer
		Escribir "Cuál es la temp mínima?"
		Leer min
		Escribir "Cuál es la temp máxima?"
		Leer max
		media=(min+max)/2
		Escribir "La temp media es de ", media, " grados centígrados"
	FinPara
	
FinSubProceso
	