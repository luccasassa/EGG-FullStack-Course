//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá
//al usuario su sueldo actual y el sueldo mínimo. Si el sueldo el mayor se debe mostrar un
//	mensaje por pantalla indicándolo.

Algoritmo ejercicio2
	
	Definir sueldo_actual, sueldo_minimo Como Entero
	
	Escribir "Ingrese el sueldo de Panchito"
	Leer sueldo_actual
	Escribir "Cuál es el sueldo minimo?"
	Leer sueldo_minimo
	
	si sueldo_actual>sueldo_minimo Entonces
		Escribir "Panchito supera el sueldo mínimo del país"
	SiNo
		si sueldo_actual=sueldo_minimo Entonces
			Escribir "Panchito está ganando el sueldo mínimo"
		SiNo
			Escribir "A panchito lo están negreando en la empresa que trabaja"
		FinSi
	FinSi
	
FinAlgoritmo
