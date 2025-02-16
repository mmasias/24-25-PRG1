package src;

import java.util.Scanner;

class CarreraCamellos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int posicionPrimero = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ",--,^";
        final int MAXIMO = 2;
        final int MINIMO = 1;
        final int FINAL = 30;

        boolean enCarrera = true;
        int turno = 0;

        while (enCarrera) {
            turno++;

            int avancePrimero = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;
            posicionPrimero += avancePrimero;
            int avanceSegundo = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;
            posicionSegundo += avanceSegundo;

            System.out.println("=========================================");
            System.out.println("Turno: " + turno);
            System.out.println("Camello 1: " + "=".repeat(posicionPrimero) + CAMELLO);
            System.out.println("Camello 2: " + "=".repeat(posicionSegundo) + CAMELLO);

            if (posicionPrimero >= FINAL || posicionSegundo >= FINAL) {
                enCarrera = false;
            }
            entrada.nextLine();
        }

        if (posicionPrimero >= FINAL && posicionSegundo >= FINAL) {
            System.out.println("¡EMPATE!");
        } else if (posicionPrimero >= FINAL) {
            System.out.println("Ha ganado el primer camello.");
        } else {
            System.out.println("Ha ganado el segundo camello.");
        }

        entrada.close();
    }
}