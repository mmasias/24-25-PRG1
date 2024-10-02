import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minimo, maximo ;
        System.out.println("Nivel de dificultad");
        System.out.println("Numero minimo");
        minimo = scanner.nextInt();
        System.out.println("Numero maximo");
        maximo = scanner.nextInt();
        int aleatorio=(int)(Math.random()*(maximo-minimo));

        

        
    }
}
