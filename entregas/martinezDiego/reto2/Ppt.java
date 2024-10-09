package entregas.martinezDiego.reto2;

import java.util.Scanner;

class Ppt {
    public static void main(String[] args) {

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;

        int numeroComputadora = (int) (Math.random() * (TIJERA - PIEDRA + 1)) + PIEDRA;

        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera.");

        int eleccionJugador = new Scanner(System.in).nextInt();

        String eleccionComputadoraTexto = numeroComputadora == PIEDRA ? "Piedra"
                : numeroComputadora == PAPEL ? "Papel" : "Tijera";

        String eleccionJugadorTexto = eleccionJugador == PIEDRA ? "Piedra"
                : eleccionJugador == PAPEL ? "Papel" : eleccionJugador == TIJERA ? "Tijera" : "Inválido";

        System.out.println("Tú elegiste: " + eleccionJugadorTexto);
        System.out.println("El ordenador eligió: " + eleccionComputadoraTexto);

        String resultado = eleccionJugador == numeroComputadora ? "Es un empate"
                : (eleccionJugador == PIEDRA && numeroComputadora == TIJERA) ? "Has ganado"
                        : (eleccionJugador == PAPEL && numeroComputadora == PIEDRA) ? "Has ganado"
                                : (eleccionJugador == TIJERA && numeroComputadora == PAPEL) ? "Has ganado"
                                        : "Has perdido";

        System.out.println(resultado);


    }
}
