public class MatricesPractica {
    public static void main(String[] args) {
        int[][] matriz ={
            {1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
        };
        for(int fila=0; fila<matriz.length; fila++){
            for(int columna=0; columna < matriz[fila].length; columna++){
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
