//Solicitar al usuario que ingrese la base y altura de un rect�ngulo, y calcular y mostrar por
//pantalla el �rea y per�metro del mismo

Algoritmo ejercicio4
	Definir area, perimetro Como Real
	Definir base, altura Como Entero
	
	Escribir "La base es de "
	Leer base
	Escribir "La altura es de "
	Leer altura
	
	area=base*altura
	perimetro=(2*altura)+(2*base)
	
	Escribir "El area total es de ", area
	Escribir "El perimetro total es de ", perimetro
	
FinAlgoritmo
