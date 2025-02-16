import java.util.Scanner;

public class Mercadona {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 

        final int HORAS_ABIERTO = 12;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL_MINUTOS = HORAS_ABIERTO*MINUTOS_HORA;

        final int MINIMO_PRODUCTOS = 5;
        final int MAXIMO_PRODUCTOS = 15;

        int minutosFilaVacia = 0;

        int itemsVendidosCaja1 = 0, itemsVendidosCaja2 = 0, itemsVendidosCaja3 = 0, itemsVendidosCaja4 = 0;
        int totalItemsVendidos = 0;

        int personasAtendidasCaja1 = 0,personasAtendidasCaja2 = 0,personasAtendidasCaja3 = 0,personasAtendidasCaja4 = 0;
        int totalPersonasAtendidas = 0;

        int unaFila = 0;
        int caja1 = 0,caja2 = 0, caja3 = 0, caja4 = 0;


        final double PROBABILIDAD_LLEGADA = 0.4;

        for(int tiempoActual = 1; tiempoActual <= TIEMPO_TOTAL_MINUTOS ; tiempoActual++){

            int llegaAlguien = Math.random() <=PROBABILIDAD_LLEGADA ? 1 : 0;

            //PROBABILIDADES DIFERENTES DE LLEGADAS DE PERSONAS 
            // double probabilidad = Math.random();
            //int llegaAlguien = probabilidad <= 0.1 ? 3 :
            //                   probabilidad <= 0.3 ? 2 :
            //                   probabilidad <= 0.5 ? 1:0;

            unaFila = unaFila + llegaAlguien;

            System.out.println("MINUTO: " + tiempoActual + " - Lega " + llegaAlguien + " persona - En Cola:" + unaFila);
            System.out.println(" ");


            if (caja1 <=0 && unaFila>0 ) {
                unaFila = unaFila - 1;
                caja1 =(int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 1 y pone " + caja1 + " productos");  
            }
            if (caja1>0) {
                caja1 = caja1 - 1;
                System.out.println("La caja 1 procesa 1 producto... le quedan " + caja1 );
                System.out.println(" ");

                itemsVendidosCaja1 = itemsVendidosCaja1 + 1;

                if (caja1 == 0) {
                    personasAtendidasCaja1 = personasAtendidasCaja1 + 1;   
                }
            }


            if (caja2 <=0 && unaFila>0 ) {
                unaFila = unaFila - 1;
                caja2 =(int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 2 y pone " + caja2 + " productos");
            }
            if (caja2>0) {
                caja2 = caja2 - 1;
                System.out.println("La caja 2 procesa 1 producto... le quedan " + caja2);
                System.out.println(" ");

                itemsVendidosCaja2 = itemsVendidosCaja2 + 1;

                if (caja2 == 0) {
                    personasAtendidasCaja2 = personasAtendidasCaja2 + 1;   
                }
            }


            if (caja3 <=0 && unaFila>0 ) {
                unaFila = unaFila - 1;
                caja3 =(int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 3 y pone " + caja3 + " productos");
            }
            if (caja3>0) {
                caja3 = caja3 - 1;
                System.out.println("La caja 3 procesa 1 producto... le quedan " + caja3);
                System.out.println(" ");

                itemsVendidosCaja3 = itemsVendidosCaja3 + 1;

                if (caja1 == 0) {
                    personasAtendidasCaja1 = personasAtendidasCaja1 + 1;   
                }
            }


            if (caja4 <=0 && unaFila>0 ) {
                unaFila = unaFila - 1;
                caja4 =(int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 4 y pone " + caja4 + " productos");
            }
            if (caja4>0) {
                caja4 = caja4 - 1;
                System.out.println("La caja 4 procesa 1 producto... le quedan " + caja4 );
                System.out.println(" ");

                itemsVendidosCaja4 = itemsVendidosCaja4 + 1;

                if (caja1 == 0) {
                    personasAtendidasCaja1 = personasAtendidasCaja1 + 1;   
                }
            }

            minutosFilaVacia = minutosFilaVacia + ((unaFila==0 && llegaAlguien==0)?1:0);

            System.out.println("Caja1:["+ caja1 + "] | Caja2:["+ caja2 + "] | Caja3:["+ caja3 + "] | Caja4:["+ caja4 + "]");
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
            System.out.println(" ");
            
        }

        totalItemsVendidos = itemsVendidosCaja1 + itemsVendidosCaja2 + itemsVendidosCaja3 + itemsVendidosCaja4;

        totalPersonasAtendidas = personasAtendidasCaja1 + personasAtendidasCaja2 + personasAtendidasCaja3 + personasAtendidasCaja4;

        System.out.println("RESUMEN");
        System.out.println("===================================================");
        System.out.println("Personas en la cola al cierre : " + unaFila );
        System.out.println("Minutos de cola vacia: " + minutosFilaVacia);
        System.out.println("Personas atendidas al dia : " + totalPersonasAtendidas);
        System.out.println("Articulos vendidos en el dia : " + totalItemsVendidos);
        System.out.println("===================================================");
        entrada.close();
    }
}
