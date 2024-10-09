
import java.util.Scanner;

public class Clase9_10 {

    public static void main(String[] args) {
        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERA = 2;

        int jugadaPersona = 0;
        int jugadaOrdenador = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introduzca 0-piedra 1-papel o 2-tijera");
            jugadaPersona = scanner.nextInt();
            if (jugadaPersona < 0 || jugadaPersona > 2) {
                System.out.println("No es un ajugada válida");
            }
        } while (jugadaPersona < 0 || jugadaPersona > 2);

        /* 
        for(int i=0;i<50;i++){
            jugadaOrdenador=(int)(Math.random()*100)%3;
            System.out.println(jugadaOrdenador);
        }
         */
        jugadaOrdenador = (int) (Math.random() * 100) % 3;
        String jugadaPersonaTexto = "";
        String jugadaOrdenadorTexto = "";
        if (jugadaPersona == PIEDRA) {
            jugadaPersonaTexto = "piedra";
        } else if (jugadaPersona == PAPEL) {
            jugadaPersonaTexto = "papel";
        } else {
            jugadaPersonaTexto = "tijera";
        }
        System.out.println("Persona juega " + jugadaPersonaTexto);

        if (jugadaOrdenador == PIEDRA) {
            jugadaOrdenadorTexto = "piedra";
        } else if (jugadaOrdenador == PAPEL) {
            jugadaOrdenadorTexto = "papel";
        } else {
            jugadaOrdenadorTexto = "tijera";
        }
        System.out.println("Ordenador juega " + jugadaOrdenadorTexto);

        if (jugadaOrdenador == jugadaPersona) {
            System.out.println("Empate");
        } else {
            if (jugadaOrdenador == PIEDRA) {
                if (jugadaPersona == PAPEL) {
                    System.out.println("Gana persona");
                } else {
                    System.out.println("Gana ordenador");
                }
            } else if (jugadaOrdenador == PAPEL) {
                if (jugadaPersona == TIJERA) {
                    System.out.println("Gana persona");
                } else {
                    System.out.println("Gana ordenador");
                }
            } else if (jugadaOrdenador == TIJERA) {
                if (jugadaPersona == PIEDRA) {
                    System.out.println("Gana persona");
                } else {
                    System.out.println("Gana ordenador");
                }
            }

        }

    }
}
