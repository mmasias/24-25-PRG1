public class suma {
    public static void main(String[] args) {
        // Definir el array de enteros
        int[] carnet = {2, 0, 2, 4, 0, 2, 1, 2, 3, 4};
        
        // Variable para almacenar la suma de los elementos en posiciones pares
        int sum = 0;
        
        // Iterar a través de cada elemento del array
        for (int i = 0; i < carnet.length; i++) {
            // Comprobar si la posición es par
            if (i % 2 == 0) {
                sum += carnet[i];
            }
        }
        
        // Imprimir la suma total de los elementos en posiciones pares
        System.out.println("La suma de los elementos en posiciones pares es: " + sum);
    }
}