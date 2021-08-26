//Una empresa tiene personal de distintas áreas con distintas condiciones de
//contratación y formas de pago. El departamento de contabilidad necesita calcular los
//sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión
//	c) salario fijo.
//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//   realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//   empleado.
//b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//	hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//	esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//	como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//	del valor de venta total.
//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//	hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//	horas semanales, las horas extras se deben pagar con un extra del 50% del valor de
//	la hora.

Algoritmo ejercicio21
	
	Definir contratacion Como Caracter
	Definir ventas,sueldo,horas_semanales,horas_extra,valor_hora Como Real
	
	Escribir "Ingrese la contratación de Panchito"
	Leer contratacion
	
	contratacion = Minusculas(contratacion)
	
	Segun contratacion hacer
		"comision": 
			Escribir "Ingrese la cantidad de ventas hechas ésta semana"
			Leer ventas
			sueldo = ventas * 0.4
			Escribir "El sueldo semanal es de $",sueldo
			
		"salario y comision":
			Escribir "Ingrese la cantidad de ventas hechas ésta semana"
			Leer ventas
			Escribir "Ingrese el valor que se paga por cada hora trabajada"
			Leer valor_hora
			Escribir "Ingrese la cantidad de horas trabajadas en ésta semana"
			leer horas_semanales
			Si horas_semanales<40 Entonces
				Escribir "VÁLIDO"
			SiNo
				Escribir "INVÁLIDO"
			FinSi	
			sueldo = (horas_semanales*valor_hora)+ventas*0.25
			Escribir "El sueldo semanal es de $",sueldo
			
		"salario":
			Escribir "Ingrese la cantidad de horas trabajadas en ésta semana"
			leer horas_semanales
			Escribir "Ingrese el valor que se paga por cada hora trabajada"
			Leer valor_hora
			Si horas_semanales<=40 Entonces
				Escribir "El sueldo semanal es de $",horas_semanales*valor_hora
			SiNo
				si horas_semanales>40 Entonces
					Escribir "El sueldo semanal es de $",(40*valor_hora) + ((horas_semanales-40) * valor_hora * 1.5)
				FinSi
			FinSi
		De Otro Modo: Escribir "Por favor corrobore de que los datos ingresados sean correctos."
			
	FinSegun
	
FinAlgoritmo
