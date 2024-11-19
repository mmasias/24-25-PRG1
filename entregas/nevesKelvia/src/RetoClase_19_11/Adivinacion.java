import java.util.Scanner;

public class Adivinacion {

    private static final int NUMERO_TURNOS = 10;

    public static void main(String[] args) {
  
        int numeroSecreto = pensarNumero();
        int intentos = 0;
        boolean adivinado = false;
        int contadorCaliente = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego 'Adivina el número'!");
        System.out.println("El número secreto está entre 1 y 100.");
        System.out.println("Tienes " + NUMERO_TURNOS + " intentos para adivinarlo.");
  
        do {
            int numeroUsuario = adivinarNumero(scanner, intentos);
            intentos++;

            if (numeroUsuario == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + intentos + ".");
            } else {
           
                contadorCaliente = darPista(numeroSecreto, numeroUsuario, contadorCaliente);

          
                if (contadorCaliente >= 2) {
                    numeroSecreto = hacerTrampa(numeroSecreto);
                    contadorCaliente = 0;  
                }
            }
        } while (!adivinado && intentos < NUMERO_TURNOS);

     
        if (!adivinado) {
            System.out.println("Lo siento, no adivinaste el número. El número secreto era " + numeroSecreto + ".");
        }

        scanner.close();
    }
   
    public static int pensarNumero() {
        return (int)(Math.random() * 100) + 1;
    }
    
    public static int adivinarNumero(Scanner scanner, int intentos) {
        System.out.print("Introduce tu número (intento " + (intentos + 1) + " de " + NUMERO_TURNOS + "): ");
        return scanner.nextInt();
    }
 
    public static int darPista(int numeroSecreto, int numeroUsuario, int contadorCaliente) {
        int diferencia = Math.abs(numeroSecreto - numeroUsuario);

        if (diferencia <= 5) {
            System.out.println("¡Caliente!");
            contadorCaliente++;
        } else if (diferencia <= 10) {
            System.out.println("¡Tibio!");
            contadorCaliente = 0;
        } else {
            System.out.println("¡Frío!");
            contadorCaliente = 0;
        }

        if (numeroUsuario > numeroSecreto) {
            System.out.println("Es menor.");
        } else if (numeroUsuario < numeroSecreto) {
            System.out.println("Es mayor.");
        }

        return contadorCaliente;
    }

    public static int hacerTrampa(int numeroSecreto) {
        System.out.println("¡Achoo! ¡El número secreto está cambiando!");
        int cambio = (int)(Math.random() * 5) + 1;
  
        if (Math.random() < 0.5) {

        numeroSecreto -= cambio;
        if (numeroSecreto < 1) {
        numeroSecreto = 1;  
    }
        } else {
   
        numeroSecreto += cambio;
        if (numeroSecreto > 100) {
        numeroSecreto = 100;  
    }
}
        System.out.println("Ahora el número secreto es diferente.");
        return numeroSecreto;
    }
}
