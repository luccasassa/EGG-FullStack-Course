///Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
///entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener
///la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que
///compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo extras2
	
	Definir llantas, suma Como Entero
	
	Escribir "ingrese la cantidad de llantas que comprará"
	leer llantas
	
	Segun llantas Hacer
		1,2,3,4:
			suma=llantas*3000
			Escribir "deberá abonar 3000 por llanta y la suma total es de " suma
		5,6,7,8,9:
			suma=llantas*2500
			Escribir "deberá abonar 2500 por llanta y la suma total es de " suma
		De Otro Modo:
			suma=llantas*2000
			Escribir "deberá abonar 2000 por llanta y la suma total es de " suma
	Fin Segun
	
	
FinAlgoritmo
