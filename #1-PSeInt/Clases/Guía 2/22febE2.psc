//Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir�
//al usuario su sueldo actual y el sueldo m�nimo. Si el sueldo el mayor se debe mostrar un
//	mensaje por pantalla indic�ndolo.

Algoritmo ejercicio2
	
	Definir sueldo_actual, sueldo_minimo Como Entero
	
	Escribir "Ingrese el sueldo de Panchito"
	Leer sueldo_actual
	Escribir "Cu�l es el sueldo minimo?"
	Leer sueldo_minimo
	
	si sueldo_actual>sueldo_minimo Entonces
		Escribir "Panchito supera el sueldo m�nimo del pa�s"
	SiNo
		si sueldo_actual=sueldo_minimo Entonces
			Escribir "Panchito est� ganando el sueldo m�nimo"
		SiNo
			Escribir "A panchito lo est�n negreando en la empresa que trabaja"
		FinSi
	FinSi
	
FinAlgoritmo
