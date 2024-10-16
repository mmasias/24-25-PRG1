import java.util.Scanner;

class Caracol {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final int MAXIMO_DIAS = 50;
        final int PROFUNDIDAD = 20;
        final String POZO_CON_COCHE = "[__]    O-=-O     [__]";
        final String POZO_BASE = "  [][][][][][][][][]";
        final String POZO_TOPE = "[__]              [__]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __ ";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~[] _ __ ";
        final String CARACOL = "  []    _@)_/'    [] _ __ ";
        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;

    
        int profundidadAgua = 20;
        int profundidadCaracol = (int)(Math.random()*(PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA + 1)+PROFUNDIDAD_MINIMA);
        int dia = 0;
        int caracolSube = 0;
        int caracolBaja =  0;
        boolean caracolMuerto = false;




        System.out.println("Al principio el caracol cayó a ["+profundidadCaracol+"] metros");

        do {
            dia++;

            int maxSubida = 4;
            if (dia > 10 && dia <= 20) {
                maxSubida = 3;
            } else if (dia > 20) {
                maxSubida = 2;
            }


            int clima = (int)(Math.random()*100-1)+1;
            if (clima < 5) {
                System.out.println("Día " + dia + ": Lluvia fuerte, el pozo se inunda 5 metros");
                profundidadAgua = profundidadAgua - 5;               
            }else if (clima < 15) {
                System.out.println("Día " + dia + ": Lluvia media, el pozo se inunda 2 metros");
                profundidadAgua = profundidadAgua - 2;
            }


            caracolSube = (int)(Math.random()*(4-1+1)+1);
            caracolBaja = (int)(Math.random()*(2-0+1)+0);

            int aparcaCoche = (int)(Math.random()*100-1)+1;
            if (aparcaCoche < 35) {
                System.out.println("Día " + dia + ": Un coche pasó cerca, el caracol resbala 2 metros");
                profundidadCaracol = profundidadCaracol + 2;
                caracolBaja = +2;
            }

            if (profundidadAgua < profundidadCaracol) {
                caracolMuerto = true;  
                System.out.println("El caracol ha muerto ahogado después de "+dia+" días.");               
            }            

            profundidadCaracol -= caracolSube;
            profundidadCaracol += caracolBaja;

            if (dia >= MAXIMO_DIAS && profundidadCaracol > 0) {
                System.out.println("El caracol ha muerto de inanición después de " + MAXIMO_DIAS + " días.");
                caracolMuerto = true;
                break;
            }

            System.out.println("DÍA["+dia+"] - Subio ["+caracolSube+"] - Bajo["+caracolBaja+"] - Posicion["+profundidadCaracol+"]");
            if (aparcaCoche < 35) {
                System.out.println(POZO_CON_COCHE);                
            }else if (aparcaCoche > 35){
                System.out.println(POZO_TOPE);
            }

            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (i == profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else if (i == profundidadCaracol) {
                    System.out.println(CARACOL + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);
            inputUsuario = entrada.nextLine();


        } while(profundidadCaracol>0 && caracolMuerto == false);
        if (!caracolMuerto && profundidadCaracol <= -1) {
            System.out.println("==========================================================");
            System.out.println("¡El caracol ha logrado salir del pozo en " + dia + " días!");
            System.out.println("==========================================================");
        }




    }
}
