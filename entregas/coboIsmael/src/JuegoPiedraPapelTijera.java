import java.util.Scanner;

class JuegoPiedraPapelTijera{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        final int MAXIMO = 3;
        final int MINIMO = 1;

        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera");
        int jugador = scanner.nextInt();

        int ordenador = (int)(Math.random() * (MAXIMO - MINIMO) + MINIMO);
        
        String resultado;
        resultado = (jugador == ordenador) ? "Empate!" :
                    (jugador == 1 && ordenador == 3) ||
                    (jugador == 2 && ordenador == 1) ||
                    (jugador == 3 && ordenador == 2) ? "¡Ganaste!" :
                    "Perdiste.";

        System.out.println("Tu eleccion: " + jugador);
        System.out.println("Elección de la maquina: " + ordenador);
        System.out.println(resultado);

        scanner.close();

    }
		
}
    
    
