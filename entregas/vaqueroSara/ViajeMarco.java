import java.util.Scanner;

public class ViajeMarco {

    public static void main(String[] args) {

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;

        final double VELOCIDADMADREMAX = 9;
        final double VELOCIDADMADREMIN = 6;

        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;

        final double TIEMPOMADREMAX = 9;
        final double TIEMPOMADREMIN = 6;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;

        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;

        double distanciaMarco = 0;
        double distanciaMadre = 350;

        boolean posVerMadre = false;
        double verMadre = 0;

        int dia = 1;

        System.out.println("BIENVENIDO AL VIAJE DE MARCO");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        do {

            double velocidadMadre = Math.random() * ((VELOCIDADMADREMAX - VELOCIDADMADREMIN + 1) + VELOCIDADMADREMIN);
            double tiempoMadre = Math.random() * ((TIEMPOMADREMAX - TIEMPOMADREMIN + 1) + TIEMPOMADREMIN);

            double velocidadMarco = Math.random() * ((VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA + 1) + VELOCIDAD_MINIMA);
            double tiempoMarco = Math.random() * ((TIEMPO_MAXIMO - TIEMPO_MINIMO + 1) + TIEMPO_MINIMO);

            double probabilidadLluvia = Math.random();
            double probabilidadLluviaMadre = Math.random();

            double probabilidad_mono_secansa = Math.random();
            double probabilidad_mono_seescapa = Math.random();

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

            if (probabilidadLluviaMadre < 0.1) {
                velocidadMadre = velocidadMadre * 0.50;
            } else if (probabilidadLluviaMadre < 0.30) {
                velocidadMadre = velocidadMadre * 0.75;
            } else

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

            double avanceMarco = (int) (velocidadMarco * tiempoMarco);
            double avanceMadre = (int) (velocidadMadre * tiempoMadre);

            System.out.println("Marco caminó " + avanceMarco + " km/h.");

            dia = dia + 1;
            distanciaMarco = distanciaMarco + avanceMarco;
            distanciaMadre = distanciaMadre + avanceMadre;

            if (distanciaMadre - distanciaMarco <= 50) {
                posVerMadre = true;
            } else {
            }

            if (posVerMadre = true) {
                verMadre = Math.random();
            } else

            if (verMadre <= 0.5) {
                distanciaMarco = distanciaMarco + 25;
            } else {
                distanciaMarco = distanciaMarco;
            }

            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();

        } while (distanciaMarco < distanciaMadre);
        System.out.println("Marco se ha encontrado con su madre.");
    }
}
