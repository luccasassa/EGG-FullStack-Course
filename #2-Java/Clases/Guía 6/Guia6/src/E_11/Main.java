/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
y cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente,
al menos, los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• Métodos getters y setters.
• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
• Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
*/

package E_11;    //ARREGLAR LIMITE 10 CAFETERA EN AGREGAR CAPSULAS
import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {
        
        Cafetera objeto1 = new Cafetera();
        objeto1.setCapacidadMaxima(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la capacidad máxima de cápsulas de la cafetera","Nespresso ®",JOptionPane.PLAIN_MESSAGE)));
        objeto1.setCantidadActual(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad actual de cápsulas de la cafetera","Nespresso ®",JOptionPane.PLAIN_MESSAGE)));
        objeto1.setTaza(1);
        
        int opcion = 123;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción\n"
            + "1. Llenar cafetera.\n"
            + "2. Servir taza.\n"
            + "3. Vaciar cafetera.\n"
            + "4. Agregar café.\n"
            + "5. Check datos.\n"
            + "0. SALIR.","Nespresso ®",JOptionPane.PLAIN_MESSAGE));
            
            switch(opcion){
                case 1: JOptionPane.showMessageDialog(null,"Se llenó la cafetera."+"\nLa cantidad actual es de "+objeto1.llenarCafetera(objeto1)+" cápsulas.","Nespresso ®",JOptionPane.INFORMATION_MESSAGE);
                break;
                case 2: 
                    if(objeto1.getCantidadActual()<objeto1.getTaza()){
                        JOptionPane.showMessageDialog(null,"CÁPSULAS DE CAFÉ INSUFICIENTES, AGREGUE POR FAVOR.","**UNAVALIABLE**",JOptionPane.WARNING_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Taza servida."+"\nLa cantidad actual es de "+objeto1.servirTaza(objeto1)+" cápsula/s.","Nespresso ®",JOptionPane.PLAIN_MESSAGE);
                    }
                break;
                case 3: JOptionPane.showMessageDialog(null,"Se vació la cafetera."+"\nLa cantidad actual es de "+objeto1.vaciarCafetera(objeto1)+" cápsulas.","Nespresso ®",JOptionPane.INFORMATION_MESSAGE);
                break;
                case 4: int ingreso = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuántas cápsulas desea agregar","Nespresso ®",JOptionPane.PLAIN_MESSAGE));
                        if(objeto1.getCantidadActual()==10){
                            JOptionPane.showMessageDialog(null,"LA CAFETERA YA ESTÁ LLENA.","**UNAVALIABLE**",JOptionPane.WARNING_MESSAGE);
                        }else if(objeto1.getCapacidadMaxima()<ingreso){
                            JOptionPane.showMessageDialog(null,"LA CANTIDAD SOBREPASA EL LÍMITE DE LA CAFETERA.","**UNAVALIABLE**",JOptionPane.WARNING_MESSAGE);
//                        }else if(objeto1.agregarCafe(objeto1, ingreso)>10){
//                            JOptionPane.showMessageDialog(null,"LA CANTIDAD SOBREPASA EL LÍMITE DE LA CAFETERA.","**UNAVALIABLE**",JOptionPane.WARNING_MESSAGE);
//                            ingreso = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuántas cápsulas desea agregar","Nespresso ®",JOptionPane.PLAIN_MESSAGE));
                        }else{
                            JOptionPane.showMessageDialog(null,ingreso+" cápsula/s agregada/s."+"\nLa cantidad actual es de "+objeto1.agregarCafe(objeto1, ingreso)+" cápsula/s.","Nespresso ®",JOptionPane.PLAIN_MESSAGE);
                        }
                break;
                case 5: JOptionPane.showMessageDialog(null,"Capacidad máxima de cápsulas: "+objeto1.getCapacidadMaxima()+"\n"
                    + "Cantidad actual de cápsulas: "+objeto1.getCantidadActual(),"Nespresso ®",JOptionPane.PLAIN_MESSAGE);
                break;
                case 0: System.out.println("");
                break;
                default: JOptionPane.showMessageDialog(null,"OPCIÓN NO VÁLIDA","***ERROR***",JOptionPane.ERROR_MESSAGE);
                break;
            }
        }while(opcion!=0);
    }
}
