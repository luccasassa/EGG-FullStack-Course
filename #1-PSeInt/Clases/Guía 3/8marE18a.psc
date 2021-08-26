//Escribir un programa que procese una secuencia de caracteres ingresada por teclado
//y terminada en punto (le�dos de a uno por vez), y luego codifique la palabra o frase
//ingresada de la siguiente manera: cada vocal se reemplaza por el car�cter que se
//indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
//mantienen sin cambios.

//a  e  i  o  u
//@  #  $  %  *

//Realice un subprograma que reciba una secuencia de caracteres y retorne la
//codificaci�n correspondiente. Utilice la estructura �seg�n� para la transformaci�n.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa deber�a ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//NOTA: investigue el uso de la funci�n concatenar de PSeInt para armar la palabra/frase.

Algoritmo ejercicio18
	
	Definir frase,separado Como Caracter
	Definir i Como Entero
	Escribir "Ingrese una palabra o frase"
	Leer frase
	
	Para i = 0 Hasta Longitud(frase) Hacer
		separado = Subcadena(frase,i, i)
		procedimiento(separado)
		Escribir Sin Saltar separado
	FinPara
	
	Escribir " "
	
FinAlgoritmo
//----------------------------------------------------------------
SubProceso procedimiento(separado Por Referencia)
	
	Segun separado Hacer
		"a": separado="@"
		"e": separado="#"
		"i": separado="$"
		"o": separado="%"
		"u": separado="*"
	FinSegun
	
FinSubProceso
