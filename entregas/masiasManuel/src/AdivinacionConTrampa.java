import java.util.Random;
import java.util.Scanner;

public class AdivinacionConTrampa {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int intentosMaximos = 10;
        int intentosRealizados = 0;
        boolean adivinado = false;
        int calienteContador = 0;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He pensado en un número entre 1 y 100. Tienes 10 oportunidades para adivinarlo.");

        while (intentosRealizados < intentosMaximos && !adivinado) {
            System.out.print("Introduce tu adivinanza (intento " + (intentosRealizados + 1) + " de " + intentosMaximos + "): ");
            int adivinanza = scanner.nextInt();
            intentosRealizados++;

            if (adivinanza == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en el intento " + intentosRealizados + "!");
            } else {
                int diferencia = Math.abs(adivinanza - numeroSecreto);
                String pista;

                if (diferencia <= 5) {
                    pista = "Caliente";
                    calienteContador++;
                } else if (diferencia <= 10) {
                    pista = "Tibio";
                    calienteContador = 0;
                } else {
                    pista = "Frío";
                    calienteContador = 0;
                }

                System.out.println("Pista: " + pista);

                if (calienteContador >= 2) {
                    System.out.println("¡Cuidado! Estás muy cerca. Voy a cambiar el número secreto...");
                    numeroSecreto = cambiarNumeroSecreto(numeroSecreto, random);
                    calienteContador = 0;
                }
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, no has adivinado el número. El número era: " + numeroSecreto);
        }

        scanner.close();
    }

    private static int cambiarNumeroSecreto(int numeroSecreto, Random random) {
        int cambio = random.nextInt(5) + 1;
        int nuevoNumero = numeroSecreto + cambio * (random.nextBoolean() ? 1 : -1);

        if (nuevoNumero < 1) {
            nuevoNumero = 1;
        } else if (nuevoNumero > 100) {
            nuevoNumero = 100;
        }

        System.out.println("El número secreto ha sido cambiado a: " + nuevoNumero);
        return nuevoNumero;
    }
}