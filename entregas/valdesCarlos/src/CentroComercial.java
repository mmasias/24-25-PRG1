import java.util.Scanner;

class Edificio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int PLANTAS = 8; // Total de plantas
        final int HABITACIONES = 6; // Habitaciones por planta
        final int DIAS_SEMANA = 7; // Días en la semana
        final int HORAS_DIA = 24; // Horas en un día

        // Simulación de una semana
        for (int dia = 1; dia <= DIAS_SEMANA; dia++) {
            for (int hora = 0; hora < HORAS_DIA; hora++) {
                // Mostrar el encabezado
                System.out.println("Dia " + dia + " - " + hora + ":00h");
                System.out.println("               __/\\__");
                System.out.println("  |    |    |  |####|  |    |    |  ");
                System.out.println("====================================");

                // Mostrar estado de las plantas
                for (int planta = 7; planta >= 1; planta--) {
                    String habitaciones = " "; // Usamos una cadena para almacenar el estado de las habitaciones

                    for (int habitacion = 0; habitacion < HABITACIONES; habitacion++) {
                        // Generar un número aleatorio del 1 al 10 para simular persiana y luz
                        int persiana = (int)(Math.random() * 10 + 1); // 1-10
                        int luz = (int)(Math.random() * 10 + 1); // 1-10

                        boolean persianaAbierta = (persiana <= 7); // 70% de abrir
                        boolean luzEncendida = (luz <= 6); // 60% de encender

                        // Construir estado de la habitación
                        if (persianaAbierta) {
                            habitaciones += "[ ]"; // Ventana abierta
                        } else {
                            habitaciones += (luzEncendida ? "[*]" : "[º]"); // Ventana cerrada
                        }
                        
                        if (habitacion < HABITACIONES - 1) {
                            habitaciones += ": :"; // Separador de habitaciones
                        } 
                    }
                    // Imprimir el estado de las habitaciones y la planta sin usar printf
                    System.out.println(":" + habitaciones + "       - P" + planta);
                }

                // Mostrar la base del hotel
                System.out.println("------------------------------------");
                System.out.println("     ==========================");
                System.out.println("   ==============================");
                System.out.println(" ==================================");
                System.out.println();
            }
        }
        entrada.close();
    }
}
