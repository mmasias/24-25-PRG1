import java.util.Scanner;

public class ClasificacionConductor {

    public static void main(String[] args) {
        
        userInput();
        hasLicense();
        ageClasification();

    }
    
    public static int userInput() {
        System.out.println("Ingrese la edad del conductor: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Ingrese si tiene licencia (1 para Si, 2 para No): ");
        int licenseUserInput = input.nextInt();
        input.close();

        return age, licenseUserInput
    };

