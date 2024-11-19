import java.util.Scanner;

class AdivinaNumero {
    public static void main(String[] args) {
        final String ADIVINO = "| > Enhorabuena, adivinaste el numero!";
        final String NO_ADIVINO = "| > Una pena, no adivinaste el numero, este era: ";
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        final int INTENTOS = 10;
        
        int turno = 1;
        int numeroOrdenador = 100;
        int numeroUsuario;
        boolean calienteRondaAnterior = false;
        boolean calienteRondaActual;
        boolean noAdivino;

        System.out.println("| >  Vamos a jugar a un juego, adivina el numero dentro del intervalo de [1,100]∈ N");

        do {
            System.out.println("| Turno " + turno + " de " + INTENTOS);
            numeroUsuario = obtenerNumeroUsuario(NUMERO_MAXIMO, NUMERO_MINIMO);
            noAdivino = numeroUsuario!=numeroOrdenador;
            if (noAdivino) {
                darPista(numeroOrdenador, numeroUsuario);
                calienteRondaActual = estaCaliente(numeroOrdenador, numeroUsuario);
                if (calienteRondaActual && calienteRondaAnterior) hacerTrampas(numeroOrdenador, NUMERO_MAXIMO, NUMERO_MINIMO);
                calienteRondaAnterior = calienteRondaActual;
            }
            turno++;
        } while (turno <= INTENTOS && noAdivino);

        System.out.println(noAdivino ? (NO_ADIVINO + numeroOrdenador) : ADIVINO );
    }

    static int generarNumeroAleatorio(int maximo, int minimo) {
        return ((int) (Math.random()*(maximo-minimo+1)+minimo));
    }

    static int obtenerNumeroUsuario(int maximo, int minimo) {
        Scanner entrada = new Scanner(System.in);
        final String ERROR = "| >  Porfavor introduzca un numero dentro del intervalo de [1,100]∈ N";
        final String EMBELLECEDOR = "| >  ";
        int numeroUsuario;

        do {
            System.out.print(EMBELLECEDOR);
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

    static void darPista(int numeroOrdenador, int numeroUsuario) {
        final int CALIENTE_RANGO = 5;
        final int TIBIO_RANGO = 10;
        int diferenacia = Math.abs(numeroOrdenador-numeroUsuario);
        System.out.println("| >  Uyyy, que "+ ((diferenacia<=CALIENTE_RANGO)? "caliente" : diferenacia<=TIBIO_RANGO ? "tibio" : "frio" ) +" estas, sigue asi");
    }

    static boolean estaCaliente(int numeroOrdenador, int numeroUsuario) {
        final int CALIENTE_RANGO = 5;
        int diferenacia = Math.abs(numeroOrdenador-numeroUsuario);
        return diferenacia<=CALIENTE_RANGO;
    }

    static int hacerTrampas(int numeroOrdenador, int numeroMaximo, int numeroMinimo){

        final int RANGO_MAXIMO_MODIFICACION = 5;
        final int RANGO_MINIMO_MODIFICACION = -5;
        System.out.println("| >  Achuuuuuuu");


        int nuevoNumero = numeroOrdenador + generarNumeroAleatorio(RANGO_MAXIMO_MODIFICACION, RANGO_MINIMO_MODIFICACION);
        return (nuevoNumero > numeroMaximo ? numeroMaximo : nuevoNumero < numeroMinimo ? numeroMinimo : nuevoNumero);
    }
}