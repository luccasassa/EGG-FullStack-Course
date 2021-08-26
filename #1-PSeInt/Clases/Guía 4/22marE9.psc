//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer
//hasta que ingrese la opción Salir:
//		a. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera
//			aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt.
//		b. Llenar Vector B. Este vector también es de tamaño N y se llena de manera
//			aleatoria.
//		c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar
//			elemento a elemento. Ejemplo: C = A + B
//		d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar
//			elemento a elemento. Ejemplo: C = B - A
//		e. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar:
//			Vector A, B, o C.
//		f. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La
//longitud para todos los vectores debe ser la misma, por lo tanto, esa información sólo se
//solicitará una vez.

Algoritmo ejercicio9
	
	Definir i,n,vectorA,vectorB,vectorC,vectorD Como Entero
	Definir respuesta como caracter
	Escribir "Ingrese la longitud del vector"
	Leer n
	Dimension vectorA(n),vectorB(n),vectorC(n),vectorD(n)
	
	respuesta=""
	
	Para i=0 hasta n-1 hacer
		vectorA(i)=aleatorio (-100,100)
		vectorB(i)=aleatorio (-100,100)
	FinPara
	
	Para i=0 hasta n-1 hacer
		vectorC(i)=vectorA(i)+vectorB(i)
		vectorD(i)=vectorB(i)-vectorA(i)
	FinPara
	
	Mientras (respuesta<>"f") y (respuesta<>"F") Hacer
		Escribir ""
		Escribir "Escriba según el vector que quiere ver en pantalla:"
		Escribir "A (para vector A), B (vector B), C (suma A y B) o D (resta B  y A)"
		Escribir "Para salir apriete X"
		Leer respuesta
		Segun respuesta hacer
			"A","a":
				Para i=0 hasta n-1 hacer
					Escribir Sin Saltar "[",vectorA(i),"] "
				FinPara
			"B","b":
				Para i=0 hasta n-1 hacer
					Escribir Sin Saltar"[",vectorB(i),"] "
				FinPara
			"C","c":
				Para i=0 hasta n-1 hacer
					Escribir Sin Saltar "[",vectorC(i),"] "
				FinPara
			"D","d":
				Para i=0 hasta n-1 hacer
					Escribir Sin Saltar "[",vectorD(i),"] "
				FinPara
			De Otro Modo:
				Si (respuesta<>"f") y (respuesta<>"F")
					Escribir "CARACTER INVÁLIDO"
				SiNo
					Escribir "La ejecución del programa ha finalizado correctamente."
				FinSi
		FinSegun
	FinMientras
	
FinAlgoritmo
