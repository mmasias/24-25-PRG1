public class JuegoCaracol {
    public static void main (String[] args){
        System.out.println("El Caracol!");

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][][][]";
        final String POZO_TOPE = "[__]             [__]";
        final String POZO_PARED = "|___________________|";
        final String POZO_AGUA = "|~~~~~~~~~~~~~~~~~~~|";
        final String POZO_CARACOL = "|______caracol______|";
        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;

        int profundidadAgua = 5;
        int profundidadCaracol = (int)(Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
        int dia = 0;

        do {
            System.out.println("Dia " + dia);
            System.out.println(POZO_TOPE);

            for(int i=0 ; i<=PROFUNDIDAD ; i++){
                if (profundidadCaracol==i){
                    System.out.println(POZO_CARACOL + i);
                } else if (i > PROFUNDIDAD-profundidadAgua){
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            
            profundidadCaracol --;
            dia++;
            System.out.println(POZO_BASE);
        } while (profundidadCaracol>0) ;

    }

}
