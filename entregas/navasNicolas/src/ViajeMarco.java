import java.util.Scanner;

class ViajeMarco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;

        double distanciaMarcoMadre = 350;
        double velocidadMarco, tiempoMarco, avanceMarco;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabilidadSeEscapa;
        boolean seHanEncontrado = false;
        int dias = 0;
        double avanceMadre = 80;

        while(!seHanEncontrado){
            dias++;
            System.out.println("la distancia con la madre es" + distanciaMarcoMadre);

            probabilidadLluvia = Math.random();

            velocidadMarco = Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA;

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

            distanciaMarcoMadre -= avanceMarco;
            distanciaMarcoMadre += avanceMadre; 

            if (distanciaMarcoMadre <= 0) {
                seHanEncontrado = true;
                System.out.println("¡Marco ha encontrado a su madre!");
            }

            entrada.nextLine();
        
            
            }
            entrada.close();
    }
}
