public class Caracol {

    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
    
    final String POZO_BASE = "[][][][][][][][][][] _ __";
    final String POZO_TOPE = "[  ]              [  ] _ __ ";
    final String POZO_PARED = "[]:. :. :. :. :.[] _ __ ";
    final String POZO_AGUA = "~~~~~~~~~~~~ _ __";
    final String POZO_CARACOL = "[]    _@)_/'    [] _ __";
    final String POZOZ_CON_COCHE = "[  ]    COCHE      [  ] _ __ "

    final int PROFUNDIDAD_MAXIMA = 20;
    final int PROFUNDIDAD_MINIMA = 10;

    final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
    final double PROBABILIDAD_LLUVIA_DEBIL
     = 0.1;

    int PROFUNDIDAD = 20;
    int profundidadAgua = 0;
    int profundidadCaracol = (int)(Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
    System.out.println("Al inicio el caracol cae a ["+profundidadCaracol+] metros");

    int dia=0;
    int caracolSube = 0;
    int CaracolBaja = 0;

        
    }

    do {
       dia++;
       
       double probabilidadLluvia = Math.random();
       double aporteAgua = probalidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5 :
                           probalididadLluvia <= PROBABILIDAD_LLUVIA_DEBIL ? 2 : 0;
       profundidadAgua = profundidadAgua + aporteAgua;

       caracolSube = (int)(Math.random()*(4-1+1)+1);
       caracolBaja = (int)(Math.random()*(2-0+1)+0);

       boolean aparcaCoche= Math.random()<=0.35;

       profundidadCaracol= profundidadCaracol
                                -caracolSube
                                +caracolBaja
                                +(aparcaCoche ? 2 : 0);

       System.out.println("Dia|"+dia+"| - Subio|"+caracolSube+"| - Bajo|"+caracolBaja+"| - Posicion|"+profundidadCaracol+");
    System.out.println(aparcaCoche?POZOZ_CON_COCHE:POZO_TOPE);

    for(int i=0; i <= PROFUNDIDAD; i++ ){

        if(i== profundidadCaracol){
            System.out.println(POZO_CARACOL + i );
        } else if (i>PROFUNDIDAD-profundidadAgua){
            System.out.println(POZO_AGUA + i );
        } else {
            System.out.println(POZO_PARED + i);
        }
      }
       System.out.println(POZO_BASE);
       inputUsuario = entrada.nextLine();
      
    } while (profundidadCaracol>0);

}
}