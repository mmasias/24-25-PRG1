package entregas.martinezDiego.Reto3;

public class Caracol2 {
    public static void main(String[] args) {


            final int PROFUNDIDAD_POZO = 20;
            final int PROFUNDIDAD_MAXIMA = 20;
            final int PROFUNDIDAD_MINIMA = 10;
            final String POZO_TOPE ="[__]             [__]";
            final String POZO_BASE = "[][][][][][][][][]";
            final String  POZO_MID = "[]:. :. :. :. :.[]";
            final String CARACOL = "[]    _@)_/'    []";
            final String AGUA = "~~~~~~~~~~~~~~";

            int profundidadCaracol = (int) (Math.random() * PROFUNDIDAD_MAXIMA-  PROFUNDIDAD_MINIMA + 1) + PROFUNDIDAD_MINIMA;
            int dia = 0;
            int caracolSube;
            int  caracolBaja;
            


            do{
                dia ++;
                caracolSube = (int)  (Math.random() *4-1+1 )+1;
                caracolBaja = (int) (Math.random()* 2-0+1)+0;
                profundidadCaracol = profundidadCaracol-caracolSube+caracolBaja;

            
            System.out.println(POZO_TOPE );

            for(int i=0; i<= PROFUNDIDAD_POZO; i++){
                if (i == profundidadCaracol){
                    System.out.println(CARACOL +i);
                }

                System.out.println(POZO_MID +i);
                } System.out.println(POZO_BASE );
                

            }
        }

}