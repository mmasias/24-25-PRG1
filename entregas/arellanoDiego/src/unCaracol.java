public class unCaracol {
  public static void main(String[] args) {
    final String POZO_BASE = "## ## ## ## ## ## _ __";
    final String POZO_TOPE = "##             ## _ __";
    final String POZO_PARED = "## :. :. :. :. :.## _ __  ";
    final String POZO_AGUA = "##~~~~~~~~~~~~~~~## _ __ ";
    final String POZO_CARACOL = "_0_/°";
    
    final int PROFUNDIDAD_MINIMA = 10;
    final int PROFUNDIDAD_MAXIMA = 20;
    final int PROFUNDIDAD_POZO = 20;

    int profundidadAgua = 5;
    int posicionCaracol = (int) (Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)*PROFUNDIDAD_MINIMA;
    int dia=0;

    do { 
        System.out.println("DIA" + dia);
        System.out.println(POZO_TOPE);
        for(int i=0; i <= PROFUNDIDAD_POZO; i++ ){
            if(i == posicionCaracol){
                System.out.println(POZO_CARACOL + i);
            } else if (i > PROFUNDIDAD_POZO - profundidadAgua){
                System.out.println(POZO_AGUA + i);
            } else {
                System.out.println(POZO_PARED + i);
            }
        }
       
        System.out.println(POZO_BASE);
        posicionCaracol = posicionCaracol - 2;
        dia++;
    } while (posicionCaracol>0);
    
  }
};