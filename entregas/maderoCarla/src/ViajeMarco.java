import java.until.Scanner;

class ViajeMarco{
    public static void main(String[], args){
        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4; //se suman lluvia fuerte y debil 
        final double PROBABILIDAD_MONO_ESCAPA =0.15;
        final double PROBABILIDAD_MONO_SE_CANSA =0.25;
   
        double velocidadMarco, tiempoMarco, avanceMarco;
        double distanciaMarcoMadre = 350;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabolidadSeEscapa;
        boolean sehanEncontrado = false;
        int dias = 0;
        double avanceMadre = 88;

        while (! sehanEncontrado) {

            dias++;
            System.out.println(x:"Ña distancia de la madre es: +distanciaMarcoMadre");
            System.out.println("Dia: " +dias);
            probabilidadLluvia = Math.random();
            velocidadMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA)+VELOCIDAD_MINIMA;
            
            if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE){
                System.out.println("Lluvia fuerte");
                velocidadMarco = velocidadMarco * 0.25;

            }else if(probabilidadLluvia<=PROBABILIDAD_LLUVIA_NORMAL){
                System.out.println("Lluvia fina");
                velocidadMarco = velocidadMarco * 0.75;
             }else{
                System.out.println("Buen tiempo");
            }

            probabilidadSeCansa = Math.random();
            if(probabolidadSeCansa <= PROBABILIDAD_MONO_SE_CANSA){
                System.out.println("El mono se cansa!");
                velocidadMarco = velocidadMarco * 0.9;
            }

            tiempoMarco = Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO)+TIEMPO_MINIMO;

            probabolidadSeEscapa = Math.random();
            if(probabolidadSeEscapa <= PROBABILIDAD_MONO_ESCAPA){
                System.out.println("El mono se escapa!");
                tiempoMarco = tiempoMarco -2;
            }

            avanceMarco =  velocidadMarco * tiempoMarco;

            System.out.println("Avanza:" +avanceMarco);

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco+
            sehanEncontrado = !(distanciaMarcoMadre>0);
        }

        entrada nextLine();
        entrada.close();

    }
}