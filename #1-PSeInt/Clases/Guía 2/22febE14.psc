//   La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
//   de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
//	de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
//	regalo.
//	Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la cantidad de
//	litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra 40 pesos
//	por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total de $5,20
//	el minuto de uso. Realice un programa que permita registrar esa información y el total a
//	pagar por el cliente.

Algoritmo ejercicio14
	
	Definir nafta Como Entero
	Definir tiempo,total Como Real
	
	Escribir "Cuánto tiempo (horas) se usó el vehículo?"
	Leer tiempo
	
	si tiempo<=2 Entonces
		Escribir "El alquiler del vehículo costará $400"
	SiNo
		Escribir "Cuántos litros de nafta consumió?"
		Leer nafta
		
		total = (tiempo * 60 * 5.2) + (nafta * 40)    //se multiplica por 60 ya que se colocó el tiempoo en horas
		
		Escribir "El alquiler del vehículo costará $ ", total
	FinSi
	
FinAlgoritmo
