import java.util.Scanner;

public class PruebaScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double numero;
        System.out.println("Digite un número: ");
        numero = entrada.nextDouble();
        System.out.println("Su número es: "+numero);
    }
}