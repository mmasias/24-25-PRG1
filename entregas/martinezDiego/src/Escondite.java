import java.util.Scanner;

public class Escondite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombresEscondites = { "arbol", "banco", "caseta", "arbusto", "columpio", "tobogan" };

        final int MINIMO = 0;
        final int MAXIMO = 5;

        int niño1 = (int) (Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
        int niño2 = (int) (Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
        int niño3 = (int) (Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);

        boolean jugando = true;
        int niñosEncontrados = 0;
        int intentos = 10;

        while (jugando && intentos > 0) {
            System.out.println("------------------");
            System.out.println("INTENTO: " + intentos);
            System.out.println("------------------");
            intentos--;

            System.out.println("pulsa para seleccionar un lugar del 0 al 5");
            for (int i = 0; i < nombresEscondites.length; i++) {
                System.out.print(i + " " + nombresEscondites[i] + "||");
            }
            int niñoUsuario = scanner.nextInt();

            if (niñoUsuario == niño1) {
                System.out.println("has encontrado al niño 1");
                System.out.println("el niño 1 estaba en " + nombresEscondites[niño1]);
                niñosEncontrados++;
            } else if (niñoUsuario != niño1) {
                System.out.println("el niño 1 no estaba en ese sitio ");
            }

            if (niñoUsuario == niño2) {
                System.out.println("has encontrado al niño 2");
                System.out.println("el niño 2 estaba en " + nombresEscondites[niño2]);
                niñosEncontrados++;
            } else if (niñoUsuario != niño2) {
                System.out.println("el niño 2 no estaba en ese sitio ");
            }

            if (niñoUsuario == niño3) {
                System.out.println("has encontrado al niño 3");
                System.out.println("el niño 3 estaba en " + nombresEscondites[niño3]);
                niñosEncontrados++;
            } else if (niñoUsuario != niño3) {
                System.out.println("el niño 3 no estaba en ese sitio ");
            }

            if (niñosEncontrados == 3) {
                System.out.println("has encontrado a todos los niños");
                jugando = false;
            }

        }
        scanner.close();

    }
}
