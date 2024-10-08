import java.util.Scanner;

class PiedraPapelTijera {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MINIMO = 1;
        final int MAXIMO = 2;

        System.out.println("Elige: 1= Piedra, 2= Papel, 3= Tijera:");
        int eleccionDelUsuario = scanner.nextInt();

        int aleatorio = (int) (Math.random() * (MAXIMO - MINIMO) + MINIMO);

        String resultado = (eleccionDelUsuario == aleatorio) ? "Empate!" :
                           (eleccionDelUsuario == 1 && aleatorio == 3) ? "Ganaste!" :
                           (eleccionDelUsuario == 2 && aleatorio == 1) ? "Ganaste!" :
                           (eleccionDelUsuario == 3 && aleatorio == 2) ? "Ganaste!" :
                           "Perdiste!";
        
        System.out.println("Tu eleccion: " + eleccionDelUsuario);
        System.out.println("Eleccion de la maquina: " + aleatorio);
        System.out.println(resultado);

        scanner.close();
    }
}