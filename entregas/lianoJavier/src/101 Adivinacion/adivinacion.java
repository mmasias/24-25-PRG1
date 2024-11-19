
import java.util.Scanner;

class adivinacion {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        int numeroAAdivinar = tiraDado(NUMERO_MINIMO, NUMERO_MAXIMO);

        int intento = 0;
        final int INTENTOS_MAXIMOS = 10;
        boolean acierta;
        do { 
            intento++;

            int numeroUsuario = preguntarUsuario(NUMERO_MINIMO, NUMERO_MAXIMO);
            int diferencia = calculaDiferencia(numeroUsuario, numeroAAdivinar);
            boolean haEstadoCaliente;
            if (estaCaliente(diferencia)) {
                if (haEstadoCaliente) {
                    numeroAAdivinar += modificaNumero(numeroMaximo, numeroMinimo);
                }
                System.out.println("Caliente");
                haEstadoCaliente = true;
            } else {
                haEstadoCaliente = false;
                if (estaTibio(diferencia)) {
                    System.out.println("Tibio");
                }
            }
            imprimirResumen(numeroUsuario, numeroAAdivinar);
            acierta = numeroAAdivinar == numeroUsuario;
        } while (intento <= INTENTOS_MAXIMOS && !acierta);

    }

    static int preguntarUsuario(int numeroMinimo, int numeroMaximo) {
        Scanner entrada = new Scanner(System.in);
        boolean esCorrecto;
        int respuesta;
        System.out.print("Escoja un número entre 1 y 100: ");
        do {
            respuesta = entrada.nextInt();
            esCorrecto = numeroMaximo >= respuesta && numeroMinimo <= respuesta;
            System.out.println();
            if (!esCorrecto) System.out.println("Numero incorrecto.");
        } while (!esCorrecto);
        return respuesta;
    }

    static int tiraDado(int numeroMinimo, int numeroMaximo) {
        return (int) (Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo);
    }

    static void imprimirResumen(int resultado, int numeroAAdivinar) {
        String mensaje = "acertó!";
        boolean acierta = resultado == numeroAAdivinar;
        if (!acierta) mensaje = daPista(resultado, numeroAAdivinar);
        System.out.println(mensaje);
    }

    static String daPista(int resultado, int numeroAAdivinar) {
        String mensaje = "es mayor";
        if (numeroAAdivinar < resultado) 
            mensaje = "es menor";
        daPistaAvanzada(resultado, numeroAAdivinar);
                
        return mensaje;
    }
        
    static void daPistaAvanzada(int resultado, int numeroAAdivinar) {
        int DISTANCIA_TIBIO = 10;

        int diferencia = (resultado - numeroAAdivinar) > 0 ? resultado - numeroAAdivinar : numeroAAdivinar - resultado;
        boolean caliente = diferencia <= DISTANCIA_CALIENTE;
        boolean tibio = diferencia <= DISTANCIA_TIBIO;

        String mensaje = "frio";
        if (caliente) {
            mensaje = "caliente";
            if (haEstadoCaliente)
            haEstadoCaliente = true;
        } else {
            haEstadoCaliente = false;
            if (tibio) mensaje = "tibio";
        } 

        System.out.println(mensaje);
    }

    static int calculaDiferencia(int numeroUsuario, int numeroAAdivinar) {
        return (numeroUsuario - numeroAAdivinar) > 0 ? numeroUsuario - numeroAAdivinar : numeroAAdivinar - numeroUsuario;
    }

    static boolean estaCaliente(int diferencia) {
        int DISTANCIA_CALIENTE = 5;
        return diferencia <= DISTANCIA_CALIENTE;
    }
    
    static boolean estaTibio(int diferencia) {
        int DISTANCIA_TIBIO = 10;
        return diferencia <= DISTANCIA_TIBIO;
    }

    static int modificaNumero(int numeroMaximo, int numeroMinimo) {
        return (int) (Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo);
    }
}
