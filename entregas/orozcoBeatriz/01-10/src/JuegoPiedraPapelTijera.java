import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;
        final int LIMITE_INFERIOR = 0;
        final int LIMITE_SUPERIOR = 4;
        final int MAX = 3;
        final int MIN = 1;

        final String PIEDRA_DESCRIPTOR = "Piedra";
        final String  PAPEL_DESCRIPTOR = "Papel";
        final String TIJERA_DESCRIPTOR = "Tijera";
        final String ERROR = "Opción no válida";

        int eleccion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Juguemos a piedra, papel o tijera!");
        
        do {
          System.out.println("Elige: " + PIEDRA + " para Piedra, " + PAPEL + " para Papel y " +  TIJERA + " para Tijera");
          eleccion  = scanner.nextInt();
          if (eleccion <= LIMITE_INFERIOR || eleccion >= LIMITE_SUPERIOR) {
            System.out.println(ERROR);
          }
          } while (eleccion <= LIMITE_INFERIOR || eleccion >= LIMITE_SUPERIOR);

        String descriptor;
        descriptor = eleccion == PIEDRA ? PIEDRA_DESCRIPTOR
        : eleccion == PAPEL ? PAPEL_DESCRIPTOR
        : eleccion == TIJERA ?  TIJERA_DESCRIPTOR : ERROR;

        System.out.println("Tu eleccion: " + descriptor);

        int randomNumber = (int)(Math.random() * (MAX - MIN) + 1) + MIN;
        String eleccionRandom;

        eleccionRandom = randomNumber == PIEDRA ? PIEDRA_DESCRIPTOR
        : randomNumber == PAPEL ? PAPEL_DESCRIPTOR
        : randomNumber == TIJERA ?  TIJERA_DESCRIPTOR : ERROR;

        System.out.println("Elección del ordenador: " + eleccionRandom);

        String resultado;
        resultado =  (eleccion <= LIMITE_INFERIOR || eleccion >= LIMITE_SUPERIOR || 
        randomNumber <= LIMITE_INFERIOR || randomNumber >= LIMITE_SUPERIOR) ? "No hay resultado"
        : eleccion == randomNumber ? "Empate"
        : (eleccion == PIEDRA && randomNumber == PAPEL) || (eleccion == PAPEL && randomNumber == TIJERA) || 
          (eleccion == TIJERA && randomNumber == PIEDRA) ? "Pierdes :("
        : "Ganas!! :D";

        System.out.println(resultado);
        scanner.close();
    }
}
