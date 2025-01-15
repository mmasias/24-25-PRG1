import java.util.Scanner;

public class ClasificacionConductor {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);
        
        int edadUsuario;
        int edadCarnetUsuario;
        int añosConCarnet;

        final int EDAD_MINIMA = 18;
        final int AÑOS_MAXIMOS_NOVEL = 2 ;
        final int AÑOS_MAXIMOS_EXEPRIMENTADO = 10;
        

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
            System.out.println("A que edad se sacó el carnet:");
            edadCarnetUsuario = entradaUsuario.nextInt();

            añosConCarnet = edadUsuario - edadCarnetUsuario;

            if (edadUsuario < EDAD_MINIMA) {
                System.out.println("Menor de edad, no puede conducir");
            }else if (edadUsuario >= EDAD_MINIMA_JUBILADO) {
                System.out.println("Conductor jubilado.Puede conducir.");
            }else if (añosConCarnet <= AÑOS_MAXIMOS_NOVEL ) {
                System.out.println("Años con el carnet:"+ añosConCarnet);
                System.out.println("Conductor novel.Puede conducir");
            }else if (edadUsuario <= AÑOS_MAXIMOS_EXEPRIMENTADO) {
                System.out.println("Años con el carnet:"+ añosConCarnet);
                System.out.println("Conductor experimentado.Puede conducir.");
            }else{
                System.out.println("Años con el carnet:"+ añosConCarnet);
                System.out.println("Conductor senior.Puede conducir.");
            }
            
        }
        
    }
}
