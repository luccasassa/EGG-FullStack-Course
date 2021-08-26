Algoritmo Palindromas
	
	Definir palabra,invertida Como Caracter
	Definir i Como Entero
	
	Escribir "Ingrese una palabra"
	Leer palabra
	
	invertida= ""                    //es necesario ya que el programa te pide que le asignes un valor
	
	Para i=Longitud(palabra) Hasta 0 Con Paso -1 Hacer
		invertida=invertida+Subcadena(palabra,i,i)
	FinPara
	
	Si invertida=palabra Entonces
		Escribir "Se escriben al derecho y al revés, por lo tanto son palíndromas"
	SiNo
		Escribir "No se escriben al derecho y al revés, por lo tanto NO son palíndromas"
	FinSi
	
	Escribir "Palabra origial: ", palabra
	Escribir "Palabra alrevés: ", invertida
	//Esté algoritmo no almacena los espacios en su orden correcto de inversión, sino que actúa por caracteres por palabra.
FinAlgoritmo
