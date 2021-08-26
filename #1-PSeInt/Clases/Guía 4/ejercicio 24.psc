//Una empresa de venta de productos por correo desea realizar una estadística de las
//ventas realizadas de cada uno de sus productos a lo largo de una semana. Distribuya
//luego 5 productos en los 5 días hábiles de la semana. Se desea conocer:
//	a. Total de ventas por cada día de la semana.
//	b. Total de ventas de cada producto a lo largo de la semana.
//	c. El producto más vendido en cada semana.
//	d. El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo ejercicio24
	
	Definir vector, i, k Como Entero
	
	Dimension vector(7,6)
	
	Escribir "Ingrese la cantidad de productos vendidos por dias, de lunes a viernes"
	
	para i=0 hasta 4 con paso 1 Hacer
		Escribir "Producto " i+1
		para k=0 hasta 4 con paso 1 Hacer
			vector(i, k)=azar(9)
		FinPara
	FinPara
	
	vector(0, 5)=0
	vector(1, 5)=0
	vector(2, 5)=0
	vector(3, 5)=0
	vector(4, 5)=0
	
	para i=0 hasta 4 con paso 1 Hacer
		vector(0, 5)=vector(0, 5)+vector(0, i)
		vector(1, 5)=vector(1, 5)+vector(1, i)
		vector(2, 5)=vector(2, 5)+vector(2, i)
		vector(3, 5)=vector(3, 5)+vector(3, i)
		vector(4, 5)=vector(4, 5)+vector(4, i)
	FinPara
	
	vector(5, 0)=0
	vector(5, 1)=0
	vector(5, 2)=0
	vector(5, 3)=0
	vector(5, 4)=0
	
	para i=0 hasta 4 con paso 1 Hacer
		vector(5, 0)=vector(5, 0)+vector(i, 0)
		vector(5, 1)=vector(5, 1)+vector(i, 1)
		vector(5, 2)=vector(5, 2)+vector(i, 2)
		vector(5, 3)=vector(5, 3)+vector(i, 3)
		vector(5, 4)=vector(5, 4)+vector(i, 4)
	FinPara
	
	vector(6, 0)=0
	vector(6, 1)=0
	vector(6, 2)=0
	vector(6, 3)=0
	vector(6, 4)=0
	
	para i=0 hasta 4 con paso 1 Hacer
		para k=0 hasta 4 Con Paso 1 Hacer
			si vector(i, k)>vector(6, k)
				vector(6, k) = i
			FinSi
		FinPara
	FinPara
	
	vector(5,5)=0
	vector(6,5)=0
	
	para i=0 hasta 6 con paso 1 Hacer
		para k=0 hasta 5 con paso 1 Hacer
			Escribir Sin Saltar vector(i, k) ", "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
