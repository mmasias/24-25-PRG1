public class JuegoCaracol {
        private static final char[] POZO_CARACOL = null;
        private static final int POZO_AGUA = 0;

        public static void main(String[] args){
    
            final int PROFUNDIDAD = 20;
            final String POZO_BASE = " ###################";
            final String POZO_TOPE = "#####                     #####";
            final String POZO_PARED = " ##:. :. :. :. :. :.## __ ___";
            final String CARACOL = "    @)_/´";
    
            int profundidadAgua = 5;
            int profundidadCaracol = 13;
    
            System.out.println(POZO_TOPE);
    
            for(int i=0; i<= PROFUNDIDAD; i++){
    
                if (profundidadCaracol==i){
                    System.out.println(POZO_CARACOL);
                }
                else if(i>PROFUNDIDAD-profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
    
                
            }
            System.out.println(POZO_BASE);
    
    
    
        }
    }
}
