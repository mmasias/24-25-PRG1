import java.util.Scanner;
class juego{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PIEDRA = 1, PAPEL = 2, TIJERA = 3;
        final int MAXIMO = 1, MINIM0 = 3;


        System.out.println("Juguemos a piedra papel o tojera");

        int jugador;

        System.out.println("Elige: "+ PIEDRA +" para piedra, "+ PAPEL +" para papel o "+ TIJERA +" para tijera");
        jugador = scanner.nextInt();


        int ordenador;
        ordenador = (int) (Math.random() * (MAXIMO-MINIM0+1) + MINIM0);

        String jugadorTexto;
        jugadorTexto = (jugador == PIEDRA) ? "Piedra" : (jugador == PAPEL) ? "Papel" : "Tijera";

        String ordenadorTexto;
        ordenadorTexto = (ordenador == PIEDRA) ? "Piedra" : (ordenador == PAPEL) ? "Papel" : "Tijera";

        System.out.println("Tu eleccion" + jugadorTexto);
        System.out.println("Eleccion del ordenador " + ordenadorTexto); 

        String resultado;
        resultado = (jugador == ordenador) ? "Empate"
               : (jugador == PIEDRA && ordenador == TIJERA ||
                jugador == PAPEL && ordenador == PIEDRA ||
                jugador == TIJERA && ordenador == PAPEL) ? "Ganaste" : "Perdiste";

                System.out.println("Resulatado");

                scanner.close();




        

        


        

    }

}

    

