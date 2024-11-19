import java.util.Scanner;

class RetoAdivinaElNumero2 {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        final int INTENTOS = 10;

        int turno = 0;
        int numeroOrdenador = generarNumeroAleatorio(NUMERO_MAXIMO, NUMERO_MINIMO);
        int numeroUsuario;
        boolean calienteRondaAnterior = false;
        boolean calienteRondaActual;
        boolean noAdivino;

        do {
            numeroUsuario = obtenerNumeroUsuario(NUMERO_MAXIMO, NUMERO_MINIMO);
            noAdivino = numeroUsuario!=numeroOrdenador;
            if (noAdivino) {
                calienteRondaActual = darPista(numeroOrdenador, numeroUsuario);
                if (calienteRondaActual && calienteRondaAnterior) hacerTrampas(numeroOrdenador, NUMERO_MAXIMO, NUMERO_MINIMO);
                calienteRondaAnterior = calienteRondaActual;
            } else {
                System.out.println("| >  Enhorabuena, lo adivinaste!");
            }
            turno++;
        } while (turno < INTENTOS && noAdivino);
    }

    static int generarNumeroAleatorio(int maximo, int minimo) {
        return ((int) (Math.random()*(maximo-minimo+1)+minimo));
    }

    static int obtenerNumeroUsuario(int maximo, int minimo) {
        Scanner entrada = new Scanner(System.in);
        final String ERROR = "| >  Porfavor introduzca un numero dentro del intervalo de [1,100]∈ N";
        int numeroUsuario;

        do {
            while(!entrada.hasNextInt()){
                System.out.println(ERROR);
                entrada.next();
            }
            numeroUsuario = entrada.nextInt();
            if (numeroUsuario > maximo || numeroUsuario < minimo) {
                System.out.println(ERROR);
            }
        } while(numeroUsuario > maximo || numeroUsuario < minimo);
        return numeroUsuario;
    }

    static boolean darPista(int numeroOrdenador, int numeroUsuario) {
        final int CALIENTE_RANGO = 5;
        final int TIBIO_RANGO = 10;
        int diferenacia = Math.abs(numeroOrdenador-numeroUsuario);
        System.out.println("| >  Uyyy, que "+ ((diferenacia<=CALIENTE_RANGO)? "caliente" : diferenacia<=TIBIO_RANGO ? "tibio" : "frio" ) +" estas, sigue asi");
        return diferenacia<=CALIENTE_RANGO;
    }

    static int hacerTrampas(int numeroOrdenador, int numeroMaximo, int numeroMinimo){

        final int RANGO_MAXIMO_MODIFICACION = 5;
        final int RANGO_MINIMO_MODIFICACION = -5;
        System.out.println(" | Achuuuuuuu");


        int nuevoNumero = numeroOrdenador + generarNumeroAleatorio(RANGO_MAXIMO_MODIFICACION, RANGO_MINIMO_MODIFICACION);
        return (nuevoNumero > numeroMaximo ? numeroMaximo : nuevoNumero < numeroMinimo ? numeroMinimo : nuevoNumero);
    }
}

