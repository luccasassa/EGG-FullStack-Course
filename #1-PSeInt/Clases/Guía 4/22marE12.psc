//Crear un programa que ordene un vector lleno de números enteros aleatorios, de menor a mayor 
//Nota: investigar el ordenamiento burbuja en el siguiente link:
//	https://pseudocodigoejemplos.com/ordenamiento-burbuja-pseint/#:~:text=El%20M%EF%BF%A9todo%20de%20Ordenamiento%20de,inversa%20de%20mayor%20a%20menor.

Algoritmo ejercicio12
	
	Definir i,n,vector,temp Como Entero
	Dimension vector(3)                           //Intentar hacer pidiendo el tamaño del vector al usuario
	
	Escribir 'Eligiendo índices al azar......'
	
	Para i=0 Hasta 2 Hacer
		vector(i)=aleatorio (0,100)
		Escribir '[', vector(i), ']'
	FinPara
	
	Para i=0 hasta 1 Hacer
		Para n=0 Hasta 1 Hacer
			Si vector(n)>vector(n+1)
				temp=vector(n)
				vector(n)=vector(n+1)
				vector(n+1)=temp
			FinSi
		FinPara
	FinPara
	
	Escribir ' '
	Escribir 'De menor a mayor quedaría......'
	
	Para i=0 Hasta 2 Hacer
		Escribir '[', vector(i), ']'
	FinPara
	
FinAlgoritmo
