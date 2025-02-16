import java.util.Scanner;

public class Excel 
{
    private static String[][] excel;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int FILAS = 15;
        final int COLUMNAS = 10;
        final int ANCHURA_CELDAS = 7;

        
        excel = new String[FILAS][COLUMNAS];

        
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                excel[i][j] = "";
            }
        }

        int filaactual = 0;
        int columnaactual = 0;
        boolean ejecutando = true;

        while (ejecutando) {
            imprimirExcel(filaactual, columnaactual);
            System.out.print("(w/a/s/d) para moverse, e para editar, q para salir): ");
            char comando = scanner.next().charAt(0);

            if (comando == 'w') {
                if (filaactual > 0) filaactual--; 
            } else if (comando == 'a') {
                if (columnaactual > 0) columnaactual--; 
            } else if (comando == 's') {
                if (filaactual < FILAS - 1) filaactual++; 
            } else if (comando == 'd') {
                if (columnaactual < COLUMNAS - 1) columnaactual++; 
            } else if (comando == 'e') {
                System.out.print("Ingrese texto para la celda: ");
                scanner.nextLine(); 
                String inputUsuario = scanner.nextLine();
        
                
                if (inputUsuario.length() > ANCHURA_CELDAS) {
                    excel[filaactual][columnaactual] = inputUsuario.substring(0, ANCHURA_CELDAS);
                } else {
                    
                    excel[filaactual][columnaactual] = String.format("%-" + ANCHURA_CELDAS + "s", inputUsuario);
                }
            } else if (comando == 'q') {
                ejecutando = false; 
            } else {
                System.out.println("Comando no válido."); 
            }
        }    

    }

    static void imprimirExcel(int filaactual, int columnaactual) {
        System.out.println("+" + "-------+|".repeat(10)); 

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                String contenidoCelda = excel[i][j];

                
                if (contenidoCelda.length() < 7) {
                    contenidoCelda = String.format("%-7s", contenidoCelda);
                }

                System.out.printf("| %-7s", contenidoCelda);
            }
            System.out.println("|");
            System.out.println("+" + "-------+|".repeat(10));
        }

        System.out.printf("Celda actual -> [%c%d]%n", 'A' + columnaactual, filaactual + 1);
    }
}
