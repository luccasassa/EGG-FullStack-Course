//Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco
//zonas: Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene
//	distintas estadísticas sobre el comportamiento de sus representantes en cada zona. Se
//	desea hacer un programa que lea el monto de las ventas de los representantes en cada
//zona y calcule luego:
//	a) el total de ventas de una zona introducida por teclado
//	b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//	c) el total de ventas de todos los representantes.

Algoritmo extra7
	
	Definir vector, i, k, vendedorA, vendedorB, vendedorC, vendedorD, zonaA, zonaB, zonaC, zonaD, zonaE Como Entero
	Definir vectorZonas Como Caracter
	
	Dimension vector(4,5), vectorZonas(5)
	
	vectorZonas(0)="Norte"
	vectorZonas(1)="Sur"
	vectorZonas(2)="Este"
	vectorZonas(3)="Oeste"
	vectorZonas(4)="Centro"
	
	para i=0 hasta 3 Con Paso 1 Hacer
		para k=0 hasta 4 Con Paso 1 Hacer
			Escribir "Ingrese las ventas de vendedor " i+1 " en la zona " vectorZonas(k)
			leer vector(i,k)
		FinPara
	FinPara
	
	vendedorA = vector(0,0)+vector(0,1)+vector(0,2)+vector(0,3)+vector(0,4)
	vendedorB = vector(1,0)+vector(1,1)+vector(1,2)+vector(1,3)+vector(1,4)
	vendedorC = vector(2,0)+vector(2,1)+vector(2,2)+vector(2,3)+vector(2,4)
	vendedorD = vector(3,0)+vector(3,1)+vector(3,2)+vector(3,3)+vector(3,4)
	zonaA = vector(0,0)+vector(1,0)+vector(2,0)+vector(3,0)
	zonaB = vector(0,1)+vector(1,1)+vector(2,1)+vector(3,1)
	zonaC = vector(0,2)+vector(1,2)+vector(2,2)+vector(3,2)
	zonaD = vector(0,3)+vector(1,3)+vector(2,3)+vector(3,3)
	zonaE = vector(0,4)+vector(1,4)+vector(2,4)+vector(3,4)
	
	Escribir "El total de las ventas del vendedor 1 es de " vendedorA
	Escribir "El total de las ventas del vendedor 2 es de " vendedorB
	Escribir "El total de las ventas del vendedor 3 es de " vendedorC
	Escribir "El total de las ventas del vendedor 4 es de " vendedorD
	Escribir "El total de ventas de la zona " vectorZonas(0) " es de " zonaA
	Escribir "El total de ventas de la zona " vectorZonas(1) " es de " zonaB
	Escribir "El total de ventas de la zona " vectorZonas(2) " es de " zonaC
	Escribir "El total de ventas de la zona " vectorZonas(3) " es de " zonaD
	Escribir "El total de ventas de la zona " vectorZonas(4) " es de " zonaE
	Escribir "El total de ventas de todos los representantes es de " vendedorA+vendedorB+vendedorC+vendedorD
	
FinAlgoritmo
