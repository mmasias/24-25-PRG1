import java.util.Scanner;

class PiedraPapelTijera {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
        
        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;
        
        System.out.println("Vamos a jugar!");
        System.out.println("Elige entre");
        System.out.println("1 siendo Piedra");
        System.out.println("2 siendo Papel");
        System.out.println("3 siendo Tijeras");
        int jugador = scanner.nextInt();

        int ordenador = (int) (Math.random() * 3) + 1;

        String jugadorTexto;
        jugadorTexto = (jugador == PIEDRA) ? "Piedra" : (ordenador == PAPEL) ? "Papel" : "Tijera";

        String ordenadorTexto = (ordenador == PIEDRA) ? "Piedra" : (ordenador == PAPEL) ? "Papel" : "Tijeras";
        System.out.println("Tu selección: " + jugadorTexto);
        System.out.println("Elección del ordenador: " + ordenadorTexto);

        String resultado;
        resultado = (jugador == ordenador) ? "Empate!" :
                (jugador == PIEDRA && ordenador == TIJERA ||
                jugador == PAPEL && ordenador == PIEDRA ||
                jugador == TIJERA && ordenador == PAPEL) ? "¡Ganaste!" : "Perdiste";
        
        System.out.println(resultado);
            
        }
    }
}



