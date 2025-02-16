
import java.util.Scanner;

class mapmatrix2{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[]args){
    final int[][] ogMap={
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0},
    };
    
    int yCoord=5;
    int xCoord=5;
    
    for(int i=0;i<10;i++){
        int[][] map=ogMap;
        
        //inputting(xCoord,yCoord);
        
        Scanner user=new Scanner(System.in);
        System.out.println("input");
        String userS=user.nextLine();
        System.out.println(user);
        if ("w".equalsIgnoreCase(userS)){yCoord=yCoord-1;}
        if ("a".equalsIgnoreCase(userS)){xCoord=xCoord-1;}
        if ("s".equalsIgnoreCase(userS)){yCoord=yCoord+1;}
        if ("d".equalsIgnoreCase(userS)){xCoord=xCoord+1;}

        map[(yCoord-1)][(xCoord-1)]=1;
        mapping(map);
        //map=ogMap;
    }

        
}


    static void mapping(int[][] map){
        for(int y=0;y<map.length;y=y+1){
            for(int x=0;x<map[y].length;x=x+1){
                System.out.print(map[y][x]+" ");
            }
        System.out.println();    
        }
    }

    //static void inputting(int xCoord, int yCoord) {
        //Scanner user=new Scanner(System.in);
        //System.out.println("input");
        //String userS=user.nextLine();
        //System.out.println(user);
        //if ("w".equalsIgnoreCase(userS)){yCoord=yCoord-1;}
        //if ("a".equalsIgnoreCase(userS)){xCoord=xCoord-1;}
        //if ("s".equalsIgnoreCase(userS)){yCoord=yCoord+1;}
        //if ("d".equalsIgnoreCase(userS)){xCoord=xCoord+1;}    
    //}
}
    

    
