import java.util.Scanner;
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            final int MINIMO = 1;
            final int MAXIMO = 100;
            final int NUMERO_TURNOS = 10;
            

            int numeroMaquina = (int) (Math.random()*(MAXIMO-MINIMO+1)+MINIMO);
            int turno = 0;
            
            do { 
              turno ++;
              System.out.println(" Dime un numero");
              int numeroUsuario = entrada.nextInt();
              final int DIFERENCIA = Math.abs(numeroMaquina-numeroUsuario);
              if (numeroMaquina == numeroUsuario ){
                System.out.println("adivino");
                
              }else if (numeroMaquina >numeroUsuario ) {
                System.out.println("es mayor");
                
              } else if (numeroMaquina <numeroUsuario){
                System.out.println("es menor");
              }else{
                System.out.println("no adivino");
              }

              if (DIFERENCIA<=5) {
                  System.out.println("CALIENTE");
              } else if (DIFERENCIA <=10){
                System.out.println("tibio");
              }else{
                System.out.println("frio");
              }

            } while (turno>NUMERO_TURNOS);

        
    }

}
