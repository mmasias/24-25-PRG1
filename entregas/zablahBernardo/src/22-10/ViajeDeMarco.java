import java.util.Scanner;

public class ViajeDeMarco {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        double velocidadMarco = Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA ;

        final double TIEMPO_MAXIMO = 8;
        final double TIEMPO_MINIMO = 10;
        double tiempoMarco = Math.random() * (TIEMPO_MAXIMO -TIEMPO_MINIMO) + TIEMPO_MINIMO ;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        double probabilidadLluvia = Math.random() ;

        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        double probabilidadMonoSeEscapa = Math.random() ;
        double probabilidadMonoSeCansa = Math.random() ;

        if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE){
            System.out.println("Esta lloviendo fuerte");
            velocidadMarco = velocidadMarco * 0.25;
        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL){
            System.out.println("Esta lloviendo normal");
            velocidadMarco = velocidadMarco * 0.75;
        } else{
            System.out.println("Buen tiempo");
        }

        if (probabilidadMonoSeCansa <= PROBABILIDAD_MONO_CANSADO){
            System.out.println("El mono se cansa!");
            velocidadMarco = velocidadMarco * 0.9;
        }
        if (probabilidadMonoSeEscapa <= PROBABILIDAD_MONO_ESCAPA){
            System.out.println("El mono se escapa!");
            tiempoMarco = tiempoMarco - 2;
        }


        double avanceMarco = velocidadMarco * tiempoMarco ;
        System.out.println("Marco Avanza " + avanceMarco + "Km") ;








        scanner.close();
    }
}
