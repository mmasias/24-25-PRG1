import java.util.Arrays;

public class AlgoritmoCar {
    public static void main(String[] args) {
       
        int numero = 2024020065;
        int sumaPares = 0;
        int sumaImpares = 0;

        
        int[] digitos = convertirANumeros(numero);


       
        for (int digito : digitos) {
            if (digito % 2 == 0) {
                sumaPares += digito; 
            } else {
                sumaImpares += digito; 
            }
        }


        int resultadoPares = (sumaPares % 6) + 1;
        int resultadoImpares = (sumaImpares % 6) + 1;

        
        System.out.println("Suma de dígitos pares: " + sumaPares);
        System.out.println("Suma de dígitos impares: " + sumaImpares);
        System.out.println("Resultado de pares (% 6 + 1): " + resultadoPares);
        System.out.println("Resultado de impares (% 6 + 1): " + resultadoImpares);
    }

    
    public static int[] convertirANumeros(int numero) {
        String numeroStr = String.valueOf(numero);
        int[] digitos = new int[numeroStr.length()];

        for (int i = 0; i < numeroStr.length(); i++) {
            digitos[i] = Character.getNumericValue(numeroStr.charAt(i));
        }

        return digitos;
    }
}