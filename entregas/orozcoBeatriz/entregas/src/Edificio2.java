import java.util.Scanner;

public class Edificio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] edificio = {

                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },
                { 0, 0, 5, 0, 0 },

        };
        int MAXIMO_HORAS = 168;

        String TECHO_EDIFICIO = "|||||||||||||||||||||";
        int hora = 0;
        int totalHorasLuzEncendida = 0;
        System.out.println("Enter para empezar");

        while (hora < MAXIMO_HORAS) {
            hora++;
            scanner.nextLine();
            System.out.println("-------------------");
            System.out.println("Hora: " + hora);
            System.out.println("-------------------");

            totalHorasLuzEncendida = totalHorasLuzEncendida + gestionarVentanas(edificio);
            System.out.println("-------------------");
            System.out.println("Luces encendidas (en horas): " + totalHorasLuzEncendida);
            System.out.println("-------------------");


            System.out.println(TECHO_EDIFICIO);
            
            imprimirEdifico(edificio);

        }

    }

    static int gestionarVentanas(int[][] edificio) {
        int horasLuzEncendida = 0; 
        for (int fila = 0; fila < edificio.length; fila++) {
            for (int columna = 0; columna < edificio[fila].length; columna++) {
            
                if (edificio[fila][columna] != 5) {
                    final double PROBABILIDAD_PERSIANA_ABIERTA = 0.7;
                    final double PROBABILIDAD_LUZ_ENCENDIDA = 0.6;
                    double probabilidadPersianaAbierta = Math.random();
                    double probabilidadLuzEncendida = Math.random();

                    if (probabilidadLuzEncendida < PROBABILIDAD_LUZ_ENCENDIDA) {
                        edificio[fila][columna] = 1;
                        horasLuzEncendida ++;
                    } else if (probabilidadPersianaAbierta < PROBABILIDAD_PERSIANA_ABIERTA) {
                        edificio[fila][columna] = 2;
                    } else
                        edificio[fila][columna] = 0;

                }

            }

        }
        return horasLuzEncendida;
    }

    

    static void imprimirEdifico(int[][] edificio) {
        for (int fila = 0; fila < edificio.length; fila++) {
            for (int columna = 0; columna < edificio[fila].length; columna++) {
                String simbolo = convertirSimbolo(edificio[fila][columna]);
                System.out.print(simbolo + " ");
            }
            System.out.println("");
        }
    }

    static String convertirSimbolo(int valor) {
        switch (valor) {
            case 0:
                return "[ ]";
            case 1:
                return "[*]";
            case 2:
                return "[º]";
            case 5:
                return "[   ]";
            default:
                return "[ ]";

        }
    }

}