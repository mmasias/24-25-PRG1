public class Matriz {
    public static void main(String[] args) {
        int[][] figura = {
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0}, 
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0},
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0}
        };

        mostrarFigura(figura);
    }

    static void mostrarFigura(int[][] figura) {
        for (int[] fila : figura) {
            for (int celda : fila) {
                System.out.print(convertirACaracter(celda));
            }
            System.out.println(); 
        }
    }

    static String convertirACaracter(int numero) {
        final String[] SIMBOLOS = {
            "  ",   
            "[#]",  
            "..",   
            "~",    
            "''",   
            ":::",  
        };

        
        if (numero < 0 || numero >= SIMBOLOS.length) {
            return "??"; 
        }
        return SIMBOLOS[numero];
    }
}
