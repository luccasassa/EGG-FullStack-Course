//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar el "n�mero no es par ni impar"
//(para que un n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0).
//Nota: investigar la funci�n mod de PSeInt

Algoritmo ejercicio18
	
	Definir num Como Entero
	
	Escribir "Ingresar n�mero"
	Leer num
	
	Si num = 0 Entonces
		Escribir "El n�mero no es par ni impar"
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
