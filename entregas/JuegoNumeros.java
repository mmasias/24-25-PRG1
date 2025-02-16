import java.util.Scanner;
public class JuegoNumeros {
    public static void main(String[] args) {
        int numJugador1, numJugador2, numJugador3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Juego numeros Medio");
        System.out.println("------------------------");

        System.out.println("Jugador 1 Di un número: ");
        numJugador1 = entrada.nextInt();
        System.out.println("Jugador 2 Di un número: ");
        numJugador2 = entrada.nextInt();
        System.out.println("Jugador 3 Di un número: ");
        numJugador3 = entrada.nextInt();

        if (((numJugador1>1) && (numJugador2<100)) && 
        ((numJugador2>1) && (numJugador2<100)) && 
        ((numJugador3>1) && (numJugador3<100)))    {
            
            if ((numJugador1 == numJugador2) || (numJugador1==numJugador3) ||  (numJugador2==numJugador3))
            System.out.println("Empate.. Existen dos números iguales");
            
            else if (((numJugador1>numJugador2) && (numJugador1<numJugador3)) 
            || (numJugador1>numJugador3) && (numJugador1<numJugador2 ))
            System.out.println("Ganó el jugador 1");

            else if (((numJugador2>numJugador1) && (numJugador2<numJugador3)) ||
            ((numJugador2>numJugador3) && (numJugador2<numJugador1)))
            System.out.println("Ganó el jugador 2");

            else if (((numJugador3>numJugador2) && (numJugador3<numJugador1)) ||
            ((numJugador3>numJugador1) && (numJugador3<numJugador2)))
            System.out.println("Ganó el jugador 3");

            else System.out.println("Error: Los números deben estar entre 1 y 100");

     }
    }
}
