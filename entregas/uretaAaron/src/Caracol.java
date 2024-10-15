public class Caracol {

    public static void main(String [] args) {
    
    final String POZO_BASE = "[][][][][][][][][][] _ __";
    final String POZO_TOPE = "[  ]              [  ] _ __ ";
    final String POZO_PARED = "[]:. :. :. :. :.[] _ __ ";
    final String POZO_AGUA = "~~~~~~~~~~~~ _ __";
    final String POZO_CARACOL = "[]    _@)_/'    [] _ __";

    final int PROFUNDIDAD_MAXIMA = 20;
    final int PROFUNDIDAD_MINIMA = 10;

    int PROFUNDIDAD = 20;
    int profundidadAgua = 0;
    int profundidadCaracol = (int)(Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
    int dia=0;

    do {
    System.out.println(POZO_TOPE);
    for(int i=0; i <= PROFUNDIDAD; i++ ){

        if(profundidadCaracol == i){
            System.out.println(POZO_CARACOL + i );
        } else if (i>PROFUNDIDAD-profundidadAgua){
            System.out.println(POZO_AGUA + i );
        } else {
            System.out.println(POZO_PARED + i);
        }
      }
       System.out.println(POZO_BASE);
       profundidadCaracol--;
        dia++;
    } while (profundidadCaracol>0);

}
}
