//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.

Algoritmo ejercicio32
	Definir num,max,min, contador, suma Como Entero;
	Definir promedio Como Real;
	
	contador=0;
	suma=0;
	max=0;
	min=1000000000;
	
	Escribir "Ingrese un n�mero";
	Leer num;
	
	Repetir
		Si num>max Entonces
			max=num;
		FinSi
		
		Si num<min Entonces    //en �ste algoritmo NO hace falta aclarar "y num <> 0", ya que el n�mero m�nimo es 1000000000
			min=num;
		FinSi
		
		contador=contador+1;
		suma=suma+num;
		promedio=suma/contador;
		
		Escribir "Ingrese otro n�mero ";
		Leer num;
	Hasta Que num=0
	
	Escribir "El promedio es ", promedio;
	Escribir "El numero minimo es ", min, " y el numero maximo es ", max;
	
FinAlgoritmo
