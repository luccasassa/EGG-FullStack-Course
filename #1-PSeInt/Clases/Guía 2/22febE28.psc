//Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo (pista:
//se puede hacer dividiendo varias veces entre 10). Nota: investigar la funci�n trunc().

Algoritmo ejercicio28
	
	Definir num,digitos Como Real
	
	Escribir "Ingrese un numero para calcular la cantidad de d�gitos"
	Leer num
	
	digitos=0
	
	Mientras trunc(num)<>0 Hacer    //o sino "trunc(num)<0 o trunc(num)>0"    //o sino "no(trunc(num)=0)"
		num=num/10
		digitos=digitos+1
	FinMientras
	
	Escribir "El n�mero ingresado contiene ", digitos, " d�gito/s"
	
FinAlgoritmo
