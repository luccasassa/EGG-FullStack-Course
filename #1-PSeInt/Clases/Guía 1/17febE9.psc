//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio
//del a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular
//cu�l fue el porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo

Algoritmo ejercicio9
	Definir precio1, precio2, porcentaje Como Real
	
	Escribir "El precio al inicio del a�o era de "
	Leer precio1
	Escribir "El precio al final del a�o es de "
	Leer precio2
	
	porcentaje=(precio2/precio1*100)-100 //o sino porcentaje=((precio2-precio1)/precio1))*100
	
	Escribir "El porcentaje de aumento que tuvo el producto es de ", porcentaje " %"
	
FinAlgoritmo
