import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {
        final int OPORTUNIDADES_ADIVINAR_NUMERO = 10;
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        final int DIFERENCIA_NUMEROS_CALIENTE = 5;
        final int DIFERENCIA_NUMEROS_TIBIO = 10;
        boolean estaJugando = true, haAdivinado = true, calienteAnterior = false;
        int numeroAleatorio, numeroUsuario;
        int oportunidades = 0;

        numeroAleatorio = pensarNumero(NUMERO_MAXIMO, NUMERO_MINIMO);
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes " + OPORTUNIDADES_ADIVINAR_NUMERO + " oportunidades para adivinar.");

        do { 
            oportunidades++;
            System.out.println("Intenta adivinar un número que esté entre el 1 y el 100: ");
            numeroUsuario = pedirNumero();
            haAdivinado = adivinaNumero(numeroAleatorio, numeroUsuario);
            if (numeroUsuario < NUMERO_MINIMO || numeroUsuario > NUMERO_MAXIMO) {
                System.out.println("El número elegido tiene que estar en el rango 1 y 100. Inténtelo de nuevo.");
            } else {
                if (haAdivinado) {
                    System.out.println("Has adivinado el número!");
                    estaJugando = false;
                }
                if (!haAdivinado) {
                    darPista(numeroAleatorio, numeroUsuario, DIFERENCIA_NUMEROS_CALIENTE, DIFERENCIA_NUMEROS_TIBIO);
                    if (calienteAnterior == true && esCaliente(numeroAleatorio, numeroUsuario)) {
                        numeroAleatorio = hacerTrampa(numeroAleatorio);
                    }
                    calienteAnterior = esCaliente(numeroAleatorio, numeroUsuario);
                }
            }
            
        } while (estaJugando && oportunidades < OPORTUNIDADES_ADIVINAR_NUMERO);

        if (!haAdivinado) {
            System.out.println("Lo siento, no has adivinado el número. Era: " + numeroAleatorio);
        }
    }  

    private static int pensarNumero(int maximo, int minimo) {
        int numeroAleatorio = (int)(Math.random() * (maximo - minimo + 1)) + minimo;
        return numeroAleatorio;
    }

    private static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        return numero;
    }

    private static boolean adivinaNumero (int numeroAleatorio, int numeroUsuario) {
        return numeroAleatorio == numeroUsuario;
    }

    private static void darPista (int numeroAleatorio, int numeroUsuario, int caliente, int tibio) {
        int diferenciaNumeros = Math.abs(numeroAleatorio - numeroUsuario);
        if (diferenciaNumeros <= caliente) {
            System.out.println("Caliente");
        } else if (diferenciaNumeros <= tibio) { 
            System.out.println("Tibio");
        } else {
            System.out.println("Frío");
        }
    }
    
    private static boolean esCaliente (int numeroAleatorio, int numeroUsuario) {
        int diferenciaNumeros = Math.abs(numeroAleatorio - numeroUsuario);
        return diferenciaNumeros <= 5;
    }

    private static int hacerTrampa (int numeroAleatorio) {
        int signo = Math.random() < 0.5 ? -1 : 1;
        int numeroTrampa = (int)(Math.random() * 5 + 1) * signo;
        numeroAleatorio = numeroAleatorio + numeroTrampa;
        System.out.println("Achís!");
        return numeroAleatorio;
    }
}
