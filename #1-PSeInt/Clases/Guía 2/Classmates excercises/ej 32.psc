Algoritmo sin_titulo
	definir num, max, min, suma, conteo Como Entero
	Definir prom Como Real
	definir condicion Como Logico
	suma = 0
	conteo= 0
	condicion= Verdadero
	Hacer
		escribir " ingrese un numero entero " 
		leer num
		conteo = conteo+1
		suma= suma+num
			si condicion = Verdadero entonces 
				max = num 
				min= num
				condicion= Falso
			sino	
				si  num < min y num <> 0 Entonces
					min = num
				SiNo
					si  num  > max Entonces
						max = num
					FinSi
				finsi	
						
			FinSi
				
	Hasta Que num = 0
	
	prom = suma / (conteo -1)
	escribir "el maximo es " , max
	escribir "el minimo es " , min
	Escribir "el promedio es " , prom
	
FinAlgoritmo
