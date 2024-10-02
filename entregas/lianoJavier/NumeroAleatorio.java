
import java.util.Scanner;

class NumeroAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugemos a la ruleta :3c");
        System.out.println("Elige un número de la ruleta");
        System.out.println("Desde el -1 al 36");

        int minimo, maximo;

        minimo = 0;
        maximo = 0;
        int random = (int) (Math.random() * (maximo - minimo) + minimo);

        String veredicto;

        int eleccion = scanner.nextInt();

        veredicto = random == eleccion ? "Ganó!" : "Perdió :3c";

        System.out.println(veredicto);

        scanner.close();
    }
}
