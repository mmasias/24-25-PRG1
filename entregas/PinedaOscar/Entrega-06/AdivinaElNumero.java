import java.util.Scanner;

class AdivinaElNumero {
    public static void main(String[] args) {
        System.out.println("Adivina un numero del 1 al 100");
        boolean jugando = true;

        Scanner entrada = new Scanner(System.in);
        while (jugando) {
            int entradaUsuarioMain = input();
            int numeroOrdenador = (int) pensarNumero();

            if (entradaUsuarioMain == numeroOrdenador) {
                jugando = false;
                System.out.println("correcto!");
            }

            else {
                System.out.println("incorrecto, prueba otra vez, aqui tienes una pista:");
            }
        }

        entrada.close();
    }

    static int input() {
        int entrada = entrada.nextInt();
        return entrada;
    }

    static int pista1() {
        int direccion = 0;
        int numeroDelOrdenador = pensarNumero();

        if (numeroDelOrdenador > input()) {
            direccion = 1;
        }

        if (numeroDelOrdenador < input()) {
            direccion = 2;
        }

        return direccion;
    }

    static int pista2() {
        int cercania = 0;

        int datoPista = Math.abs(pensarNumero() - input());

        if (datoPista <= 5) {
            cercania = 1;
        }

        if (datoPista <= 10) {
            cercania = 2;
        }

        else {
            cercania = 3;
        }

        return cercania;
    }

    static int pensarNumero() {
        int numero = (int) (Math.random() * (100));
        return numero;
    }
}