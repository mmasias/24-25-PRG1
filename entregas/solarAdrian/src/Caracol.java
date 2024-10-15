 public class Caracol {
    public static void main(String[] args){

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][] _ ___ ";
        final String POZO_TOPE = "[___]         [___]     - ___";
        final String POZO_PARED = "[]:. :. :. :. :.[ _ ___] _ ___  ";
        final String POZO_AGUA = "[]~~~~~~~~~~~~~~~~~~~~[][] _ ___";
        final String POZO_CARACOL = "[]  __@) __/´  [][] _ ___";

        int profundidadAgua = 5;
        int profundidadCaracol = (int)(Math.random()*20-10+1)+10;

        System.out.println(POZO_TOPE);

        for(int i=0;i<=PROFUNDIDAD; i++){
            
            if(profundidadCaracol==i) {
                System.out.println(POZO_CARACOL + i);
            } else if (i>PROFUNDIDAD-profundidadAgua){
                System.out.println(POZO_AGUA + i);
            } else {
                System.out.println(POZO_PARED + i);
            }

            if(i>PROFUNDIDAD-profundidadAgua){
                System.out.println(POZO_AGUA + i);
            } else {
                System.out.println(POZO_PARED + i);
            }
            System.out.println(POZO_PARED + i);
            
        }
        System.out.println(POZO_BASE);
    }
    
}
