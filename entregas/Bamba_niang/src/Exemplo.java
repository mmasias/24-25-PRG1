import java.util.Scanner;
class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         final int MAXIMO = 10;
         final int MINIMO = 1;

         int aleatorio = (int) (Math.random()*(MINIMO-MAXIMO)+MAXIMO);
         int numeroDelusuario;

         System.out.println("Dime un numero entre 1 y 10 (inclusive)");
         numeroDelusuario = scanner.nextInt();


         System.out.println("aleatorio");

         scanner.close();


    }
    
}
