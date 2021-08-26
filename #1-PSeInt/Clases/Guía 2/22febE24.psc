//Escriba un programa que solicite dos números enteros (mínimo y máximo). A
//continuación, se debe pedir al usuario que ingrese números enteros situados entre el
//máximo y mínimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminará cuando se escriba un número que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//números ingresados dentro del intervalo.

Algoritmo ejercicio24
	
	Definir num,min,max,contador Como Entero;
	
	contador=0
	
	Escribir "Ingrese el número mínimo de su intervalo";
	Leer min;
	Escribir "Ingrese el número máximo de su intervalo";
	Leer max;
	
	Escribir 'Ingrese un número que esté dentro de su intervalo'
	Leer num
	
	Mientras num<min Hacer
		Escribir 'El número debe ser mayor al mínimo, ingrese otro número'
		Leer num
	FinMientras
	
	Mientras num<=max y num>=min Hacer
		Escribir 'Ingrese otro número respetando la condición que se le asignó'
		Leer num
		
		contador=contador+1
		
		Si num<min o num>max Entonces
			Escribir 'No respetó la consigna, no se le pedirán más números..'
			Escribir ''
		FinSi
		
	FinMientras
	
	Escribir 'El total de números ingresados es de: ', contador
	
FinAlgoritmo
