//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		H A B
//		I L I
//		D A D
//Nota: recordar el uso de la función Subcadena().

Algoritmo ejercicio22
	
	Definir palabra,matriz Como Caracter
	Definir cantidad,i,j,contador Como Entero
	Dimension matriz[3,3]
	
	Escribir 'Ingrese una palabra o frase que contenga 9 caracteres en total'
	Leer palabra
	cantidad=Longitud(palabra)
	//	Dimension matriz[cantidad,cantidad]
	
	contador=0
	Para i=0 hasta 2 Hacer
		Para j=0 hasta 2 Hacer
			matriz[i,j]=Subcadena(palabra,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
	Para i=0 hasta 2 Hacer
		Para j=0 hasta 2 Hacer
			Escribir matriz[i,j], ' ' Sin Saltar
		FinPara
		Escribir ''
	FinPara
	
	//Escribir '---Mostramos posiciones 0,1 y 1,2---'
	//Escribir matriz[0,1], ' y ', matriz[1,2]
	
FinAlgoritmo
