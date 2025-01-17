import java.util.Arrays;
import java.util.Scanner;
public class Elavador {
    public static void main(String[] args) {
        int FLOORS [] = {0,0,0,0,0,0,0,0,0,0}; 

        int currentFloor = 0;
        FLOORS[currentFloor]=1;
        int destiny;
        int userDestiny;
        String direction="-";        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the floor: ");
        userDestiny = scanner.nextInt();
        destiny = userDestiny;
        
        printing(currentFloor,destiny,FLOORS,direction);
        
                            
    }
                    
    static void printing(int currentFloor, int destiny, int[] FLOORS,String direction) {
        while (currentFloor <= destiny) {
            int elevatorPrint=(FLOORS.length-1);
            while(elevatorPrint>=0){
                direction=directionMaking(currentFloor,destiny);
                System.out.println(elevatorPrint+"-> "+parse(FLOORS[elevatorPrint],destiny,direction));
                elevatorPrint=elevatorPrint-1;
            } 
            currentFloor=currentFloor+1;
            Arrays.fill(FLOORS,0);
            FLOORS[currentFloor]=1;
            System.out.println();
        }
    }
    
    static String parse(int change, int destiny, String direction){
        return switch (change) {
            case 0 -> "|   |";
            case 1 -> "|"+direction+ destiny +direction+"|";
            default -> "???";
        };
    }

    static String directionMaking(int currentFloor, int destiny) {
        if(currentFloor<destiny){
            return "^";
        }
        if(currentFloor>destiny){
            return "v";
        }
        //if(currentFloor==destiny){
        else{
            return "-";
        }
    }
}
        