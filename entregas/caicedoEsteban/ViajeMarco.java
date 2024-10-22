package entregas.caicedoEsteban;

import java.util.Scanner;

class ViajeMarco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LUUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA = 0.4;
        final double PROBABILIDAD_SE_CANSA = 0.25;
        final double PROBABILIDAD_SE_ESCAPA = 0.15;

        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = 350;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabilidadSeEscapa;
        boolean seHanEncontrado = false;
        int dias = 0;
        int avanceMadre = 80; 

        while (seHanEncontrado){probabilidadLluvia = Math.random();
            dias++;

        velocidadMarco = (Math.random() * VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA + 1) + VELOCIDAD_MINIMA;

        if (probabilidadLluvia <= PROBABILIDAD_LUUVIA_FUERTE) {
            System.out.println("Lluvia Fuerte");
            velocidadMarco = velocidadMarco * 0.25;

        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA) {
            System.out.println("Lluvia Suave");
            velocidadMarco = velocidadMarco * 0.75;
        } else {
            System.out.println("Hace un buen clima");
        }
        if (probabilidadSeCansa <= PROBABILIDAD_SE_CANSA) {
            System.out.println("El mono se cansó");
            velocidadMarco = velocidadMarco * 0.9;
        }

        probabilidadLluvia = Math.random();
        probabilidadSeCansa = Math.random();
        probabilidadSeEscapa = Math.random();

        tiempoMarco = (Math.random() * (TIEMPO_MAXIMO - TIEMPO_MINIMO + 1)) + TIEMPO_MINIMO;
        
        if (probabilidadSeEscapa <= PROBABILIDAD_SE_ESCAPA) {
            System.out.println("El mono se está escapanado");
            tiempoMarco = tiempoMarco - 2;
        }

        avanceMarco = velocidadMarco * tiempoMarco;

        distanciaMarcoMadre = distanciaMarcoMadre-avanceMarco+avanceMadre;
        seHanEncontrado = distanciaMarcoMadre<=0; 
        entrada.nextLine();
    }

        entrada.close();
    }
}