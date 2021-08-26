//Realizar un procedimiento que permita realizar la división entre dos números y
//obtenga el cociente y el resto utilizando el método de restas sucesivas.

//Método de división por restas sucesivas: Restar el dividendo del divisor hasta obtener
//un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//50 - 13 = 37 una resta realizada
//37 - 13 = 24 dos restas realizadas
//24 - 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo ejercicio17
	
	Definir dividendo,divisor Como Entero
	
	Escribir "Ingrese el dividendo"
	Leer dividendo
	Escribir "Ingrese el divisor"
	Leer divisor
	
	procedimiento(dividendo,divisor)
	
FinAlgoritmo
//----------------------------------------------------------------
SubProceso procedimiento(dividendo,divisor)
	
	Definir contador,residuo Como Entero
	
	contador=0
	residuo=dividendo
	
	Mientras residuo-divisor>=0 Hacer
		residuo=residuo-divisor
		Escribir (residuo+divisor), "-", divisor, "=", residuo
		contador=contador+1
	FinMientras
	
	Escribir "Dado que ", residuo " es menor que ", divisor, ", entonces: el residuo es ", residuo, " y el cociente es ", contador
	
FinSubProceso
