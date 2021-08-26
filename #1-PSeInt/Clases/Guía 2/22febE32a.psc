//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.

Algoritmo ejercicio32
	
	Definir num,contador,suma,promedio,max,min,primernum Como Real;
	
	Escribir "Ingrese un número";
	Leer primernum;
	
	suma=primernum;
	//es igual a "primernum" porque si pongo "0" luego en el bucle no me lo toma en cuenta en la ecuación "suma=suma+num".
	//En el bucle sí me toma en cuenta "primernum" porque "suma" tiene dos equivalencias (primernum y num).
	contador=0;
	max=primernum;
	min=primernum;
	promedio=0
	num=0
	
	Repetir
		Si primernum<>0 Entonces
			Escribir "Ingrese otro número";
			Leer num;
			contador=contador+1;
			suma=suma+num;
			promedio=suma/contador;
			Si num>primernum Entonces
				max=num;
			FinSi
			Si num<min y num<>0 Entonces    //en éste algoritmo es necesario aclarar que el número sea diferente a 0
				min=num;
			FinSi
		SiNo
			Escribir 'Ingresaste un valor imposible de trabajar, hacete culiar.'
	FinSi
	Hasta Que num=0
	
	Escribir "El promedio entre los números es ", promedio;
	Escribir "El numero minimo es ", min, " y el numero maximo es ", max;
	
FinAlgoritmo