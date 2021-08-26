Algoritmo extra11
	
	Definir n, suma, cant,suma1, suma3, suma4, total Como Real
	
	suma=0
	suma1=0
	suma3=0
	suma4=0
	total=1
	
	Mientras total<>0
		
		suma1=suma1+1
		suma=suma+suma1
		
		suma3=suma1+1
		suma4=0
		
		Mientras suma4<=suma
			
			suma3=suma3+1
			suma4=suma4+suma3
			
			total=suma-suma4
			
			si total=0
				
				Escribir suma1+1 " es centro numerico de " suma3
				
			FinSi
			
		FinMientras
		
	FinMientras
	
FinAlgoritmo
