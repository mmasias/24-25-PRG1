import java.util.Scanner;

class ViajeMarco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double distanciaMarcoMadre = 350;
        boolean seHanEncontrado = false;
        int dias = 0;

        while (!seHanEncontrado) {
            dias++;
            System.out.println("La distancia con la madre es: " + distanciaMarcoMadre);
            System.out.println("DIA " + dias);

            double velocidadMarco = calcularVelocidadMarco();
            double tiempoMarco = calcularTiempoMarco();

            double probabilidadLluvia = Math.random();
            velocidadMarco = ajustarVelocidadPorLluvia(velocidadMarco, probabilidadLluvia);
            velocidadMarco = ajustarVelocidadPorMonoCansado(velocidadMarco);
            tiempoMarco = ajustarTiempoPorMonoEscapado(tiempoMarco);

            double avanceMarco = calcularAvanceMarco(velocidadMarco, tiempoMarco);

            System.out.println("Avanza: " + avanceMarco);

            distanciaMarcoMadre = actualizarDistancia(distanciaMarcoMadre, avanceMarco);

            seHanEncontrado = distanciaMarcoMadre <= 0;
            entrada.nextLine();
        }
        System.out.println("Marco se ha encontrado con su madre!");
    }

    static double calcularVelocidadMarco() {
        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        
        return Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA;
    }

    static double calcularTiempoMarco() {    
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;

        return Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO;
    }

    static double ajustarVelocidadPorLluvia(double velocidad, double probabilidadLluvia) {
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        
        if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("Lluvia fuerte");
            return velocidad * 0.25;
        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Lluvia fina");
            return velocidad * 0.75;
        } else {
            System.out.println("Buen tiempo");
            return velocidad;
        }
    }

    static double ajustarVelocidadPorMonoCansado(double velocidad) {
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;

        if (Math.random() <= PROBABILIDAD_MONO_SE_CANSA) {
            System.out.println("El mono se cansa!");
            return velocidad * 0.9;
        }
        return velocidad;
    }

    static double ajustarTiempoPorMonoEscapado(double tiempo) {
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;

        if (Math.random() <= PROBABILIDAD_MONO_ESCAPA) {
            System.out.println("El mono se escapa!");
            return tiempo - 2;
        }
        return tiempo;
    }

    static double calcularAvanceMarco(double velocidad, double tiempo) {
        return velocidad * tiempo;
    }

    static double actualizarDistancia(double distanciaMarcoMadre, double avanceMarco) {
        final double AVANCE_MADRE = 80;

        return distanciaMarcoMadre - avanceMarco + AVANCE_MADRE;
    }
}
