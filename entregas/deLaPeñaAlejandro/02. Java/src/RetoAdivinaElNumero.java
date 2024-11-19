import java.util.Scanner;

public class RetoAdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int MINIMO = 1, MAXIMO = 100;
        final int MINIMO_TRAMPA = 1, MAXIMO_TRAMPA = 5;
        final int CALIENTE = 5;
        final int TIBIO = 10;
        final int FRIO = 10;
        final int CALIENTE_TRAMPA = 2;
        final double MITAD = 0.5;

        int numeroSecreto = (int) (Math.random() * MAXIMO) + MINIMO; 
        final int NUMERO_INTENTOS = 5; 
        int calientesConsecutivos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego 'Adivina el número'!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("Tienes " + NUMERO_INTENTOS + " oportunidades para adivinarlo.");

        for (int intento = 1; intento <= NUMERO_INTENTOS; intento++) {
            System.out.print("Intento " + intento + ": Ingresa un número: ");
            int usuario = scanner.nextInt();

            if (usuario == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + intento + ".");
                adivinado = true;
            } else {
                int diferencia = Math.abs(numeroSecreto - usuario);

                if (diferencia <= CALIENTE) {
                    System.out.println("Caliente");
                    calientesConsecutivos++;
                } else if (diferencia <= TIBIO) {
                    System.out.println("Tibio");
                    calientesConsecutivos = 0;
                } else if (diferencia > FRIO) {
                    System.out.println("Frío");
                    calientesConsecutivos = 0;
                }
                
                if (usuario < numeroSecreto) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }

                if (calientesConsecutivos >= CALIENTE_TRAMPA) {
                    int cambio = (int) (Math.random() * MAXIMO_TRAMPA) + MINIMO_TRAMPA; 
                    if (Math.random() < MITAD) { 
                        numeroSecreto += cambio;
                    } else {
                        numeroSecreto -= cambio;
                    }

                    System.out.println("¡Achoo!");
                    calientesConsecutivos = 0;
                }
            }
        }
        
        if (!adivinado) {
            System.out.println("Lo siento, no adivinaste el número. El número secreto era: " + numeroSecreto);
        }
        scanner.close();
    }
}   