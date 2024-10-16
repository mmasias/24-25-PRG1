public class Caracol {
    public static void main(String[] args) {
        
        final String POZO_SUPERIOR = "Superior";
        final String POZO_PARED = "Pared";
        final String POZO_INFERIOR = "Inferior";
        final String POZO_AGUA = "Agua";
        final String CARACOL = "Caracol";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random() * (MAXIMA - MINIMA + 1)) + MINIMA;

        int dia = 0;
        int caracolSube;
        int caracolBaja;

        
        
        do {
            dia++;
            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= 0.05 ? 5 :
                                probabilidadLluvia <= 0.1 ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int) (Math.random() * (4 - 1 + 1)) + 1; 
            caracolBaja = (int) (Math.random() * (2 - 0 + 1)); 

            boolean aparcaCoche = Math.random()<=0.35;

            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja;
            System.out.println(POZO_SUPERIOR);
        
        
        for (int i = 0; i < PROFUNDIDAD; i++) {
            if (profundidadCaracol == i) {
                System.out.println(CARACOL + " " + i);
            } else if (i >= PROFUNDIDAD - profundidadAgua) {
                System.out.println(POZO_AGUA + " " + i);
            } else {
                System.out.println(POZO_PARED + " " + i);
            }
        }
        
        System.out.println(POZO_INFERIOR);
        } while (profundidadCaracol > 0);

        
    }
}
