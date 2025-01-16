import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaElNumeroVersionSimplificada {
    public static void main (String args[]){

        final int NUMERO_INTENTOS = 5;
        final int NUMERO_MAXIMO = 50;
        final int NUMERO_MINIMO = 1;
        int numeroJugador = 0;
        boolean estaJugando = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de Adivinar el Numero (Versión Simplificada)");

        int numeroOrdenador = (int)(Math.random()*(NUMERO_MAXIMO-NUMERO_MINIMO)+NUMERO_MINIMO);

        while (estaJugando) {
            
            int numeroSecreto = random.nextInt(50) + 1;
            int intento;
            boolean adivinado = false;

            System.out.println("He pensado en un número entre 1 y 50. ¡Intenta adivinarlo!");

            while (!adivinado) {
                System.out.print("Introduce tu número: ");
                intento = scanner.nextInt();

                if (intento < numeroSecreto) {
                    System.out.println("El número es mayor.");
                } else if (intento > numeroSecreto) {
                    System.out.println("El número es menor.");
                } else {
                    adivinado = true;
                    System.out.println("¡Felicidades! Adivinaste el número.");
                }
            }
        }







    }
    
}
