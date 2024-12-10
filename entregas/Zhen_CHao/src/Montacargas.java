import java.util.Scanner;

public class Montacargas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int plantaActual = 0;
        final int MAXIMO_NUMERO_PLANTAS = 10;
        boolean continuar = true;

        while (continuar) {
            System.out.println("El montacargas está en la planta " + plantaActual);
            System.out.println("¿A qué planta deseas ir (de la 0 a la 10)?");
            System.out.println("O ingresa -1 para salir.");

            final int plantaDestino = entrada.nextInt();

            if (plantaDestino == -1) {
                continuar = false;
                System.out.println("Simulación finalizada.");
            } else if (plantaDestino >= plantaActual && plantaDestino <= MAXIMO_NUMERO_PLANTAS) {
                if (plantaDestino > plantaActual) {
                    System.out.println("El montacargas sube de la planta " + plantaActual + " a la planta " + plantaDestino + ".");
                } else if (plantaDestino < plantaActual) {
                    System.out.println("El montacargas baja de la planta " + plantaActual + " a la planta " + plantaDestino + ".");
                } else {
                    System.out.println("El montacargas ya está en la planta " + plantaActual + ".");
                }

                plantaActual = plantaDestino;

                System.out.print("¿Deseas realizar otro viaje? (si/no): ");
                String respuestaUsuario = entrada.next(); 

                if (respuestaUsuario ==("no")) {
                    continuar = false;
                    System.out.println("Simulación finalizada.");
                }
            } else {
                System.out.println("Planta no válida. Por favor, elige una planta entre 0 y 10.");
            }
        }

        entrada.close();
    }
}
