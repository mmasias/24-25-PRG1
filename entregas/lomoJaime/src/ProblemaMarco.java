import java.util.Scanner;
public class ProblemaMarco {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        final double VELCIDAD_MAXIMA = 15;
        final double VELCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;


        double velocidadMarco, tiempoMarco, avanceMarco;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabilidadSeEscapa;
        
        
        probabilidadLluvia = Math.random();
        probabilidadSeCansa = Math.random();
        probabilidadSeEscapa = Math.random();
        velocidadMarco = Math.random()*(VELCIDAD_MAXIMA-VELCIDAD_MINIMA+1)+VELCIDAD_MINIMA;
        
        if (probabilidadLluvia<=PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("Lluvia fuerte");
            velocidadMarco = velocidadMarco *0.25;
        } else if (probabilidadLluvia>PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Lluvia fina");
            velocidadMarco = velocidadMarco *0.75;
        }else{
            System.out.println("Buen tiempo");
        }   


        if (probabilidadSeCansa<=PROBABILIDAD_MONO_SE_CANSA) {
            System.out.println("El mono se cansa");
            velocidadMarco = velocidadMarco *0.9;
        }

        tiempoMarco = Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO+1)+TIEMPO_MAXIMO;

        if(probabilidadSeEscapa<=PROBABILIDAD_MONO_ESCAPA){
            System.out.println("El mono se escapa");
            tiempoMarco = tiempoMarco - 2;
        }

        avanceMarco = velocidadMarco*tiempoMarco;
        
        System.out.println("Avanza "+ avanceMarco);

        entrada.close();
    }   
    }



