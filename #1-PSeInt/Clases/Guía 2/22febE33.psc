//Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a
//continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//	1º) El programa elige al azar un número n entre 1 y 10.
//	2º) El usuario ingresa un número x.
//	3º) Si x no es el número exacto, el programa indica si n es más grande o más pequeño
//		que el número ingresado.
//	4º) Repetimos desde 2) hasta que x sea igual a n.
//		El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué
//		hacer y qué pasó hasta que adivine el número.
//	NOTA: Para generar un número aleatorio entre 1 y 10 se puede utilizar la función
//	Aleatorio(limite_inferior, limite_superior) de PSeInt.

Algoritmo ejercicio33
	
	Definir min,max,num,respuesta Como Entero
	
	Escribir "Ingrese el número mínimo"
	Leer Min
	Escribir "Ingrese el número máximo"
	Leer max
	
	respuesta=Aleatorio(Min,max)
	
	Escribir " "                                                       //decoración
	Escribir "Eligiendo número aleatorio para adivinar..........."     //decoración
	Escribir " "                                                       //decoración
	
	Escribir "Juego comenzado! Trate de adivinar el número"
	Leer num
	
	Hacer
		Si num<respuesta Entonces
			Escribir "El número es más grande que el ingresado"
		FinSi
		
		Si num>respuesta Entonces
			Escribir "El número es más pequeño que el ingresado"
		FinSi
		
		Si num <> respuesta Entonces 
			Leer num    //No escribí "Ingrese otro número" para no acumular texto verde en el ejecutador
		FinSi
	Hasta Que num=respuesta
	
	Si num=respuesta entonces	
		Escribir "Usted ha adivinado el número, era ", respuesta "!"
	FinSi
	
	
FinAlgoritmo
