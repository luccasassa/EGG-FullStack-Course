/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ListaCantantesFamosos {

    private static List<CantanteFamoso> listaCantantes = new ArrayList<>();

    /**
     *
     * @param nombre
     * @param disco
     * @return
     */
    public CantanteFamoso crearCantante(String nombre, String disco) {
        CantanteFamoso c = new CantanteFamoso();
        c.setNombre(nombre);
        c.setDiscoConMasVentas(disco);
        guardarLista(c);
        return c;
    }

    public static void guardarLista(CantanteFamoso c) {
        listaCantantes.add(c);
    }

    public void mostrarLista() {
        for (CantanteFamoso c : listaCantantes) {
            System.out.println("Cantante: " + c.getNombre() + ". Disco Mas Vendido "
                    + c.getDiscoConMasVentas());
        }
    }

    public void pedirUsuario() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese otro cantante");
        String c = sc.next();
        System.out.println("Ingrese su disco mas vendido");
        String d = sc.next();
        crearCantante(c, d);
        System.out.println("Asi queda la lista actualizada");
        mostrarLista();
    }
}
