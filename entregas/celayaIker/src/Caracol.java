package entregas.celayaIker.src;
import java.util.Scanner;

class Caracol {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputUsuario;
        
        final int PROFUNDIDAD = 20;

        final String POZO_TOPE = "[__]              [__]";
        final String POZO_CON_COCHE = "[__]    O-=-O     [__]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __";
        final String POZO_BASE = "  [][][][][][][][][]";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~[] _ __";
        final String POZO_CARACOL = "  []    _@)_/’    [] _ __";

        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*20-10+1)+10;
        boolean haSalido = false;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        int dia=0;
        int caracolSube=0;
        int caracolBaja=0;

        do {
            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5 : probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int)(Math.random()*4-1+1)+1;
            caracolBaja = (int)(Math.random()*2-0+1)+0;

            boolean aparcaCoche = Math.random()<=0.35;

            profundidadCaracol = profundidadCaracol+caracolBaja-caracolSube+(aparcaCoche ? 2 : 0);

            System.out.println("Dia["+dia+"] - Sube["+caracolSube+"] - baja["+caracolBaja+"] - Altura del caracol["+profundidadCaracol+"]");

            System.out.println(aparcaCoche ? POZO_CON_COCHE : POZO_TOPE);
            for(int i = 0; i <= PROFUNDIDAD; i++) {
                if(i==profundidadCaracol) {
                System.out.println(POZO_CARACOL + i);
                } else if(i > PROFUNDIDAD - profundidadAgua) {
                System.out.println(POZO_AGUA + i);
                } else {
                System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);
            haSalido = profundidadCaracol<= 0;
            inputUsuario = scanner.nextLine();
            
        } while(!haSalido);

        if (haSalido) {
            System.out.println("El caracol ha salido del pozo");
        }
        scanner.close();
    }
}