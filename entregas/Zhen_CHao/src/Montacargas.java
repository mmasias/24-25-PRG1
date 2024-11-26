import java.util.Scanner;
public class Montacargas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int plantaActual = 0; 
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("El montacargas esta en la planta "+ plantaActual);
            System.out.println("A que planta deseas ir (de la 0 a la 10, O INGRESA -1 PASA SALIR)");
            final int plantaDestino = entrada.nextInt();
            if (plantaDestino == -1){
                continuar = false;
                System.out.println("Simulacion finalizada");
            }

            if (plantaDestino>plantaActual) {

                System.out.println("El montacargas sube de la planta " + plantaActual + " a la planta " + plantaDestino + ".");
                } else if (plantaDestino < plantaActual) {
                    System.out.println("El montacargas baja de la planta " + plantaActual + " a la planta " + plantaDestino + ".");
                } else {
                    System.out.println("El montacargas ya está en la planta " + plantaActual + ".");
                }

               
            }


            


            

            
        }
   } 
}
