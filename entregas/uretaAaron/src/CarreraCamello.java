<<<<<<< HEAD

import java.util.Scanner;

class CarreraCamello {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int posicionPrimero = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ",--,^";
        final String PISTA = ".. ..";

        final int MAXIMO = 4;
        final int MINIMO = 1;
        final int FINAL = 20;

        boolean enCarrera = true;
        int turno = 0;
        int avance = 0;

        while (enCarrera) {
            turno++;

            avance = (int) Math.random() * (MAXIMO - MINIMO + 1) + MINIMO;

            avance = (int) Math.random() * (MAXIMO - MINIMO + 1) + MINIMO;
            posicionSegundo = posicionSegundo + avance;

            System.out.println("===".repeat(20));
            System.out.println("Turno: " + turno);
            System.out.println(PISTA.repeat(posicionPrimero) + CAMELLO);
            System.out.println(PISTA.repeat(posicionSegundo) + CAMELLO);
            enCarrera = posicionPrimero < FINAL;
            entrada.nextLine();

        }

        System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primero"
                : (posicionPrimero == posicionSegundo ? "empate" : "segundo")));
      
                

    }
}
=======

import java.util.Scanner;

class CarreraCamello {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int posicionPrimero = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ",--,^";
        final String PISTA = ".. ..";

        final int MAXIMO = 4;
        final int MINIMO = 1;
        final int FINAL = 20;

        boolean enCarrera = true;
        int turno = 0;
        int avance = 0;

        while (enCarrera) {
            turno++;

            avance = (int) Math.random() * (MAXIMO - MINIMO + 1) + MINIMO;

            avance = (int) Math.random() * (MAXIMO - MINIMO + 1) + MINIMO;
            posicionSegundo = posicionSegundo + avance;

            System.out.println("===".repeat(20));
            System.out.println("Turno: " + turno);
            System.out.println(PISTA.repeat(posicionPrimero) + CAMELLO);
            System.out.println(PISTA.repeat(posicionSegundo) + CAMELLO);
            enCarrera = posicionPrimero < FINAL;
            entrada.nextLine();

        }

        System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primero"
                : (posicionPrimero == posicionSegundo ? "empate" : "segundo")));
        entrada.close();
    }
}
>>>>>>> ef3af5b9f99eb16f2a5aa142174ccf672f999fe9
