//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el
//curso actual. El programa debe solicitar al usuario
//que ingrese la cantidad total de niños, y la cantidad total de niñas que hay en el curso

Algoritmo ejercicio1
	Definir total_ninos, total_ninas Como Entero
	Definir promedio_ninos, promedio_ninas Como Real
	
	Escribir "Cantidad de ninos en el curso"
	Leer total_ninos
	Escribir "Cantidad de ninas en el curso"
	Leer total_ninas
	
	promedio_ninos=total_ninos*100/(total_ninas+total_ninos)
	promedio_ninas=total_ninas*100/(total_ninas+total_ninos)
	
	Escribir "El promedio de ninos que hay es de ", promedio_ninos
	Escribir  "El promedio de ninas que hay es de ", promedio_ninas
	
FinAlgoritmo