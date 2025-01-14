import java.util.Scanner;

public class ClasificacionConductor {

    public static void main(String[] args) {
        int[] inputs;
        inputs = userInput();
        outputPrinting(hasLicense(inputs[1]),ageClasification(inputs[0]));  

    }
    
    public static int[] userInput() {
        System.out.println("Ingrese la edad del conductor: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Ingrese si tiene licencia (1 para Si, 2 para No): ");
        int licenseUserInput = input.nextInt();
        input.close();
        int[] inputs = {age, licenseUserInput};

        return inputs;
    };

    public static boolean hasLicense(int licenseInput) {
        boolean hasLicense;
        hasLicense = licenseInput == 1 ? true : false;
        return hasLicense;
    };

    public static string ageClasification(int ageInput) {
        
    };

    public static void outputPrinting(boolean hasLicense, string ageClasification) {
      };