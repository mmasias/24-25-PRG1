class CaracolPozo{
    public static void main(String[] args){
        
        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "     [] [] [] [] [] [] []";
        final String POZO_TOPE = " # # # #              # # # #";
        final String POZO_PARED = "     ##:. :. :. :. :.## _ __";
        final String POZO_AGUA = "     ##~~~~~~~~~~~~~~## _ __";
        final String POZO_CARACOL= "     ##    _@)_/'    ## _ __";

        final int MAXIMA = 20;
        final int MINIMA = 11;

        int caracolSube = 0;
        int caracolBaja = 0;
        int aporteAgua = 0;
        int POZO_CON_COCHE = 0;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random()*20-10+1)+10;
        int profundidadCaracol = (int) (Math.random()*MAXIMA-MINIMA+1)+MINIMA;
        int dia = 0;
        System.out.println("Al inicio el caracol cae a ["+profundidadCaracol+"] metros");

        do {
            System.out.println("DIA" + dia);
            System.out.println(POZO_TOPE);
            dia++;

            double probabilidadLluvia = Math.random();
            int aportaAgua = probabilidadLluvia <= 0.05 ? 5 :
                                probabilidadLluvia <= 0.1 ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;


            caracolSube = (int) (Math.random()*(4-1+1)+1);
            caracolBaja = (int) (Math.random()*(2-0+1)+0);

            boolean aparcaCoche = Math.random()<=0.35;

            profundidadCaracol = profundidadCaracol
                                 -caracolSube
                                 +caracolBaja
                                 +(aparcaCoche ? 2 : 0);


            System.out.println("DIA["+dia+"] - Subio["+caracolSube+"] - Bajo["+caracolBaja+"] - Posicion["+profundidadCaracol+"]");
            System.out.println(aparcaCoche?POZO_CON_COCHE:POZO_TOPE);

            for(int i=0; i<=PROFUNDIDAD; i++){

                if (profundidadCaracol==i) {

                    System.out.println(POZO_CARACOL + i);
                } else if (i>PROFUNDIDAD-profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);
            profundidadCaracol = profundidadCaracol - 2;
            dia++;
        } while (profundidadCaracol>1);
    }
}