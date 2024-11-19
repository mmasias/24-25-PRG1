import java.util.Scanner;

public class Marco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final int VELOCIDAD_P_MAX = 15;
        final int VELOCIDAD_P_MIN = 10;
        final int HORAS_MAX = 10;
        final int HORAS_MIN = 8;
        final double P_LLUVIA_FUERTE = 0.1;
        final double P_LLUVIA_NORMAL = 0.4;
        final double REDUCCION_VELOCIDAD_FUERTE = 0.25;
        final double REDUCCION_VELOCIDAD_NORMAL = 0.75;
        final double REDUCCION_VELOCIDAD_MONO = 0.9;
        final double P_ESCAPA_MONO = 0.15;
        final double P_CANSANCIO_MONO = 0.25;
        final double MAX_MADRE = 9;
        final double MIN_MADRE = 6;
        
        int dia = 1;


        double velocidadMarco, tiempoMarco, avanceMarco;
        double velocidadMama, tiempoMama, avanceMama;
        double probabilidadLluvia, probabilidadCansancio, probabilidadSeEscapa;
        double distanciaMarcoMadre = 350;

        boolean noSeHanEncontrado = false;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");
        do {
            System.out.println("DIA: " + dia);
            dia++;

            probabilidadLluvia = Math.random();
            probabilidadCansancio = Math.random();
            probabilidadSeEscapa = Math.random();

            velocidadMarco = Math.random() * (VELOCIDAD_P_MAX - VELOCIDAD_P_MIN + 1) - VELOCIDAD_P_MIN;

            if (probabilidadLluvia <=  P_LLUVIA_FUERTE) {
                velocidadMarco = velocidadMarco * REDUCCION_VELOCIDAD_FUERTE;
                System.out.println("Me ha llovido mucho");
            } else if (probabilidadLluvia <= P_LLUVIA_NORMAL) {
                velocidadMarco = velocidadMarco * REDUCCION_VELOCIDAD_NORMAL;
                System.out.println("Me ha llovido un poco");
            } else {
                System.out.println("Me ha hecho buen tiempo");
            }

            if (probabilidadCansancio <= P_CANSANCIO_MONO) {
                System.out.println("El mono se ha cansado!");
                velocidadMarco = velocidadMarco * REDUCCION_VELOCIDAD_MONO;
            }

            tiempoMarco = Math.random() * (HORAS_MAX - HORAS_MIN + 1) - HORAS_MIN;

            if (probabilidadSeEscapa <= P_ESCAPA_MONO) {
                System.out.println("El mono se ha escapado!");
                tiempoMarco = tiempoMarco - 2;
            }

            avanceMarco = velocidadMarco * tiempoMarco;

            velocidadMama = Math.random() * (MAX_MADRE - MIN_MADRE + 1) - MIN_MADRE;
            if (probabilidadLluvia <=  P_LLUVIA_FUERTE) {
                velocidadMama = velocidadMama * 0.5;
                System.out.println("A mamá le ha llovido mucho");
            } else if (probabilidadLluvia <= P_LLUVIA_NORMAL) {
                velocidadMama = velocidadMama * 0.25;
                System.out.println("A mamá le ha llovido un poco");
            } else {
                System.out.println("A mamá le ha hecho un buen día");
            }
            tiempoMama = Math.random() * (MAX_MADRE - MIN_MADRE + 1) - MIN_MADRE;
            avanceMama =  velocidadMama * tiempoMama;

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMama;
            noSeHanEncontrado = !(distanciaMarcoMadre > 0);

            System.out.println("He avanzado " + tiempoMarco + " horas a " + velocidadMarco + " Km/h, recorriendo " + avanceMarco  + " km");
            System.out.println("Mama pudo avanzar en " + tiempoMama + " horas a " + velocidadMama + "Km/h, recorriendo" + avanceMama  + " km");
            System.out.println("Al final del día " + dia +  "la distancia entre Marco y su Madre es de " + distanciaMarcoMadre + " Km");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

            inputUsuario = entrada.nextLine();
            
        } while (noSeHanEncontrado);

        if (!noSeHanEncontrado) {
            System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
            System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
        }

        entrada.close();
    }
}
