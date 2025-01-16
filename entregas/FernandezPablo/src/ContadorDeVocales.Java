import java.util.Scanner;

public class ContadorDeVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean contarDeNuevo = true;

        System.out.println("Bienvenido al Contador de Vocales");

        while (contarDeNuevo) {
            
            System.out.print("Introduce una palabra o frase: ");
            String entrada = scanner.nextLine();

            int contadorVocales = 0;

            for (int i = 0; i < entrada.length(); i++) {
                char caracter = entrada.charAt(i);

                
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contadorVocales++;
                }
            }

            System.out.println("Resultado: " + contadorVocales + " vocales.");

            System.out.print("¿Quieres contar las vocales de otra palabra o frase? (Sí/No): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("sí")) {
                contarDeNuevo = false;



    }
}
