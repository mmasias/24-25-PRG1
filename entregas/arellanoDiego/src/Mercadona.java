import java.util.Scanner;

class Mercadona {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int HORAS_ABIERTO = 12;
        final int MINUTOS_HORAS = 60;
        final int TIEMPO_TOTAL = HORAS_ABIERTO * MINUTOS_HORAS;
        final double PROBABILIDAD_LLEGADA = 0.4;
        final int PACK_MINIMO = 5, PACK_MAXIMO = 15;

        int Fila = 0;
        int MinFilaVacia = 0;
        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;

        for (int tiempoActual = 1; tiempoActual <= TIEMPO_TOTAL; tiempoActual++) {
            System.out.println("Tiempo: " + tiempoActual);

            int llegaAlguien = Math.random() <= PROBABILIDAD_LLEGADA ? 1 : 0;
            Fila = Fila + llegaAlguien;

            if (caja1 <= 0 && Fila > 0) {
                Fila = Fila - 1;
                caja1 = (int) (Math.random() * (PACK_MAXIMO - PACK_MINIMO + 1) + PACK_MINIMO);
                System.out.println("Pasa una persona a la caja 1 y pone " + caja1 + " productos");
            }

            if (caja2 <= 0 && Fila > 0) {
                Fila = Fila - 1;
                caja2 = (int) (Math.random() * (PACK_MAXIMO - PACK_MINIMO + 1) + PACK_MINIMO);
                System.out.println("Pasa una persona a la caja 2 y pone " + caja2 + " productos");
            }

            if (caja3 <= 0 && Fila > 0) {
                Fila = Fila - 1;
                caja3 = (int) (Math.random() * (PACK_MAXIMO - PACK_MINIMO + 1) + PACK_MINIMO);
                System.out.println("Pasa una persona a la caja 3 y pone " + caja3 + " productos");
            }

            if (caja4 <= 0 && Fila > 0) {
                Fila = Fila - 1;
                caja4 = (int) (Math.random() * (PACK_MAXIMO - PACK_MINIMO + 1) + PACK_MINIMO);
                System.out.println("Pasa una persona a la caja 4 y pone " + caja4 + " productos");
            }

            if (caja1 > 0) {
                caja1 = caja1 - 1;
                System.out.println("La caja 1 procesa 1 producto... le quedan " + caja1);
            }

            if (caja2 > 0) {
                caja2 = caja2 - 1;
                System.out.println("La caja 2 procesa 1 producto... le quedan " + caja2);
            }

            if (caja3 > 0) {
                caja3 = caja3 - 1;
                System.out.println("La caja 3 procesa 1 producto... le quedan " + caja3);
            }

            if (caja4 > 0) {
                caja4 = caja4 - 1;
                System.out.println("La caja 4 procesa 1 producto... le quedan " + caja4);
            }

            boolean cajaVacia = (Fila == 0 && llegaAlguien == 0);
            MinFilaVacia = MinFilaVacia + (cajaVacia ? 1 : 0);

            System.out.println("LLegan a mercadona " + llegaAlguien);
            System.out.println("En fila hay  " + Fila);
            System.out.println("--------------------------------------------- ");

        }

        System.out.println("Al final del dia, la fila ha estado " + MinFilaVacia + " minutos vacia ");
        System.out.println("y quedan " + Fila + " personas esperando");

        entrada.close();
    }
}