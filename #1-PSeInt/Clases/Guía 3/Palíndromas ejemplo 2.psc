Algoritmo Palindromas
	
	Definir palabra,invertida,e Como Caracter
	Definir i,contador Como Entero
	
	Escribir "Ingrese una palabra"
	Leer palabra
	
	contador=0
	e=""                            //es necesario ya que el programa te pide que le asignes un valor
	invertida=""                    //es necesario ya que el programa te pide que le asignes un valor
	
	Para i=Longitud(palabra) Hasta 0 Con Paso -1 Hacer
		Si Subcadena(palabra,i,i) <> " " Entonces
			e= e + Subcadena(palabra,i,i)
		FinSi
	FinPara
	
	Para i=0 Hasta Longitud(palabra) Hacer
		Si Subcadena(palabra,i,i) <> " " Entonces
			invertida=invertida+Subcadena(e,contador,contador)
			contador=contador+1
		SiNo
			invertida=invertida+Subcadena(palabra,i,i)
		FinSi
	FinPara
	
	Si invertida=palabra Entonces
		Escribir "Se escriben al derecho y al revés, por lo tanto son palíndromas"
	SiNo
		Escribir "No se escriben al derecho y al revés, por lo tanto NO son palíndromas"
	FinSi
	
	Escribir "Palabra origial: ", palabra
	Escribir "Palabra alrevés: ", invertida
	//Esté algoritmo si almacena los espacios en su orden correcto de inversión, no actúa por caracteres por palabra.
FinAlgoritmo