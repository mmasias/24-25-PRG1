
import java.util.Scanner;

class adivinacion {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        int resultado = preguntarUsuario(NUMERO_MINIMO, NUMERO_MAXIMO);
        int numeroAAdivinar = tiraDado(NUMERO_MINIMO, NUMERO_MAXIMO);
        imprimirResumen(resultado, numeroAAdivinar);

    }

    static int preguntarUsuario(int numeroMinimo, int numeroMaximo) {
        Scanner input = new Scanner(System.in);
        boolean esCorrecto;
        int respuesta;
        System.out.print("Escoja un número entre 1 y 100: ");
        do {
            respuesta = input.nextInt();
            esCorrecto = numeroMaximo >= respuesta && numeroMinimo <= respuesta;
            System.out.println();
            if (!esCorrecto) System.out.println("Numero incorrecto.");
        } while (!esCorrecto);
        input.close();
        return respuesta;
    }

    static int tiraDado(int numeroMinimo, int numeroMaximo) {
        return (int) (Math.random() * (numeroMaximo - numeroMinimo) + numeroMinimo);
    }

    static void imprimirResumen(int resultado, int numeroAAdivinar) {
        String mensaje = "acertó!";
        boolean acierta = resultado == numeroAAdivinar;
        if (!acierta) mensaje = daPista(resultado, numeroAAdivinar);
        System.out.println(mensaje);
    }

    static String daPista(int resultado, int numeroAAdivinar) {
        String mensaje = "es mayor";
        if (numeroAAdivinar > resultado) 
            mensaje = "es menor";
        
        return mensaje;
    }
}
