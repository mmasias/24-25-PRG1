

public class Mapa {
    public static void main(String[] args) {
        int [][] array = {
            {2,1,2},
            {3,2,3},
            {2,1,2},
        };

       imprime(array);

    }
    public static void imprime(int[][]array) {
        for (int fila = 0;fila<array.length;fila++) {
            for(int columna = 0;columna<array[fila].length;columna++){
                System.out.print(parse(array[fila][columna]));
            }
            System.out.println();
        }
    }

    public static String parse(int valor){
        final String[] TILES = {

            "? ",
            " ",
            "X",
            "O", 
            "_o_"
            
    };
    return TILES[valor];
    }
}
