
import java.util.Scanner;
public class AdivinarElNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a jugar  adivinar el numero ");
        int maxIntentos = 10;
        System.err.println("Tienes un maximo de " + maxIntentos + " intentos");

     final int numMax = 100;
     final int numMin = 1;



      boolean enJuego = true;
      int turno= 0 ;

      while (enJuego) {
        turno++;
        System.out.println("Escoge un numero de 1 al 100");
        int jugador = entrada.nextInt();
        System.out.println("Escogiste "+ jugador);
        int computadora = (int)(Math.random()* numMax -numMin + 1)+numMin;
        System.out.println("La computadora eligio "+ computadora);
        boolean adivo = jugador==computadora;
        if(adivo){
            System.out.println("Bien echo adivinaste");
        }else{
                System.out.println("No adivinaste loser ");

            

        }

        
      }
     



    }
}
