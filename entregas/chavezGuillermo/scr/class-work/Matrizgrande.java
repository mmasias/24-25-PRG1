class Matrizgrande{
    public static void main(String[]args){
        int[][] table={
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,2,3,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,0,0,4,0,0,0,0,0,0,0,0}
        };

        for(int x=0;x<table.length;x=x+1){
            for(int y=0;y<table[x].length;y=y+1){
            System.out.print(parse(table[x][y]));
        }
        System.out.println("|");}
    }

    static String parse(int value){
    String[] tiles={"_"," # "," $ "," % ","=","w"};
    return tiles[value];
};
}