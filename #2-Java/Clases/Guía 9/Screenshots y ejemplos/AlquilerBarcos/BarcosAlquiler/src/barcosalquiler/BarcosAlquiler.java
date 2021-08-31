package barcosalquiler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarcosAlquiler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        List<Barco> listaBarcos = new ArrayList(); //COMO PINGO USAR ÉSTE ARRAYLIST//
        Alquileres alquiler = new Alquileres();
        
        int salida = 1;
        do {
            int opcion;
            do {
                System.out.println("Ingrese el tipo de barco que desea crear: 1.VELERO / 2.YATE / 3.DEPORTIVO ");
                opcion = sc.nextInt();
            } while (opcion != 1 && opcion != 2 && opcion != 3);

            switch (opcion) {
                //INGRESO DATOS DE MES Y DIA Y INVOCO A METODO PARA GENERAR FECHAS Y CALCULAR DIAS DE ALQUILER//
                case 1:
                    System.out.println("Ingrese un mes y dia de inicio de alquiler: mm/dd");
                    LocalDate fecha1 = LocalDate.of(2021, sc.nextInt(), sc.nextInt());
                    alquiler.setFechaInicial(fecha1);
                    System.out.println("Ingrese mes y dia de fin de alquiler: mm/dd");
                    LocalDate fecha2 = LocalDate.of(2021, sc.nextInt(), sc.nextInt());
                    alquiler.setFechaFinal(fecha2);

                    int diasAlquilados = alquiler.diasAlquiler(fecha1, fecha2);

                    //INSTANCIO UN BARCO TIPO VELERO POR PARAMETROS//
                    Velero velero1 = new Velero(3, 125, 12, 1965, "ALEJANDRO MAGNO", 37510382, fecha1, fecha2, diasAlquilados, 12);

                    //MUESTRO PRECIO FINAL DE ALQUILER Y DATOS DEL BARCO TIPO VELERO//
                    System.out.println("Precio aquiler $ " + velero1.precioAlquiler());

                    //ALMACENO DATOS DE MI BARCO EN UN ARRAYLIST//
                    listaBarcos.add(velero1);
                    break;

                case 2:
                    //INGRESO DATOS DE MES Y DIA Y INVOCO A METODO PARA GENERAR FECHAS Y CALCULAR DIAS DE ALQUILER//
                    System.out.println("Ingrese un mes y dia de inicio de alquiler: mm/dd");
                    LocalDate fecha3 = LocalDate.of(2021, sc.nextInt(), sc.nextInt());
                    alquiler.setFechaInicial(fecha3);
                    System.out.println("Ingrese mes y dia de fin de alquiler: mm/dd");
                    LocalDate fecha4 = LocalDate.of(2021, sc.nextInt(), sc.nextInt());
                    alquiler.setFechaFinal(fecha4);

                    int diasAlquilados1 = alquiler.diasAlquiler(fecha3, fecha4);
                    //INSTANCIO UN BARCO TIPO YATE POR PARAMETROS/
                    Yate yate1 = new Yate(180, 193, 10, 2008, "MARCELO MILANESIO", 20199356, fecha3, fecha4, diasAlquilados1, 3);

                    //MUESTRO PRECIO FINAL DE ALQUILER Y DATOS DEL BARCO TIPO YATE//
                    System.out.println("Precio aquiler $ " + yate1.precioAlquiler());

                    //ALMACENO DATOS DE MI BARCO EN UN ARRAYLIST//
                    listaBarcos.add(yate1);
                    break;
                case 3:
                    //INGRESO DATOS DE MES Y DIA Y INVOCO A METODO PARA GENERAR FECHAS Y CALCULAR DIAS DE ALQUILER//
                    System.out.println("Ingrese un mes y dia de inicio de alquiler: mm/dd");
                    LocalDate fecha5 = LocalDate.of(2021, sc.nextInt(), sc.nextInt());
                    alquiler.setFechaInicial(fecha5);
                    System.out.println("Ingrese mes y dia de fin de alquiler: mm/dd");
                    LocalDate fecha6 = LocalDate.of(2021, sc.nextInt(), sc.nextInt());
                    alquiler.setFechaFinal(fecha6);

                    int diasAlquilados2 = alquiler.diasAlquiler(fecha5, fecha6);

                    //INSTANCIO UN BARCO TIPO YATE POR PARAMETROS//
                    Barco deportivo1 = new Deportivo(120, 3, 22, 8, 2011, "MONICA GALINDO", 24588369, fecha5, fecha6, diasAlquilados2, 15);

                    //MUESTRO PRECIO FINAL DE ALQUILER Y DATOS DEL BARCO TIPO YATE//
                    System.out.println("Precio aquiler $ " + deportivo1.precioAlquiler());

                    //ALMACENO DATOS DE MI BARCO EN UN ARRAYLIST//
                    listaBarcos.add(deportivo1);
            }
            
            //CONDICION PARA SEGUIR ALQUILANDO BARCOS//
            System.out.println("Desea seguir alquilando barcos? 1 - SI / 2 - NO");
            salida = sc.nextInt();

        } while (salida == 1);

         //FOR EACH PARA MOSTRAR LISTA DE BARCOS ALQUILADOS//
           mostrarListaBarcos(listaBarcos);
    }
    
    public static void mostrarListaBarcos(List<Barco> listaBarcos){
            for (Barco b : listaBarcos) {
                System.out.println("Cliente -> " + b.nombre);
                System.out.println("N° amarre -> " + b.posAmarre);
                System.out.println("Dias alquiler -> " + b.diasTranscurridos);
                System.out.println("Abono alquiler -> $" + b.precioAlquiler());
            }    
    }
}
