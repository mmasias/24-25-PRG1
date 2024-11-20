import java.util.Scanner;

class AdivinarElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimo;
        int maximo;
        int aleatorio;

        System.out.println("Numero minimo deseado");
        minimo = scanner.nextInt();
        System.out.println("Numero Maximo deseado");
        maximo = scanner.nextInt();
        aleatorio = (int) (Math.random() * (maximo - minimo) + minimo);

        int numeroDelUsuario;
        System.out.println("Dime un numero entre " + minimo + " y " + maximo + " incluido");
        numeroDelUsuario = scanner.nextInt();

        String veredictos;
        veredictos = numeroDelUsuario == aleatorio ? "Has adivinado el numero :)" : "No has adivinado el numero :(";

        System.out.println(veredictos);

        scanner.close();
    }
}
