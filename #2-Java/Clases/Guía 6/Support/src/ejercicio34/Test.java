package ejercicio34;

import java.util.ArrayList;
//import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        //Probando como funciona un ArrayList del tipo de la interfaz
        //<Edificio> (que es implementado en ambas clases (Oficina y Poli)
        //Si creo un arrayList del Tipo Polideportivo, los objetos deben ser de 
        //ese tipo y si lo creo del tipo <Edificio> los obj pueden ser del tipo Oficina o Polideportivo
        
        ArrayList<Oficinas> listaOficinas = new ArrayList<>();
        ArrayList<Polideportivo> listaPoli = new ArrayList<>();
        
        Oficinas of1 = new Oficinas(4, 8.0, 4.0);
        Oficinas of2 = new Oficinas(2, 5.0, 8.0);
        
        listaOficinas.add(of1);
        listaOficinas.add(of2);
        
        Polideportivo pd1 = new Polideportivo("Polideportivo 1");
        Polideportivo pd2 = new Polideportivo("Polideportivo 2");
        Polideportivo pd3 = new Polideportivo("Polideportivo 3");
        
        listaPoli.add(pd1);
        listaPoli.add(pd2);
        listaPoli.add(pd3);
        
        for (Oficinas  of : listaOficinas) {
            System.out.println("Oficina: "+of.toString()+". Superficie "+of.getSuperficieEdificio());
        }
        
        for (Polideportivo polideportivo : listaPoli) {
            System.out.println("Tipo de Instalacion: "+polideportivo.getTipoDeInstalacion()+". "+polideportivo);
        }
    }
}
