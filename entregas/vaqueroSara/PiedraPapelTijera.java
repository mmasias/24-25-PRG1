import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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
            
            int computerValue = (int) (Math.random() * (maximo - minimo) + minimo);
            
            String computerChoice = (computerValue == 1) ? "piedra"
                    : (computerValue == 2) ? "papel"
                    : (computerValue == 3) ? "tijera" : "";
            
            
            String result =
                    (validOption.equals(piedra) && computerChoice.equals(tijera)) ||
                    (validOption.equals(tijera) && computerChoice.equals(papel)) ||
                    (validOption.equals(papel) && computerChoice.equals(piedra)) ? "Has ganado!" :
                    
                    (validOption.equals(computerChoice)) ? "Empate!" :
                    
                    "Perdiste...";
            
            System.out.println("La computadora escogió "+computerChoice+".");
            System.out.println(result);

            // Este pull request es solo para confirmar asistencia.
        }

    }
}
