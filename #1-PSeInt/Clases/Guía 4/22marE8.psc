//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector
//se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la
//	función Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con
//	su longitud.

Algoritmo ejercicio8
	
	Definir nombre Como Caracter
	Definir i,tamano,x Como Entero
	
	Escribir 'Ingrese el tamaño de los vectores'
	Leer x
	Dimension nombre[x],tamano[x]
	
	Para i=0 hasta x-1 Hacer
		Escribir 'Ingrese los nombres'
		Leer nombre[i]
	FinPara
	
	Para i=0 hasta x-1 Hacer
		tamano[i]=Longitud(nombre[i])
		Escribir nombre[i], ': tiene ', tamano[i], ' letras'
	FinPara
	
FinAlgoritmo
