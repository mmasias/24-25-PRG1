package Java;

import java.util.Scanner;

class CarreraCamello {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int posicionJugador = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ".-.-@";
        final String PISTA = ".....";

        final int MAXIMO = 4;
        final int MINIMO = 1;

        final int META = 60;

        boolean enCarrera = true;
        int turno = 0;
        int avance;

        while (enCarrera){
            turno++;

            avance = numeroPasos(entrada);
            posicionJugador = posicionJugador + avance;

            avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            posicionSegundo = posicionSegundo + avance;

            System.out.println("=====".repeat(META +1));
            System.out.println("Turno:" + turno);
            System.out.println(PISTA.repeat(posicionJugador) + CAMELLO);
            System.out.println(PISTA.repeat(posicionSegundo) + CAMELLO);
            
            enCarrera = (posicionJugador < META && posicionSegundo < META);
        
        }

        System.out.println("Ha ganado el " + (posicionJugador > posicionSegundo ? "primero" : posicionJugador == posicionSegundo ? "empate" : "segundo"));

        entrada.close();

    }

    public static int numeroPasos(Scanner scanner) {

        int input;
        double random = Math.random();

        while(true) {
            
            System.out.println("Elija un número del 1 al 4 inclusive");

            input = Integer.parseInt(scanner.nextLine()); 

            if(input > 0 && input < 5) 
                break;

        }       
        
        if(input == 1) {

            if(random < 0.6) return 1;
           
        } else if(input == 2) {

            if(random < 0.4) return 2;

        } else if(input == 3) {

            if(random < 0.3) return 4;

        } else if(input == 4) {

            if(random < 0.1) return 6;

        }

        return -1;

    }

}
