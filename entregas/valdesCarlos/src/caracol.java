import java.util.Scanner;
public class caracol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final String POZO_BASE = "###################";
        final String POZO_TOPE = "##               ##";
        final String POZO_PARED = "## :.:.:.:.:.:.:.##";
        final String POZO_AGUA = "##~~~~~~~~~~~~~~~##";
        final String POZO_CARACOL = "##      _@_/`    ##";
        
        int profundidadAgua = 5;
        int profundidadCaracol = (int)((Math.random()*MAXIMA-MINIMA+1)+MINIMA);
        System.out.println(POZO_TOPE);
        int dia=0;
        int caracolSube=0;
        int caracolBaja=0;

        do {
            dia++;
            caracolSube = (int)(Math.random()*(4-1+1)+1);

            System.out.println(POZO_TOPE);
            for(int i=0; i<=PROFUNDIDAD; ++i) {

                if(profundidadCaracol==i) {
                    System.out.println(POZO_CARACOL + i);
                } else if (i>PROFUNDIDAD-profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE); 
            profundidadCaracol = profundidadCaracol -2;
            dia++;
        } while (profundidadCaracol>0);    

    }



}  