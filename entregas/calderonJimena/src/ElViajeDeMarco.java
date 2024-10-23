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
        double distanciaMarcoMadre = 350;
        double propabilidadLluvia;
        double propabilidadSeCansa, propabilidadSeEscapa;
        boolean seHanEncontrado = false;
        int dias = 0;
        double avanceMadre = 80;
         

        while (seHanEncontrado) {
            dias++; 
            System.out.println("La distancia con la madre es: " + distanciaMarcoMadre);
            System.out.println("Dia" + dias);
            propabilidadLluvia = Math.random();

            velocidadMarco = (int) (Math.random() * VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA;
            tiempoMarco = Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;

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

            propabilidadSeEscapa = Math.random();
            if (propabilidadSeEscapa <= PROPABILIDAD_MONO_SE_ESCAPA) {
                System.out.println("El mono se escapo");
                tiempoMarco = tiempoMarco - 2;
            }

            avanceMarco = velocidadMarco * tiempoMarco;

            System.out.println("Avanza: " + avanceMarco);

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

            seHanEncontrado = !(distanciaMarcoMadre > 0);

            entrada.nextLine();
        }

        entrada.close();
    }
}