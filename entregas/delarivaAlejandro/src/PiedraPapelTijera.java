import java.util.Scanner;

class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAXIMO = 3;
        final int MINIMO = 1;

        System.out.println("Elige: 1= Piedra, 2= Papel, 3= Tijeras");
        int eleccionDeUsuario = scanner.nextInt();

        int aleatorio = (int)(Math.random() * (MAXIMO - MINIMO) + MINIMO);

        String resultado = (eleccionDeUsuario == aleatorio) ? "Empate" :
                           (eleccionDeUsuario == 1 && aleatorio == 3)|| 
                           (eleccionDeUsuario == 2 && aleatorio == 1)||
                           (eleccionDeUsuario == 3 && aleatorio == 2) ? "Has ganado" :
                           "Has perdido";

        System.out.println("Elección usuario: " + eleccionDeUsuario);
        System.out.println("Elección ordenador: " + aleatorio);
        System.out.println(resultado);

        scanner.close();

    }
}