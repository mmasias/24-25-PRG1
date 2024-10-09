import java.util.Scanner;

class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Piedra = 1;
        int Papel = 2;
        int Tijera = 3;

        System.out.println("¿Quieres jugar Piedra, Papel o Tijera?");
        System.out.println("1 para Piedra, 2 para Papel, 3 para Tijera: ");

        int eleccionusuario = scanner.nextInt();
        int eleccionComputadora = (int)(Math.random() * 3);

        String resultado;

        if ((eleccionusuario == Piedra && eleccionComputadora == Tijera) ||
            (eleccionusuario == Papel && eleccionComputadora == Piedra) ||
            (eleccionusuario == Tijera && eleccionComputadora == Papel)) {
            resultado = "¡Victoria :)!";
        } else if (eleccionusuario == eleccionComputadora) {
            resultado = "¡Empate!";
        } else {
            resultado = "¡Perdiste :/";
        }

        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println("Elección de la computadora: " + opciones[eleccionComputadora]);
        System.out.println(resultado);

        scanner.close();
    }
}