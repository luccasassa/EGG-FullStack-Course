Algoritmo extra4
	
	Definir kilos Como Real
	Definir coste Como Real
	
	Escribir "ingrese la cantidad de kilos que desea comprar"
	leer kilos
		
	si kilos>10
		coste=kilos*0.8
		Escribir "deber� abonar " coste
	SiNo
		si (kilos<=10) y (kilos>5)
			coste=kilos*0.85
			Escribir "deber� abonar " coste
		SiNo
			si (kilos<=5) y (kilos>2)
				coste=kilos*0.9
				Escribir "deber� abonar " coste
			SiNo
				si (kilos<=2) y (kilos>0)
					coste=kilos
					Escribir "deber� abonar " coste
				SiNo
					Escribir "ingrese un numero positivo, no podemos comprarles manzanas"
				FinSi
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo
