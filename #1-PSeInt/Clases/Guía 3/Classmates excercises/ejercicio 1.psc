Algoritmo ejercicio_1
	
	definir cad1,verificacion como caracter
	Escribir "ingrese una palabra"
	leer cad1
	verificacion=prim_y_ult(cad1)
	
	
	
	
FinAlgoritmo




Funcion palabra= prim_y_ult(cad1)
	
	definir palabra,cad2,cad3 Como Caracter
	cad2=subcadena(cad1,0,0)
	cad3=subcadena(cad1,longitud(cad1)-1,longitud(cad1))
	
	si cad2=cad3  Entonces
		Escribir "CORRECTO"
	SiNo
		escribir " INCORRECTO"
	FinSi
	
	FinFuncion
	