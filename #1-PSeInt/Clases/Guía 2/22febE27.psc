//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas
//vale el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres
//notas obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los
//datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben
//estar comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el
//promedio y se mostrará un mensaje de error.

Algoritmo ejercicio27
	
	Definir respuesta Como Caracter
	Definir practica,problemas,teoria Como Entero
	
	respuesta=''
	respuesta=Minusculas(respuesta)
	
	Hacer
		Escribir "Ingrese las notas: practica, problema y teoria"
		Leer practica,problemas,teoria
		
		si (practica>=1 y practica<=10) y (problemas>=1 y problemas<=10) y (teoria>=1 y teoria<=10) Entonces
			Escribir "Le corresponde ", (practica*0.1) + (problemas*0.5) + (teoria*0.4)
		SiNo
			Escribir "ERROR, alguna nota que ingresó no está comprendida entre 1 y 10"
		FinSi
		
		Escribir 'Quiere calcular más promedios de alumnos? s\n'
		Leer respuesta
	Hasta que respuesta="n"
	
FinAlgoritmo
