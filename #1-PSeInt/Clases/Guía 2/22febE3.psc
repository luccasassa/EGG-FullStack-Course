//Realizar un programa que pida un número al usuario. Si el número es mayor que 100 se
//deberá de imprimir en pantalla Es Mayor, y en caso contrario se deberá imprimir Es
//Menor.

Algoritmo ejercicio3
	
	Definir num Como Entero
	
	Escribir "Ingresar número"
	Leer num
	
	si num>100 Entonces
		Escribir "El número es mayor a 100"
	SiNo
		si num=100 Entonces
			Escribir "El número es igual a 100"
		SiNo
			Escribir "El número es menor a 100"
		FinSi
	FinSi
	
FinAlgoritmo
