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
		Escribir "Se escriben al derecho y al rev�s, por lo tanto son pal�ndromas"
	SiNo
		Escribir "No se escriben al derecho y al rev�s, por lo tanto NO son pal�ndromas"
	FinSi
	
	Escribir "Palabra origial: ", palabra
	Escribir "Palabra alrev�s: ", invertida
	//Est� algoritmo no almacena los espacios en su orden correcto de inversi�n, sino que act�a por caracteres por palabra.
FinAlgoritmo
