import java.util.Scanner;

class Prueba {
    public static void main(String[] args) {

        final int MENOR_EDAD = 17;
        final int MAYOR_EDAD = 18;
        final int CONDUCTOR_NOVEL = 20;
        final int CONDUCTOR_EXPERIMENTADO = 27;
        final int CONDUCTOR_SENIOR = 64;
        final int CONDUCTOR_JUBILADO = 65;

        final String MENOR_EDAD_DETECTOR = "Menor de edad, no puede conducir. ";
        final String SIN_LICENCIA = "No tiene licencia. ";
        final String MAYOR_EDAD_DETECTOR = "Mayor de edad. ";
        final String CONDUCTOR_NOVEL_DETECTOR = "Conductor novel. ";
        final String CONDUCTOR_EXPERIMENTADO_DETECTOR = "Conductor experimentado. ";
        final String CONDUCTOR_SENIOR_DETECTOR = "Conductor senior. ";
        final String CONDUCTOR_JUBILADO_DETECTOR = "Conductor jubilado. ";

        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        boolean licencia;
        System.out.println("¿Tiene licencia de conducir? (True/false)");
        licencia = entrada.nextBoolean();

        String detector;
        detector = edad <= MENOR_EDAD ? MENOR_EDAD_DETECTOR
            : !licencia ? SIN_LICENCIA
            : (edad >= MAYOR_EDAD && edad<=CONDUCTOR_NOVEL) ? CONDUCTOR_NOVEL_DETECTOR
            : (edad > CONDUCTOR_NOVEL && edad<=CONDUCTOR_EXPERIMENTADO) ? CONDUCTOR_EXPERIMENTADO_DETECTOR
            : (edad > CONDUCTOR_EXPERIMENTADO && edad<=CONDUCTOR_SENIOR) ? CONDUCTOR_SENIOR_DETECTOR
            : CONDUCTOR_JUBILADO_DETECTOR;

        String mensaje = (edad >= MAYOR_EDAD && licencia)
            ? ("Clasificacion: " + detector + "Tiene licencia")
            : ("Clasificacion: " + detector + "No tiene licencia");
        
        System.out.println(mensaje);

        entrada.close();

        }
    }

