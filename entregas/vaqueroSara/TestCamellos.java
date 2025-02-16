import java.util.Scanner;

public class TestCamellos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int NUMERO_MAX = 4;
        final int NUMERO_MIN = 1;
        final int META = 30;

        int numeroJugador1 = 0;
        int numeroJugador2 = 0;

        final double POSIBILIDAD1=0.6;
        final double POSIBILIDAD2=0.4;
        final double POSIBILIDAD3=0.3;
        final double POSIBILIDAD4=0.1;

        int turno= 0;

        int distanciaJugador1 = 0;
        int distanciaJugador2 = 0;

        boolean jugando = true;

        while (jugando) {

            turno++;
            System.out.println("Turno "+turno);
            
            numeroJugador1 = scanner.nextInt();
            numeroJugador2 = calcularDecisión(NUMERO_MAX, NUMERO_MIN);

            distanciaJugador1 = distanciaJugador1 +sumarPuntos(numeroJugador2, POSIBILIDAD1, POSIBILIDAD2, POSIBILIDAD3, POSIBILIDAD4);
            distanciaJugador2 = distanciaJugador2 + sumarPuntos(numeroJugador2, POSIBILIDAD1, POSIBILIDAD2, POSIBILIDAD3, POSIBILIDAD4);
            System.out.println(distanciaJugador1+" y "+distanciaJugador2);

            if (distanciaJugador1 >= META || distanciaJugador2 >= META) {
                jugando = false;
            }
        }

       

        System.out.println(numeroJugador1 + "y" + numeroJugador2);

    }

    static int calcularDecisión(int NUMERO_MAX, int NUMERO_MIN) {
        return (int) (Math.random() * (NUMERO_MAX - NUMERO_MIN) + NUMERO_MIN);
    }
    static int sumarPuntos(int numeroJugador, double POSIBILIDAD1, double POSIBILIDAD2, double POSIBILIDAD3, double POSIBILIDAD4) {
       
        double probabilidad = Math.random(); 

      
        if (numeroJugador == 1 && probabilidad <= POSIBILIDAD1) {
            return 1; 
        } else if (numeroJugador == 2 && probabilidad <= POSIBILIDAD2) {
            return 2;
        } else if (numeroJugador == 3 && probabilidad <= POSIBILIDAD3) {
            return 4; 
        } else if (numeroJugador == 4 && probabilidad <= POSIBILIDAD4) {
            return 6; 
        }
        return 0; 
    }
}
