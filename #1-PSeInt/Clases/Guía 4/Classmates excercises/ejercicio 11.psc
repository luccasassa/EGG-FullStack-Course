//Crear una función que devuelva la diferencia que hay entre el valor más chico de un
//arreglo y su valor más grande.

Algoritmo G4_EJ11
	Definir i,vector,n,r Como Entero //min,max son el valor mas chico y el más grande respectivamente
	Escribir "Escriba el largo del vector a analizar"
	Leer n
	Dimension vector(n)
	Para i=0 hasta n-1 Hacer
		vector(i) =aleatorio(0,100)
	FinPara
	i=n
	r=diferencia(n,i,vector)
	Escribir "La resta del máximo y el mínimo es: ",r
FinAlgoritmo

Funcion d=diferencia(n,i,vector)
	Definir d,min,max como entero
	min=vector(0)
	max=vector(0)
	Para i=0 hasta n-1 hacer
		si vector(i)>max entonces
			max=vector(i)
		FinSi
		si vector(i)<min entonces
			min=vector(i)
		FinSi
	FinPara
	Para i=0 hasta n-1 hacer
		Escribir " [",vector(i),"]"
	FinPara
	Escribir "El máximo número es: [",max,"]"
	Escribir "El mínimo número es: [",min,"]"
	d=max-min
FinFuncion
	