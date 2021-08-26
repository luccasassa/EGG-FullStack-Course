//Solicitar al usuario que ingrese un valor entre 1 y 7. El programa debe mostrar por
//pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el
//número 1 corresponde al día “Lunes”, y así sucesivamente.

Algoritmo ejercicio15
	
	Definir dia Como Entero
	
	Escribir "Ingrese un valor entre 1 y 7"
	Leer dia
	
	Segun dia hacer
		1: Escribir "Día Lunes"
		2: Escribir "Día Martes"
		3: Escribir "Día Miércoles"
		4: Escribir "Día Jueves"
		5: Escribir "Día Viernes"
		6: Escribir "Día Sábado"
		7: Escribir "Día Domingo"
		De Otro Modo:
			Escribir dia, " no válido, no se tomará en cuenta"
	FinSegun
	
FinAlgoritmo
