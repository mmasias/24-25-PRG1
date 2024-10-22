import java.util.Scanner;

class ViajeMarco{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        double VELOCIDAD_MAXIMA = 15;
        double VELOCIDAD_MINIMA = 10;
        double TIEMPO_MAXIMO = 10;
        double TIEMPO_MINIMO = 8;
        double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        double PROBABILIDAD_MONO_ESCAPA = 0.15;
        double PROBABILIDAD_MONO_SE_CANSA = 0.25;

        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = 350;
        double probabilidadLluvia;
        double probabilidadseCansa, probabilidadseEscapa;
        boolean seHanEncontrado = false;
        int dias = 0;
        int avanceMadre = 80;

        probabilidadseCansa = Math.random();
        probabilidadseEscapa = Math.random();


        while(!seHanEncontrado){
            dias++;
            System.out.println("La distancia con la madre es: "+distanciaMarcoMadre);
            System.out.println("DIA "+dias);
            probabilidadLluvia = Math.random();
            velocidadMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA)+VELOCIDAD_MINIMA;
        
        
        if(probabilidadLluvia<=PROBABILIDAD_LLUVIA_FUERTE){
            System.out.println("Esta lloviendo");
            velocidadMarco = velocidadMarco*0.25;
        }else if (probabilidadLluvia>PROBABILIDAD_LLUVIA_FUERTE && probabilidadLluvia>PROBABILIDAD_LLUVIA_NORMAL){
            System.out.println("Buen tiempo");
            velocidadMarco = velocidadMarco*0.75;
        }else{
            System.out.println("Buen Tiempo");
        }

        if(probabilidadseCansa<PROBABILIDAD_MONO_SE_CANSA){
            System.out.println("El mono se canso");
            velocidadMarco = velocidadMarco*0.9;
        } 


        tiempoMarco = Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO)+VELOCIDAD_MINIMA;

        if(probabilidadseEscapa<PROBABILIDAD_MONO_ESCAPA){
            System.out.println("El mono se escapo");
            tiempoMarco = tiempoMarco-0.2;
        }  

        avanceMarco = velocidadMarco*tiempoMarco;
        

        System.out.println("Avanza: "+avanceMarco);

        distanciaMarcoMadre = distanciaMarcoMadre-avanceMarco+avanceMadre;

        seHanEncontrado = distanciaMarcoMadre<=0;
        
        if(distanciaMarcoMadre<=0){
            System.out.println("Se han encontrado!");
        } 

        }

        entrada.close();

    }
}