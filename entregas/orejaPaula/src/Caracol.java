public class Caracol {
  public static void main(String[] args) {

    final int PROFUNDIDAD = 20;
    final String POZO_BASE = " ##################";
    final String POZO_TOPE = "####            ####";
    final String POZO_PARED = " ##:. :. :. :. :.## _ ___";
    final String POZO_AGUA = " ##~~~~~~~~~~~~~~## _ ___";
    final String POZO_CARACOL = " ##     _@)_/'   ## _ ___";

    final int PROFUNDIDAD_MAXIMA = 20;
    final int PROFUNDIDAD_MINIMA = 10;

    int profundidadAgua = 0;
    int profundidaCaracol = (int) (Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1 )+10;
    int dia = 0;

    do {
        System.out.println("DIA" + dia) ;
        System.out.println(POZO_TOPE) ;
        for (int i=0 ; i<=PROFUNDIDAD;  i++) {
             if (profundidaCaracol==i)  {
            System.out.println(POZO_CARACOL + i) ;
         } else if (i>PROFUNDIDAD-profundidadAgua) {
            System.out.println(POZO_AGUA +i) ;
        } else {
            System.out.println(POZO_PARED +1) ;
        }
    }


        System.out.println(POZO_BASE) ;
        profundidaCaracol = profundidaCaracol - 2;
        dia++;
  }  while (profundidaCaracol>0);      
 }
}
