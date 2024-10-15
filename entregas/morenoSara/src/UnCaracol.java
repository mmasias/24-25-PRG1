public class UnCaracol {
    public static void main(String[] args) {
        System.out.println("El caracol");

        final int PROFUNDIDAD = 20;
        final int PROFUNDIDAD_MAXIMA_CARACOL = 20;
        final int PROFUNDIDAD_MINIMA_CARACOL = 10;


        final String POZO_TOPE = "[__]              [__]";
        final String POZO_BASE = "  [][][][][][][][][]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~[] _ __";
        final String POZO_CARACOL = "  []    _@)_/´    [] _ __";

        int profundidadAgua = 0;
        int profundidadCaracol = (int) (Math.random()*PROFUNDIDAD_MAXIMA_CARACOL-PROFUNDIDAD_MINIMA_CARACOL+1)+PROFUNDIDAD_MINIMA_CARACOL;
        int dia = 0;

        
        do{
            System.out.println("Dia:" + dia);
            System.out.println(POZO_TOPE);
            for(int i=0; i<=PROFUNDIDAD ;i++){
                if (profundidadCaracol==i) {
                    System.out.println(POZO_CARACOL + i);
                } else if (i>PROFUNDIDAD-profundidadAgua){
                    System.out.println(POZO_AGUA + i);
                } else{
                    System.out.println(POZO_PARED+i);
                }
            }
            System.out.println(POZO_BASE);
            dia = dia + 1;
            profundidadCaracol--;
        } while (profundidadCaracol>0);
    } 
}
