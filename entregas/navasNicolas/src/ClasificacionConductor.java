import java.util.Scanner;

public class ClasificacionConductor {
    public static void main(String[] args) {

        boolean CARNET;
        int edad;

        final int EDAD_MINIMA_CONDUCIR = 18;
        final int EDAD_CONDUCTOR_NOVEL = 2;
        final int EDAD_CONDUCTOR_EXPERIMENTADO = 10;
        final int EDAD_JUBILACION = 65;

        final String MENOR_DESCRIPTOR = "Menor de edad, no puede conducir";
        final String SIN_LICENCIA_DESCRIPTOR = "Mayor de edad, pero sin licencia";
        final String CONDUCTOR_NOVEL_DESCRIPTOR = "Conductor novel";
        final String CONDUCTOR_EXPERIMENTADO_DESCRIPTOR = "Conductor experimentado";
        final String CONDUCTOR_SENIOR_DESCRIPTOR = "Conductor senior";
        final String CONDUCTOR_JUBILADO_DESCRIPTOR = "Conductor jubilado";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese se edad:");
        edad = entrada.nextInt();
        System.out.println("¿Tiene licencia de conducir? (true/false):");
        CARNET = entrada.nextBoolean();

        String clasificacion = edad < EDAD_MINIMA_CONDUCIR ? MENOR_DESCRIPTOR
                : !CARNET ? SIN_LICENCIA_DESCRIPTOR
                        : (edad >= EDAD_MINIMA_CONDUCIR && edad < EDAD_MINIMA_CONDUCIR + EDAD_CONDUCTOR_NOVEL)
                                ? CONDUCTOR_NOVEL_DESCRIPTOR
                                : (edad >= EDAD_MINIMA_CONDUCIR + EDAD_CONDUCTOR_NOVEL
                                        && edad < EDAD_MINIMA_CONDUCIR + EDAD_CONDUCTOR_EXPERIMENTADO)
                                                ? CONDUCTOR_EXPERIMENTADO_DESCRIPTOR
                                                : (edad >= EDAD_MINIMA_CONDUCIR + EDAD_CONDUCTOR_EXPERIMENTADO
                                                        && edad < EDAD_JUBILACION) ? CONDUCTOR_SENIOR_DESCRIPTOR
                                                                : CONDUCTOR_JUBILADO_DESCRIPTOR;

        String mensaje = (edad >= EDAD_MINIMA_CONDUCIR && CARNET)
                ? "Clasificación: " + clasificacion + ". Puede conducir."
                : "Clasificación: " + clasificacion + ". No puede conducir.";

        System.out.println(mensaje);
    }
}
