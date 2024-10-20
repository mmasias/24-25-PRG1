import java.util.Scanner;

class Carrera {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        final double PROBABILIDAD_ACIERTO_AGUJERO_1 = 0.6;
        final double PROBABILIDAD_ACIERTO_AGUJERO_2 = 0.4;
        final double PROBABILIDAD_ACIERTO_AGUJERO_3 = 0.3;
        final double PROBABILIDAD_ACIERTO_AGUJERO_4 = 0.1;

        final int AVANCE_ACIERTO_AGUJERO_1 = 1;
        final int AVANCE_ACIERTO_AGUJERO_2 = 2;
        final int AVANCE_ACIERTO_AGUJERO_3 = 4;
        final int AVANCE_ACIERTO_AGUJERO_4 = 6;

        int recorrido = 0;
        int recorridoTotal = 60;
        
        do {
            System.out.println("Opciones: 1 | 2 | 3 | 4");
            System.out.println("Elige un agujero al que tirar:");
            int seleccionJugador = inputUser.nextInt();

            int avance = 0;

            if (seleccionJugador == 1 && Math.random() <= PROBABILIDAD_ACIERTO_AGUJERO_1) {

                avance = AVANCE_ACIERTO_AGUJERO_1;

            } else if (seleccionJugador == 2 && Math.random() <= PROBABILIDAD_ACIERTO_AGUJERO_2) {

                avance = AVANCE_ACIERTO_AGUJERO_2;

            } else if (seleccionJugador == 3 && Math.random() <= PROBABILIDAD_ACIERTO_AGUJERO_3) {

                avance = AVANCE_ACIERTO_AGUJERO_3;

            } else if (Math.random() <= PROBABILIDAD_ACIERTO_AGUJERO_4) {

                avance = AVANCE_ACIERTO_AGUJERO_4;

            }

            recorrido += avance;

            int recorridoRestante; 
            recorridoRestante = (recorridoTotal - recorrido) >= 0 ? (recorridoTotal - recorrido) : 0;

            System.out.println("Has avanzado: "+ avance);
            System.out.println("Te quedan: "+ recorridoRestante);

        } while (recorrido <= recorridoTotal);

        inputUser.close();

    }
}