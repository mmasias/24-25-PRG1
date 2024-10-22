import java.util.Scanner;


public class ViajeMarco {

    public static void main(String[] args) {

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;

        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;

        double velocidadMarco = Math.random() * ((VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA + 1) + VELOCIDAD_MINIMA);
        double tiempoMarco = Math.random() * ((TIEMPO_MAXIMO - TIEMPO_MINIMO + 1) + TIEMPO_MINIMO);

        double avanceMarco = velocidadMarco * tiempoMarco;
        double probabilidadLluvia = Math.random();

        double probabilidad_mono_secansa = Math.random();
        double probabilidad_mono_seescapa = Math.random();

        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;

        double distanciaMarco = 0;
        double distanciaMadre = 80;

        int dia = 0;

        System.out.println("BIENVENIDO AL VIAJE DE MARCO");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        do {
            System.out.println("DIA " + dia);

            if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                System.out.println("Lluvia fuerte");
                velocidadMarco = velocidadMarco * 0.25;
            } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
                System.out.println("LLuvia fina");
                velocidadMarco = velocidadMarco * 0.75;
            } else {
                System.out.println("Buen tiempo");
            }

            if (probabilidad_mono_secansa <= PROBABILIDAD_MONO_CANSADO) {
                System.out.println("El mono se cansa.");
                velocidadMarco = velocidadMarco * 0.9;
            } else {
                System.out.println("El mono no se ha cansado.");
            }

            if (probabilidad_mono_seescapa <= PROBABILIDAD_MONO_ESCAPA) {
                System.out.println("El mono  se ha escapado. Marco ha perdido 2 horas buscándole.");
                tiempoMarco = tiempoMarco - 2;
            } else {
                System.out.println("El mono no se escapó.");
            }
            
            Scanner scanner = new Scanner(System.in);
            String continuar = scanner.nextLine();

            dia = dia +1;

        } while (distanciaMarco != distanciaMadre);
    }
}
