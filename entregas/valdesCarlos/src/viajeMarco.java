import java.util.scanner;

class viajeMarco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 0;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.4;

        double velocidadMarco;
        double tiempoMarco;
        double avanceMarco;
        double probabilidadLluvia;
        
        velocidadMarco = (Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA+1)+VELOCIDAD_MINIMA);
        tiempoMarco = (Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO+1)+TIEMPO_MINIMO);
        avanceMarco = velocidadMarco*tiempoMarco;

        System.out.println("Avanza: " + avanceMarco);
        
    }
}