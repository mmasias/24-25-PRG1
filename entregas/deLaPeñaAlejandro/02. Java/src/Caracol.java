import java.util.Scanner;

class Caracol{
    public static void main(String[] args) {
     try (Scanner entrada = new Scanner(System.in)) {
        String inputUsuario;

        System.out.println("Sube Caracol!!");
        final int PROFUNDIDAD = 20;
        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_DEBIL = 0.15;

        int profundidadAgua = 0;
        int profundidadCaracol = (int) (Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
        boolean haSalido = profundidadCaracol <= 0;
        boolean esteVivo = true;

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;

        final String POZO_TOPE = "[ ]              [ ]";
        final String POZO_PARED = " [].: .: .: .: .:[] ";
        final String POZO_AGUA =  " []~ ~ ~ ~ ~ ~ ~ [] ";
        final String POZO_CARACOL = " [].: .:\\_(@)^ .:[] ";
        final String POZO_BASE = " [][][][][][][][][] ";
        final String POZO_COCHE = "[ ]    O-=-O    [ ]";

        System.out.println("Al inicio el caracol cae a |"+profundidadCaracol+"| metros");

        do {
            dia++;
            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5 :
            probabilidadLluvia <= PROBABILIDAD_LLUVIA_DEBIL ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int) (Math.random()*(4-1+1)+1);
            caracolBaja = (int) (Math.random()*(2-0+1)+0);

            boolean aparcaCoche = Math.random()<= 0.35;

            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? 2 : 0);

            System.out.println("Dia |"+dia+"| - Subio |"+caracolSube+"| - Bajo |"+caracolBaja+"| - Posición |"+profundidadCaracol+"|");
            System.out.println(aparcaCoche ? POZO_COCHE:POZO_TOPE);
            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (i==profundidadCaracol) {
                    System.out.println(POZO_CARACOL + i);
                } else if (i>PROFUNDIDAD-profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            
            }
            System.out.println(POZO_BASE);
            haSalido = profundidadCaracol <= 0;
            inputUsuario = entrada.nextLine();

        } while (!haSalido && esteVivo);
    } 
    }
}    