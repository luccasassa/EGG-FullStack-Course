//Realizar una funci�n que calcule la suma de los d�gitos de un numero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en
//el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

Algoritmo ejercicio7
	
	Definir num,resultado Como Real
	
	Escribir "Ingrese un n�mero"
	Leer num
	
	resultado=nombre(num)
	Escribir "La suma de los d�gitos de ", num, " es ", resultado
	
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
