//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo ejercicio4
	
	Definir i,num,contador,suma,promedio Como Real
	Dimension vector[5]
	
	suma=0
	contador=0
	
	Para i=0 hasta 4 Hacer
		Leer vector[i]
		
		suma=suma+vector[i]
		contador=contador+1
		promedio=suma/contador
	FinPara
	
	Escribir "El promedio de los números es ", promedio;
	
FinAlgoritmo
