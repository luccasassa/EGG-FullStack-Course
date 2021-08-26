//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la
//diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe
//generar otro subproceso para imprimir la matriz.

Algoritmo ejercicio21
	
	Definir i,j,matriz,n Como Entero
	Escribir 'Ingrese los subíndices de su matriz'
	Leer n,n
	Dimension matriz[n,n]
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Si i=j Entonces
				Escribir '0 ' Sin Saltar
			SiNo
				matriz[i,j]= Aleatorio(1,3)
				Escribir matriz[i,j], ' ' Sin Saltar
			FinSi
		FinPara
		Escribir ''
	FinPara
	
FinAlgoritmo
