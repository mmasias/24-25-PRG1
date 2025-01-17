import java.util.Scanner;

public class ClasificacionConductor {

    public static void main(String[] args) {
        int[] inputs;
        String[] ages = {};
        inputs = userInput();
        final int PERSON_ID = 0;
        final int DRIVER_ID = 1;
        outputPrinting(hasLicense(inputs[DRIVER_ID]), PERSON_ID, DRIVER_ID, ages);  
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

    public static void personClasification(int ageInput, String[] ages) {
        String personClasification;
        String driverClasification;
        if (ageInput < 18) {
            personClasification = "Menor de edad";
            driverClasification = "Menor de edad que quiso una licencia";
        } else if (ageInput >= 18 && ageInput <= 19) {
            personClasification = "Joven";
            driverClasification = "Conductor Novel";
        } else if (ageInput > 20 && ageInput <= 27) {
            personClasification = "Joven adulto";
            driverClasification = "Conductor Experimentado";
        } else if (ageInput >= 28 && ageInput <= 64) {
            personClasification = "Adulto en edad de plata";
            driverClasification = "Conductor senior";
        } else if (ageInput >= 65) {
            personClasification = "Adulto mayor";
            driverClasification = "Conductor jubilado";
        } else {
            personClasification = "El peaton tiene una edad invalida";
            driverClasification = "El conductor tiene una edad invalida";
        }
        ages[0] = driverClasification;
        ages[1] = personClasification;

     };

    public static void outputPrinting(boolean hasLicense,int personId, int driverId, String[] ages) {
        String personClasification = ages[personId];
        String driverClasification = ages[driverId];
        if(!hasLicense){
        System.out.println("El " + personClasification + " no tiene licencia, es un peaton.");
      } else {
        System.out.println("El " + driverClasification + " tiene licencia, es un conductor.");
      }
    };

}