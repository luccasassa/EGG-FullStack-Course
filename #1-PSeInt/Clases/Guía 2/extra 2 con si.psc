///Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
///entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener
///la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que
///compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo sin_titulo
	
	Definir llantas, suma Como Entero
	
	Escribir "ingrese la cantidad de llantas que comprará"
	leer llantas
	
	si llantas<5
		suma=llantas*3000
		Escribir "deberá abonar 3000 por llanta y la suma total es de " suma
	SiNo
		si (llantas>=5) y (llantas<=10)
			suma=llantas*2500
			Escribir "deberá abonar 2500 por llanta y la suma total es de " suma
		SiNo
			suma=llantas*2000
			Escribir "deberá abonar 2000 por llanta y la suma total es de " suma
		FinSi
		
	FinSi
	
	
FinAlgoritmo
