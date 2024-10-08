import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        
        String[] cpu_options = { "piedra", "papel", "tijera" };
        int user_selection;

        System.out.print("Indique su selección [1=Piedra, 2=Papel, 3=Tijera]: ");
        user_selection = scanner.nextInt(); 

        int random_pick = (int) (Math.random() * 3); 
        String cpu_selection = cpu_options[random_pick];

        String resultado = (user_selection == 1 && cpu_selection.equals("tijera")) ? "Ganaste! La piedra aplasta la tijera." :
                        (user_selection == 2 && cpu_selection.equals("piedra")) ? "Ganaste! El papel cubre la piedra." :
                        (user_selection == 3 && cpu_selection.equals("papel")) ? "Ganaste! La tijera corta el papel." :
                        (user_selection == 1 && cpu_selection.equals("papel")) ? "Perdiste! El papel cubre la piedra." :
                        (user_selection == 2 && cpu_selection.equals("tijera")) ? "Perdiste! La tijera corta el papel." :
                        (user_selection == 3 && cpu_selection.equals("piedra")) ? "Perdiste! La piedra aplasta la tijera." :
                        "Empate!";

        System.out.println("La computadora eligió: " + cpu_selection);
        System.out.println(resultado);
    }
}
