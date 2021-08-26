//Escribir un programa que calcule cuántos litros de combustible consumió un automóvil.
//El usuario ingresara una cantidad de litros de combustible cargados en la estación y una
//cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y
//se lo mostrará al usuario.

Algoritmo ejercicio10
	Definir kms, lts, consumo Como Real
	
	Escribir "Le cargo los siguientes litros de combustible al auto"
	Leer lts
	Escribir "Recorro los siguientes kilómetros con el auto"
	Leer kms
	
	consumo=lts/(kms/100)
	
	Escribir "El veh;iculo consume ", consumo "litros por cada kilómetro"
FinAlgoritmo
