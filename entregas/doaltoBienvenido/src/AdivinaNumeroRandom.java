import java.util.Scanner;
import java.util.Random;


class AdivinaNumeroRandom{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minimo;
        int maximo;
        int numeroUsuario;
        
        System.out.println("Dime el numero minimo: ");
        minimo = scanner.nextInt();
        
        System.out.println("Dime un numero maximo: ");
        maximo = scanner.nextInt();

        int numeroRandom = random.nextInt(maximo - minimo) + minimo;

        System.out.println("Dime un numero entre " + minimo + " y " + maximo + " :");
        numeroUsuario = scanner.nextInt();

        String resultado = numeroUsuario==numeroRandom ? "Acertaste" : "Fallaste";
        System.out.println(resultado);

        System.out.println("El numero random era: " +numeroRandom);
  
    }
}