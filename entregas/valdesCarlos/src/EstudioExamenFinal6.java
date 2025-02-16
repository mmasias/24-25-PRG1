public class EstudioExamenFinal6 {

    public static void main(String[] args) {
        
        int[][] tablero = generarTablero(8, 8);

        
        System.out.println("Tablero de recompensas:");
        imprimirTablero(tablero);

        
        int[] conteos = contarValores(tablero);
        System.out.println("\nResultados:");
        System.out.println("Total de valores pares: " + conteos[0]);
        System.out.println("Total de valores impares: " + conteos[1]);
        System.out.println("Total de valores >= 50: " + conteos[2]);

        
        int[] maximo = encontrarMaximo(tablero);
        System.out.println("\nValor más alto: " + maximo[0] + " (Posición: fila " + maximo[1] + ", columna " + maximo[2] + ")");
    }

   
    static int[][] generarTablero(int filas, int columnas) {
        int[][] tablero = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = (int) (Math.random() * 100) + 1; 
            }
        }
        return tablero;
    }

    
    static void imprimirTablero(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int valor : fila) {
                System.out.printf("%4d", valor); 
            }
            System.out.println();
        }
    }

    
    static int[] contarValores(int[][] tablero) {
        int pares = 0;
        int impares = 0;
        int mayores50 = 0;

        for (int[] fila : tablero) {
            for (int valor : fila) {
                if (valor % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                if (valor >= 50) {
                    mayores50++;
                }
            }
        }

        return new int[]{pares, impares, mayores50};
    }

    
    static int[] encontrarMaximo(int[][] tablero) {
        int maximo = Integer.MIN_VALUE;
        int filaMax = -1;
        int colMax = -1;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] > maximo) {
                    maximo = tablero[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }

        return new int[]{maximo, filaMax, colMax};
    }
}
