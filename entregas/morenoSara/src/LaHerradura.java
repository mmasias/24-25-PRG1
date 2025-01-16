import java.util.Scanner;

public class LaHerradura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int puntosNaneh = 0;
        int puntosArmand= 0;
        String dondeCaeArmand;
        String dondeCaeNaneh;

        int numeroTiro = 0;

        

        boolean jugando = true;

        while (jugando) {
            
        
            double tiroNaneh;
            double tiroArmand;

            tiroNaneh = Math.random();
            tiroArmand = Math.random();

            

            puntosArmand = repartirPuntosArmand(puntosArmand, numeroTiro);
            puntosNaneh = repartirPuntosNaneh(puntosNaneh, puntosArmand, numeroTiro);
            dondeCaeArmand = lugarDeCaidaArmand(puntosArmand);
            dondeCaeNaneh = lugarDeCaidaNaneh(numeroTiro);
            numeroTiro ++;
            System.out.println(""); 
            System.out.println("---------------------");
            System.out.println("Tiro nª:"+ numeroTiro);
            System.out.println("Armand ha caido en :"+ tiroArmand);
            System.out.println("Naneh ha caido en :"+ tiroNaneh);
            System.out.println("Armand ha caido en :"+ dondeCaeArmand);
            System.out.println("Naneh ha caido en :"+ dondeCaeNaneh);
            System.out.println("Puntos:");
            System.out.println("    -Naneh:"+ puntosNaneh );
            System.out.println("    -Armand:" + puntosArmand);
            System.out.println("---------------------");
            System.out.println("");
            jugando = sigueJugando(puntosArmand, puntosNaneh, jugando);
            
            entrada.nextLine();
            
        }
        entrada.close();
    }
    static int repartirPuntosArmand ( int tiroArmand,int tiroNaneh){

        final double PRIMER_TRAMO = 0.1;

        final int PUNTOS_PARA_ACIERTO = 5;
        final int PUNTOS_PARA_GANADOR = 3;
        final int PUNTOS_PARA_EMPATE = 1;

       
        int puntosArmand = 0;

        if (tiroArmand <= PRIMER_TRAMO) {
            puntosArmand = puntosArmand + PUNTOS_PARA_ACIERTO;
        }
        
        if (tiroArmand < tiroNaneh) {
            puntosArmand = puntosArmand + PUNTOS_PARA_GANADOR;
        }

        if (tiroArmand == tiroNaneh) {
            puntosArmand = puntosArmand - PUNTOS_PARA_EMPATE;
        }

        return puntosArmand;
    }
    static int repartirPuntosNaneh  (int puntosNaneh,int tiroArmand,int tiroNaneh){

        final double PRIMER_TRAMO = 0.1;

        final int PUNTOS_PARA_ACIERTO = 5;
        final int PUNTOS_PARA_GANADOR = 3;
        final int PUNTOS_PARA_EMPATE = 1;
    
       

        if (tiroNaneh <= PRIMER_TRAMO) {
            puntosNaneh = puntosNaneh + PUNTOS_PARA_ACIERTO;
        }
        
        if (tiroNaneh < tiroArmand) {
            puntosNaneh = puntosNaneh + PUNTOS_PARA_GANADOR;
        }

        if (tiroArmand == tiroNaneh) {
            puntosNaneh = puntosNaneh - PUNTOS_PARA_EMPATE;
        }

        return puntosNaneh;
    }
    
    static String lugarDeCaidaArmand (int tiroArmand){
        final double PRIMER_TRAMO = 0.1;
        final double SEGUNDO_TRAMO = 0.22;
        final double TERCER_TRAMO = 1;

        String dondeCaeArmand = "";

        if (tiroArmand <= PRIMER_TRAMO) {
            dondeCaeArmand = "Primer tramo";
        }else if (tiroArmand <= SEGUNDO_TRAMO) {
            dondeCaeArmand = "Segundo tramo";
        }else{
            dondeCaeArmand = "Tercer tramo";
        }

        return dondeCaeArmand;
    }
    static String lugarDeCaidaNaneh (int tiroNaneh){
        final double PRIMER_TRAMO = 0.1;
        String dondeCaeNaneh = "";
        
        final double SEGUNDO_TRAMO = 0.22;
        final double TERCER_TRAMO = 1;

        if (tiroNaneh <=  PRIMER_TRAMO  ) {
            dondeCaeNaneh = "Primer tramo";
        }else if (tiroNaneh <= SEGUNDO_TRAMO) {
            dondeCaeNaneh = "Segundo tramo";
        }else{
            dondeCaeNaneh = "Tercer tramo";
        }

        return dondeCaeNaneh;
    }

    static boolean sigueJugando (int puntosArmand, int puntosNaneh,boolean jugando){
        final int MAXIMO_DE_PUNTOS = 50;
        if (puntosArmand >= MAXIMO_DE_PUNTOS || puntosNaneh >= MAXIMO_DE_PUNTOS) {
            jugando = false;
        }
        return jugando;
    }
}
