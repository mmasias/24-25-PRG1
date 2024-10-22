import java.util.Scanner;

class ElViajeDeMarco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROPABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROPABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROPABILIDAD_MONO_SE_ESCAPA = 0.15;
        final double PROPABILIDAD_MONO_SE_CANSA = 0.25;

        double velocidadMarco, tiempoMarco, avanceMarco;
        double propabilidadLluvia;
        double propabilidadSeCansa, propabilidadSeEscapa;

        propabilidadLluvia = Math.random();

        velocidadMarco = (int) (Math.random() * VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA;

        if (propabilidadLluvia <= PROPABILIDAD_LLUVIA_FUERTE) {
            System.out.println("Lluvia fuerte");
            velocidadMarco = velocidadMarco * 0.25;
        } else if (propabilidadLluvia <= PROPABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Lluvia fina");
            velocidadMarco = velocidadMarco * 0.75;
        } else {
            System.out.println("Buen tiempo");
        }

        propabilidadSeCansa = Math.random();
        if (propabilidadSeCansa <= PROPABILIDAD_MONO_SE_CANSA) {
            System.out.println("El mono se cansa");
            velocidadMarco = velocidadMarco * 0.9;
        }

        tiempoMarco = Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;

        propabilidadSeEscapa = Math.random();
        if (propabilidadSeEscapa <= PROPABILIDAD_MONO_SE_ESCAPA) {
            System.out.println("El mono se escapo");
            tiempoMarco = tiempoMarco - 2;
        }
        avanceMarco = velocidadMarco * tiempoMarco;

        System.out.println("Avanza: " + avanceMarco);

        entrada.close();
    }
}