//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//youtube.com/watch?v=PeTfytqYyKg&list=PLgwlfcqa5h3wXbzMBAbvQCWcNnsGtheSe&index=2

Algoritmo ejercicio13
	
	Definir num1,num2,num3 Como Entero
	
	Escribir "Ingrese el valor del primer n�mero y el segundo n�mero"
	Leer num1,num2
	
	procedimiento(num1,num2,num3)
	Escribir "El valor del primer n�mero es ", num1, ", y el valor del segundo n�mero es ", num2
	
FinAlgoritmo
//----------------------------------------------------------------
SubProceso procedimiento(num1 Por Referencia,num2 Por Referencia,num3 Por Referencia)
	
	num3=num1
	num1=num2
	num2=num3
	
FinSubProceso
