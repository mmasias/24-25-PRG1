import java.util.Scanner;

class Repaso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int posicion = 0;

        final String CAMELLO = ",--,^";
        final String PISTA = "XXX";

        final int MAXIMO = 4;
        final int MINIMO = 1;
        final int FINAL = 20;

        boolean haFinalizado = false;
        int turno = 0;

        while (!haFinalizado) {
            turno++;
            int avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            System.out.println("Turno: " + turno);
            System.out.println(PISTA.repeat(posicion) + CAMELLO);
            posicion = posicion + avance;
            haFinalizado = posicion >= FINAL;
            entrada.nextLine();

        }
        entrada.close();

    }

}
