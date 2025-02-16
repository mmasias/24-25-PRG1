import java.util.Scanner;

class JuegoClase {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int PIEDRA = 1;
          int PAPEL = 2;
          int TIJERA = 3;

          int jugador = scanner.nextInt();
          int máquina = (int) (Math.random() * 3) + 1;

          String jugadorTexto;
          jugadorTexto = (jugador == PIEDRA) ? "Piedra" : (jugador == PAPEL) ? "Papel" : "Tijera";
          String máquinaTexto;
          máquinaTexto = (máquina == PIEDRA) ? "Piedra" : (máquina == PAPEL) ? "Papel" : "Tijera";
          
          System.out.println("Tu eleccion: " + jugadorTexto);
          System.out.println("Eleccion de la máquina: " + máquinaTexto);
          String veredicto;
          veredicto = (jugador == máquina) ? "Empate!" :
          (jugador == PAPEL && máquina == PIEDRA ||
          jugador == TIJERA && máquina == PAPEL ||
          jugador == PIEDRA && máquina == TIJERA) ? "¡Ganaste!" : "¡Perdiste!";

          System.out.println(veredicto);

        

       

        scanner.close();
     } 



}