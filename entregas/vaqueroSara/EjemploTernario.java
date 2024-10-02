import java.util.Scanner;

public class EjemploTernario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int minimo;
		int maximo;
		System.out.println("Nivel de dificultad");
		System.out.println("Indique el número mínimo");
		minimo = scanner.nextInt();
		System.out.println("Indique el número máximo");
		maximo = scanner.nextInt();

		int aleatorio = (int) (Math.random() * (maximo - minimo) + minimo);
		int numeroDelUsuario;

		System.out.println("Diga un numero entre "+minimo+" y "+maximo+" (inclusive)");
		numeroDelUsuario = scanner.nextInt();

		String veredicto;

		veredicto = numeroDelUsuario != aleatorio ? "No adivinó!" : "Adivinó!";
		System.out.println(veredicto);
		scanner.close();
	}
}