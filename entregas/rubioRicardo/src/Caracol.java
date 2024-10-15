public class JuegoCaracol {
    public static void main (String[] args){
        System.out.println("El Caracol!");

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][][][]";
        final String POZO_TOPE = "[__]             [__]";
        final String POZO_PARED = "|___________________|";
        final String POZO_AGUA = "|~~~~~~~~~~~~~~~~~~~|";
        final String POZO_CARACOL = "|______caracol______|";

        int profundidadAgua = 5;
        int profundidadCaracol = 7;

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



    }

}