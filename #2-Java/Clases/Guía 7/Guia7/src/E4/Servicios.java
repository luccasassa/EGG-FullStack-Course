/*
Se necesita implementar un sistema en el que se puedan cargar alumnos, a los
cuales los caracterizan el nombre y apellido, el número de legajo, el sexo,
condición (regular o condicional) y la nota final. Estos alumnos se deben cargar
en una asignatura, llamada Curso Programación Egg. Implemente las clases y
métodos necesarios para esta situación, teniendo en cuenta lo que se pide a
continuación:
• Mostrar en pantalla todos los alumnos que se encuentren en la asignatura.
• Mostrar en pantalla los alumnos que se encuentren como condicional y su
cantidad.
• Ordenar los alumnos de acuerdo a su nota (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar los alumnos de acuerdo a su nota (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla

Nota: para los ordenamientos utilizar las facilidades provistas por la plataforma
Java.
*/

package E4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Servicios {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Alumnos> lista = new ArrayList<>();
    
    public void menu(){
        int opcion = 123;
        
        do{
            System.out.print("----------------------------------------\n"
            +"EGG MENU:\n"  
            +"1. Ingresar nuevo alumno.\n"
            +"2. Ver lista ordenada alfabeticamente.\n"
            +"3. Ver notas de Menor a Mayor.\n"
            +"4. Ver notas de Mayor a Menor.\n"
            +"5. Ver cantidad de alumnos condicionales.\n"
            +"6. LIMPIAR PANTALLA.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: crearAlumno();
                break;
                case 2: mostrarListaOrdenada();
                break;
                case 3: notasMenorAMayor();
                break;
                case 4: notasMayorAMenor();
                break;
                case 5: mostrarCondicionales();
                break;
                case 6: limpiarPantalla();
                break;
                case 0: System.out.println("");
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }while(opcion!=0);
    }
        
    public void limpiarPantalla(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }
    
    public void crearAlumno(){
        String rta = "asd";
        
        do{
            Alumnos objeto1 = new Alumnos();
            System.out.print("\033[30m"+"Nombre del alumno -> ");
            objeto1.setNombre(sc.next());
            System.out.print("\033[30m"+"Apellido del alumno -> ");
            objeto1.setApellido(sc.next());
            System.out.print("\033[30m"+"Número de legajo del alumno -> ");
            objeto1.setLegajo(sc.nextInt());
            System.out.print("\033[30m"+"Sexo del alumno (h/m) -> ");
            objeto1.setSexo(sc.next());
            System.out.print("\033[30m"+"Condición regular o condicional (r/c) -> ");
            objeto1.setCondicion(sc.next());
            System.out.print("\033[30m"+"Nota final del alumno -> ");
            objeto1.setNotafinal(sc.nextInt());
            System.out.println("Agregar más alumnos? (s/n)");
            rta = sc.next();
            System.out.println("");
            lista.add(objeto1);
        }while(!"n".equals(rta));
    }
    
    public Comparator<Alumnos> menorAmayor = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos o1, Alumnos o2) {
            return o1.getNotafinal().compareTo(o2.getNotafinal());
        }
    };
    
    public Comparator<Alumnos> mayorAmenor = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos o1, Alumnos o2) {
            return o2.getNotafinal().compareTo(o1.getNotafinal());
        }
    };
    
    public void mostrarListaOrdenada(){
        Collections.sort(lista, menorAmayor);
        System.out.println("Notas (-a+):");
        for (Alumnos i : lista) {
            System.out.println("- "+i.getApellido()+" "+i.getNombre());
        }
    }
    
    public void notasMenorAMayor(){
        Collections.sort(lista, menorAmayor);
        System.out.println("Alumnos (-a+):");
        for (Alumnos i : lista) {
            System.out.println("- ("+i.getNotafinal()+") "+i.getApellido()+" "+i.getNombre());
        }
    }
    
    public void notasMayorAMenor(){
        Collections.sort(lista, mayorAmenor);
        System.out.println("Alumnos (+a-):");
        for (Alumnos i : lista) {
            System.out.println("- ("+i.getNotafinal()+") "+i.getApellido()+" "+i.getNombre());
        }
    }
    
    public void mostrarCondicionales(){
        int c = 0;
        //System.out.println("");
        for (Alumnos i : lista) {
            c++;
            if(i.getCondicion().equals("c")){
                c++;
                System.out.println("- ("+i.getCondicion()+") "+i.getApellido()+" "+i.getNombre());
            }
        }
        System.out.println("\nAlumnos condicionales: "+c+"\n");
    }
    
    
}
