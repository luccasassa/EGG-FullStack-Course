///Implemente de forma recursiva una funci�n que le d� la vuelta a una cadena de caracteres. 
///NOTA: Si la cadena es un pal�ndromo, la cadena y su inversa coincidir�n.
Algoritmo ej21
	Definir cad  como cadena
	Definir largo Como Entero
	Escribir "Escriba una frase o palabra"
	Leer cad
	largo=Longitud(cad)
	Escribir vuelta(cad,largo)
FinAlgoritmo

Funcion vueltaa=vuelta(a,b)
	Definir vueltaa como cadena
	vueltaa= " "
	Si b<0 Entonces
		vueltaa=vueltaa+" "
	SiNo
		vueltaa = vueltaa + Subcadena(a, b, b) + vuelta(a, (b - 1))
	FinSi
FinFuncion
