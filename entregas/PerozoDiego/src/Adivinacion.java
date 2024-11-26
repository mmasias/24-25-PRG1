package src;

import java.util.Scanner;

class Adivinacion {
    public static void main(String[] args) {
        int numeroMaquina = (int) (Math.random() * 100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 10;
        boolean hizoTrampa = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el número que estoy pensando (entre 1 y 100). Tienes 10 intentos.");

        while (intentos > 0) {
            System.out.print("\nIntroduce tu número: ");
            int numeroUsuario = scanner.nextInt();
            intentos--;

            if (numeroUsuario == numeroMaquina) {
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + (10 - intentos) + ".");
                break;
            } else {
                int diferencia = Math.abs(numeroMaquina - numeroUsuario);

                if (diferencia <= 5) {
                    System.out.println("¡Caliente!");
                } else if (diferencia <= 10) {
                    System.out.println("Tibio.");
                } else {
                    System.out.println("Frío.");
                }

                if (numeroUsuario < numeroMaquina) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }

                // Hacer trampa si está "caliente" dos veces seguidas
                if (!hizoTrampa && diferencia <= 5) {
                    numeroMaquina = ajustarNumero(numeroMaquina);
                    hizoTrampa = true;
                    System.out.println("*ACHÚ* (La máquina hizo trampa)");
                }

                if (intentos == 0) {
                    System.out.println("¡Se acabaron los intentos! El número era: " + numeroMaquina);
                }
            }
        }
        scanner.close();
    }

    static int ajustarNumero(int numero) {
        int ajuste = (int) (Math.random() * 5) + 1; // Cambio aleatorio entre 1 y 5
        return Math.random() < 0.5 ? Math.max(1, numero - ajuste) : Math.min(100, numero + ajuste);
    }
}
