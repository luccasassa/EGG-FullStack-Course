//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//bisiesto. Nota: recuerde la funci�n mod de PSeInt

Algoritmo ejercicio19
	
	Definir year Como Entero
	
	Escribir "Ingrese un a�o"
	Leer year
	
	si (year mod 4 = 0) y no(year mod 100 = 0) Entonces    //tambien puede ser: y year mod 100 = -1
		Escribir "Es un a�o bisiesto"
	SiNo
		si (year mod 400 = 0) y (year mod 100 = 0) Entonces
			Escribir "Es un a�o bisiesto"
		SiNo
			Escribir "No es un a�o bisiesto"
		FinSi		
	FinSi
	
FinAlgoritmo
