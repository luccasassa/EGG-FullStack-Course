//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.

Algoritmo ejercicio32
	
	Definir num,minimo,maximo,contador,promedio Como Real	
	
	Escribir "Por favor introduzca un n�mero"
	Leer num
	
	contador=0
	minimo=num
	maximo=num
	promedio=num
	
	Si num<>0 Entonces
		Repetir
			Escribir "Por favor introduzca otro n�mero"
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
		promedio=1       //�sto es para que no salte error en la l�nea 40
		contador=1       //�sto tambi�n es para que no salte error en la l�nea 40
	FinSi
	
	Escribir "El n�mero m�ximo ingresado es ", maximo
	Escribir "El n�mero m�nimo ingresado es ", minimo
	Escribir "El promedio de los n�meros ingresados es ", promedio/contador
	
FinAlgoritmo

