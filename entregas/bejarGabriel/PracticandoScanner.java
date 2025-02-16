import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticandoScanner {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        boolean encontrado = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número a buscar: ");
        try {
            int numeroBuscado = scanner.nextInt();
            for (int numero : numeros){
                if (numero == numeroBuscado){
                    encontrado = true;
                    break;
                }
            }
            if (encontrado){
                System.out.println("El número se encontró!");
            } else{
                System.out.println("El número no se encontró.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
        } finally{
            scanner.close();
        }
    }
}
