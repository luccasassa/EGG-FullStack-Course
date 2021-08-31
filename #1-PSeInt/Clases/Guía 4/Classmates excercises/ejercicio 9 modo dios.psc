Algoritmo ejercicio9
	
	Definir A, B, C, op2, n, l Como Entero
	Definir op Como Caracter
	
	Escribir "Bienvenido al programa de creación, suma y resta de Vectores."
	Esperar 1 segundo
	Escribir "Presione cualquier tecla para continuar."
	Esperar Tecla
	Escribir ""
	Escribir "Debes definir inicialmente la dimension de tus vectores."
	Leer n
	Escribir "Creando espacios de memoria" Sin Saltar
	
	Para l=1 hasta n Hacer
		Escribir "." Sin Saltar
		Esperar 1 segundo
	FinPara
	
	Escribir ""
	Escribir "Hecho."
	
	Esperar 1 segundo
	Dimension A(n)
	Dimension B(n)
	Dimension C(n)
	
	A(0)=200
	B(0)=200
	
	Hacer
		Limpiar Pantalla
		Escribir "MENU PRINCIPAL"
		Escribir "Opción ´a´: Llenar un vector A de manera aleatoria."
		Escribir "Opción ´b´: Llenar un vector B de manera aleatoria."
		Escribir "Opción ´c´: Llenar un vector C de manera A+B. (Debe definir A y B previamente)"
		Escribir "Opción ´d´: Llenar un vector C de manera A-B. (Debe definir A y B previamente)"
		Escribir "Opción ´e´: Mostrar vector (A, B, C)."
		Escribir "Opción ´f´: Salir."
		Escribir "------------------------------------------------------"
		Escribir "Elige una opción:" Sin Saltar
		Leer op
		Segun op Hacer
			"a":
				Limpiar Pantalla
				Escribir "Creando el vector A."
				LlenadoAleatorio(A, n)
				Esperar 1 segundo
				Escribir "Completado. Volviendo al menú principal."
				Escribir "------"
				Esperar 2 segundo
			"b":
				Limpiar Pantalla
				Escribir "Creando el vector B."
				LlenadoAleatorio(B, n)
				Esperar 1 segundo
				Escribir "Completado. Volviendo al menú principal."
				Escribir "------"
				Esperar 2 segundo
			"c":
				Limpiar Pantalla
				Si A(0)=200 o B(0)=200 Entonces
					Escribir "ERROR."
					Escribir "Primero debe generar los Vectores A y B para poder operar."
					Esperar 1 segundo
					Escribir "Presione cualquier tecla para continuar."
					Esperar Tecla
					Escribir "Volviendo a menu principal."
					Esperar 2 segundo
				SiNo
					Escribir "Sumando los vectores"
					SumaVectores(A, B, C, n)
					Esperar 1 segundo
					Escribir "Completado. Volviendo al menú principal."
					Escribir "------"
					Esperar 2 segundo
				FinSi
			"d":
				Limpiar Pantalla
				Si A(0)=200 o B(0)=200 Entonces
					Escribir "ERROR."
					Escribir "Primero debe generar los Vectores A y B para poder operar."
					Esperar 1 segundo
					Escribir "Presione cualquier tecla para continuar."
					Esperar Tecla
					Escribir "Volviendo a menu principal."
					Esperar 2 segundo
				SiNo
					Escribir "Restando los vectores"
					RestaVectores(A, B, C, n)
					Esperar 1 segundo
					Escribir "Completado. Volviendo al menú principal."
					Escribir "------"
					Esperar 2 segundo
				FinSi
			"e":
				Limpiar Pantalla
				Escribir "QUE VECTOR DESEA MOSTRAR???"
				Escribir "1. Vector A."
				Escribir "2. Vector B."
				Escribir "3. Vector C."
				Escribir "4. Salir."
				Repetir
					Escribir "Eliga la opción." Sin Saltar
					Leer op2
					Segun op2 Hacer
						1:
							Escribir Sin Saltar "VECTOR A: "
							MostrarVector(A, n)
							Esperar 1 segundo
						2:
							Escribir Sin Saltar "VECTOR B: "
							MostrarVector(B, n)
							Esperar 1 segundo
						3:
							Escribir Sin Saltar "VECTOR C: "
							MostrarVector(C, n)
							Esperar 1 segundo
						4:
							Escribir "Volviendo a menú principal."
							Esperar 1 Segundo
						De Otro Modo:
							Escribir "La opcion ingresada no es correcta."
							Escribir "....................................................."
							Esperar 1 segundo
							Limpiar Pantalla
					Fin Segun
				Hasta Que op2=4
			"f":
				Escribir "Saliendo..."
				Esperar 2 Segundos
			De Otro Modo:
				Escribir "La opcion ingresada no es correcta."
				Escribir "Volviendo a menú principal."
				Escribir "....................................................."
				Esperar 1 segundo
		Fin Segun
	Hasta Que op="f"
	
FinAlgoritmo
//------------------------------------------------------------------------
SubProceso LlenadoAleatorio(VECTOR Por Referencia, n)
	Definir i Como Entero
	Para i=0 hasta n-1 Hacer
		VECTOR(i)=Aleatorio(-100,100)
	FinPara
FinSubProceso
//------------------------------------------------------------------------
SubProceso SumaVectores(vector1, vector2, resultado Por Referencia, n)
	Definir i Como Entero
	Para i=0 hasta n-1 Hacer
		resultado(i)=vector1(i)+vector2(i)
	FinPara
FinSubProceso
//------------------------------------------------------------------------
SubProceso RestaVectores(vector1, vector2, resultado Por Referencia, n)
	Definir i Como Entero
	Para i=0 hasta n-1 Hacer
		resultado(i)=vector1(i)-vector2(i)
	FinPara
FinSubProceso
//------------------------------------------------------------------------
SubProceso MostrarVector(vector, n)
	Definir i Como Entero
	Para i=0 hasta n-1 Hacer
		Escribir Sin Saltar vector(i), " "
	FinPara
	Escribir ""
FinSubProceso
