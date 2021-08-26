//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
//continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
//m�ximo y m�nimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//n�meros ingresados dentro del intervalo.

Algoritmo ejercicio24
	
	Definir num,min,max,contador Como Entero;
	
	contador=0
	
	Escribir "Ingrese el n�mero m�nimo de su intervalo";
	Leer min;
	Escribir "Ingrese el n�mero m�ximo de su intervalo";
	Leer max;
	
	Escribir 'Ingrese un n�mero que est� dentro de su intervalo'
	Leer num
	
	Mientras num<min Hacer
		Escribir 'El n�mero debe ser mayor al m�nimo, ingrese otro n�mero'
		Leer num
	FinMientras
	
	Mientras num<=max y num>=min Hacer
		Escribir 'Ingrese otro n�mero respetando la condici�n que se le asign�'
		Leer num
		
		contador=contador+1
		
		Si num<min o num>max Entonces
			Escribir 'No respet� la consigna, no se le pedir�n m�s n�meros..'
			Escribir ''
		FinSi
		
	FinMientras
	
	Escribir 'El total de n�meros ingresados es de: ', contador
	
FinAlgoritmo
