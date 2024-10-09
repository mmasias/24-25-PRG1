import java.util.Scanner;

class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Piedra = 0;
        int Papel = 1;
        int Tijera = 2;

        System.out.println("Juguemos Piedra, Papel o Tijera");
        System.out.println("0 para Piedra, 1 para Papel, 2 para Tijera: ");

        int eleccionjugador = scanner.nextInt();
        int eleccionComputadora = (int)(Math.random() * 3);

        String resultado;

        if ((eleccionjugador == Piedra && eleccionComputadora == Tijera) ||
            (eleccionjugador == Papel && eleccionComputadora == Piedra) ||
            (eleccionjugador == Tijera && eleccionComputadora == Papel)) {
            resultado = "¡Ganaste!";
        } else if (eleccionjugador == eleccionComputadora) {
            resultado = "¡Empate!";
        } else {
            resultado = "¡Perdiste!";
        }

        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println("La computadora eligió: " + opciones[eleccionComputadora]);
        System.out.println(resultado);

        scanner.close();
    }
}
