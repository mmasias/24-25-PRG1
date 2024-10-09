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

        int numeroDelUsuario=0;

        System.out.println("Dime un número entre "+minimo+" y "+maximo+ " inclusive");
        numeroDelUsuario=scanner.nextInt();

        boolean loAdivino;

        System.out.println("El número es "+aleatorio);

        loAdivino=numeroDelUsuario==aleatorio;
        System.out.println(loAdivino);



        //scanner.close();




        
    }
}
