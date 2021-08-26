//Crear un vector que contenga 100 notas con valores entre 0 y 20 generadas
//aleatoriamente mediante el uso de la funci�n azar() o aleatorio() de PseInt. Luego, de
//acuerdo a las notas contenidas, el programa debe indicar cu�ntos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo ejercicio7
	
	Definir i,notas,d,r,b,e Como Entero
	Dimension notas[100]
	
	d=0
	r=0
	b=0
	e=0
	
	Escribir 'Las notas de los alumnos son: '
	
	Para i=0 hasta 99 Hacer
		notas[i]=Aleatorio(1,20)                                     //0 (cero) no pongo, ya que no existe la nota 0
		
		Si i = 99 Entonces
			Escribir Sin Saltar notas[99], '.'                    //�sto me lee el �ltimo n�mero, �sta condici�n es para no colocar la �ltima coma (,)
		SiNo
			Escribir Sin Saltar notas[i], ','                     //�sto me lee los primeros 4 n�meros
		FinSi
	FinPara
	
	Escribir ' '
	
	Para i=0 hasta 99 Hacer
		Si notas[i]>=1 y notas[i]<=5 Entonces
			d=d+1
		FinSi
		Si notas[i]>=6 y notas[i]<=10 Entonces
			r=r+1
		FinSi
		Si notas[i]>=11 y notas[i]<=15 Entonces
			b=b+1
		FinSi
		Si notas[i]>=16 y notas[i]<=20 Entonces
			e=e+1
		FinSi
	FinPara
	
	Escribir ' '
	Escribir 'Los estudiantes deficientes son: ', d
	Escribir 'Los estudiantes regulares son: ', r
	Escribir 'Los estudiantes buenos son: ', b
	Escribir 'Los estudiantes excelentes son: ', e
	
FinAlgoritmo
