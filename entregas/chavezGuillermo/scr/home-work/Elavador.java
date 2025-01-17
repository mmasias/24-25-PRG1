import java.util.Arrays;
import java.util.Scanner;
public class Elavador {
    public static void main(String[] args) {
        final int FLOOR_TEMPLATE[] = {0,0,0,0,0,0,0,0,0,0}; 
        int FLOORS [] = {0,0,0,0,0,0,0,0,0,0}; 

        int currentFloor = 0;
        FLOORS[currentFloor]=1;
        int destiny;
        int userDestiny;        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the floor: ");
        userDestiny = scanner.nextInt();
        destiny = userDestiny;
        
        printing(currentFloor,destiny,FLOORS,FLOOR_TEMPLATE);
        
                            
    }
                    
    static void printing(int currentFloor, int destiny, int[] FLOORS, int[] FLOOR_TEMPLATE) {
        while (currentFloor <= destiny) {
            int elevatorPrint=(FLOORS.length-1);
            while(elevatorPrint>=0){
                System.out.println(elevatorPrint+"-> "+parse(FLOORS[elevatorPrint],destiny,direction));
                elevatorPrint=elevatorPrint-1;
            } 
            currentFloor=currentFloor+1;
            Arrays.fill(FLOORS,0);
            FLOORS[currentFloor]=1;
            System.out.println();
        }
    }
    
    static String parse(int change, int destiny String direction){
        return switch (change) {
            case 0 -> "|   |";
            case 1 -> "|"+direction+ destiny +direction+"|";
            default -> "???";
        };
    }
}
        