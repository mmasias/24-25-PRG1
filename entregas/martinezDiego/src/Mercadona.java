import java.util.Scanner;

public class Mercadona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HORARIO_ABIERTO = 720;
        final double PROBABILIDAD_CLIENTE = 0.6;
        final int MINIMO_PRODUCTOS = 5;
        final int MAXIMO_PRODUCTOS = 15;
        boolean caja1Abierta = true;
        int fila = 0;
        int clienteEnFila = 0;
        int contadorProductos = 0;
        int minuto = 0;
        System.out.println("Enter para avanzar los minutos");

        while (minuto <= HORARIO_ABIERTO) {
            scanner.nextLine();
            minuto++;
            System.out.print("Minuto: " + minuto + "||");
            double llegaAlguien = Math.random();
            if (llegaAlguien <= PROBABILIDAD_CLIENTE) {
                System.out.print(" ha llegado un cliente|| ");
                fila = clienteEnFila++;
                System.out.print("nº clientes en fila:" + fila + "||");
            } else
                System.out.println("no ha llegado nadie||");

            if (clienteEnFila > 0 && caja1Abierta == true) {
                caja1Abierta = false;
                int numeroProductos;
                numeroProductos = (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1) + MINIMO_PRODUCTOS);
                System.out.println("Caja1:" + "[" + numeroProductos + "]");
                contadorProductos = numeroProductos;
                contadorProductos = (!caja1Abierta)
                


                   
                    
                    
                    
                }
            }
            

        }

    }

}
