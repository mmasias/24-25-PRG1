import java.util.Scanner;

class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int MAXIMO = 3;
        final int MINIMO = 1;

        System.out.println("Elige: 1= Piedra, 2= Papel, 3= Tijeras");
        int eleccionDeUsuario = entrada.nextInt();

        int aleatorio = (int)(Math.random() * (MAXIMO - MINIMO) + MINIMO);

        String resultado = (eleccionDeUsuario == aleatorio) ? "Empate" :
                           (eleccionDeUsuario == 1 && aleatorio == 3) ||
                           (eleccionDeUsuario == 2 && aleatorio == 1) ||
                           (eleccionDeUsuario == 3 && aleatorio == 2) ? "Ganaste" :
                           "Perdiste";

        System.out.println("Tu eleccion: " + eleccionDeUsuario);
        System.out.println("Elección de la maquina: " + aleatorio);
        System.out.println(resultado);

        entrada.close();

    }
}