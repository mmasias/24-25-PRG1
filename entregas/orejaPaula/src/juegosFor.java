import java.util.Scanner;

class juegosFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int jugador = input.nextInt();
        int ordenador = (int) (Math.random() * 3) + 1;

        int PIEDRA = 1;
        int PAPEL = 2;
        int TIJERA = 3;

        String jugadorTexto;
        if (jugador == PIEDRA) {
            jugadorTexto = "Piedra";
        } else if (jugador == PAPEL) {
            jugadorTexto = "Papel";
        } else {
            jugadorTexto = "Tijeras";
        }

        String ordenadorTexto;
        if (ordenador == PIEDRA) {
            ordenadorTexto = "Piedra";
        } else if (ordenador == PAPEL) {
            ordenadorTexto = "Papel";
        } else {
            ordenadorTexto = "Tijeras";
        }

        System.out.println("Tu elección: " + jugadorTexto);
        System.out.println("Elección de la ordenador: " + ordenadorTexto);

        String resultado;
        if (jugador == ordenador) {
            resultado = "Empate";
        } else if ((jugador == PIEDRA && ordenador == TIJERA) || (jugador == PAPEL && ordenador == PIEDRA) || (jugador == TIJERA && ordenador == PAPEL)) {
            resultado = "¡Ganaste!";
        } else {
            resultado = "Perdiste";
        }

        System.out.println(resultado);

        input.close();
    }
}

