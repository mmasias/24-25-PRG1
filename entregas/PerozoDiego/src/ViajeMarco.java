package src;

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
        final double PROBABILIDAD_MONO_SE_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;

        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = 350;
        double probabilidadLluvia;
        double probabilidadCansado, probabilidadEscapa;
        boolean seHanEncontrado = false;
        int dias=0;


        while(!seHanEncontrado) {
            dias++;
            System.out.println("La madre de Marco esta a: " + distanciaMarcoMadre );

        probabilidadLluvia = Math.random();

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        velocidadMarco = Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA + 1) + VELOCIDAD_MINIMA;

        probabilidadEscapa = Math.random();
        if (probabilidadEscapa < PROBABILIDAD_MONO_SE_ESCAPA) {
            System.out.println("El mono se te escapoooooo");
            velocidadMarco = velocidadMarco - 2;
        }
        
        probabilidadCansado = Math.random();
        if (probabilidadCansado < PROBABILIDAD_MONO_SE_CANSA) {
            System.out.println("El mono se te cansa papi, cargalo");
            velocidadMarco = velocidadMarco * 0.9;
        }

        if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("¡Ha llovido muchísimo!");
            velocidadMarco = velocidadMarco * 0.25;
        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Ha llovido un poco");
            velocidadMarco = velocidadMarco * 0.75;
        } else {
            System.out.println("Ha hecho un buen día");
        }

        tiempoMarco = Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO + 1) + TIEMPO_MINIMO;
        avanceMarco = velocidadMarco * tiempoMarco;

        System.out.println("Avanza: " + avanceMarco);
        seHanEncontrado = !(distanciaMarcoMadre>=0);
        entrada.nextLine();
        
    }
    entrada.close();
}
}
