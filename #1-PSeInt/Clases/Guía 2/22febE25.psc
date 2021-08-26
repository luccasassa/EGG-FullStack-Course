//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

Algoritmo ejercicio25
	
	Definir suma,num,max Como Entero
	
	Escribir "Ingrese el número límite"
	Leer max
	
	suma=0
	
	Mientras suma<max Hacer
		Escribir "Ingrese un número que desea sumar hasta llegar al límite"
		Leer num
		suma=suma+num
	FinMientras
	
	Escribir "La suma ya igualó o superó al número límite"
	
FinAlgoritmo
