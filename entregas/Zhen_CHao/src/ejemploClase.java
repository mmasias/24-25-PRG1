import java.util.Scanner;
public class EjemploClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int minimo,maximo;

        System.out.println("Nivel de dififcultad");
        System.out.println("Dime el numero minimo");
        minimo = scanner.nextInt();
        System.out.println("Dime el numero maximo");
        maximo = scanner.nextInt();

        int aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);

        int numeroDelUsuario;
        System.out.println("Dime un numeor entre "+minimo+ " y "+maximo);
        numeroDelUsuario =scanner.nextInt();

        String veredicto;
        veredicto = numeroDelUsuario!= aleatorio? "adivino!" :"no adivina!";
        System.out.println(veredicto);
        scanner.close();

        
    }
}

