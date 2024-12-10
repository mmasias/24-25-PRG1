import java.util.Scanner; 

public class numeroRandom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int maximo;
        int minimo; 
        System.out.println("Nivel de dificultad");
        System.out.println("numero minimo");
        minimo = scanner.nextInt();
        System.out.println("Numero maximo");
        maximo = scanner.nextInt();

        int aleatorio = (int) (Math.random()*(maximo-minimo)+minimo);
        
        int numeroDelUsuario;

        System.out.println("Dime un numero entre "+minimo+" y "+maximo  +"(inclusive)");

        numeroDelUsuario = scanner.nextInt();

        boolean loAdivino;

        loAdivino = numeroDelUsuario==aleatorio;

        System.out.println(loAdivino);


        scanner.close();
    }
}
