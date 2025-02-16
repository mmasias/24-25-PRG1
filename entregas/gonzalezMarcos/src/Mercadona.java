import java.util.Scanner;

class Mercadona {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int HORAS_ABIERTO = 1;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL = HORAS_ABIERTO*MINUTOS_HORA;
        final double PROBABILIDAD_LLEGADA = 0.4;
        final int MINIMO_PRODUCTOS = 5, MAXIMO_PRODUCTOS = 15;
        int minutosFilaVacia = 0;

        int unaFila = 0;
        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;

        for(int tiempoActual = 1;tiempoActual <= TIEMPO_TOTAL;tiempoActual++){
            System.out.println("Tiempo: " + tiempoActual);

            int llegaAlguien = Math.random()<=PROBABILIDAD_LLEGADA ? 1 : 0;
            unaFila = unaFila + llegaAlguien;

            
            if (caja1 <= 0 && unaFila > 0) {
                unaFila--;
                caja1 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 1 y pone "+ caja1 +" productos");
            }

            if (caja2 <= 0 && unaFila > 0) {
                unaFila--;
                caja2 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 1 y pone "+ caja2 +" productos");
            }

            if (caja3 <= 0 && unaFila > 0) {
                unaFila--;
                caja3 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 1 y pone "+ caja3 +" productos");
            }

            if (caja4 <= 0 && unaFila > 0) {
                unaFila--;
                caja4 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
                System.out.println("Pasa una persona a la caja 1 y pone "+ caja4 +" productos");
            }

            if (caja1>0) {
                caja1 = caja1 - 1;
                System.out.println("La caja procesa un producto... le quedan " + caja1);         
            }

            if (caja2>0) {
                caja2 = caja2 - 1;
                System.out.println("La caja procesa un producto... le quedan " + caja2);         
            }

            if (caja3>0) {
                caja3 = caja3 - 1;
                System.out.println("La caja procesa un producto... le quedan " + caja3);         
            }

            if (caja4>0) {
                caja4 = caja4 - 1;
                System.out.println("La caja procesa un producto... le quedan " + caja4);         
            }

            boolean haEstadoVacia = (unaFila==0 && llegaAlguien==0);
            minutosFilaVacia = minutosFilaVacia + (haEstadoVacia?1:0);

            System.out.println("Llego " + llegaAlguien);
            System.out.println("En fila hay: " + unaFila);
            System.out.println("En la caja 1 hay " + caja1 + " productos ");
            System.out.println("En la caja 2 hay " + caja2 + " productos ");
            System.out.println("En la caja 3 hay " + caja3 + " productos ");
            System.out.println("En la caja 4 hay " + caja4 + " productos ");
            System.out.println("-------------------------------------------------");
        }
         System.out.println("Al final de la jornada, la fila ha estado "+ minutosFilaVacia + " minutos vacía");
         System.out.println("y quedan "+ unaFila + " personas esperando");

        entrada.close();
    }
}










//double probabilidad = Math.random();
            //int llegaAlguien = probabilidad <= 0.1 ? 3 : probabilidad <= 0.3 ? 2 : probabilidad <= 0.5 ? 1 : 0;