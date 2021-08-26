//Los empleados de una f�brica trabajan en dos turnos: Diurno y Nocturno. Se desea
//calcular el jornal diario de acuerdo con las siguientes reglas:
	//a) La tarifa de las horas diurnas es de $ 90.
	//b) La tarifa de las horas nocturnas es de $ 125.
	//c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y
	//en un 15% si el turno es nocturno.
//El programa debe solicitar la siguiente informaci�n al usuario: el nombre del
//trabajador, el d�a de la semana, el turno (diurno o nocturno) y la cantidad de horas
//trabajadas. Adem�s, debemos preguntarle al usuario si el d�a de la semana (lunes,
//martes, mi�rcoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice
//una funci�n para realizar el c�lculo.

Algoritmo ejercicio9
	
	Definir horas,resultado Como Real
	Definir turno,dia,feriado,trabajdor Como Caracter
	
	Escribir "Ingrese el nombre del trabajador"
	Leer trabajdor
	Escribir "Ingrese el d�a de trabajo"
	Leer dia
	Escribir "Ingrese el turno del trabajador (diurno o nocturno)"
	Leer turno
	Escribir "Cu�ntas horas trabaj�"
	Leer horas
	Escribir "El d�a era feriado?. Responder si o no"
	Leer feriado
	
	resultado=nombre(turno,horas,feriado)
	Escribir trabajdor, " trabaj� el d�a ", dia, ", ", feriado, " era feriado, por lo tanto cobrar� $ ", resultado, " el jornal."
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion retorno=nombre(turno,horas,feriado)
	
	Definir retorno como Real
	
	Segun turno hacer
		"diurno":
			Segun feriado hacer
				"si": retorno=(90*horas)*1.1
				"no": retorno=(90*horas)
			FinSegun
			
		"nocturno":
			Segun feriado hacer
				"si": retorno=(125*horas)*1.15
				"no": retorno=(125*horas)
			FinSegun
	FinSegun
	
FinFuncion

