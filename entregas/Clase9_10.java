import java.util.Scanner;

public class Clase9_10 {
    public static void main(String[] args) {
        final int PIEDRA=0;
        final int PAPEL=1;
        final int Tijera=2;
        int jugadaPersona=0;

        Scanner scanner= new Scanner(System.in);
        do { 
             System.out.println("Introduzca 0-piedra 1-papel o 2-tijera");
            jugadaPersona=scanner.nextInt();
            if(jugadaPersona<0 || jugadaPersona>2){
                System.out.println("No es un ajugada válida");
            }
        } while (jugadaPersona<0 || jugadaPersona>2);
       
      





    
    }
    
}