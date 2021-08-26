//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones).

Algoritmo ejercicio41
	
	Definir i,vendedores,comision,sueldo_base,ventas,precio_venta,sueldo,contador Como Entero
	
	Escribir "Ingrese la cantidad de vendedores"
	Leer vendedores
	Escribir "Ingrese el sueldo base"
	Leer sueldo_base
	Escribir "Ingrese el valor de cada venta"
	Leer precio_venta
	
	contador=0
	
	Para i=1 hasta vendedores Hacer
		contador=contador+1
		ventas=Aleatorio(0,20)
		
		Si ventas<>0 Entonces
			sueldo=sueldo_base+(((precio_venta*10)/100)*ventas)
			comision=((precio_venta*10)/100)*ventas
			Escribir contador, " El empleado debe cobrar $ ", comision , " de comision ya que vendio " , ventas , " autos"
			Escribir contador, " El sueldo de esta semana del empleado es de $ ", sueldo
		SiNo
			Escribir contador, " El sueldo de esta semana del empleado es de $ ", sueldo_base , " ya que no realizo ventas"
		FinSi
	FinPara
	
FinAlgoritmo
