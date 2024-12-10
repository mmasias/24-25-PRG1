public class Matrices {
    public static void main(String[] args) {
        int matriz [][] = {
            {4,3,9,9,1,0,6,1,8,8},
            {2,3,8,9,2,1,9,7,0,0},
            {6,7,8,2,1,3,3,3,7,3},
            {4,2,9,5,7,1,9,5,6,3},
            {4,6,7,3,7,7,8,9,2,9},
            {1,6,2,8,2,7,4,7,1,3},
            {3,8,9,5,2,2,7,3,9,5},
            {3,8,9,5,2,2,7,3,9,5},
            {5,2,8,3,1,2,0,1,1,4},
            {3,2,0,3,9,0,4,1,0,1}
        };

        printArray(matriz);
    }


    public static void printArray(int[][] matriz){

        for(int rows = 0; rows < matriz.length;rows++){
            for(int columns = 0; columns < matriz[rows].length; columns++){
                System.out.print(parse(matriz[columns][rows]));
            }
            System.out.println();
        }
    }

    public static String parse(int valueArary){
        final String[] TILES = {"  ","[#]"," -  ","(^^)"," | "," /  ","\\","[---]"," <  ","  >  ","*","^","$","#","@","!"};
        return TILES[valueArary];
    }
}
