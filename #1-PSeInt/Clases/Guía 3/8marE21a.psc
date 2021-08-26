//Implemente de forma recursiva una funci�n que le d� la vuelta a una cadena de caracteres. 
//NOTA: Si la cadena es un pal�ndromo, la cadena y su inversa coincidir�n.

Algoritmo ejercicio21a
	
	Definir palabra Como Caracter
	Definir resultado Como Logico
	
	Escribir "Escriba una palabra"
	Leer palabra
	
	resultado=mifuncion(palabra)
	
	Escribir " "
	Escribir 'Las palabras son pal�ndromas?: ' resultado
	
FinAlgoritmo
// ----------------------------------------------------------------
Funcion retorno=mifuncion(palabra)
	
	Definir retorno Como Logico
	Definir invertida Como Caracter
	Definir i Como Entero
	
	invertida= ""                    //es necesario ya que el programa te pide que le asignes un valor
	
	Para i=Longitud(palabra) Hasta 0 Con Paso -1 Hacer
		invertida=invertida+Subcadena(palabra,i,i)
	FinPara
	
	Si invertida=palabra Entonces
		retorno=Verdadero
	SiNo
		retorno=Falso
	FinSi
	
	Escribir "Palabra origial: ", palabra
	Escribir "Palabra alrev�s: ", invertida
	
FinFuncion
	