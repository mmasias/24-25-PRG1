import java.util.Scanner;

public class ClasificacionEdad {
    public static void main(String[] args) {

        int edad;
        final int LIMITE_INFERIOR = 0;
        final int PRIMERA_INFANCIA = 5;
        final int INFANCIA = 11;
        final int ADOLESCENCIA = 18;
        final int JUVENTUD = 26;
        final int ADULTEZ = 59;
        final int LIMITE_SUPERIOR = 100;

        final String PRIMERA_INFANCIA_DESCRIPTOR = "Primera infancia";
        final String INFANCIA_DESCRIPTOR = "Infancia";
        final String ADOLESCENCIA_DESCRIPTOR = "Adolescencia";
        final String JUVENTUD_DESCRIPTOR = "Juventud";
        final String ADULTEZ_DESCRIPTOR = "Adultez";
        final String MAYOR_DESCRIPTOR = "Persona mayor";
        final String ERROR_DESCRIPCION = "Edad inválida";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una edad entre 0 y 100");
        edad = entrada.nextInt();
        
        String descriptor;
        descriptor = edad < LIMITE_INFERIOR ? ERROR_DESCRIPCION
            : edad <= PRIMERA_INFANCIA ? PRIMERA_INFANCIA_DESCRIPTOR
            : edad <= INFANCIA ? INFANCIA_DESCRIPTOR
            : edad <= ADOLESCENCIA ? ADOLESCENCIA_DESCRIPTOR
            : edad < JUVENTUD ? JUVENTUD_DESCRIPTOR
            : edad < ADULTEZ ? ADULTEZ_DESCRIPTOR
            : edad > LIMITE_SUPERIOR ? ERROR_DESCRIPCION : MAYOR_DESCRIPTOR;

        System.out.println("> " + descriptor);
    }
}
