import java.util.Scanner;
class Ejemplo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int minimo,maximo;
        System.out.println("Nivel de dificultad");
        System.out.println("Numero minimo ");
        minimo = scanner.nextInt();
        System.out.println("Numero maximo");
        maximo = scanner.nextInt();


        int aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);

        int numeroDelUsuario;
         
        System.out.println("Dime un numero entre "+minimo+" y "+maximo+" (inclusive)");
        numeroDelUsuario = scanner.nextInt();

        String veredicto;

        veredicto = numeroDelUsuario==aleatorio ? "Adivino" : "No adivino";
        System.out.println(veredicto);
        
        scanner.close();
    }



}