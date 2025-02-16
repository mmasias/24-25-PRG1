
import java.util.Scanner;

class mapmatrix{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[]args){
    int[][] map={
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
    };

    mapPrintint(map);

    Scanner pos=new Scanner(System.in);
    System.out.println("gimmie some coords boi,[x max="+map[0].length+"] [y max="+map.length+"] starting off with x bruh:");
    int xCoord=pos.nextInt();
    //pos.close();
    System.out.println("the x result should be "+xCoord);
    
//    Scanner pos=new Scanner(System.in);
    System.out.println("now gimmie the y value bro:");
    int yCoord=pos.nextInt();
    pos.close();
    System.out.println("the y result should be "+yCoord);

    map[(yCoord-1)][(xCoord-1)]=1;
    //    map[yCoord][xCoord]=1;

    mapPrintint(map);
}

    static void mapPrintint(int[][] map){
        for(int y=0;y<map.length;y=y+1){
            for(int x=0;x<map[y].length;x=x+1){
                System.out.print(map[y][x]+" ");
            }
        System.out.println();    
        }
    }
}
    

    
