import java.util.Scanner;

public class JuegoCaracol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ImputUsuario;

        System.out.println("===================================");
        System.out.println("¡¡BIENVENIDO AL JUEGO DEL CARACOL!!");
        System.out.println("===================================");

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][][][][]";
        final String POZO_TOPE = "[__]               [__]";
        final String POZO_PARED = "||-------------------|| -- ";
        final String POZO_AGUA = "||~~~~~~~~~~~~~~~~~~~|| -- ";
        final String POZO_CARACOL = "||       _@)_/'      || -- ";
        final String COCHE = "         O-=-O      ";

        final int PROFUNDIDAD_MAXIMA_CAIDA_CARACOL = 20;
        final int PROFUNDIDAD_MINIMA_CAIDA_CARACOL = 10;
        final int SUBIDA_MAXIMA_CARACOL = 4;
        final int SUBIDA_MINIMA_CARACOL = 1;
        final int BAJADA_MAXIMA_CARACOL = 2;
        final int BAJADA_MINIMA_CARACOL = 0;
        final int BAJADA_CARACOL_COCHE = 2;
        final int CANTIDAD_LLUVIA_FUERTE = 5;
        final int CANTIDAD_LLUVIA_DEBIL = 2;


        int profundidadAgua = 0;
        int profundidadCaracol = (int) (Math.random() * (PROFUNDIDAD_MAXIMA_CAIDA_CARACOL - PROFUNDIDAD_MINIMA_CAIDA_CARACOL + 1)) + PROFUNDIDAD_MINIMA_CAIDA_CARACOL;
        System.out.println("El caracol cayo a " + profundidadCaracol + " metros");

        int dia = 0;
        boolean lluviaFuerte = Math.random() * 100 <= 5;
        boolean lluviaDebil = Math.random() * 100 <= 10;

        do {

            dia++; 

            boolean probabilidadCoche = Math.random() * 100 <= 35;
            int subidaCaracol = (int) (Math.random() * (SUBIDA_MAXIMA_CARACOL - SUBIDA_MINIMA_CARACOL + 1)) + SUBIDA_MINIMA_CARACOL;
            int bajadaCaracol = (int)(Math.random()*(BAJADA_MAXIMA_CARACOL-BAJADA_MINIMA_CARACOL+1)+BAJADA_MINIMA_CARACOL);
            profundidadCaracol = profundidadCaracol - subidaCaracol + bajadaCaracol + (probabilidadCoche ? BAJADA_CARACOL_COCHE : 0);
									
            if (profundidadCaracol > PROFUNDIDAD) {
                profundidadCaracol = PROFUNDIDAD;
            }

            System.out.println();
            System.out.println("DIA: " + dia);
            System.out.println();

            if (probabilidadCoche) {
                System.out.println("¡¡Un coche pasó x encima!!");
                System.out.println();
                System.out.println(COCHE);
            }


            
            if (lluviaFuerte) {
                profundidadAgua += CANTIDAD_LLUVIA_FUERTE; 
            } else if (lluviaDebil) {
                profundidadAgua += CANTIDAD_LLUVIA_DEBIL; 
            }

            System.out.println("Subio["+subidaCaracol+"] - Bajo["+bajadaCaracol+"] - Posicion["+profundidadCaracol+"]");

            System.out.println(POZO_TOPE);

            for (int i = 0; i <= PROFUNDIDAD; i++) {
                
                if (profundidadCaracol == i) {
                    System.out.println(POZO_CARACOL + " " + i);
                } else if (i > PROFUNDIDAD - profundidadAgua) { 
                    System.out.println(POZO_AGUA + " " + i);
                } else {
                    System.out.println(POZO_PARED + " " + i);
                }
            }

            System.out.println(POZO_BASE);


            if (profundidadCaracol < 0) 
            {
                profundidadCaracol = 0;

            }else if (profundidadCaracol > profundidadAgua)
            {
                profundidadCaracol = profundidadAgua - 1;
            }


            ImputUsuario = scanner.nextLine();
        } while (profundidadCaracol > 0 && dia < 51);

        if (profundidadCaracol == 0) {
            System.out.println();
            System.out.println("¡El caracol ha salido del pozo después de " + dia + " días!");
        } else {
            System.out.println("El caracol ha muerto después de 50 días sin salir del pozo.");
        }
    }
}