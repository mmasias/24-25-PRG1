import java.util.Scanner;

class Ejemplo{

    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);

        int minimo;
        int maximo;
        System.err.println("--Nivel de dificultad--");
        System.out.println("Numero minimo:");
        minimo = scanner.nextInt();
        System.out.println("Numero maximo:");
        maximo = scanner.nextInt();

        int aleatorio = (int) (Math.random()*(maximo-minimo)+minimo);

        int numeroDeUsuario;

        System.out.println("Dime un numero entre "+minimo+" y "+maximo+" (inclusive)");
        numeroDeUsuario = scanner.nextInt();

        String veredicto;

        veredicto = numeroDeUsuario == aleatorio ? "Adivino!" : "No adivino!";

        System.out.println(veredicto);

        /*
        booelean  loAdivino;

        loAdivino = numeroDeUsuario==aleatorio;

        System.out.printIn(loAdivino);
        */

        scanner.close();
    }
}