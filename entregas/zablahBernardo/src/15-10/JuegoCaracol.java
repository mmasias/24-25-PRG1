public class JuegoCaracol {
    public static void main (String[] args){
        System.out.println("El Caracol!");

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][][][]";
        final String POZO_TOPE = "[__]             [__]";
        final String POZO_PARED = "|___________________|";
        final String POZO_AGUA = "|~~~~~~~~~~~~~~~~~~~|";
        final String POZO_CARACOL = "|______caracol______|";
        final String COCHE = "[__]    coche    [__]";
        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;

        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
        System.out.println("Al inicio el caracol cae a " + profundidadCaracol + " metros");

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;

        do {
            caracolSube = (int)(Math.random()*(4-1+1)+1);
            caracolBaja = (int)(Math.random()*(2-0+1)+0);
            boolean aparcaCoche = Math.random()<0.35;

            double probabilidadDeLluvia = Math.random();
            int aporteAgua = probabilidadDeLluvia <= 0.05 ? 5 :
                            probabilidadDeLluvia <= 0.1 ? 2 : 0 ;
            profundidadAgua = profundidadAgua + aporteAgua ;

            System.out.println("Dia " + dia + " El caracol subio " + caracolSube + ", Bajo " + caracolBaja + ", y termino en la posicion " + profundidadCaracol);
            if (aparcaCoche){
                System.out.println(COCHE);
            } else{
                System.out.println(POZO_TOPE);
            }

            profundidadCaracol = profundidadCaracol-caracolSube+caracolBaja + (aparcaCoche ? 2 : 0);
            if (profundidadCaracol >= profundidadAgua){
                profundidadCaracol = (profundidadAgua - 1) ;
            }
            
            for(int i=0 ; i<=PROFUNDIDAD ; i++){
                if (profundidadCaracol==i){
                    System.out.println(POZO_CARACOL + i);
                } else if (i > PROFUNDIDAD-profundidadAgua){
                    System.out.println(POZO_AGUA + i); 
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);
            dia++;
        } while (profundidadCaracol>0 && dia <= 50) ;

    }

}
