///Implemente de forma recursiva una función que le dé la vuelta a una cadena de caracteres. 
///NOTA: Si la cadena es un palíndromo, la cadena y su inversa coincidirán.
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
