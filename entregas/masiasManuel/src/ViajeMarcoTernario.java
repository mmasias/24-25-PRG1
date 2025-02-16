import java.util.Scanner;

class ViajeMarcoTernario {
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

        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = 350;
        double probabilidadLluvia;

        boolean seHanEncontrado = false;
        int dias = 0;

        while (!seHanEncontrado) {
            dias++;

            velocidadMarco = Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA;
            tiempoMarco = Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;

            probabilidadLluvia = Math.random();
            double correccionPorLluvia = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 0.25 : probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL ? 0.75 : 1;
            String descripcionClima = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? "Lluvia fuerte" : probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL ? "Lluvia" : "Buen clima";

            double probabilidadSeCansa = Math.random();
            double correccionPorMono = probabilidadSeCansa <= PROBABILIDAD_MONO_SE_CANSA ? 0.9 : 1;
            String descripcionMono = correccionPorMono != 1 ? "El mono se cansa!" : "";

            double probabilidadSeEscapa = Math.random();
            double correccionTiempoPorMono = probabilidadSeEscapa <= PROBABILIDAD_MONO_ESCAPA ? 2 : 0;
            descripcionMono += correccionTiempoPorMono > 0 ? "El mono se escapa!" : "";

            double avanceMadre = 80;
            avanceMarco = (velocidadMarco * correccionPorLluvia * correccionPorMono) * (tiempoMarco - correccionTiempoPorMono);
            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

            seHanEncontrado = distanciaMarcoMadre <= 0;

            System.out.println("DIA " + dias);
            System.out.println("La distancia con la madre es: " + distanciaMarcoMadre);
            System.out.println(descripcionClima);
            System.out.println(descripcionMono);
            System.out.println("Avanza: " + avanceMarco);
            System.out.println((!seHanEncontrado ? "Aun no" : "Por fin") + " se han encontrado!");
            System.out.println("=====================================================");
            entrada.nextLine();
        }
        System.out.println("después de " + dias + " dias!!!");
        entrada.close();
    }
}
