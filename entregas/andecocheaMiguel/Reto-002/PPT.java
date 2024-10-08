import java.util.Scanner;
public class PPT{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Juguemos a Piedra Papel o Tijera");
        System.out.println("Elige 1 para Piedra, 2 para Papel y 3 para Tijera");
        
        int persona = scanner.nextInt();
        int ordenador = (int) (Math.random() * (3) + 1);

        String eleccionPersona = (persona == 1) ? "Piedra" : (persona == 2) ? "Papel" : "Tijera";
        String eleccionOrdenador = (ordenador == 1) ? "Piedra" : (ordenador == 2) ? "Papel" : "Tijera";
        
       

        String resultado = (persona == ordenador) ? "Has empatado " :
                           (persona == 1 && ordenador == 3) || (persona == 2 && ordenador == 1) || (persona == 3 && ordenador == 2) 
                           ? "Has ganado" : "Perdiste. El ordenador gana";

        
        System.err.println("Has elegido " + eleccionPersona);
        System.out.println("El ordenador saco " + eleccionOrdenador);
        System.err.println(resultado);

        scanner.close();

       

         
    }
}