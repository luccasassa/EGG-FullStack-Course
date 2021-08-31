Algoritmo ejercicio_18
	
	Definir frase, separarCaracteres Como Caracter
	Definir i Como Entero
	Escribir "Ingrese una palabra o frase que termine en punto final"
	Leer frase
	
	Para i = 0 Hasta Longitud(frase) -1 Hacer
		separarCaracteres = Subcadena(frase,i, i)
		convertirCaracteres(separarCaracteres)
		Escribir Sin Saltar separarCaracteres 
	FinPara
	
	
FinAlgoritmo

SubProceso convertirCaracteres(separarCaracteres Por Referencia)
	Segun separarCaracteres Hacer
		"a":
			separarCaracteres = concatenar ("@", "")
		"e": 
			separarCaracteres = Concatenar("#", "")
		"i": 
			separarCaracteres = Concatenar("$", "")
		"o": 
			separarCaracteres = Concatenar("%", "")
		"u": 
			separarCaracteres = Concatenar("*", "")
	FinSegun
FinSubProceso
	