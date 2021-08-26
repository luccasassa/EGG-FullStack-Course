//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado,
//escriba un programa para convertir los días en horas, en minutos y en segundos.

Algoritmo ejercicio7
	Definir dias, horas, min, seg Como entero
	
	Escribir "Seleccionar cantidad de dias a calcular"
	Leer dias
	
	horas=dias*24
	min=horas*60
	seg=min*60
	
	Escribir "en ", dias " dias, hay ", horas " horas, ", min " minutos, y ", seg " segundos"
	
FinAlgoritmo
