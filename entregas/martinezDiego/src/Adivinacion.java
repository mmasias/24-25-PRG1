import java.util.Scanner;

public class Adivinacion {

    static Scanner scanner = new Scanner(System.in);

    static final int NUMERO_INTENTOS = 5;
    static final int NUMERO_MAXIMO = 100;
    static final int NUMERO_MINIMO = 1;

    public static void main(String[] args) {
        boolean partidaEnCurso = true;
        int numeroMaquina = generarNumero();
        int intentos = 0;

        while(partidaEnCurso && intentos < NUMERO_INTENTOS) {
            intentos++;
            System.out.println("NUMERO DE INTENTO: " + intentos);
            System.out.println("Ingresa un numero entre " + NUMERO_MINIMO + " y " + NUMERO_MAXIMO);
            
            int numeroUsuario = pedirNumeroUsuario();
            
            if(validarNumero(numeroMaquina, numeroUsuario)) {
                System.out.println("Has adivinado el numero!");
                partidaEnCurso = false;
            } else {
                if (numeroUsuario < numeroMaquina) {
                    System.out.println("El numero es mayor.");
                    System.out.println("===================");
                } else {
                    System.out.println("El numero es menor.");
                    System.out.println("===================");
                }
                
                String pista = darPista(numeroMaquina, numeroUsuario);
                System.out.println("Pista: " + pista);
                System.out.println("===================");
              
               
            }
            
            if (intentos == NUMERO_INTENTOS) {
                System.out.println("Has agotado tus intentos. El numero correcto era: " + numeroMaquina);
                partidaEnCurso = false;
            }
        }
    }

    private static int generarNumero() {
        return (int) (Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO + 1)) + NUMERO_MINIMO;
    }

    private static int pedirNumeroUsuario() {
        return scanner.nextInt();
    }

    private static boolean validarNumero(int numero, int numeroUsuario) {
        return numero == numeroUsuario;
    }

    private static String darPista(int numeroMaquina, int numeroUsuario) {
        int diferencia = Math.abs(numeroMaquina - numeroUsuario);
        if (diferencia <= 5) {
            return "caliente";
        } else if (diferencia <= 10) {
            return "tibio";
        } else {
            return "frio";
        }
    }


}

