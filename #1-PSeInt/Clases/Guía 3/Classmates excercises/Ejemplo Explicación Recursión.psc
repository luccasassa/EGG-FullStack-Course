Algoritmo Explicacion_Recursion
	
	Definir num,resultado Como Entero
	
	Escribir "Ingrese el n�mero a calcular el factorial."
	Leer num
	
	resultado=nombre(num)
	
	Escribir "Finalmente, el factorial de ", num, " es ", resultado
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(num)
	
	Definir retorno,anterior Como Entero
	
	Escribir "-> Inicia ejecuci�n del c�lculo de ", num, "! <-"
	
	Si num=0 o num=1 Entonces
		retorno=1                                                      //condicion de base que detiene la recursion
		Escribir "Condici�n de base: ", num, "! = 1"
	SiNo
		Escribir "Para conocer el ", num, "! debo calcular el ", (num-1), "!"
		anterior = nombre(num-1)
		retorno = num*anterior                                        //invocacion recursiva
		
		Escribir "Ahora s�! El ", num, "! = ", num, " * ", (num-1), "! = ", num, " * ", retorno  
	FinSi
	
	Escribir "-> Finaliza ejecuci�n del c�lculo de ", num, "! <-"
	
FinFuncion
