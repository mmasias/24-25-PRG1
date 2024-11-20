import java.util.Scanner;

public class AdivinaNumero {
 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int NUMERO_TURNOS = 10;
        int numeroMaquina = generarNumeroAleatorio();

        int turno = 0;
        boolean adivinado = false;

       
        while (turno < NUMERO_TURNOS && !adivinado) {
            turno++;
            System.out.print("Dime un número: ");
            int numeroUsuario = entrada.nextInt();

            if (numeroUsuario == numeroMaquina) {
                System.out.println("¡Has adivinado el número!");
                adivinado = true;  
            } else {
                if (numeroUsuario < numeroMaquina) {
                    System.out.println("Es mayor.");
                } else {
                    System.out.println("Es menor.");
                }

                
                int diferencia = Math.abs(numeroMaquina - numeroUsuario);
                if (diferencia <= 5) {
                    System.out.println("¡CALIENTE!");
                } else if (diferencia <= 10) {
                    System.out.println("TIBIO");
                } else {
                    System.out.println("FRÍO");
                }
            }
        }

        if (!adivinado) {
            System.out.println("Fin del juego. El número era: " + numeroMaquina);
        }
    }

    
    private static int generarNumeroAleatorio() {
        final int MINIMO = 1;
        final int MAXIMO = 100;
        
        return (int) (Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
    }
}
