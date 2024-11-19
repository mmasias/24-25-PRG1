import java.util.Scanner;

class ViajeMarco {

    private static final double VELOCIDAD_MAXIMA = 15;
    private static final double VELOCIDAD_MINIMA = 10;
    private static final double TIEMPO_MAXIMO = 10;
    private static final double TIEMPO_MINIMO = 8;
    private static final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
    private static final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
    private static final double PROBABILIDAD_MONO_ESCAPA = 0.15;
    private static final double PROBABILIDAD_MONO_SE_CANSA = 0.25;

    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        double distanciaMarcoMadre = 350;
        double avanceMadre = 88;
        boolean seHanEncontrado = false;
        int dias = 0;

        while (!seHanEncontrado) {
            dias++;
            System.out.println("DIA " + dias);
            System.out.println("La distancia de la madre es: " + distanciaMarcoMadre);

            double velocidadMarco = calcularVelocidad();
            double tiempoMarco = calcularTiempo();

            velocidadMarco = ajustarPorClima(velocidadMarco);
            tiempoMarco = ajustarPorMono(tiempoMarco);

            double avanceMarco = calcularAvance(velocidadMarco, tiempoMarco);
            System.out.println("Marco avanza: " + avanceMarco);

            distanciaMarcoMadre -= avanceMarco;
            seHanEncontrado = actualizarEstado(distanciaMarcoMadre);

            entrada.nextLine(); // Pausa para continuar al siguiente día.
        }
        entrada.close();
    }

    private static double calcularVelocidad() {
        return Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA;
    }

    private static double calcularTiempo() {
        return Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;
    }

    private static double ajustarPorClima(double velocidadMarco) {
        double probabilidadLluvia = Math.random();

        if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("Lluvia fuerte");
            return velocidadMarco * 0.25;
        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Lluvia fina");
            return velocidadMarco * 0.75;
        } else {
            System.out.println("Buen tiempo");
            return velocidadMarco;
        }
    }

    private static double ajustarPorMono(double tiempoMarco) {
        double probabilidadSecansa = Math.random();
        double probabilidadSeEscapa = Math.random();

        if (probabilidadSecansa < PROBABILIDAD_MONO_SE_CANSA) {
            System.out.println("El mono se cansa!");
            tiempoMarco *= 0.9;
        }

        if (probabilidadSeEscapa <= PROBABILIDAD_MONO_ESCAPA) {
            System.out.println("El mono se escapa!");
            tiempoMarco -= 2;
        }

        return tiempoMarco;
    }

    private static double calcularAvance(double velocidad, double tiempo) {
        return velocidad * tiempo;
    }

    private static boolean actualizarEstado(double distanciaMarcoMadre) {
        if (distanciaMarcoMadre <= 0) {
            System.out.println("¡Marco ha encontrado a su madre!");
            return true;
        }
        return false;
    }
}
