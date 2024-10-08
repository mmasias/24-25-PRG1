import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;
        final int LIMITE_INFERIOR = 0;
        final int LIMITE_SUPERIOR = 4;

        final String PIEDRA_DESCRIPTOR = "Piedra";
        final String  PAPEL_DESCRIPTOR = "Papel";
        final String TIJERA_DESCRIPTOR = "Tijera";
        final String ERROR = "Opción no válida";

        int eleccion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Juguemos a piedra, papel o tijera!");
        System.out.println("Elige: 1 para Piedra, 2 para Papel y 3 para Tijera");
        eleccion = scanner.nextInt();
        String descriptor;
        descriptor = eleccion <= LIMITE_INFERIOR ? ERROR
        : eleccion == PIEDRA ? PIEDRA_DESCRIPTOR
        : eleccion == PAPEL ? PAPEL_DESCRIPTOR
        : eleccion == TIJERA ?  TIJERA_DESCRIPTOR
        : eleccion >= LIMITE_SUPERIOR ? ERROR : ERROR;

        System.out.println("Tu eleccion: " + descriptor);

        int randomNumber = (int)(Math.random() * 3) + 1;
        String eleccionRandom;

        eleccionRandom = randomNumber <= LIMITE_INFERIOR ? ERROR
        : randomNumber == PIEDRA ? PIEDRA_DESCRIPTOR
        : randomNumber == PAPEL ? PAPEL_DESCRIPTOR
        : randomNumber == TIJERA ?  TIJERA_DESCRIPTOR
        : randomNumber >= LIMITE_SUPERIOR ? ERROR : ERROR;

        System.out.println("Elección del ordenador: " + eleccionRandom);

        String resultado;
        resultado =  (eleccion <= LIMITE_INFERIOR || eleccion >= LIMITE_SUPERIOR || 
        randomNumber <= LIMITE_INFERIOR || randomNumber >= LIMITE_SUPERIOR) ? "No hay resultado"
        : eleccion == randomNumber ? "Empate"
        : (eleccion == PIEDRA && randomNumber == PAPEL) || (eleccion == PAPEL && randomNumber == TIJERA) || 
          (eleccion == TIJERA && randomNumber == PIEDRA) ? "Pierdes"
        : "Ganas";

        System.out.println(resultado);
        scanner.close();
    }
}
