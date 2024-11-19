import java.util.Scanner;

class adivinaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.close();
    }

    public static void jugar(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroOrdenador = (int) (Math.random() * 100) + 1;
        int intentos = 0;

        System.out.println("Adivina el número entre 1 y 100:");

        while (true) {
            int eleccionJugador = entrada.nextInt();
            intentos++;

            if (eleccionJugador == numeroOrdenador) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            } else if (eleccionJugador >= numeroOrdenador - 5 && eleccionJugador <= numeroOrdenador + 5) {
                System.out.println("Caliente");
            } else {
                System.out.println("Frio");
            }

            if (intentos >= 10) {
                System.out.println("Se te han acabado los intentos, vuelve a internar :)");
            }
            entrada.close();
        }
    }
}