import java.util.Scanner;

public class LaHerradura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double PRIMER_TRAMO = 0.1;
        final double SEGUNDO_TRAMO = 0.22;
        final double TERCER_TRAMO = 1;

        final int MAXIMO_DE_PUNTOS = 50;

        final int PUNTOS_PARA_ACIERTO = 5;
        final int PUNTOS_PARA_GANADOR = 3;
        final int PUNTOS_PARA_EMPATE = 1;

        int puntosNaneh = 0;
        int puntosArmand = 0;

        int numeroTiro = 0;

        String dondeCaeNaneh = "";
        String dondeCaeArmand = "";

        boolean jugando = true;

        while (jugando) {
            
        
            double tiroNaneh;
            double tiroArmand;

            tiroNaneh = Math.random();
            tiroArmand = Math.random();

            numeroTiro ++;
            if (tiroArmand == tiroNaneh) {

                puntosArmand = puntosArmand + PUNTOS_PARA_EMPATE;
                puntosNaneh = puntosNaneh + PUNTOS_PARA_EMPATE;

                if (tiroArmand <= PRIMER_TRAMO) {
                    dondeCaeArmand = "Primer tramo";
                }else if (tiroArmand <= SEGUNDO_TRAMO) {
                    dondeCaeArmand = "Segundo tramo";
                }else{
                    dondeCaeArmand = "Tercer tramo";
                }

                if (tiroNaneh <= PRIMER_TRAMO) {
                    dondeCaeNaneh = "Primer tramo";
                }else if (tiroNaneh <= SEGUNDO_TRAMO) {
                    dondeCaeNaneh = "Segundo tramo";
                }else{
                    dondeCaeNaneh = "Tercer tramo";
                }
            }else{
                if (tiroArmand <= PRIMER_TRAMO) {
                    dondeCaeArmand = "Primer tramo";
                    puntosArmand = puntosArmand + PUNTOS_PARA_ACIERTO;
                }else if (tiroArmand <= SEGUNDO_TRAMO) {
                    dondeCaeArmand = "Segundo tramo";
                }else{
                    dondeCaeArmand = "Tercer tramo";
                }
       
                if (tiroNaneh <=  PRIMER_TRAMO  ) {
                    dondeCaeNaneh = "Primer tramo";
                    puntosNaneh = puntosNaneh + PUNTOS_PARA_ACIERTO;
                }else if (tiroNaneh<= SEGUNDO_TRAMO) {
                    dondeCaeNaneh = "Segundo tramo";
                }else{
                    dondeCaeNaneh = "Tercer tramo";
                }

                if (tiroArmand < tiroNaneh) {
                    puntosArmand = puntosArmand + PUNTOS_PARA_GANADOR;
                } else{
                    puntosNaneh = puntosNaneh + PUNTOS_PARA_GANADOR;
                }
    
            }

            System.out.println("");
            System.out.println("---------------------");
            System.out.println("Tiro nª:"+ numeroTiro);
            System.out.println("Armand ha caido en :"+ dondeCaeArmand);
            System.out.println("Naneh ha caido en :"+ dondeCaeNaneh);
            System.out.println("Puntos:");
            System.out.println("    -Naneh:"+ puntosArmand );
            System.out.println("    -Armand:" + puntosNaneh);
            System.out.println("---------------------");
            System.out.println("");

            if (puntosArmand >= MAXIMO_DE_PUNTOS || puntosNaneh >= 50) {
                jugando = false;
            }
            entrada.nextLine();

        }
        entrada.close();
    }
}
