import java.util.Scanner;

class  RetoPiedraPapelTijera {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int MAXIMO = 3;
        final int MINIMO = 1;

        System.out.println("Elige: 1= Piedra, 2= Papel, 3= Tijera");
        int eleccionDelUsuario = entrada.nextInt();

        int aleatorio = (int)(Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);

        String resultado = (eleccionDelUsuario == aleatorio) ? "Empate" :
                           (eleccionDelUsuario == 1 && aleatorio == 3) ||
                           (eleccionDelUsuario == 2 && aleatorio == 1) || 
                           (eleccionDelUsuario == 3 && aleatorio == 2) ? "Ganaste" :
                           "Perdiste";

        System.out.println("Tu eleccion: " + eleccionDelUsuario);
        System.out.println("Elección de la maquina: " + aleatorio);
        System.out.println(resultado);

        entrada.close();
    }
}