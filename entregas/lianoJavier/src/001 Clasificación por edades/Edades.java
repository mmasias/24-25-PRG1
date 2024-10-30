import java.util.Scanner;

class Edades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final String ERROR_AÑO_INCORRECTO = "ERROR: El número debe ser menor a 100 y mayor a 0.";

        boolean añoCorrecto;
        int añosDelUsuario;

        System.out.println("¿Cuál es tu edad?");

        do {
            añosDelUsuario = entrada.nextInt();
            añoCorrecto = añosDelUsuario < 100 && añosDelUsuario > 0;

            if (!añoCorrecto) {
                System.out.println(ERROR_AÑO_INCORRECTO);
            }
        } while (!añoCorrecto);

        boolean pertenecePrimeraInfancia = añosDelUsuario <= 5,
                perteneceInfancia = añosDelUsuario <= 11,
                perteneceAdolescencia = añosDelUsuario <= 18,
                perteneceJuventud = añosDelUsuario <= 25,
                perteneceAdultez = añosDelUsuario <= 59;

        String aQueEtapaPertenece 
                = pertenecePrimeraInfancia ? "Primera Infancia"
                    : perteneceInfancia ? "Infancia"
                    : perteneceAdolescencia ? "Adolescencia"
                    : perteneceJuventud ? "Juventud"
                    : perteneceAdultez ? "Adultez"
                    : "Persona mayor";

        System.out.println("Perteneces a la etapa de la vida:");
        System.out.println(aQueEtapaPertenece);

        entrada.close();
    }
}
