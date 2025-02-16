import java.util.Scanner;

public class Numero2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el numero de numeros");
        int numeroDeNumeros = scanner.nextInt();
        int[] numeros = new int[numeroDeNumeros];
        System.out.println(" introduce " + numeroDeNumeros + " numeros ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println(" la suma de los numeros es " + suma);

        int promedio = suma / numeroDeNumeros;
        System.out.println("el promedio de los numeros es " + promedio);

        scanner.close();

    }

}
