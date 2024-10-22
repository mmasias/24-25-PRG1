import java.util.Scanner;

class ViajeMarco{

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

            final double VELOCIDAD_MAXIMA = 15;
            final double VELOCIDAD_MINIMA = 10;
            final double TIEMPO_MAXIMO = 10;
            final double TIEMPO_MINIMO = 8;
            final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
            final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
            final double PROBABILIDAD_MONO_ESCAPA = 0.15;
            final double PROBABILIDAD_MONO_CANSA = 0.25;
            final double DISTANCIA_MADRE_INICIAL =  350;

            double distanciaMadre;
            double distanciaEncuentro;
            double distanciaMarco;
            double velocidadMarco;
            double tiempoMarco;
            double avanceMarco;
            double probabilidadLluvia;
            double probabilidadMonoEscapa;
            double probabilidadMonoCansa;
            int dia;

            distanciaMadre = DISTANCIA_MADRE_INICIAL;
            distanciaEncuentro = DISTANCIA_MADRE_INICIAL;
            distanciaMarco = 0;
            dia = 1;

            while(distanciaEncuentro>0){
            dia = dia+1;
            distanciaMadre = distanciaMadre + 80;
            distanciaEncuentro = distanciaMadre - distanciaMarco;            
            probabilidadMonoCansa = Math.random();
            probabilidadMonoEscapa = Math.random();
            probabilidadLluvia = Math.random();

            velocidadMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA+1)+VELOCIDAD_MINIMA;

            System.out.println(dia);

            if(probabilidadLluvia<=PROBABILIDAD_LLUVIA_FUERTE){
                System.out.println("Lluvia fuerte");
                velocidadMarco = velocidadMarco*0.25;
            }else if(probabilidadLluvia<=PROBABILIDAD_LLUVIA_NORMAL){
                System.out.println("Lluvia fina");
                velocidadMarco = velocidadMarco * 0.75;
            }else{
                System.out.println("Buen tiempo");
            }

            tiempoMarco = Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO+1)+TIEMPO_MINIMO;

            if(probabilidadMonoEscapa<PROBABILIDAD_MONO_ESCAPA){
                System.out.println("El mono se escapa!!!");
                tiempoMarco = tiempoMarco-2;
            }

            if(probabilidadMonoCansa<PROBABILIDAD_MONO_CANSA){
                System.out.println("El mono se cansa. :(");
                velocidadMarco = velocidadMarco * 0.9;
            }
    
            avanceMarco = velocidadMarco*tiempoMarco;

            System.out.println("Marco avanza: " + avanceMarco);
        }
        
        entrada.close();
    }
}