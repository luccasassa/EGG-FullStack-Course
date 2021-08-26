//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//bisiesto. Nota: recuerde la función mod de PSeInt

Algoritmo ejercicio19
	
	Definir year Como Entero
	
	Escribir "Ingrese un año"
	Leer year
	
	si (year mod 4 = 0) y no(year mod 100 = 0) Entonces    //tambien puede ser: y year mod 100 = -1
		Escribir "Es un año bisiesto"
	SiNo
		si (year mod 400 = 0) y (year mod 100 = 0) Entonces
			Escribir "Es un año bisiesto"
		SiNo
			Escribir "No es un año bisiesto"
		FinSi		
	FinSi
	
FinAlgoritmo
