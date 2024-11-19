
import java.util.Scanner;

class RuletaDeLaSuerte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugemos a la ruleta :3c");
        System.out.println("Elige un número de la ruleta");
        System.out.println("Desde el -1 al 36 (el -1 equivale al 00 en una ruleta real)");
        
        int minimo, maximo;
        
        minimo = -1;
        maximo = 36;
        int random = (int) (Math.random() * (maximo - minimo) + minimo);
        
        String veredicto;
        
        int eleccion = scanner.nextInt();
        
        veredicto = random == eleccion ? "Ganó!" : "Perdió :3c";
        
        System.out.println("El resultado fué: " + random);
        System.out.println(veredicto);

        scanner.close();
    }
}
