//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
//válida se debe imprimir la fecha cambiando el número que representa el mes por su
//nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”.

Algoritmo ejercicio17
	
	Definir day,month,year Como Entero
	
	Escribir "Ingrese el dia, mes y año"
	Leer day, month, year
	
	Si day<1 o day>31 Entonces
		Escribir "ERROR Día"
	FinSi
	
	Si month<1 o month>12 Entonces
		Escribir "ERROR Mes"
	FinSi
	
	Segun month hacer
		1: Escribir "La fecha ingresada es ", day, " de Enero del ", year
		2: Escribir "La fecha ingresada es ", day, " de Febrero del ", year
		3: Escribir "La fecha ingresada es ", day, " de Marzo del ", year
		4: Escribir "La fecha ingresada es ", day, " de Abril del ", year
		5: Escribir "La fecha ingresada es ", day, " de Mayo del ", year
		6: Escribir "La fecha ingresada es ", day, " de Junio del ", year
		7: Escribir "La fecha ingresada es ", day, " de Julio del ", year
		8: Escribir "La fecha ingresada es ", day, " de Agosto del ", year
		9: Escribir "La fecha ingresada es ", day, " de Septiembre del ", year
		10: Escribir "La fecha ingresada es ", day, " de Octubre del ", year
		11: Escribir "La fecha ingresada es ", day, " de Noviembre del ", year
		12: Escribir "La fecha ingresada es ", day, " de Diciembre del ", year
		De Otro Modo:
			Escribir "ERROR EN LA EJECUCIÓN"
	FinSegun
	
FinAlgoritmo
