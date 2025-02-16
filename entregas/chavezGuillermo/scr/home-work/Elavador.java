import java.util.Arrays;
import java.util.Scanner;
public class Elavador {
    public static void main(String[] args) {
        int FLOORS [] = {0,0,0,0,0,0,0,0,0,0}; 

        int currentFloor = 0;
        FLOORS[currentFloor]=1;
        int destiny;
        int userDestiny=0;
        String direction="-";        
        
        destiny=askfloor(userDestiny);

        
        printing(currentFloor,destiny,FLOORS,direction,userDestiny);
        
                            
    }
                    
    static void printing(int currentFloor, int destiny, int[] FLOORS,String direction,int userDestiny) {
        while (currentFloor != destiny) {
            int elevatorPrint=(FLOORS.length-1);
                while(elevatorPrint>=0){
                    direction=directionMaking(currentFloor,destiny);
                    System.out.println(elevatorPrint+"-> "+parse(FLOORS[elevatorPrint],destiny,direction));
                    elevatorPrint=elevatorPrint-1;} 
            if(currentFloor<destiny){
                currentFloor=currentFloor+1;
            }
            if(currentFloor>destiny){
                currentFloor=currentFloor-1;
            }
            Arrays.fill(FLOORS,0);
            FLOORS[currentFloor]=1;
            System.out.println();
        }
        if(currentFloor==destiny){
            int elevatorPrint=(FLOORS.length-1);
                while(elevatorPrint>=0){
                    direction=directionMaking(currentFloor,destiny);
                    System.out.println(elevatorPrint+"-> "+parse(FLOORS[elevatorPrint],destiny,direction));
                    elevatorPrint=elevatorPrint-1;}
            destiny=askfloor(userDestiny);
        }
    }
    static String parse(int change, int destiny, String direction){
        return switch (change) {
            case 0 -> "|   |";
            case 1 -> "|"+direction+ destiny +direction+"|";
            default -> "???";
        };}

    static String directionMaking(int currentFloor, int destiny) {
        if(currentFloor<destiny){
            return "^";}
        if(currentFloor>destiny){
            return "v";}
        //if(currentFloor==destiny){
        else{
            return "-";}}

    static int askfloor(int userDestiny) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the floor: ");
        userDestiny = scanner.nextInt();
        return userDestiny;
    }
}
        