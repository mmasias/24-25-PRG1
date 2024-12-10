import java.util.Scanner;

public class MercadonaASCII {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int HORAS_ABIERTO = 12;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL = HORAS_ABIERTO * MINUTOS_HORA;
        final double PROBABILIDAD_LLEGADA = 0.4;
        final int MINIMO_PRODUCTOS = 5, MAXIMO_PRODUCTOS = 15;
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

            if (puedePasar(caja1,unaFila)) {
                unaFila = unaFila - 1;
                caja1 = generarProductos();
            }

            if (puedePasar(caja2,unaFila)) {
                unaFila = unaFila - 1;
                caja2 = generarProductos();

            if (puedePasar(caja3,unaFila)) {
                unaFila = unaFila - 1;
                caja3 = generarProductos();
            }

            if (puedePasar(caja4,unaFila)) {
                unaFila = unaFila - 1;
                caja4 = generarProductos();
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
            
            contarHistoria(caja1, caja2, caja3, caja4);
        }

        System.out.println("Al final de la jornada, la fila ha estado " + minutosFilaVacia + " minutos vacia");
        System.out.println("y quedan " + unaFila + " personas esperando");

        entrada.close();}
    }

        static void contarHistoria(int unaFila, int caja1, int caja2, int caja3, int caja4) {

            final String PERSONA = "_O_ ", PRODUCTO = "[]";

            System.out.println((llegaAlguien > 0 ? "   ===>" : "       ") + PERSONA.repeat(unaFila));
            System.out.println("CAJA 1 " + PRODUCTO.repeat(caja1));
            System.out.println("CAJA 2 " + PRODUCTO.repeat(caja2));
            System.out.println("CAJA 3 " + PRODUCTO.repeat(caja3));
            System.out.println("CAJA 4 " + PRODUCTO.repeat(caja4));
            System.out.println("---------------------------------------------");
            for(int i=0;i<1000000000;i++){
                {

            }
            }
        }

            static boolean puedePasar(int unaCaja, int laFila){
                return unaCaja <= 0 && laFila > 0;
            }

            static int generarProductos (){
                final int MINIMO_PRODUCTOS = 5, MAXIMO_PRODUCTOS = 15;

                return (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1) + MINIMO_PRODUCTOS);

                }

            static void darLaHora (int tiempoActual){
                int hora = (int)(tiempoActual/60)+9;
                int minutos = tiempoActual - (hora*60);

                System.out.println("^[+hora+]:["+minutos+"]");
            }
            static int atender(int unaCaja){
                 
                return unaCaja <= 0 ? 0 : unaCaja--;
            }
    }