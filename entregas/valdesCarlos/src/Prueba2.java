import java.util.Scanner;

class Prueba2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MARCO_MINIMA = 10;
        final double VELOCIDAD_MARCO_MAXIMA = 15;
        final double TIEMPO_MARCO_MINIMO = 8;
        final double TIEMPO_MARCO_MAXIMO = 10;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.10;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.30;
        final double PROBABILIDAD_ESCAPE_AMEDIO = 0.15;
        final double PROBABILIDAD_CANSANCIO_AMEDIO = 0.25;
        final double AVANCE_MADRE = 80;

        double velocidadMarco;
        double tiempoMarco;
        double distanciaMarco;
        double distanciaMadre = 350;
        double probabilidadLluvia;
        double probabilidadAmedio;

        int dia = 0;
        boolean seEncontraron = false;

        while(!seEncontraron) {
            dia ++;
            velocidadMarco = (Math.random()*(VELOCIDAD_MARCO_MAXIMA-VELOCIDAD_MARCO_MINIMA+1)+VELOCIDAD_MARCO_MINIMA);
            tiempoMarco = (Math.random()*(TIEMPO_MARCO_MAXIMO-TIEMPO_MARCO_MINIMO+1)+TIEMPO_MARCO_MAXIMO);
            distanciaMarco = velocidadMarco * tiempoMarco;
            probabilidadLluvia = Math.random();
            probabilidadAmedio = Math.random();
            System.out.println("Dia "+dia);

            if(probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                velocidadMarco *= 0.75;
                System.out.println("Ha llovido mucho!");
            } else if(probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
                velocidadMarco *= 0.75;
                System.out.println("Ha llovido!");
            } else {
                System.out.println("Hace buen clima!");
            }

            if(probabilidadAmedio <= PROBABILIDAD_ESCAPE_AMEDIO) {
                tiempoMarco -= 2;
                System.out.println("El mono Amedio se ha escapado");

            } else if(probabilidadAmedio <= PROBABILIDAD_CANSANCIO_AMEDIO) {
                velocidadMarco *= 0.10;
                System.out.println("El mono Amedio se ha cansado");
            }

            System.out.println("Marco avanza " + distanciaMarco + " km");
            distanciaMadre = distanciaMadre - distanciaMarco + AVANCE_MADRE;
            System.out.println("La distancia entre Marco y su madre es de: "+ distanciaMadre + " km");
            seEncontraron = distanciaMadre <= 0;
            
            entrada.nextLine();


        }

        entrada.close();
    }
}