import java.util.Scanner;
class EjemploTernario {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        String veredicto;
		int minimo, maximo, numeroDelUsuario, aleatorio;
        
        System.out.println("Nivel de dificultad");
		System.out.println("Numero minimo");
		minimo = scanner.nextInt();
		System.out.println("Numero maximo");
		maximo = scanner.nextInt();
        
		aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);
		
		System.out.println("Dime un numero entre "+minimo+" y "+maximo+" (inclusive)");
		numeroDelUsuario = scanner.nextInt();

		veredicto = numeroDelUsuario != aleatorio ? "No adivino!" : "Adivino!";
	
		System.out.println(veredicto);
	}
}
