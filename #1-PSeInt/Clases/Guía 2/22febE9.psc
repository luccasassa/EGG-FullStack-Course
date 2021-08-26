//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento de
//500 pesos sobre el total de la compra que realiza un cliente. Solicitar al usuario que
//ingrese un mes y el importe de la compra. El programa debe calcular cuál es el monto
//total que se debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo ejercicio9
	
	Definir precio Como Real
	Definir mes Como Caracter
	
	Escribir "Ingrese el precio de la compra"
	Leer precio
	Escribir "En qué mes está comprando?"
	Leer mes
	
	si mes = "septiembre" o mes= "octubre" o mes= "noviembre" Entonces
		Escribir "El total a  pagar es de ", precio-500
	SiNo
		Escribir "El total a pagar es de ", precio
	FinSi
	
FinAlgoritmo
