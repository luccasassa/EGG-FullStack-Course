//Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica
//de tornillos, y se le imponen para un per�odo de prueba:
//Producir menos de 200 tornillos defectuosos.
//Producir m�s de 10000 tornillos sin defectos.
//El grado de eficiencia se determina de la siguiente manera:
//Si no cumple ninguna de las condiciones, grado 5.
//Si s�lo cumple la primera condici�n, grado 6.
//Si s�lo cumple la segunda condici�n, grado 7.
//Si cumple las dos condiciones, grado 8

Algoritmo ejercicio20
	
	Definir tornillos_mal,tornillos_bien Como Real
	
	Escribir "Ingrese los datos"
	Leer tornillos_mal,tornillos_bien
	
	Si tornillos_mal>200 y tornillos_bien<10000 Entonces
		Escribir "La experiencia de Panchito es de grado 5"
	SiNo
		Si tornillos_mal<200 y tornillos_bien<10000 Entonces
			Escribir "La experiencia de Panchito es de grado 6"
		SiNo
			Si tornillos_mal>200 y tornillos_bien>10000 Entonces
				Escribir "La experiencia de Panchito es de grado 7"
			SiNo
				Si tornillos_mal<200 y tornillos_bien>10000 Entonces
					Escribir "La experiencia de Panchito es de grado 8"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo

