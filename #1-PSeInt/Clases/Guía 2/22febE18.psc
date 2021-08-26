//Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar el "número no es par ni impar"
//(para que un número sea par, se debe dividir entre dos y su resto debe ser igual a 0).
//Nota: investigar la función mod de PSeInt

Algoritmo ejercicio18
	
	Definir num Como Entero
	
	Escribir "Ingresar número"
	Leer num
	
	Si num = 0 Entonces
		Escribir "El número no es par ni impar"
	SiNo
		Si (num mod 2 = 0) y num > 0 Entonces
			Escribir "Es par"
		SiNo
			si (num mod 1 = 0) y num > 0 Entonces
				Escribir "Es impar"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
