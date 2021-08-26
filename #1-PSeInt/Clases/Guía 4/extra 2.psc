//Tomando en cuenta el ejercicio 10, mejore el mecanismo de inserción del carácter,
//facilitando un potencial reordenamiento del vector. Digamos que se pide ingresar el
//carácter en la posición X y la misma está ocupada, entonces de existir un espacio en
//cualquier posición X-n o X+n, desplazar los caracteres hacia la izq o hacia la derecha
//para poder ingresar el carácter en cuestión en el lugar deseado. El procedimiento de
//reordenamiento debe ubicar el espacio más cercano.

Algoritmo extra2
	
	Definir frase, vector, letra, letra1 Como Caracter
	Definir largo, i, k, resp Como Entero
	
	Escribir "Ingrese una frase"
	leer frase
	
	largo=Longitud(frase)+5
	Dimension vector(largo)
	
	para i=0 hasta largo-1 Con Paso 1 Hacer
		letra=Subcadena(frase, i, i)
		vector(i)=letra
	FinPara
	
	Escribir "En que posicion deseas agregar un caracter?(si deseas terminar oprime 0)"
	leer resp
	
	Mientras resp<>0
		si vector(resp)<>" "
			Escribir "Escribir el caracter que deseas ingresar"
			leer letra1
			para k=largo-2 hasta resp Con Paso -1 Hacer
				vector(k)=vector(k-1)
			FinPara
			vector(resp)=letra1
		SiNo
			Escribir "Escribir el caracter que deseas ingresar"
			leer letra1
			vector(resp)=letra1
		FinSi
		Escribir "En que posicion deseas agregar un caracter?(si deseas terminar oprime 0)"
		leer resp
	FinMientras
	
	para i=0 hasta largo-1 Con Paso 1 Hacer
		Escribir Sin Saltar vector(i)
	FinPara
	
	Escribir ""
	
FinAlgoritmo
