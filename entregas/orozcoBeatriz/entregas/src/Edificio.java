import java.util.Scanner;

public class Edificio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputUsuario;

        final int PLANTAS = 7;
        final int HABITACIONES = 7;
        final int HORAS = 24;
        final int DIAS = 7;
        final double PH_PERSIANA = 0.7;
        final double PH_LUZ = 0.6;
        final String VENTANA_CERRADA = "[ ]";
        final String LUZ_APAGADA = "[º]";
        final String LUZ_ENCENDIDA = "[*]";
        final String INTERMEDIO = "[   ]";
        final String TECHO_HOTEL = "====================================";
        final String TECHO_HOTEL_2 = "  |    |    |  |####|  |    |    |  ";
        final String TECHO_HOTEL_3 = "               __/\\__             ";
        final String SUELO_HOTEL = "------------------------------------";
        final String ESCALERA_1 = "     ==========================     ";
        final String ESCALERA_2 = "   ==============================   ";
        final String ESCALERA_3 = " ================================== ";

        int dia = 0;

        do { 
            for (int j = 0; j < DIAS; j++) {
                dia++;
                for (int i = 0; i < HORAS;  i++) {
                    System.out.println("Dia: " + dia + " - " + i + ":00h");
                System.out.println(TECHO_HOTEL_3);
                System.out.println(TECHO_HOTEL_2);
                System.out.println(TECHO_HOTEL);
                for (int y = PLANTAS; y >= 1; y--){
                    System.out.print(":");
                    for (int x = 0; x < HABITACIONES; x++) {
                        double probabilidadPersianaBajada = Math.random();
                        double probabilidadLuzEncendida = Math.random();
                        if (x == 3) {
                            System.out.print(INTERMEDIO);
                        } else if (probabilidadPersianaBajada >  PH_PERSIANA) {
                            System.out.print(VENTANA_CERRADA);
                        } else if (probabilidadLuzEncendida >  PH_LUZ) {
                            System.out.print(LUZ_APAGADA);
                        } else {
                            System.out.print(LUZ_ENCENDIDA);
                        }
                        System.out.print("::");
                    }
                    System.out.println(" - P"+ y);
                }
                System.out.println(SUELO_HOTEL);
                System.out.println(ESCALERA_1);
                System.out.println(ESCALERA_2);
                System.out.println(ESCALERA_3);
                inputUsuario = scanner.nextLine();
                }
            }
        } while (dia < 7);
    }

}
