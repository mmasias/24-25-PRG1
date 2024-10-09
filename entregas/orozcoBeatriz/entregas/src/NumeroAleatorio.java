import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int minimo, maximo, numeroDelUsuario;
            System.out.println("Nivel de dificultad");
            System.out.println("Número mínimo: ");
            minimo = scanner.nextInt();
            System.out.println("Número máximo: ");
            maximo =  scanner.nextInt();

            int aleatorio = (int)(Math.random() * (maximo - minimo) + minimo);
            System.out.println("Dime un número entre " + minimo + " y " + maximo + " (inclusive): ");
            numeroDelUsuario = scanner.nextInt();

            String veredicto;
 
            veredicto = numeroDelUsuario == aleatorio ? "Adivinó!" : "No advinó!";

            System.out.println(veredicto);

            scanner.close();
        }
    }
}
