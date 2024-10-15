public class JuegoCaracol {
        public static void main (String[] args){
            System.out.println("El Caracol!");
    
            final int PROFUNDIDAD = 20;
            final String POZO_BASE = "[][][][][][][][][][][]";
            final String POZO_TOPE = "[_]             [_]";
            final String POZO_PARED = "||--------------||";
            final String POZO_AGUA = "|~~~~~~~~~~~~~~~~|";
            final String POZO_CARACOL = "||___caracol___||";
    
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
