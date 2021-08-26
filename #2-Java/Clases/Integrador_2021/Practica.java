package Integrador_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Practica {

    /*
    El programa debera tomar un numero x y determinar si es palindromo o no
    **Contemplar que el num que llega puede ser null,en caso de que sea null,
    retornar false, en caso que sea palindromo retornar true.
    
    @param num
    @return esPalindromo
    */
    
    public Boolean numeroCapicua(Long num) {
        
        try{
            if(num<0){
                num*=-1;
            }
            String numLong = num + "";
            String inv = "";
            for (int i=0; i<numLong.length(); i++) {
                inv = inv + numLong.substring(i, i+1);
            }
            
            return (Long.parseLong(inv)==num);
            
        }catch (NullPointerException e){
            System.err.println("No ingresaste número");
            
            return false;
        }
    }

    /*
    Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
    vez al mes, se sienta una n cantidad de presos en ronda, contemplando al
    primer preso que se sienta, como el preso 0. A los presos se le repartira
    una m cantidad de caramelos contemplando que se comenzaran a repartir los
    caramelos desde el primer preso (inicio). El ultimo caramelo en
    repartirse estara podrido, determinar a que preso, segun su posicion en
    la ronda le tocara.
    
    @param inicio
    @param cantidadCaramelos
    @param cantidadPresos
    @return presoQueLeTocoElCarameloPodrido
    */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadPresos) {
        
        Integer[] preso = new Integer[cantidadPresos];
        
        for (int i=0; i<cantidadPresos; i++) {
            preso[i] = 0;
        }
        
        do{
            if(inicio >= cantidadPresos){    //si es el último, vuelve al primero (0)
                inicio = 0;
            }
            
            preso[inicio]++;    //sumo caramelo al preso
            cantidadCaramelos--;    //resto caramelo dado
            inicio++;    //voy al siguiente
        }while(cantidadCaramelos>0);
        
        return inicio-1;    //debido a que le tocó al anterior el último
    }

    /*
    En un universo paralelo, donde los habitantes son medias, existe un
    crucero de medias donde se sube una lista de medias. Esta lista de
    tripulantes del crucero es una Collection de letras, lo que se debera
    hacer, es filtrar la lista de medias que se suben al crucero y retornar
    una lista que contenga los grupos de medias que si tenian amigas. Esta
    lista final de medias amigas se mostraran ordenadas de menor a mayor. A
    continuacion un ejemplo:
    
    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H.
    F,Z,H no tienen amigas :( List que se deberia retornar : A,B,C
     
    @param pasajeros
    @return mediasAmigas
    */
    public List<String> mediasAmigas(List<String> pasajeros) {
        
        Map<String,Integer> countMedias = new TreeMap<>();
        
        for (String i : pasajeros) {
            countMedias.put(i, 0);
        }
        
        for (String i : pasajeros) {
            if(countMedias.containsKey(i)){
                countMedias.replace(i, countMedias.get(i), (countMedias.get(i))+1);
            }
        }
        
        List<String> lista = new ArrayList<>();
        
        for (Map.Entry<String,Integer> i : countMedias.entrySet()) {
            if(i.getValue()>1){
                lista.add(i.getKey());
            }
        }
        
        return lista;
    }
    
    public List<String> mediasAmigas2(List<String> pasajeross){
        
        List<String> amigas = new ArrayList<>();
        
        int c = 0;
        
        for (int i=0; i<pasajeross.size(); i++) {
            if(!amigas.contains(pasajeross.get(i))){
                amigas.add(pasajeross.get(i));
            }
        }
        
        for (String i : amigas) {
            for (String j : pasajeross) {
                if(i.equals(j)){
                    c++;
                }
            }
            
            System.out.println(i+""+c);
            if(c==1){
                amigas.remove(i);
            }
            c = 0;
        }
        System.out.println(amigas.toString());
        
        return amigas;
    }
}
