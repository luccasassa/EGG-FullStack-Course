// Escribir una funci�n recursiva que devuelva la suma de los primeros N enteros.

Algoritmo ejercicio19
	
	Definir num,resultado Como Entero
	
	Escribir 'Ingrese un n�mero'
	Leer num
	
	resultado = sumatoria(num)
	Escribir "La sumatoria de primeros ", num, " n�meros es ", resultado
	
FinAlgoritmo
// ----------------------------------------------------------------
Funcion recursion = sumatoria(num)
	
	Definir recursion Como Entero
	
	Si num=1 Entonces                                                                   // Tambien puede ser: Si num=1 Entonces
		recursion = 1                                                                    // recursion=1 
	SiNo                                                                                 // Sino
		recursion = num+sumatoria(num-1)                                                // recursion=num+sumatoria(num-1)
		Escribir "+ ", num, " = ", recursion
	FinSi
	
FinFuncion
