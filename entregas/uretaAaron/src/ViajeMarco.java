<<<<<<< HEAD
import java.util.Scanner;

public class ViajeMarco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double VELOCIDADA_MAXIMA = 15;
        final double VELOCIDADA_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;

        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = 350;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabilidadSeEscapa;
        boolean seHanEncontrado = false;
        int dias = 0;

        while (seHanEncontrado) {
            dias++;
            System.out.println("La distancia con la madre es: ");
        }
        probabilidadLluvia = Math.random();
        velocidadMarco = Math.random() * (VELOCIDADA_MAXIMA - VELOCIDADA_MINIMA + 1) + VELOCIDADA_MINIMA;

        if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("Lluvia fuerte");
            velocidadMarco = velocidadMarco * 0.25;
        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Lluvia fina");
            velocidadMarco = velocidadMarco * 0.75;
        } else {
            System.out.println("Buen tiempo");
        }

        probabilidadSeCansa = Math.random();
        if (probabilidadSeCansa <= PROBABILIDAD_MONO_SE_CANSA) {
            System.out.println("El mono se cansa!");
            velocidadMarco = velocidadMarco * 0.9;
        }

        tiempoMarco = Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;

        probabilidadSeEscapa = Math.random();
        if (probabilidadSeEscapa <= PROBABILIDAD_MONO_ESCAPA) {
            System.out.println("El mono se escapa!");
            tiempoMarco = tiempoMarco - 2;
        }
        avanceMarco = velocidadMarco * tiempoMarco;

        System.out.println("Avanza: " + avanceMarco);
        entrada.nextLine();
        entrada.close();
    }
}
=======
import java.util.Scanner;

public class ViajeMarco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double VELOCIDADA_MAXIMA = 15;
        final double VELOCIDADA_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;

        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = 350;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabilidadSeEscapa;
        boolean seHanEncontrado = false;
        int dias = 0;

        while (seHanEncontrado) {
            dias++;
            System.out.println("La distancia con la madre es: ");
        }
        probabilidadLluvia = Math.random();
        velocidadMarco = Math.random() * (VELOCIDADA_MAXIMA - VELOCIDADA_MINIMA + 1) + VELOCIDADA_MINIMA;

        if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("Lluvia fuerte");
            velocidadMarco = velocidadMarco * 0.25;
        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Lluvia fina");
            velocidadMarco = velocidadMarco * 0.75;
        } else {
            System.out.println("Buen tiempo");
        }

        probabilidadSeCansa = Math.random();
        if (probabilidadSeCansa <= PROBABILIDAD_MONO_SE_CANSA) {
            System.out.println("El mono se cansa!");
            velocidadMarco = velocidadMarco * 0.9;
        }

        tiempoMarco = Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;

        probabilidadSeEscapa = Math.random();
        if (probabilidadSeEscapa <= PROBABILIDAD_MONO_ESCAPA) {
            System.out.println("El mono se escapa!");
            tiempoMarco = tiempoMarco - 2;
        }
        avanceMarco = velocidadMarco * tiempoMarco;

        System.out.println("Avanza: " + avanceMarco);
        entrada.nextLine();
        entrada.close();
    }
}
>>>>>>> ef3af5b9f99eb16f2a5aa142174ccf672f999fe9
