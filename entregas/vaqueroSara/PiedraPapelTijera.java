import java.util.Scanner;

public class PiedraPapelTijera.java {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String piedra = "piedra";
        String tijera = "tijera";
        String papel = "papel";

        System.out.println("Bienvenido a piedra, papel o tijera.");
        System.out.println(
                "Escoge piedra, papel o tijera para jugar contra la computadora. Por favor, introduce la palabra exacta");
        String userValue = scanner.nextLine().toLowerCase();

        String validOption = (userValue.equals(piedra) || userValue.equals(tijera) || userValue.equals(papel))
                ? userValue
                : "inválido";

        System.out.println(validOption.equals("inválido") ? "Por favor, reinicia e introduce un valor válido" : "");

        int maximo = 3;
        int minimo = 1;

        int compValue = (int) (Math.random() * (maximo - minimo) + minimo);

        String compChoice = (compValue == 1) ? "piedra"
                : (compValue == 2) ? "papel"
                        : (compValue == 3) ? "tijera" : "";

        
        String result = 
        (validOption.equals(piedra) && compChoice.equals(3)) || 
        (validOption.equals(tijera) && compChoice.equals(2)) ||
        (validOption.equals(papel) && compChoice.equals(1)) ? "Has ganado!" : 

        (validOption.equals(compChoice)) ? "Empate!" :

        "Perdiste...";
    
        System.out.println("La computadora escogió "+compChoice+".");
        System.out.println(result);

        scanner.close();

    }
}
