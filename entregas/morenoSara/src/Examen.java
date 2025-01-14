import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final int CONFIGURACION = 1;
        final int TEST = 2;
        final int SALIR = 3;

        int eleccionUsuario;

        System.out.println("1.Configuración");
        System.out.println("2.Ejecucción del Test");
        System.out.println("3.Salir del sistema");
        eleccionUsuario = scanner.nextInt();

        if (eleccionUsuario == CONFIGURACION) {
            configuración();
        }else if (eleccionUsuario == TEST) {
            System.out.println("2");

        }else{
            System.out.println("3");
        }
        
        scanner.close();
    }
    static void configuración (){
        Scanner scanner = new Scanner(System.in);

        final int FACIL = 1;
        final int NORMAL = 2;
        final int DIFICIL = 3;

        
        int primerFactor;
        int nivelDificultad;
        int segundoFactor;

        System.out.println("Elige un número entre el 2 y el 10 para realizar la evaluación:");
        primerFactor = scanner.nextInt();

        System.out.println("Elige el nivel de dificultad: 1 Fácil 2 Normal 3 Avanzado");
        nivelDificultad = scanner.nextInt();

        if (nivelDificultad == FACIL) {
            int maximo = 6;
            int minimo = 1;
            segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
        }else if (nivelDificultad == NORMAL) {
            int maximo = 10;
            int minimo = 1;
            segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
        }else{
            int maximo =10;
            int minimo = 4;
            segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
        }
        scanner.close();

    }
}
