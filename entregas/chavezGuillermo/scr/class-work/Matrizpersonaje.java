class Matrizpersonaje{
    public static void main(String[]args){
        int[][] table={
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},

        };
        int[]pos={0,0};
        printing(table,pos);
    }

    static void printing(int[][]table,int[]pos){
        for(int x=0;x<table.length;x=x+1){
            for(int y=0;y<table[x].length;y=y+1){
                table[1]=pos[1];
                System.out.print(parse(table[x][y]));
            }
            System.out.println("|");}
        }
    static String parse(int value){
    String[] tiles={" ","0"," $ "," % ","=","w"};
    return tiles[value];
};
}