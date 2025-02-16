import java.util.Scanner;

class CarreraCaballos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int posicionJugador = 0;
        int posicionOrdenador = 0;

        final String CABALLO = ",--,^";
        final String PISTA = "-";
        final int MAX_AVANCE = 3;
        final int MIN_AVANCE = 1;
        final int META = 60;

        boolean carreraEnProgreso = true;
        int numeroTurnos = 0;
        int avanceJugador, avanceOrdenador;

        System.out.println("¡Comienza la carrera de caballos!");

        while (carreraEnProgreso) {
            numeroTurnos++;

            avanceJugador = (int) (Math.random() * MAX_AVANCE - MIN_AVANCE + 1) + MIN_AVANCE;
            posicionJugador += avanceJugador;

            avanceOrdenador = (int) (Math.random() * MAX_AVANCE - MIN_AVANCE + 1) + MIN_AVANCE;
            posicionOrdenador += avanceOrdenador;

            System.out.println("=".repeat(META + 1));
            System.out.println("Turno: " + numeroTurnos);
            System.out.println("Jugador: " + PISTA.repeat(Math.min(posicionJugador, META)) + CABALLO);
            System.out.println("Ordenador: " + PISTA.repeat(Math.min(posicionOrdenador, META)) + CABALLO);

            if (posicionJugador >= META || posicionOrdenador >= META) {
                carreraEnProgreso = false;
            }

            System.out.println("Presiona Enter para el siguiente turno...");
            input.nextLine();
        }

        if (posicionJugador >= META && posicionOrdenador >= META) {
            System.out.println("¡Empate! Ambos han llegado a la meta al mismo tiempo.");
        } else if (posicionJugador >= META) {
            System.out.println("¡Felicidades! El jugador ha ganado.");
        } else {
            System.out.println("El ordenador ha ganado la carrera.");
        }

        input.close();
    }
}
