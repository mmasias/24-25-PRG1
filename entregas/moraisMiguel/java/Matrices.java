class Matrices{
    public static void main(String[]args){

        int[][] matriz ={
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 4, 0, 1, 1, 1, 1, 1, 6, 1, 0, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 0, 0, 0, 5, 0, 0, 6, 1, 5, 0, 0, 3, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 5, 1, 1, 6, 1, 1, 1, 1, 3, 1, 0, 1 },
                { 1, 4, 4, 4, 0, 0, 0, 0, 5, 1, 0, 6, 5, 0, 0, 0, 3, 1, 0, 1 },
                { 1, 1, 1, 2, 2, 2, 2, 2, 2, 1, 5, 1, 1, 1, 1, 1, 3, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1 },
                { 1, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 3, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
        };
         for(int fila=0;fila<matriz.length;fila++){
                for(int columna=0;columna<matriz[fila].length;columna++){
                    System.out.print(parse(matriz[fila][columna]));
                }
            System.out.println("|");
         }
    }

    static String parse(int valor){
        final String[] TILES = {"   ","[#]"," . ","~ ~",";:;","/|/","owo"};
        return TILES[valor];
    }
}
