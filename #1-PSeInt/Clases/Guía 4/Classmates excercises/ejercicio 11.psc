//Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un
//arreglo y su valor m�s grande.

Algoritmo G4_EJ11
	Definir i,vector,n,r Como Entero //min,max son el valor mas chico y el m�s grande respectivamente
	Escribir "Escriba el largo del vector a analizar"
	Leer n
	Dimension vector(n)
	Para i=0 hasta n-1 Hacer
		vector(i) =aleatorio(0,100)
	FinPara
	i=n
	r=diferencia(n,i,vector)
	Escribir "La resta del m�ximo y el m�nimo es: ",r
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
	Escribir "El m�ximo n�mero es: [",max,"]"
	Escribir "El m�nimo n�mero es: [",min,"]"
	d=max-min
FinFuncion
	