import java.util.Scanner;

class Ejemplo{
public static void main(String[]args){
    Scanner scanner =new Scanner(System.in);

    int minimo, maximo;
}
    System.out.println("Nivel de la dificultad");
    System.out.println("Numero minimo");
    minimo = scanner.nextInt();
    System.out.println("Numero maximo");
    maximo = scanner.nextInt();

    int aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);

    int numeroDelUsuario;
    System.out.println("Dime un numero entre "+minimo+" y "+maximo+"");
    numeroDelUsuario = sacnner.nextInt();
    
    string veredicto;
    
    veredicto = numeroDelUsuario == aleatorio?"Advino!" : "No adivino :";
    System.out.print(veredicto);

    scanner.close();

    }


