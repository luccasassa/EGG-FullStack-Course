//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta
//entre las letras M y T. Recordar que Pseint les da un valor numérico a cada letra a
//través del Código Ascii

Algoritmo ejercicio14
	
	Definir letra Como Caracter
	
	Escribir "Ingrese una letra"
	Leer letra
	
	procedimiento(letra)
	
FinAlgoritmo
//----------------------------------------------------------------
SubProceso procedimiento(letra)
	
	Si (letra>"M" y letra<"T") o (letra>"m" y letra<"t") Entonces
		Escribir "Tu letra SI se encuentra entre el intervalo"
	SiNo
		Escribir "Tu letra NO se encuentra entre el intervalo"
	FinSi
	
FinSubProceso
	