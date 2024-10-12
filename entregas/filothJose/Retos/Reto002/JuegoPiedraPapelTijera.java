import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;

        final String PIEDRA_DESCRIPTOR = "Piedra";
        final String PAPEL_DESCRIPTOR = "Papel";
        final String TIJERA_DESCRIPTOR = "Tijera";
        final String ERROR = "Opción no válida";

        int eleccion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Juguemos a piedra, papel o tijera!");
        System.out.println("Elige: 1 para Piedra, 2 para Papel y 3 para Tijera");
        eleccion = scanner.nextInt();

        String descriptor;
        descriptor = eleccion == PIEDRA ? PIEDRA_DESCRIPTOR
                : eleccion == PAPEL ? PAPEL_DESCRIPTOR
                : eleccion == TIJERA ? TIJERA_DESCRIPTOR
                : ERROR;

        if (descriptor.equals(ERROR)) {
            System.out.println("Opción no válida. Por favor, elige un número entre 1 y 3.");
            scanner.close();
            return;
        }

        System.out.println("Tu elección: " + descriptor);

        int randomNumber = (int) (Math.random() * 3) + 1;
        String eleccionRandom;

        eleccionRandom = randomNumber == PIEDRA ? PIEDRA_DESCRIPTOR
                : randomNumber == PAPEL ? PAPEL_DESCRIPTOR
                : randomNumber == TIJERA ? TIJERA_DESCRIPTOR
                : ERROR;

        System.out.println("Elección del ordenador: " + eleccionRandom);

        String resultado;
        resultado = eleccion == randomNumber ? "Empate"
                : (eleccion == PIEDRA && randomNumber == PAPEL) ? "Pierdes"
                : (eleccion == PIEDRA && randomNumber == TIJERA) ? "Ganas"
                : (eleccion == PAPEL && randomNumber == PIEDRA) ? "Ganas"
                : (eleccion == PAPEL && randomNumber == TIJERA) ? "Pierdes"
                : (eleccion == TIJERA && randomNumber == PIEDRA) ? "Pierdes"
                : (eleccion == TIJERA && randomNumber == PAPEL) ? "Ganas"
                : "No hay resultado";

        System.out.println(resultado);

        scanner.close();
    }
}
