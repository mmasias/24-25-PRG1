public class JuegoCaracol {
    public static void main (String[] args){

        System.out.println("===================================");
        System.out.println("¡¡BIENVENIDO AL JUEGO DEL CARACOL!!");
        System.out.println("===================================");

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][][][][]";
        final String POZO_TOPE = "[__]               [__]";
        final String POZO_PARED = "||-------------------||";
        final String POZO_AGUA = "||~~~~~~~~~~~~~~~~~~~||";
        final String POZO_CARACOL = "||------Caracol------||";

        final int PROFUNDIDAD_MAXIMA_CAIDA_CARACOL = 20;
        final int PROFUNDIDAD_MINIMA_CAIDA_CARACOL = 10;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random()*PROFUNDIDAD_MAXIMA_CAIDA_CARACOL-PROFUNDIDAD_MINIMA_CAIDA_CARACOL+1) + PROFUNDIDAD_MINIMA_CAIDA_CARACOL;
        int dia = 0;

        do{
            System.out.println();
            System.out.println("DIA: " + dia);
            System.out.println();

            System.out.println(POZO_TOPE);
            for(int i=0 ; i<=PROFUNDIDAD ; i++){
                if (profundidadCaracol==i){
                    System.out.println(POZO_CARACOL + i);
                } else if (i > PROFUNDIDAD-profundidadAgua){
                    System.out.println(POZO_AGUA + i);
                } else{
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);
            
            profundidadCaracol--;
            dia++;
        }while(profundidadCaracol>=0);
        



    }

}