import java.util.Scanner;
class Aleatorio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimo, maximo;
        System.out.println("Nivel de dificultad");
        System.out.println("Numero minimo");
        minimo = scanner.nextInt();
        System.out.println("Numero maximo");
        maximo = scanner.nextInt();

        int aleatorio = (int) (Math.random()*(maximo-minimo)+minimo);

        int numeroDelusuario;

        System.out.println("Dime un numero entre "+minimo+" y "+maximo+" (inclusive)" );
        numeroDelusuario = scanner.nextInt();

        String veredicto;
        
         veredicto = numeroDelusuario==aleatorio ? "Adivino" : "No adivino";

         System.out.println("verdicto");


         scanner.close();


    }
}

