import java.util.Scanner;

public class Adivinacion {

    public static void main(String[] args) {
        int numeroSecreto = (int)(Math.random() * 100) + 1;  
        int intentos = 0;  
        int numeroUsuario = 0;  
        boolean adivinado = false;  

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego 'Adivina el número'!");
        System.out.println("El número secreto está entre 1 y 100.");
        System.out.println("Tienes 10 intentos para adivinarlo.");

        do {
            System.out.print("Introduce tu número (intento " + (intentos + 1) + " de 10): ");
            numeroUsuario = scanner.nextInt();
            intentos++;  

            if (numeroUsuario == numeroSecreto) {
                adivinado = true; 
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + intentos + ".");

            } else {
                
                int diferencia = Math.abs(numeroSecreto - numeroUsuario); 

                if (diferencia <= 5) {
                    System.out.println("¡Caliente!");
                } else if (diferencia <= 10) {
                    System.out.println("¡Tibio!");
                } else {
                    System.out.println("¡Frío!");
                }

            if (numeroUsuario > numeroSecreto) {
                System.out.println("Es menor.");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("Es mayor.");
            } else {
                adivinado = true;  
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + intentos + ".");
            }

        } while (!adivinado && intentos < 10); 
        
        if (!adivinado) {
            System.out.println("Lo siento, no adivinaste el número. El número secreto era " + numeroSecreto + ".");
        }

        scanner.close();
    }

}
