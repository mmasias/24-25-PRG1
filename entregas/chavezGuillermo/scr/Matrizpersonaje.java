class Matrizpersonaje{
    public static void main(String[]args){
        int[][] map={
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},

        };
        int[]pos={0,0};
        printing(map,pos);
        boolean isPlaying=true;
    }

    static void printing(int[][]map,int[]pos){
        //
        //System.out.println("~".repeat(map[0].length));
        // .repeat como el comando del string anterior, es leido como un int.. (map[0].length lee la longitud de la primera fila en el array, volviendose un margen superior)
        int maxLenght=getLenght(map);
        System.out.println(parse(6).repeat(maxLenght));
        for(int x=0;x<map.length;x=x+1){
            for(int y=0;y<map[x].length;y=y+1){
                //boolean moving(boolean isPlaying, int[]pos);
                //map[1]=pos[1];
                System.out.print(parse(map[x][y]));
            }
            System.out.println("|");}
        System.out.println(parse(6).repeat(maxLenght));   
        }

    static String parse(int value){
    String[] tiles={"^^","0"," $ "," % ","=","w","~~"};
    return tiles[value];
    };

    //static boolean moving(boilean isPlaying int[]pos){}
    //boolean playin=false
    //return 


    static int getLenght(int[][]map){
    int maximun=0;
    for(int i=0;i<map.length;i=i+1)
        if(map[i].length>maximun){
            maximun=map[i].length;}
    return maximun;
    //
    //esta parte me gusta mucho, el ´for va por cada una de las filas, luego se compara la longitud de las filas identificadas por i con el maximo, el sorteo es automatico ndea 
    }
}

//
//profe si lee estos comentarios no se enoje porfa, son notas de clase nomas