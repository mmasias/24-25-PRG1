import java.util.Scanner;

class Reto002PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Piedra = 1;
        int Paper = 2;
        int Tijera = 3;

        System.out.println("Juguemos a Piedra, Papel o Tijera");
        System.out.println("Tendras que elegir 1 para Piedra, 2 para Papel y 3 para Tijera");
        System.out.println("Introduce el numero de la opcion que jugaras");

        int jugador = scanner.nextInt();
        int numeroAleatorio = (int) (Math.random() * 3) + 1;

        String eleccionJugador;
        eleccionJugador = (jugador == Piedra) ? "Piedra" : (jugador == Paper) ? "Papel" : "Tijera";
        String computadora;
        computadora = (numeroAleatorio == Piedra) ? "Piedra" : (numeroAleatorio == Paper) ? "Papel" : "Tijera";

        System.out.println("La computadora ha elegido: " + computadora);
        System.out.println("Tú elegiste: " + eleccionJugador);

        String veredicto;
        veredicto = (jugador == numeroAleatorio) ? "Han quedado empate" :
                (jugador == Paper && numeroAleatorio == Piedra ||
                        jugador == Tijera && numeroAleatorio == Paper ||
                        jugador == Piedra && numeroAleatorio == Tijera) ? "Has ganado" : "Has perdido";

        System.out.println(veredicto);

        scanner.close();
    }
}