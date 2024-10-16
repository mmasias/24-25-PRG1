import java.util.Scanner;

class Caracol{
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final String POZO_BASE = "  ##################";
        final String POZO_CON_COCHE = "####    COCHE          ####";
        final String POZO_PARED = "   ##: . :. :. :. :.## : ::";
        final String POZO_AGUA = "   ##---------------## _ __";
        final String POZO_CARACOL = "   ##      _@)/    ## _ __";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        int profundiadAgua = 5;
        int profundidadCaracol = (int)(Math.random()*MAXIMA-MINIMA+1)+MINIMA;
        boolean haSalido = profundidadCaracol<=0;
        boolean estaVivo = true;
        System.out.println("Al inicio el caracol cae a ["+profundidadCaracol+"] metros");

        int dia=0;
        int caracolSube=0;
        int caracolBaja=0;

        do{
            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia<0.05 ? 5: probabilidadLluvia <= 0.1 ? 2 : 0;
            profundiadAgua = profundiadAgua + aporteAgua;

            caracolSube = (int)(Math.random()*(4-1+1)+1);
            caracolBaja = (int)(Math.random()*(2-0+1)+0);

            boolean aparcaCoche = Math.random()<=0.35;

            profundidadCaracol = profundidadCaracol-caracolSube+caracolBaja+(aparcaCoche ? 2 : 0);
            System.out.println("Dia["+dia+"] - Subio["+caracolSube+"] - Bajo["+caracolBaja+"] - Posicion ["+profundidadCaracol+"]");
            System.out.println(aparcaCoche?POZO_CON_COCHE:POZO_BASE);
            for (int i=0;i<=PROFUNDIDAD;i++){
            if (i==profundidadCaracol) {
                    System.out.println(POZO_CARACOL + 1);
            } else if (i>PROFUNDIDAD-profundiadAgua){
                    System.out.println(POZO_AGUA + i);
            } else {
                System.out.println(POZO_PARED + i);
            }
        }
        System.out.println(POZO_BASE);
        inputUsuario = entrada.nextLine();

        haSalido = profundidadCaracol<=0;

        } while(!haSalido && estaVivo);

    }
}