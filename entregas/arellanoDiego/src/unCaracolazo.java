import java.util.Scanner;

class unCaracolazo {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        

        final String POZO_SUPERIOR = "##             ##";
        final String COCHE = "##      COCHE    ##";
        final String POZO_PARED = "## :. :. :. :. :.## _ __  ";
        final String POZO_INFERIOR = "### ## ## ## ## ### _ __";
        final String POZO_AGUA = "##~~~~~~~~~~~~~~~## _ __ ";
        final String CARACOL = "##     _0_/°     ## _ __";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;


        int dia=0;
        int caracolSube=0;
        
        int caracolBaja=0;

        int profundidadAgua = 5;
        int profundidadCaracol = (int)(Math.random()*MAXIMA-MINIMA+1)+MINIMA;
        System.out.println("Al inicio el caracol cae a ["+profundidadCaracol+"] metros");
        boolean haSalido = profundidadCaracol <= 0;
        boolean estaVivo = dia <= 50;



        do{
            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5:
                probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int)(Math.random()*(4-1+1)+1);
            caracolBaja = (int)(Math.random()*(2-0+1)+0);

            boolean aparcaCoche = Math.random()<=0.35;
            

            profundidadCaracol = profundidadCaracol-caracolSube+caracolBaja +(aparcaCoche ? 2 : 0 );


            System.out.println("Dia["+dia+"] - Subio["+caracolSube+"] - Bajo["+caracolBaja+"] - Posición["+profundidadCaracol+"]");

            System.out.println(aparcaCoche?COCHE:POZO_SUPERIOR);

            int nivelAgua = PROFUNDIDAD - profundidadAgua + 1;

            for (int i = 0; i < PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(CARACOL + " Nivel [" + (i + 1) + "]");
                } else if (i >= PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + " Nivel [" + nivelAgua + "]");
                    nivelAgua++; 
                } else {
                    System.out.println(POZO_PARED + " Nivel [" + (i + 1) + "]");
                }
            }

            System.out.println(POZO_INFERIOR);
            entrada.nextLine();
            haSalido = profundidadCaracol <= 0;


        } while(!haSalido && estaVivo);
        System.out.println("Esta VIVO");

        System.out.println(POZO_SUPERIOR);
        for(int i=0;i<PROFUNDIDAD;i++){
            if (i==profundidadCaracol){
                System.out.println(CARACOL + 1);
            } else if (i>PROFUNDIDAD-profundidadAgua){
                System.out.println(POZO_AGUA + 1);
            } 
            else {
                System.out.println(POZO_PARED + i);
            }
        }
        
        entrada.close();


    }
}
