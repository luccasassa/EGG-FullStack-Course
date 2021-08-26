Algoritmo Ej18
	
	Definir frase,frase_encriptada Como Caracter
	
	Repetir
		Escribir "Ingrese una frase y al finalizar termine con un punto"
		Leer frase
	Hasta Que Subcadena(frase,Longitud(frase)-1,Longitud(frase)-1) = "."
	
	frase_encriptada=""
	encriptar(frase,frase_encriptada)
	
	Escribir frase_encriptada
	
FinAlgoritmo
// ----------------------------------------------------------------
SubProceso encriptar(frase,frase_encriptada Por Referencia)
	
	Definir i Como Entero
	
	Para i=0 Hasta Longitud(frase)-1 Hacer
		
		Segun Subcadena(frase,i,i)
			"a" o "A": frase_encriptada=Concatenar(frase_encriptada,"@")
			"e" o "E": frase_encriptada=Concatenar(frase_encriptada,"#")
			"i" o "I": frase_encriptada=Concatenar(frase_encriptada,"$")
			"o" o "O": frase_encriptada=Concatenar(frase_encriptada,"%")
			"u" o "U": frase_encriptada=Concatenar(frase_encriptada,"*")
			De Otro Modo:
				frase_encriptada=Concatenar(frase_encriptada,Subcadena(frase,i,i))
		FinSegun
		
	FinPara
	
FinSubProceso

