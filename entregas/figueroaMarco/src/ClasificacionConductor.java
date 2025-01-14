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

    public static String ageClasification(int ageInput) {
        String ageClasification;
        if (ageInput < 18) {
            ageClasification = "Menor de edad";
        } else if (ageInput >= 18 && ageInput <= 19) {
            ageClasification = "Joven";
        } else if (ageInput > 20 && ageInput <= 27) {
            ageClasification = "Joven adulto";
        } else if (ageInput >= 28 && ageInput <= 64) {
            ageClasification = "Adulto en edad de plata";
        } else if (ageInput >= 65) {
            ageClasification = "Adulto mayor";
        } else {
            ageClasification = "No se puede clasificar!";
        }
        return ageClasification;
     };

    public static void outputPrinting(boolean hasLicense, String ageClasification) {
      if(!hasLicense){
        System.out.println("El " + ageClasification + " no tiene licencia, es un peaton.");
      } else {
        System.out.println("El " + ageClasification + " tiene licencia, es un conductor.");
      }
    };

}