public class Carnet {
    public static void main(String[] args) {
        
        int numero = 2024020065;

        
        int[] digitos = String.valueOf(numero).chars().map(c -> c - '0').toArray();

        
        int[] pares = new int[digitos.length];
        int[] impares = new int[digitos.length];
        int sumaPares = 0, sumaImpares = 0, countPares = 0, countImpares = 0;

        
        for (int d : digitos) {
            if (d % 2 == 0) {
                pares[countPares++] = d;
                sumaPares += d;
            } else {
                impares[countImpares++] = d;
                sumaImpares += d;
            }
        }

        
        int resultadoPares = (sumaPares % 6) + 1;
        int resultadoImpares = (sumaImpares % 6) + 1;

        // Imprimir resultados
        System.out.println("Pares: " + java.util.Arrays.toString(java.util.Arrays.copyOf(pares, countPares)) + " | Resultado: " + resultadoPares);
        System.out.println("Impares: " + java.util.Arrays.toString(java.util.Arrays.copyOf(impares, countImpares)) + " | Resultado: " + resultadoImpares);
    }
}
