import java.util.Scanner;

public class EstudioExamenFinal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugarDeNuevo;

        do {
            jugarDeNuevo = jugarUnaPartida(scanner);
        } while (jugarDeNuevo);

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        scanner.close();
    }

    
    static boolean jugarUnaPartida(Scanner scanner) {
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int[] historialIntentos = new int[100]; 
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número secreto entre 1 y 100. ¡Intenta adivinarlo!");

        while (!adivinado) {
            System.out.print("Ingresa tu número: ");
            int intento = scanner.nextInt();
            historialIntentos[intentos] = intento; 
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número secreto en " + intentos + " intentos.");
                mostrarHistorial(historialIntentos, intentos);
                adivinado = true;
            }
        }

        System.out.print("¿Quieres jugar otra vez? (s/n): ");
        char respuesta = scanner.next().toLowerCase().charAt(0);
        return respuesta == 's';
    }

    static void mostrarHistorial(int[] intentos, int cantidadIntentos) {
        System.out.println("Historial de intentos:");
        for (int i = 0; i < cantidadIntentos; i++) {
            System.out.println("Intento " + (i + 1) + ": " + intentos[i]);
        }
    }
}
