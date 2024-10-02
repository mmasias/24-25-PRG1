import java.util.Scanner;

class AdivinarNumeroRandom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int minimo, maximo;
        System.out.println("Nivel de dificultad");
        System.out.println("Número mínimo");
        minimo = scanner.nextInt();
        System.out.println("Número máximo");
        maximo = scanner.nextInt();

        int aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);

        int numeroDelUsuario;

        System.out.println("Dime un número entre "+minimo+" y "+maximo+" (inclusive)");

        numeroDelUsuario = scanner.nextInt();   
        
        String veredicto;

        veredicto = numeroDelUsuario == aleatorio ? "Adivinó!" : "No adivinó!";
    
        System.out.println(veredicto);

        System.out.println("El número era: " + aleatorio);

        scanner.close();
    }
    
}
