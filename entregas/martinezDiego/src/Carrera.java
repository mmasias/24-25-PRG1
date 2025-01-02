import java.util.Scanner;

public class Carrera {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int posicionPrimero = 0;
            int posicionSegundo = 0;

            final String PISTA = "....";
            final String CAMELLO = "...^''";

            final int MAXIMO = 4;
            final int MINIMO = 1;
            final int FINAL = 30;
            boolean enCarrera = true;

            int turno = 0;

            while (enCarrera) {
                turno++;

                int avance = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;
                posicionPrimero = posicionPrimero + avance;

                avance = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;
                posicionSegundo = posicionSegundo + avance;

                System.out.println("===".repeat(FINAL + 1));
                System.out.println("turno" + turno);
                System.out.println(PISTA.repeat(posicionPrimero) + CAMELLO);
                System.out.println(PISTA.repeat(posicionSegundo) + CAMELLO);
                enCarrera = posicionPrimero < FINAL;
                scanner.nextLine();

            }
            System.out.println("ha ganado el " + (posicionPrimero > posicionSegundo) );
        }
    }
   
    

}