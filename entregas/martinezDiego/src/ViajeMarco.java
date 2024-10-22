import java.util.Scanner;

public class ViajeMarco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TRAYECTO_MAXIMO = 10;
        final double TRAYECTO_MINIMO = 8;
        final double LLUVIA_FUERTE = 0.1;
        final double LLUVIA_NORMAL = 0.4;
        final double MONO_CANSADO = 0.25;
        final double MONO_FUGADO = 0.15;
        final double MONO_CANSADO_Y_FUGADO = 0.0375;
        final double DISTANCIA_INICIAL = 350;

        double velocidadMarco, trayectoMarco, avanceMarco;
        double probabilidadLluvia = Math.random();
        double probabilidadMono = Math.random();
        double distanciaMarco = 0;
        double distanciaMadre = DISTANCIA_INICIAL;
        double avanceMadre = 80;
        boolean seHanEncontrado = false;
        int dia = 0;

        while (!seHanEncontrado) {
            System.out.println("Enter para avanzar los dias");
            scanner.nextLine();
            dia++;
            System.out.println("DIA " + dia);

            velocidadMarco = Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA + 1) + VELOCIDAD_MINIMA;
            trayectoMarco = Math.random() * (TRAYECTO_MAXIMO - TRAYECTO_MINIMO + 1) + TRAYECTO_MINIMO;

            if (probabilidadLluvia <= LLUVIA_FUERTE) {
                velocidadMarco = velocidadMarco * 0.25;
                System.out.println("Ha llovido fuerte");
            } else if (probabilidadLluvia <= LLUVIA_NORMAL) {
                velocidadMarco = velocidadMarco * 0.75;
                System.out.println("Ha llovido normal");
            } else
                System.out.println("Ha hecho buen tiempo");

            if (probabilidadMono <= MONO_CANSADO) {
                velocidadMarco = velocidadMarco * 0.9;
                System.out.println("El mono se ha cansado");
            } else if (probabilidadMono <= MONO_FUGADO) {
                trayectoMarco = trayectoMarco - 2;
                System.out.println("El mono se ha fugado");
            } else
                System.out.println("El mono ha estado tranquilo");
            if (probabilidadMono <= MONO_CANSADO_Y_FUGADO) {
                velocidadMarco = velocidadMarco * 0.9;
                trayectoMarco = trayectoMarco - 2;
                System.out.println("El mono se ha cansado y se ha fugado");
            }

            avanceMarco = velocidadMarco * trayectoMarco;
            distanciaMarco = distanciaMarco + avanceMarco;
            System.out.println(" Marco ha avanzado" + distanciaMarco + "km");

            distanciaMadre = distanciaMadre + avanceMadre;
            System.out.println(" La madre ha avanzado " + distanciaMadre + "km");

            if (distanciaMarco >= distanciaMadre) {
                seHanEncontrado = true;
                System.out.println("Marco y la madre se han encontrado");
            }

        }
        scanner.close();

    }

}
