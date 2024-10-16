import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MINIMO, MAXIMO;
        System.out.println("Numero Minimo:");
        MINIMO = scanner.nextInt();
        System.out.println("Numero Maximo:");
        MAXIMO = scanner.nextInt();
        
        int aleatorio = (int)(Math.random() * (MAXIMO - MINIMO)) + MINIMO;

        int NumeroDelUsuario;

        System.out.println("Dime un numero entre " + MINIMO + " y " + MAXIMO + ":");
        NumeroDelUsuario = scanner.nextInt();

        String Veredicto = (NumeroDelUsuario == aleatorio) ? "Adivinaste" : "No adivinaste";
        
        System.out.println("El número aleatorio era: " + aleatorio);
        System.out.println(Veredicto);

        scanner.close();
    }
}
