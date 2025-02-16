import java.util.Scanner;

public class MercadonaFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int HORAS_ABIERTO = 12;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL = HORAS_ABIERTO * MINUTOS_HORA;
        final double PROBABILIDAD_LLEGADA = 0.4;
        final int MINIMO_PRODUCTOS = 5, MAXIMO_PRODUCTOS = 15;
        final String PERSONA = "_O_ ", PRODUCTO = "[]";
        int unaFila = 0;
        int minutosFilaVacia = 0;
        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;
        int horas=9, minutos=0;

        for (int tiempoActual = 1; tiempoActual <= TIEMPO_TOTAL; tiempoActual++) {
            
            minutos++;
            if(minutos>=60){
                horas++;
                minutos=0;
            }
            
            int llegaAlguien = Math.random() <= PROBABILIDAD_LLEGADA ? 1 : 0;
            unaFila = unaFila + llegaAlguien;

            if (caja1 <= 0 && unaFila > 0) {
                unaFila = unaFila - 1;
                caja1 = (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1) + MINIMO_PRODUCTOS);
            }

            if (caja2 <= 0 && unaFila > 0) {
                unaFila = unaFila - 1;
                caja2 = (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1) + MINIMO_PRODUCTOS);
            }

            if (caja3 <= 0 && unaFila > 0) {
                unaFila = unaFila - 1;
                caja3 = (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1) + MINIMO_PRODUCTOS);
            }

            if (caja4 <= 0 && unaFila > 0) {
                unaFila = unaFila - 1;
                caja4 = (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1) + MINIMO_PRODUCTOS);
            }

            if (caja1 > 0)
                caja1 = caja1 - 1;

            if (caja2 > 0)
                caja2 = caja2 - 1;

            if (caja3 > 0)
                caja3 = caja3 - 1;

            if (caja4 > 0)
                caja4 = caja4 - 1;

            boolean haEstadoVacia = (unaFila == 0 && llegaAlguien == 0);
            minutosFilaVacia = minutosFilaVacia + (haEstadoVacia ? 1 : 0);

            System.out.println("Tiempo: [" + horas + "]:[" + minutos + "]");
            System.out.println((llegaAlguien > 0 ? "   ===>" : "       ") + PERSONA.repeat(unaFila));
            System.out.println("CAJA 1 " + PRODUCTO.repeat(caja1));
            System.out.println("CAJA 2 " + PRODUCTO.repeat(caja2));
            System.out.println("CAJA 3 " + PRODUCTO.repeat(caja3));
            System.out.println("CAJA 4 " + PRODUCTO.repeat(caja4));
            System.out.println("---------------------------------------------");
            for(int i=0;i<1000000000;i++){}
        }

        System.out.println("Al final de la jornada, la fila ha estado " + minutosFilaVacia + " minutos vacia");
        System.out.println("y quedan " + unaFila + " personas esperando");

        entrada.close();
    }
}