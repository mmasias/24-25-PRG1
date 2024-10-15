public class caracol {
    public static void main(String[] args) {
        
        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "###################";
        final String POZO_TOPE = "##               ##";
        final String POZO_PARED = "## :.:.:.:.:.:.:.##";
        final String POZO_AGUA = "##~~~~~~~~~~~~~~~##";
        final String POZO_CARACOL = "##      _@_/`    ##";
        

        int profundidadAgua = 10;
        int profundidadCaracol = 16;
        System.out.println(POZO_TOPE);
        int dia=0;

        do {
            System.out.println("DIA" + dia);
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