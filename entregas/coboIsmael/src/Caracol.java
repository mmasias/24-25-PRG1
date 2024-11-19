class Caracol{
        public static void main(String[] args) {
            System.out.println("Sube Caracol!!");
            final int PROFUNDIDAD = 20;
            final int PROFUNDIDAD_MAXIMA = 20;
            final int PROFUNDIDAD_MINIMA = 10;
    
            int profundidadAgua = 0;
            int profundidadCaracol = (int) (Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
            int dia = 0;
    
            final String POZO_TOPE = "[ ]              [ ]";
            final String POZO_PARED = " [].: .: .: .: .:[] ";
            final String POZO_AGUA =  " []~ ~ ~ ~ ~ ~ ~ [] ";
            final String POZO_CARACOL = " [].: .:\\_(@)^ .:[] ";
            final String POZO_BASE = " [][][][][][][][][] ";
            do {
                System.out.println("DIA" + dia);
                System.out.println(POZO_TOPE);
                for (int i = 0; i <= PROFUNDIDAD; i++) {
                    if (i==profundidadCaracol) {
                        System.out.println(POZO_CARACOL + 1);
                    } else if (i>PROFUNDIDAD-profundidadAgua) {
                        System.out.println(POZO_AGUA + 1);
                    } else {
                        System.out.println(POZO_PARED + 1);
                    }
    
                }
                System.out.println(POZO_BASE);
                profundidadCaracol = profundidadCaracol - 2;
                dia++;
            } while (profundidadCaracol>0); 
        }
    }  

