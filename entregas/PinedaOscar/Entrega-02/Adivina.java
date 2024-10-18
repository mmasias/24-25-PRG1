import java.util.Scanner;

public class Adivina{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quiero que pienses un numero del 1-10");
        String paso;
        paso = scanner.next();
        int numeroCreado = (int)Math.random()*(10-1)+1;

        int numeroFinal;

        System.out.println("Tu numero es "+numeroCreado+"");

        System.out.println("Si no era ese cual era tu numero?");
        numeroFinal = scanner.nextInt();

    }
}