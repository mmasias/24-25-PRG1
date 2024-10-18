import java.util.Scanner;
class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int minimo, maximo;
        System.out.println("Nivel de dificultad");
        System.out.println("Numero minimo");
        minimo = scanner.nextInt();
        System.out.println("Numero maximo");
        maximo = scanner.nextInt();

        int aleatorio = (int) (Math.random()* (maximo-minimo) + minimo);

        int numeroDelUsuario;

        System.out.println("Dime un numero entre el "+minimo+" y "+maximo+" (inclusive)");

        String veredicto;
        veredicto = numeroDelUsuario != aleatorio ? "Adivino!" : "No Adivino!";

        System.out.println(veredicto);

        scanner.close();
    
    
    
    
    
    
    
    }
}