import java.util.Scanner;
import java.util.Random;

public class JuegoLaberintoDePalabras {
    public static void main (String args[]){

        final int NUMERO_INTENTOS = 6;
        String[] palabras = {"gato", "mesa", "cielo", "nube", "piedra", "flor", "luz", "río"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean jugarDeNuevo = true;

        System.out.println("¡Bienvenido al Laberinto de Palabras!");

        while(jugarDeNuevo){
            String palabraSecreta = palabras[random.nextInt(palabras.length)];
            int intentosRestantes = 6;
            boolean adivinada = false;

            System.out.println("He seleccionado una palabra secreta. Tienes 6 intentos para adivinarla.");

            while (intentosRestantes > 0 && !adivinada) {
                System.out.print("Introduce tu palabra: ");
                String intento = scanner.nextLine();
            }


        }
        
       
        

    }
}
