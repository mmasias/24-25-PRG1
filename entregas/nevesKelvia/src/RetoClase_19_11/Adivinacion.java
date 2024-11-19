import java.util.Scanner;

public class Adivinacion {

    public static void main(String[] args) {
        int numeroSecreto = (int)(Math.random() * 100) + 1;  
        int intentos = 0;  
        int numeroUsuario = 0;  
        boolean adivinado = false;  

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego 'Adivina el número'!");
        System.out.println("El número secreto está entre 1 y 100.");
        System.out.println("Tienes 10 intentos para adivinarlo.");

}
