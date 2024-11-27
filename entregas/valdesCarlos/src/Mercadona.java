import java.util.Scanner;

class Mercadona {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        final int HORAS_ABIERTO = 1;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL = HORAS_ABIERTO*MINUTOS_HORA;
        final double PROBABILIDAD_LLEGADA = 0.40;
        final int MINIMO_PRODUCTOS = 5, MAXIMO_PRODUCTOS = 15;
        int unaFila = 0;
        int minutosFilaVacia = 0;
        int caja1 = 0, caja2 = 0, caja3 =0, caja4 = 0;
        
        for(int tiempoActual = 0; tiempoActual <= TIEMPO_TOTAL; tiempoActual++) {
            System.out.println("Tiempo: " + tiempoActual);

            int llegaAlguien = Math.random()<= PROBABILIDAD_LLEGADA ? 1 : 0;
            unaFila = unaFila + llegaAlguien;

            if(caja1<=0 && unaFila > 0) {
                unaFila--;
                caja1 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
            }
            
            if(caja1>0);{
            caja1 = caja1 -1;
            }

            if(caja2<=0 && unaFila > 0) {
                unaFila--;
                caja2 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
            }
            
            if(caja2>0);{
            caja2 = caja2 -1;
            }

            if(caja3<=0 && unaFila > 0) {
                unaFila--;
                caja3 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
            }
            
            if(caja3>0);{
            caja3 = caja3 -1;
            }

            if(caja4<=0 && unaFila > 0) {
                unaFila--;
                caja4 = (int)(Math.random()*(MAXIMO_PRODUCTOS-MINIMO_PRODUCTOS+1)+MINIMO_PRODUCTOS);
            }
            
            if(caja4>0);{
            caja4 = caja4 -1;
            }

            boolean haEstadoVacia = (unaFila == 0 && llegaAlguien == 0 );
            minutosFilaVacia = minutosFilaVacia + (haEstadoVacia ? 1 : 0);

            System.out.println("Llegó a Mercadona " + llegaAlguien);
            System.out.println("En fila hay " + unaFila);
            System.out.println("En la caja 1 hay " + caja1 + " productos");
            System.out.println("En la caja 2 hay " + caja2 + " productos");
            System.out.println("En la caja 3 hay " + caja3 + " productos");
            System.out.println("En la caja 4 hay " + caja4 + " productos");
            System.out.println("------------------------------------------------");

        }

        System.out.println("Al final de la jornada, la fila ha estado " + minutosFilaVacia + " minutos vacia");
        System.out.println("y quedan " + unaFila + " personas esperando");



        entrada.close();
    }
}