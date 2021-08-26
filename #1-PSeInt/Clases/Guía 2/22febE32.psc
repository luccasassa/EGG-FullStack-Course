//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.

Algoritmo ejercicio32
	
	Definir num,minimo,maximo,contador,promedio Como Real	
	
	Escribir "Por favor introduzca un número"
	Leer num
	
	contador=0
	minimo=num
	maximo=num
	promedio=num
	
	Si num<>0 Entonces
		Repetir
			Escribir "Por favor introduzca otro número"
			Leer num
			Si num<minimo y num<>0 Entonces
				minimo=num
			SiNo
				Si num>maximo Entonces
					maximo=num
				Fin Si
			FinSi
			promedio=promedio+num
			contador=contador+1
		Hasta Que num=0
	SiNo
		minimo=0
		maximo=0
		promedio=1       //ésto es para que no salte error en la línea 40
		contador=1       //ésto también es para que no salte error en la línea 40
	FinSi
	
	Escribir "El número máximo ingresado es ", maximo
	Escribir "El número mínimo ingresado es ", minimo
	Escribir "El promedio de los números ingresados es ", promedio/contador
	
FinAlgoritmo

