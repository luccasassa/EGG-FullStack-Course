//Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil.
//El usuario ingresara una cantidad de litros de combustible cargados en la estaci�n y una
//cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo (km/lt) y
//se lo mostrar� al usuario.

Algoritmo ejercicio10
	Definir kms, lts, consumo Como Real
	
	Escribir "Le cargo los siguientes litros de combustible al auto"
	Leer lts
	Escribir "Recorro los siguientes kil�metros con el auto"
	Leer kms
	
	consumo=lts/(kms/100)
	
	Escribir "El veh;iculo consume ", consumo "litros por cada kil�metro"
FinAlgoritmo
