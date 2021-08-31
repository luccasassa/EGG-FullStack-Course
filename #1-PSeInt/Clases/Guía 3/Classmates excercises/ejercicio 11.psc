///Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
///número tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a
///tener que separar el numero en partes (si es un numero de más de un digito) y ver si
///cada numero es par o impar. Nota: recordar el uso de la función Mod y Trunc(). No
///podemos pasar el numero a cadena para realizar el ejercicio.

Algoritmo ejercicio11
	
	Definir resultado, num Como Entero
	
	Escribir "Ingrese un numero para determinar si sus numeros son pares o impares"
	leer num
	
	resultado=extraccion(num)
	
	Escribir " "
	
FinAlgoritmo

Funcion resul=extraccion(num)
	
	Definir suma, i, md, trun Como Entero
	Definir cant Como Real
	
	suma=1
	cant=num
	
	Mientras cant>9
		
		cant=cant/10
		suma=suma+1
		
	FinMientras
	
	Para i=1 Hasta suma Con Paso 1 Hacer
		
		trun=trunc(cant)
		
		md= trun mod 2
		
		si md = 0
			
			Escribir sin saltar " Par "
			
		SiNo
			
			Escribir sin saltar " Impar "
			
		FinSi
		
		cant=cant*10
		
	Fin Para
	
FinFuncion
