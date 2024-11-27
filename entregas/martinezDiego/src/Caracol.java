
import java.util.Scanner;

public class Caracol {

    public static void main(String[] args) {

        final String POZO_TOPE = "[__]             [__]";
        final String POZO_MEDIO = "[]:. :. :. :. :.[]";
        final String POZO_FONDO = "[][][][][][][][][]";
        final String CARACOL = "[]    _@)_/’    []";
        

        int PROFUNDIDAD = 20;
        int profundidadCaracolInicial = (int) (Math.random() * 11) + 10; 
        int dia = 0;
        
        Scanner scanner = new Scanner(System.in);  

        do {
            dia++;
            int caracolSube = (int) (Math.random() * 4) + 1; 
            int caracolBaja = (int) (Math.random() * 3); 

            int profundidadCaracolDia = profundidadCaracolInicial - caracolSube + caracolBaja;
            if (profundidadCaracolDia < 0) {
                profundidadCaracolDia = 0;  
            }

            System.out.println("Día: " + dia);
            System.out.println("El caracol ha subido: " + caracolSube + " metros");
            System.out.println("El caracol ha bajado: " + caracolBaja + " metros");
            System.out.println("Profundidad actual: " + profundidadCaracolDia + " metros");

           
            System.out.println(POZO_TOPE);
            for (int i = 0; i <= PROFUNDIDAD; i++) {  
                if (i == profundidadCaracolDia) {
                    System.out.println(CARACOL + " " + i + " metros");
                } else {
                    System.out.println(POZO_MEDIO + " " + i + " metros");
                }
            }
            System.out.println(POZO_FONDO);

            
            profundidadCaracolInicial = profundidadCaracolDia;

            
            System.out.println("Presiona 'Enter' para avanzar al siguiente día...");
            scanner.nextLine();  
            
        } while (profundidadCaracolInicial > 0);

        System.out.println("¡El caracol ha salido del pozo en " + dia + " días!");
        scanner.close();  
    }
}






import java.util.Scanner;

public class Caracol {

    public static void main(String[] args) {

        final String POZO_TOPE = "[__]             [__]";
        final String POZO_MEDIO = "[]:. :. :. :. :.[]";
        final String POZO_FONDO = "[][][][][][][][][]";
        final String CARACOL = "[]    _@)_/’    []";
        

        int PROFUNDIDAD = 20;
        int profundidadCaracolInicial = (int) (Math.random() * 11) + 10; 
        int dia = 0;
        
        Scanner scanner = new Scanner(System.in);  

        do {
            dia++;
            int caracolSube = (int) (Math.random() * 4) + 1; 
            int caracolBaja = (int) (Math.random() * 3); 

            int profundidadCaracolDia = profundidadCaracolInicial - caracolSube + caracolBaja;
            if (profundidadCaracolDia < 0) {
                profundidadCaracolDia = 0;  
            }

            System.out.println("Día: " + dia);
            System.out.println("El caracol ha subido: " + caracolSube + " metros");
            System.out.println("El caracol ha bajado: " + caracolBaja + " metros");
            System.out.println("Profundidad actual: " + profundidadCaracolDia + " metros");

           
            System.out.println(POZO_TOPE);
            for (int i = 0; i <= PROFUNDIDAD; i++) {  
                if (i == profundidadCaracolDia) {
                    System.out.println(CARACOL + " " + i + " metros");
                } else {
                    System.out.println(POZO_MEDIO + " " + i + " metros");
                }
            }
            System.out.println(POZO_FONDO);

            
            profundidadCaracolInicial = profundidadCaracolDia;

            
            System.out.println("Presiona 'Enter' para avanzar al siguiente día...");
            scanner.nextLine();  
            
        } while (profundidadCaracolInicial > 0);

        System.out.println("¡El caracol ha salido del pozo en " + dia + " días!");
        scanner.close();  
    }
}






