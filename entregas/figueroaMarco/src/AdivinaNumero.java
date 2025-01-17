import java.util.Scanner;
public class AdivinaNumero { 
    Scanner scanner = new Scanner(System.in);
    
    final int MAX = 10;
    final int MIN = 1;

    int random = (int) (Math.random() * (MAX-MIN) + MIN);
    int userNumber;

    System.out.println("Intenta adivinar el numero aleatorio");
    userNumber = scanner.nextInt();
    System.out.println(random);
    
}
