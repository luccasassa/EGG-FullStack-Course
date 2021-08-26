//Realizar una función que calcule la suma de los dígitos de un numero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en
//el resto de una división entre 10. Recordar el uso de la función Mod y Trunc.

Algoritmo ejercicio7
	
	Definir num,resultado Como Real
	
	Escribir "Ingrese un número"
	Leer num
	
	resultado=nombre(num)
	Escribir "La suma de los dígitos de ", num, " es ", resultado
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(num)
	
	Definir retorno,i Como Real
	
	retorno=0
	i=0
	
	Mientras num<>0 Hacer
		i=num mod 10
		retorno= retorno+i
		num=trunc(num/10)
	FinMientras
	//retorno=retorno=resultado
FinFuncion
