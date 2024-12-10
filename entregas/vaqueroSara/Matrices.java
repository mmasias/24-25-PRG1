public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                { 0, 1, 2 },
                { 3, 4, 5 }
        };

        matriz[0][1] = 9;

        imprime(matriz);

    }

    static void imprime (int[][] unaMatriz) {
        for(int fila = 0; fila < unaMatriz.length; fila++) {
            for(int columna = 0; columna < unaMatriz[fila].length; columna++){
                System.out.print("|" + unaMatriz[fila][columna]);
            }
        }
        
        System.out.println("|");
        
        System.out.println("=".repeat(40));
    }
}
