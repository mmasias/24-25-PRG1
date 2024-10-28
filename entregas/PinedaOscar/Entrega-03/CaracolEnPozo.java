import java.util.Random;

public class CaracolEnPozo {
    public static void main(String[] args) {
        int profundidadPozo = 20;
        int profundidadInicial = 10; 
        int posicionCaracol = profundidadInicial;
        int dias = 0;
        Random random = new Random();

        while (posicionCaracol > 0 && dias < 50) {
            dias++;
            int subida = random.nextInt(4) + 1; 
            int bajada = random.nextInt(3);     

            
            if (dias > 10 && dias <= 20) {
                subida = Math.min(subida, 3);
            } else if (dias > 20) {
                subida = Math.min(subida, 2);
            }

            
            if (random.nextDouble() < 0.35) {
                bajada += 2; 
                System.out.println("¡Un coche pasó cerca y el caracol retrocedió!");
            }

            
            double clima = random.nextDouble();
            if (clima < 0.05) {
                profundidadPozo += 5;
                System.out.println("Lluvia fuerte, el pozo se inunda 5 metros más.");
            } else if (clima < 0.15) {
                profundidadPozo += 2;
                System.out.println("Lluvia media, el pozo se inunda 2 metros más.");
            }

           
            posicionCaracol -= subida;
            if (posicionCaracol < 0) {
                posicionCaracol = 0; 
            }

            posicionCaracol += bajada;
            if (posicionCaracol > profundidadPozo) {
                posicionCaracol = profundidadPozo; 
            }

            
            System.out.println("Día " + dias + ": El caracol sube " + subida + " metros y baja " + bajada + " metros.");
            mostrarPozo(profundidadPozo, posicionCaracol);
            System.out.println("------------------------------");

            
            if (posicionCaracol <= 0) {
                System.out.println("¡El caracol ha salido del pozo en " + dias + " días!");
                break;
            }
        }

        
        if (dias >= 50) {
            System.out.println("El caracol no logró salir y murió de inanición después de 50 días.");
        }
    }


    public static void mostrarPozo(int profundidadPozo, int posicionCaracol) {
        for (int i = 0; i <= profundidadPozo; i++) {
            if (i == posicionCaracol) {
                System.out.println(" @_/' "); 
            } else {
                System.out.println(" | .: | "); 
            }
        }
        System.out.println(" [___] "); 
    }
}

