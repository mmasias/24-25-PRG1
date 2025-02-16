import java.util.Scanner;

public class Mercadona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HORARIO_ABIERTO = 720;
        final double PROBABILIDAD_CLIENTE = 0.6;
        final int MINIMO_PRODUCTOS = 5;
        final int MAXIMO_PRODUCTOS = 15;

        boolean caja1Abierta = true;
        boolean caja2Abierta = true;
        boolean caja3Abierta = true;
        boolean caja4Abierta = true;
        int productosCaja1 = 0;
        int productosCaja2 = 0;
        int productosCaja3 = 0;
        int productosCaja4 = 0;
        int fila = 0;
        int minuto = 0;

        System.out.println("Presiona Enter para avanzar los minutos");

        while (minuto <= HORARIO_ABIERTO) {
            scanner.nextLine();
            minuto++;
            System.out.print("Minuto: " + minuto + " || ");

            double llegaAlguien = Math.random();
            if (llegaAlguien <= PROBABILIDAD_CLIENTE) {
                System.out.print("Ha llegado un cliente || ");
                fila++;
            } else {
                System.out.print("No ha llegado nadie || ");
            }
            System.out.print("Nº clientes en fila: " + fila + " || ");

            if (caja1Abierta && fila > 0) {
                fila--;
                productosCaja1 = MINIMO_PRODUCTOS + (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1));
                caja1Abierta = false; 
                System.out.print("Caja1: " + productosCaja1 + " || ");
            } else if (!caja1Abierta) {
                productosCaja1--;
                System.out.print("Caja1: " + productosCaja1 + " || ");
                if (productosCaja1 <= 0) {
                    caja1Abierta = true;
                    System.out.print("Caja1 libre || ");
                }
            }
            if (caja2Abierta && fila > 0) {
                fila--;
                productosCaja2 = MINIMO_PRODUCTOS + (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1));
                caja2Abierta = false; 
                System.out.print("Caja2: " + productosCaja2 + " || ");
            } else if (!caja2Abierta) {
                productosCaja2--;
                System.out.print("Caja2: " + productosCaja2 + " || ");
                if (productosCaja2 <= 0) {
                    caja2Abierta = true;
                    System.out.print("Caja2 libre || ");
                }
            }if (caja3Abierta && fila > 0) {
                fila--;
                productosCaja3 = MINIMO_PRODUCTOS + (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1));
                caja3Abierta = false; 
                System.out.print("Caja3: " + productosCaja3 + " || ");
            } else if (!caja3Abierta) {
                productosCaja3--;
                System.out.print("Caja3: " + productosCaja3 + " || ");
                if (productosCaja3 <= 0) {
                    caja3Abierta = true;
                    System.out.print("Caja3 libre || ");
                }
            }if (caja4Abierta && fila > 0) {
                fila--;
                productosCaja4 = MINIMO_PRODUCTOS + (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1));
                caja4Abierta = false; 
                System.out.print("Caja4: " + productosCaja4 + " || ");
            } else if (!caja4Abierta) {
                productosCaja4--;
                System.out.print("Caja4: " + productosCaja4 + " || ");
                if (productosCaja1 <= 0) {
                    caja4Abierta = true;
                    System.out.print("Caja4 libre || ");
                }
            }

            System.out.println();
        }
        scanner.close();
    }
}
