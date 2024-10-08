import java.util.Scanner;

class JuegoClase {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);

        int PIEDRA = 1;
        int PAPEL = 2;
        int TIJERA = 3;

        int jugador = scanner.nextInt();
        int maquina = (int) (Math.random() * 3) + 1;

        String jugadorTexto;
        jugadorTexto = (jugador == PIEDRA) ? "Piedra" : (jugador == PAPEL) ? "Papel" : "Tijera";
        String maquinaTexto;
        maquinaTexto = (maquina == PIEDRA) ? "Piedra" : (maquina == PAPEL) ? "Papel" : "Tijera";

        System.out.println("Tu eleccion: " + jugadorTexto);
        System.out.println("Eleccion de la maquina: " + maquinaTexto);
        String veredicto;
        veredicto = (jugador == maquina) ? "Empate!" :
        (jugador == PAPEL && maquina == PIEDRA ||
        jugador == TIJERA && maquina == PAPEL ||
        jugador == PIEDRA && maquina == TIJERA) ? "¡Ganaste!" : "¡Perdiste!";

        System.out.println(veredicto);

        scanner.close();
    }
}



    
    

