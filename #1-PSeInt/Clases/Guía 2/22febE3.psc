//Realizar un programa que pida un n�mero al usuario. Si el n�mero es mayor que 100 se
//deber� de imprimir en pantalla Es Mayor, y en caso contrario se deber� imprimir Es
//Menor.

Algoritmo ejercicio3
	
	Definir num Como Entero
	
	Escribir "Ingresar n�mero"
	Leer num
	
	si num>100 Entonces
		Escribir "El n�mero es mayor a 100"
	SiNo
		si num=100 Entonces
			Escribir "El n�mero es igual a 100"
		SiNo
			Escribir "El n�mero es menor a 100"
		FinSi
	FinSi
	
FinAlgoritmo
