
import java.util.Scanner;

public class Mathfor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        for (int i= 1; i<=10; i++) {
            int numero =(int)(Math.random()*100) + 1;
            System.out.println("Numero aleatorio" + i + " = " + numero);

        }
        

    }
}
