//Solicitar al usuario que ingrese un valor entre 1 y 7. El programa debe mostrar por
//pantalla un mensaje que indique a qu� d�a de la semana corresponde. Considere que el
//n�mero 1 corresponde al d�a �Lunes�, y as� sucesivamente.

Algoritmo ejercicio15
	
	Definir dia Como Entero
	
	Escribir "Ingrese un valor entre 1 y 7"
	Leer dia
	
	Segun dia hacer
		1: Escribir "D�a Lunes"
		2: Escribir "D�a Martes"
		3: Escribir "D�a Mi�rcoles"
		4: Escribir "D�a Jueves"
		5: Escribir "D�a Viernes"
		6: Escribir "D�a S�bado"
		7: Escribir "D�a Domingo"
		De Otro Modo:
			Escribir dia, " no v�lido, no se tomar� en cuenta"
	FinSegun
	
FinAlgoritmo
