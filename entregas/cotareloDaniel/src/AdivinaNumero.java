import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int NUMERO_MAXIMO = 5;
        final int NUMERO_MINIMO = 1;

        int numeroAleatorio;
        int contador = 0;
        int eleccionUsuario;
        int diferencia;

        numeroAleatorio = (int) (Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO)) + NUMERO_MINIMO;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduzca un numero");
            eleccionUsuario = entrada.nextInt();
            contador++;

            if (eleccionUsuario != numeroAleatorio) {
                if (eleccionUsuario < numeroAleatorio) {
                    System.out.println("Es mayor");
                } else if (eleccionUsuario > numeroAleatorio) {
                    System.out.println("Es menor");

                } else {
                    System.out.println("¡Has acertado el numero! En el intento " + contador + "");
                }
            }

            diferencia = (int) Math.abs(eleccionUsuario - numeroAleatorio);

            if (diferencia <= 5) {
                System.out.println("Caliente");
            } else if (diferencia <= 10) {
                System.out.println("Tibio");
            } else {
                System.out.println("Frio");
            }
        }
    }
}