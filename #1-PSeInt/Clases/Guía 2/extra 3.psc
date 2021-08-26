///El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de
///las cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
///programa que determine cuál es la nota eliminada y el promedio de los trabajos
///prácticos de un estudiante.

Algoritmo extra3
	
	Definir nota1, nota2, nota3, nota4, min, promedio Como Real
	Definir alumnos, n Como Entero
	Definir nombre Como Caracter
	
	Escribir "ingrese la cantidad de alumnos"
	leer alumnos
	
	n=0
	min=10
	
	Para n=1 Hasta alumnos Con Paso 1 Hacer
		Escribir "ingrese el nombre del estudiante"
		leer nombre
		Escribir "ingrese las cuatro notas de los practicos"
		leer nota1, nota2, nota3, nota4
		si min>nota1
			min=nota1			
		FinSi
		si min>nota2
			min=nota2			
		FinSi
		si min>nota3
			min=nota3			
		FinSi
		si min>nota4
			min=nota4			
		FinSi
		promedio=(nota1+nota2+nota3+nota4-min)/3
		
		Escribir nombre " tuvo una nota minima de " min " y el promedio de " promedio
		
	Fin Para
	
	
FinAlgoritmo
