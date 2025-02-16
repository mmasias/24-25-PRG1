public class SIGMA{
    public static void main(String[]args){

        int[][] mundo1={
            {0,1,2,3,4,5,6,7,8,9},
            {1,2,3,4,5,6,7,8,9,0},
            {2,3,4,5,6,7,8,9,0,1},
            {3,4,5,6,7,8,9,0,1,2},
            {4,5,6,7,8,9,0,1,2,3},
        };

        int[][] mundo2={
            {3,2,1,0},
            {2,1,0,3},
            {1,0,3,2},
            {0,3,2,1},
        };

        imprimir2(mundo1);
        imprimir1(mundo2);
    }

    public static void imprimir1(int[][] mundo2){
        for(int row=0;row<mundo2.length;row++){
            for(int column=0;column<mundo2[row].length;column++){
                System.out.print(mundo2[row][column]);
            }
            System.out.println();
        }
    }

    public static void imprimir2(int[][] mundo1){
        for(int row=0;row<mundo1.length;row++){
            for(int column=0;column<mundo1[row].length;column++){
                System.out.print(mundo1[row][column]);
            }
            System.out.println();
        }
    }
}