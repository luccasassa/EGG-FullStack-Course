//Programar un juego donde la computadora elige un n�mero al azar entre 1 y 10, y a
//continuaci�n el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//	1�) El programa elige al azar un n�mero n entre 1 y 10.
//	2�) El usuario ingresa un n�mero x.
//	3�) Si x no es el n�mero exacto, el programa indica si n es m�s grande o m�s peque�o
//		que el n�mero ingresado.
//	4�) Repetimos desde 2) hasta que x sea igual a n.
//		El programa tiene que imprimir los mensajes adecuados para informarle al usuario qu�
//		hacer y qu� pas� hasta que adivine el n�mero.
//	NOTA: Para generar un n�mero aleatorio entre 1 y 10 se puede utilizar la funci�n
//	Aleatorio(limite_inferior, limite_superior) de PSeInt.

Algoritmo ejercicio33
	
	Definir min,max,num,respuesta Como Entero
	
	Escribir "Ingrese el n�mero m�nimo"
	Leer Min
	Escribir "Ingrese el n�mero m�ximo"
	Leer max
	
	respuesta=Aleatorio(Min,max)
	
	Escribir " "                                                       //decoraci�n
	Escribir "Eligiendo n�mero aleatorio para adivinar..........."     //decoraci�n
	Escribir " "                                                       //decoraci�n
	
	Escribir "Juego comenzado! Trate de adivinar el n�mero"
	Leer num
	
	Hacer
		Si num<respuesta Entonces
			Escribir "El n�mero es m�s grande que el ingresado"
		FinSi
		
		Si num>respuesta Entonces
			Escribir "El n�mero es m�s peque�o que el ingresado"
		FinSi
		
		Si num <> respuesta Entonces 
			Leer num    //No escrib� "Ingrese otro n�mero" para no acumular texto verde en el ejecutador
		FinSi
	Hasta Que num=respuesta
	
	Si num=respuesta entonces	
		Escribir "Usted ha adivinado el n�mero, era ", respuesta "!"
	FinSi
	
	
FinAlgoritmo
