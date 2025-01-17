import java.util.Scanner;

class Mercadona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HORASABIERTO = 12;
        final int MINUTOSHORA = 60;
        final int TOTAL_TIME = HORASABIERTO * MINUTOSHORA;
        final int MINIMOPRODUCTOS = 5;
        final int MAXIMOPRODUCTOS = 15;
        final double probablidadLllegada = 0.4;

        int laFila = 0;
        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;
        for(int tiempoActual = 0; tiempoActual <= TOTAL_TIME; tiempoActual++) {
            System.out.println("Han pasado " + tiempoActual + "minutos");

            int llegoAlguien = Math.random() <= probablidadLllegada ? 1 : 0; 
            laFila = laFila + llegoAlguien;
            System.out.println("Han llegado" + laFila + "personas a la fila");

            if(caja1 <= 0 && laFila > 0){
                laFila = laFila - 1;
                caja1 = (int) Math.random() * ((MAXIMOPRODUCTOS - MINIMOPRODUCTOS) + MINIMOPRODUCTOS);
                System.out.println("Ha pasado una persona a la caja 1 y ha llegado con " + caja1 + "productos");
            }
            if(caja2 <= 0 && laFila > 0){
                caja2 = (int) Math.random() * ((MAXIMOPRODUCTOS - MINIMOPRODUCTOS) + MINIMOPRODUCTOS);
                System.out.println("Ha pasado una persona a la caja 2 y ha llegado con " + caja2 + "productos");
            }
            if(caja3 <= 0 && laFila > 0){
                laFila = laFila - 1;
                caja3 = (int) Math.random() * ((MAXIMOPRODUCTOS - MINIMOPRODUCTOS) + MINIMOPRODUCTOS);
                System.out.println("Ha pasado una persona a la caja 3 y ha llegado con " + caja3 + "productos");
            }
            if(caja3 <= 0 && laFila > 0){
                laFila = laFila - 1;
                caja4 = (int) Math.random() * ((MAXIMOPRODUCTOS - MINIMOPRODUCTOS) + MINIMOPRODUCTOS);
                System.out.println("Ha pasado una persona a la caja 4 y ha llegado con " + caja4 + "productos");
            }

            if(caja1 > 0){
                caja1 = caja1 - 1;
                System.out.println("La caja 1 ha procesado 1 producto, le quedan" + caja1 + "producto(s)");
            }
            if(caja2 > 0){
                caja2 = caja2 - 1;
                System.out.println("La caja 2 ha procesado 1 producto, le quedan" + caja2 + "producto(s)");
            }
            if(caja3 > 0){
                caja3 = caja3 - 1;
                System.out.println("La caja 3 ha procesado 1 producto, le quedan" + caja3 + "producto(s)");
            }
            if(caja4 > 0){
                caja4 = caja4 - 1;
                System.out.println("La caja 4 ha procesado 1 producto, le quedan" + caja4 + "producto(s)");
            }
            
            
        }
        input.close();
    }
}