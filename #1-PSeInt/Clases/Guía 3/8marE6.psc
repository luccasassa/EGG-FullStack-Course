//Crear una función llamada "Login" en donde se pida usuario y contraseña.
//Si el usuario es "usuario1" y la contraseña es "asdasd" entonces el programa nos devuelve VERDADERO.
//Además la función nos limitará la cantidad de intentos en solo 3 veces, si no acertamos en esas 3, el programa nos devolverá FALSO.

Algoritmo ejercicio6
	
	Definir usuario,password Como caracter
	Definir resultado Como logico
	
	Escribir "Ingrese nombre de usuario y contraseña"
	Leer usuario,password
	
	resultado=mifuncion(usuario,password)
	Escribir resultado
	
FinAlgoritmo
//----------------------------------------------------------------
Funcion login=mifuncion(usuario,password)
	Definir login Como Logico
	Definir contador Como Entero
	
	contador=0
	
	Si usuario = "usuario1" y password = "asdasd" Entonces
		login = Verdadero
	SiNo
		Repetir
			Escribir "Usuario o contraseña incorrectos, vuelva a intentarlo"
			Leer usuario,password
			contador=contador+1
		Hasta Que contador=2 o usuario="usuario1" y password="asdasd"
		
		si usuario="usuario1" y password="asdasd" Entonces
			login=Verdadero
		SiNo
			login = Falso
		FinSi
	FinSi
	
FinFuncion
