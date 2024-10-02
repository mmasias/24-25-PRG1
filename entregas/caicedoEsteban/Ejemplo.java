package entregas.caicedoEsteban;

import java.util.Scanner;

public class Ejemplo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimo, maximo;
        System.out.println("Nivel de dificultad");
        System.out.println("Numero minimo: ");
        minimo = scanner.nextInt();
        System.out.println("Numero maximo: ");
        maximo = scanner.nextInt();

        int aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);

        int numeroEscogidoPorElUsuario;
        System.out.println("Pon un numero cualquiera entre "+minimo+" y "+maximo+": ");
        numeroEscogidoPorElUsuario = scanner.nextInt();

        String resultado;

        resultado = numeroEscogidoPorElUsuario == aleatorio ? "¡Acertó!" : "No acertó: ";

        System.out.print(resultado);

        System.out.println(resultado + " El número aleatorio era: " + aleatorio);

        scanner.close();


    }



}
    
