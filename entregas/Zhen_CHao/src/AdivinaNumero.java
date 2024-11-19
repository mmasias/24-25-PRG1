import java.util.Scanner;
import javax.naming.event.NamingExceptionEvent;
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            final int MINIMO = 1;
            final int MAXIMO = 100;
            final int NUMERO_TURNOS = 10;
            boolean estaJugando = true ;

            int numeroMaquina = (int) (Math.random()*(MAXIMO-MINIMO+1)+MINIMO);
            int turno = 0;
            
            do { 
              turno ++;
              System.out.println(" Dime un numero");
              int numeroUsuario = entrada.nextInt();
              if (numeroMaquina == numeroUsuario){
                System.out.println("adivino");
              }else if (numeroMaquina >numeroUsuario) {
                System.out.println("es mayor");
              } else {
                System.out.println("es menor");
              }



              if (turno > NUMERO_TURNOS) {
                  final boolean estaJugando = false;
              }  

            } while (estaJugando);
        









       

        
    }

}
