import java.util.Scanner;

public class ClasificacionConductor {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);
        int edadUsuario;

        final int EDAD_MINIMA= 18;
        final int EDAD_MAXIMA_NOVEL = 19;
        final int EDAD_MAXIMA_EXEPRIMENTADO = 27;
        final int EDAD_MINIMA_JUBILADO = 65;
        boolean licencia;

        System.out.println("Ingrese su edad:");
        edadUsuario =entradaUsuario.nextInt();

        System.out.println("¿Tiene licencia de conducir? (true/false)");
        licencia = entradaUsuario.nextBoolean();

        if (licencia == false) {
            if (edadUsuario < EDAD_MINIMA) {
                System.out.println("Meno de edad, no puede conducir");
            }else{
                System.out.println("Mayor sin licecncia, no puede conducir");
            }
        }else{
            if (edadUsuario < EDAD_MINIMA) {
                System.out.println("Menor de edad, no puede conducir");
            }else if (edadUsuario <= EDAD_MAXIMA_NOVEL) {
                System.out.println("Conductor novel.Puede conducir");
            }else if (edadUsuario <= EDAD_MAXIMA_EXEPRIMENTADO) {
                System.out.println("Conductor exeprimentado.Puede conducir");
            }else if (edadUsuario < EDAD_MINIMA_JUBILADO) {
                System.out.println("Conductor senior.Puede conducir.");
            }else{
                System.out.println("Conductor jubilado.Puede conducir.");
            }
            
        }
        
    }
}
