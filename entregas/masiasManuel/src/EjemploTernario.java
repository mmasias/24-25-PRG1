import java.util.Scanner;

class EjemploTernario {
    public static void main(String[] args) {

        final int MAXIMO = 10;
        final int MINIMO = 1;

        int numeroAleatorio = (int) (Math.random() * (MAXIMO - MINIMO)) + MINIMO;

        System.out.println(numeroAleatorio);

        int entrada = new Scanner(System.in).nextInt();

        String respuesta = numeroAleatorio == entrada ? "Adivinó" : "No adivinó";

        System.out.println(respuesta);
        
    }
}
