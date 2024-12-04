public class Caracol {

    public static void main(String [] args) {
    
    final String POZO_BASE = "[][][][][][][][][][] _ __";
    final String POZO_TOPE = "[  ]              [  ] _ __ ";
    final String POZO_PARED = "[]:. :. :. :. :.[] _ __ ";
    final String POZO_AGUA = "~~~~~~~~~~~~ _ __";
    final String POZO_CARACOL = "[]    _@)_/'    [] _ __";

    final int PROFUNDIDAD_MAXIMA = 20;
    final int PROFUNDIDAD_MINIMA = 10;
    int dia =0;
    int
    int 

    int PROFUNDIDAD = 20;
    int profundidadAgua = 0;
    int profundidadCaracol = (int)(Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
  System.out.println("Al inicio el caracol cae a");

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
    } while (profundidadCaracol>0);

}
}