
import java.util.Scanner;

public class ViajeMarco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROBABILIDAD_MONO_ESPCAPA = 0.15;
        final double PROBABILIDAD_MONO_SE_CANSA = 0.25;


        double distanciaMarcoMadre = 350;
        double avanceMadre = 80;
        double velocidadMarco, tiempoMarco, avanceMarco;
        double probabilidadLluvia;
        double probabilidadSeCansa, probabilidadEscapa ;

        boolean seHanEncontrado= false;

        int dias = 0;

        
        while (!seHanEncontrado) {

            dias = dias + 1;

            System.out.println("DIA:"+ dias);
            System.out.println("La distancia con la madre es:" + distanciaMarcoMadre);

            probabilidadSeCansa = Math.random();
            probabilidadEscapa = Math.random();   
            probabilidadLluvia = Math.random();


            velocidadMarco = (Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA)+VELOCIDAD_MINIMA);

            if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                System.out.println("Lluvia fuerte");
                velocidadMarco = velocidadMarco * 0.25;
            }else if (probabilidadLluvia<=PROBABILIDAD_LLUVIA_NORMAL) {
                System.out.println("Lluvia fina");
                velocidadMarco = velocidadMarco * 0.75;
            }else {
                System.out.println("Buen tiempo");
            }

            if (probabilidadSeCansa <= PROBABILIDAD_MONO_SE_CANSA) {
                System.out.println("El mono se cansa!");
                velocidadMarco = velocidadMarco * 0.9;
            }

            tiempoMarco = (Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO)+TIEMPO_MINIMO);

            if(probabilidadEscapa <= PROBABILIDAD_MONO_ESPCAPA){
                System.out.println("El mono se escapa!");
                tiempoMarco = tiempoMarco - 2;
            }

            avanceMarco = velocidadMarco * tiempoMarco;

            System.out.println("Avanza Marco: "+ avanceMarco);

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;
            

            seHanEncontrado = !(distanciaMarcoMadre>0);

            entrada.nextLine();
        }
        dias = dias + 1;
        System.out.println("DIA:"+ dias);
        System.out.println("Marco ha encontrado a su madre!");
        entrada.close();

    }
}
    