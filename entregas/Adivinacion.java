import java.util.Random;
import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroPensado = random.nextInt(100) + 1; 
        int intentosRestantes = 10;
        boolean haGanado = false; 

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("Tienes 10 intentos para adivinarlo. ¡Buena suerte!");

        while (intentosRestantes > 0 && !haGanado) {
            System.out.println("\nIntentos restantes: " + intentosRestantes);
            System.out.print("Introduce tu número: ");
            int numeroUsuario = scanner.nextInt();
            int diferencia = Math.abs(numeroPensado - numeroUsuario);

            if (numeroUsuario == numeroPensado) {
                System.out.println("¡Felicidades! Has adivinado el número en el intento " + (11 - intentosRestantes) + ".");
                haGanado = true; 
            } else {
                
                if (numeroUsuario < numeroPensado) {
                    System.out.println("Pista: El número es mayor.");
                } else {
                    System.out.println("Pista: El número es menor.");
                }

                
                if (diferencia <= 5) {
                    System.out.println("¡Caliente! Estás muy cerca.");
                } else if (diferencia <= 10) {
                    System.out.println("Tibio. Te estás acercando.");
                } else {
                    System.out.println("Frío. Aún estás lejos.");
                }

                
                if (diferencia <= 5 && intentosRestantes <= 9) { 
                    numeroPensado = ajustarNumeroPensado(numeroPensado, random);
                    System.out.println("¡Atchís! El ordenador ha estornudado.");
                }
            }

            
            intentosRestantes--;
        }

        
        if (!haGanado) {
            System.out.println("\nLo siento, se han agotado los intentos. El número era: " + numeroPensado);
        }

        scanner.close();
    }

    
    private static int ajustarNumeroPensado(int numeroActual, Random random) {
        int ajuste = random.nextInt(5) + 1; 
        if (random.nextBoolean()) {
            numeroActual += ajuste; 
        } else {
            numeroActual -= ajuste; 
        }
        
        return Math.max(1, Math.min(100, numeroActual));
    }
}
