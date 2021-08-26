//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
//	de los siguientes valores: 2+4+6+8+10.

Algoritmo ejercicio31
	
	Definir cantidad,num,suma,contador Como Entero
	
	suma=0
	num=0
	contador=0
	
	Escribir "Ingrese la cantidad de pares que desea sumar"
	Leer cantidad
	
	Repetir
		num=num+2
		suma=suma+num
		contador=contador+1
		Escribir suma, ' + ', num+2
	Hasta Que contador=cantidad
	
	Escribir "El resultado de la suma de los números pares es ", suma
	
FinAlgoritmo
