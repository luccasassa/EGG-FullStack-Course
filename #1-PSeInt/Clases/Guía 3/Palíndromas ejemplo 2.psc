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
		Escribir "Se escriben al derecho y al rev�s, por lo tanto son pal�ndromas"
	SiNo
		Escribir "No se escriben al derecho y al rev�s, por lo tanto NO son pal�ndromas"
	FinSi
	
	Escribir "Palabra origial: ", palabra
	Escribir "Palabra alrev�s: ", invertida
	//Est� algoritmo si almacena los espacios en su orden correcto de inversi�n, no act�a por caracteres por palabra.
FinAlgoritmo