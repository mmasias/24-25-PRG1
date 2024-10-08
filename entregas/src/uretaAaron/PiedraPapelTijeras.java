import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Tú eliges: 0 = Piedra, 1 = Papel, 2 = Tijeras: ");
        int usuario = sc.nextInt();

        int computadora = (usuario + 1) % 3; 

        System.out.println("Tú: " + opciones[usuario] + " | Computadora: " + opciones[computadora]);

        String resultado = (usuario == computadora) ? "Empate" :
        (usuario == 0 && computadora == 2) || (usuario == 1 && computadora == 0) || (usuario == 2 && computadora == 1) ? "Ganaste" : "Perdiste";
        System.out.println(resultado);
        sc.close();
    }
}