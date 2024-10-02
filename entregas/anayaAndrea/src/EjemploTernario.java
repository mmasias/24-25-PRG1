import java.util.Scanner;
class EjemploTernario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nivel de dificultad");
		
		int minimo, maximo;
		System.out.println("Numero minimo");
		minimo = scanner.nextInt();
		System.out.println("Numero maximo");
		maximo = scanner.nextInt();
		int aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);
		
		int numeroDelUsuario;
		System.out.println("Dime un numero entre "+minimo+" y "+maximo+" (inclusive)");
		numeroDelUsuario = scanner.nextInt();
		
		String veredicto;
		veredicto = numeroDelUsuario != aleatorio ? "No adivino!" : "Adivino!";
	
		System.out.println(veredicto);
		{
			
		}
