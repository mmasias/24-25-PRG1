public class JuegoCaracol {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("¡¡BIENVENIDO AL JUEGO DEL CARACOL!!");
        System.out.println("===================================");

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][][][][]";
        final String POZO_TOPE = "[__]               [__]";
        final String POZO_PARED = "||-------------------|| -- ";
        final String POZO_AGUA = "||~~~~~~~~~~~~~~~~~~~|| -- ";
        final String POZO_CARACOL = "||       _@)_/'      || -- ";
        final String COCHE = "      O-=-O      ";

        final int PROFUNDIDAD_MAXIMA_CAIDA_CARACOL = 20;
        final int PROFUNDIDAD_MINIMA_CAIDA_CARACOL = 10;
        final int SUBIDA_MAXIMA_CARACOL = 4;
        final int SUBIDA_MINIMA_CARACOL = 1;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random() * (PROFUNDIDAD_MAXIMA_CAIDA_CARACOL - PROFUNDIDAD_MINIMA_CAIDA_CARACOL + 1)) + PROFUNDIDAD_MINIMA_CAIDA_CARACOL;
        int dia = 0;
        boolean probabilidadCoche;

        do {
            System.out.println();
            System.out.println("DIA: " + dia);
            System.out.println();

            if(probabilidadCoche = Math.random() * 100 < 35)
            {
                System.out.println(COCHE);
            }

            System.out.println(POZO_TOPE);
            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (profundidadCaracol == i) 
                {
                    System.out.println(POZO_CARACOL + i);
                } else if (i > PROFUNDIDAD - profundidadAgua) 
                {
                    System.out.println(POZO_AGUA + i);
                } else 
                {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);

            
            int subidaCaracol = (int) (Math.random() * (SUBIDA_MAXIMA_CARACOL - SUBIDA_MINIMA_CARACOL + 1)) + SUBIDA_MINIMA_CARACOL;
            profundidadCaracol -= subidaCaracol; 

            
            if (profundidadCaracol < 0) 
            {
                profundidadCaracol = 0; 
            }


            if (probabilidadCoche) 
            {
                profundidadCaracol += 2;
                
                if (profundidadCaracol > PROFUNDIDAD) 
                {
                    profundidadCaracol = PROFUNDIDAD; 
                }
            }

            dia++;

        
        } while (profundidadCaracol > 0 && dia < 50);

        if (profundidadCaracol == 0) {
            System.out.println("¡El caracol ha salido del pozo después de " + dia + " días!");
        } else {
            System.out.println("El caracol ha muerto después de 50 días sin salir del pozo.");
        }
    }
}