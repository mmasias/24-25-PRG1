import java.util.Scanner;

public class Camellos 
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int posicionPrimero = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ",--,^";
        final String PISTA = "....";

        final int AVANCE_MAXIMO_CAMELLO = 4;
        final int AVANCE_MINIMO_CAMELLO = 1;
        final int FINAL = 30;

        boolean enCarrera = true;
        int turno = 0;
        int avance;

        while (enCarrera) {
            turno++;

            avance = (int) (Math.random() * AVANCE_MAXIMO_CAMELLO - AVANCE_MINIMO_CAMELLO + 1) + AVANCE_MINIMO_CAMELLO;
            posicionPrimero = posicionPrimero + avance;

            avance = (int) (Math.random() * AVANCE_MAXIMO_CAMELLO - AVANCE_MINIMO_CAMELLO + 1) + AVANCE_MINIMO_CAMELLO;
            posicionSegundo = posicionSegundo + avance;

            System.out.println("===".repeat(FINAL + 1));
            System.out.println("Turno:" + turno);
            System.out.println(PISTA.repeat(posicionPrimero) + CAMELLO);
            System.out.println(PISTA.repeat(posicionSegundo) + CAMELLO);
            enCarrera = posicionPrimero < FINAL;
            entrada.nextLine();
        }

        if (posicionPrimero > posicionSegundo) {
            System.out.println("Ha ganado el primer camello");
        }else if (posicionPrimero < posicionSegundo) {
            System.out.println("Ha ganado el segundo camello");
        }else
        System.out.println("EMPATE");


    }
}
