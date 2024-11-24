import java.util.Scanner;

class ViajeMarco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.3; 
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;
        final double DISTANCIA_INICIAL = 350;

        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = DISTANCIA_INICIAL;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabilidadSeEscapa;
        boolean seHanEncontrado = false;
        int dias = 0;

        double avanceMadre, velocidadMadre, tiempoMadre;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (!seHanEncontrado) {
            dias++;
            System.out.println("\nDIA " + dias);
            System.out.println("La distancia con la madre es: " + distanciaMarcoMadre + " Km");
            probabilidadLluvia = Math.random();

            velocidadMarco = Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA;
            tiempoMarco = Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;

            if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                System.out.println("¡Ha llovido muchísimo!");
                velocidadMarco *= 0.25; 
            } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE + PROBABILIDAD_LLUVIA_NORMAL) {
                System.out.println("Ha llovido un poco.");
                velocidadMarco *= 0.75; 
            } else {
                System.out.println("Ha hecho un buen día.");
            }

            probabilidadSeCansa = Math.random();
            if (probabilidadSeCansa <= PROBABILIDAD_MONO_SE_CANSA) {
                System.out.println("El mono se cansa!");
                velocidadMarco *= 0.9; 
            }

            probabilidadSeEscapa = Math.random();
            if (probabilidadSeEscapa <= PROBABILIDAD_MONO_ESCAPA) {
                System.out.println("¡Ha perdido tiempo buscando a Amedio!");
                tiempoMarco -= 2;
            }

            avanceMarco = velocidadMarco * tiempoMarco;
            System.out.println("Avance: " + tiempoMarco + " horas a " + velocidadMarco + " Km/h recorriendo " + avanceMarco + " Km");


            velocidadMadre = Math.random() * (9 - 6) + 6; 
            tiempoMadre = Math.random() * (9 - 6) + 6; 

            double probabilidadLluviaMadre = Math.random();
            if (probabilidadLluviaMadre <= PROBABILIDAD_LLUVIA_FUERTE) {
                System.out.println("A mamá le ha hecho un día de lluvia muy fuerte.");
                velocidadMadre *= 0.5; 
            } else if (probabilidadLluviaMadre <= PROBABILIDAD_LLUVIA_FUERTE + PROBABILIDAD_LLUVIA_NORMAL) {
                System.out.println("A mamá le ha hecho un día de lluvia.");
                velocidadMadre *= 0.75; 
            } else {
                System.out.println("A mamá le ha hecho un buen día.");
            }

            avanceMadre = velocidadMadre * tiempoMadre;
            System.out.println("Mama pudo avanzar " + tiempoMadre + " horas a " + velocidadMadre + " Km/h recorriendo " + avanceMadre + " Km");

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

            if (distanciaMarcoMadre < 50 && Math.random() <= 0.5) {
                System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                avanceMarco += 25;
            }

            seHanEncontrado = distanciaMarcoMadre <= 0;

            entrada.nextLine();
        }

        if (seHanEncontrado) {
            System.out.println("************************************************************");
            System.out.println("Al final del día " + dias + " Marco encuentra a su madre!!!");
            System.out.println("************************************************************");
        }

        entrada.close();
    }
}
