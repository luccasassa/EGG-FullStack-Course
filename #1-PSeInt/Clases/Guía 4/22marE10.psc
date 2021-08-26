//Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
//desarrollar un programa que:

//	a. Pida una frase al usuario y luego copie carácter a carácter dentro del arreglo
//letra por letra. Ayuda: utilizar la función subcadena de PSeInt.
//	b. Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
//	posición dentro del arreglo, y el programa debe intentar ingresar el carácter
//	en la posición indicada si es que hay lugar (es decir la posición está vacía o
//	en blanco). De ser posible debe listar el vector con el carácter ingresado, de
//	lo contrario debe darle un mensaje al usuario.

//	Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
//		H o l a m u n d o c r u e l !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//Si se desea ingresar el carácter % en la posición 10, entonces el resultado sería:
//		H o l a m u n d o % c r u e l !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19

Algoritmo ejercicio10
	
	Definir palabra,letra,vector Como Caracter
	Definir cantidad,i,posicion Como Entero
	Dimension vector[20]
	
	Escribir 'Ingrese una palabra o frase que contenga 20 caracteres en total'
	Leer palabra
	cantidad=Longitud(palabra)
	
	Para i=0 hasta cantidad-1 Hacer
		vector[i]=Subcadena(palabra,i,i)
	FinPara
	
	Escribir 'Ingrese un caracter o signo y la posición entre el 0 y el 19 para reemplazarlo en la frase'
	Leer letra, posicion
	
	Para i=0 Hasta cantidad-1 Hacer
		vector[posicion]=Concatenar(letra,"")         //no agregar nada entre las comillas porque sino se agrega despues del signo
		Escribir Sin Saltar vector[i]
	FinPara
	Escribir ''
	
FinAlgoritmo
