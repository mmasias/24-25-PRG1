import java.util.Scanner;

public class TestCaracol {

    public static void main(String[] args) {

        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;
        final int SUPERFICIE = 0;
        final int BAJADA_MAXIMA = 2;
        final int BAJADA_MINIMA = 0;
        final double PROBABILIDAD_COCHE = 0.35;
        final int MOVIMIENTO_COCHE = 2;

        int subidaMaxima = 4;
        int subidaMinima = 1;

        int dia = 1;
        int alturaCaracol = (int) (Math.random() * ((PROFUNDIDAD_MAXIMA - PROFUNDIDAD_MINIMA)) + PROFUNDIDAD_MINIMA);

        Scanner scanner = new Scanner(System.in);

        System.out.println(alturaCaracol);

        final String Caracol = "_@)_/’";
        final String Borde = " [__] ";
        final String fondo = ":.";

        boolean dentroDelPozo = true;

        do {

            subidaMaxima = calcularSubidaMaxima(dia);

            int subida = calcularSubida(subidaMaxima, subidaMinima);
            int bajada = calcularBajada(BAJADA_MAXIMA, BAJADA_MINIMA);
            
            System.out.println("Día " + dia);

            if (Math.random() <= PROBABILIDAD_COCHE){
                bajada = bajada + MOVIMIENTO_COCHE;
                System.out.println("El movimiento de un coche le hizo bajar 2.");
            } else

            alturaCaracol = alturaCaracol - subida + bajada;

           
            System.out.println("Por el día subió " + subida + ", pero bajó " + bajada + ". Está en el la altura " + alturaCaracol);
            dia++;
            
            

            for (int i = SUPERFICIE + 1; i <= PROFUNDIDAD_MAXIMA; i++) {

                if (i < alturaCaracol) {
                    System.out.println(Borde + fondo.repeat(10) + Borde + i);
                } else if (i == alturaCaracol) {
                    System.out.println(Borde + fondo.repeat(3) + Caracol + fondo.repeat(4) + Borde + i);
                } else {
                    System.out.println(Borde + fondo.repeat(10) + Borde + i);
                }
            }


            if (alturaCaracol <= SUPERFICIE) {
                dentroDelPozo = false;
            }
            

            if (dia >= 50) {
                dentroDelPozo = false;
            }

            String continuar = scanner.nextLine();

        } while (dentroDelPozo);

        if (dia >= 50) {
            System.out.println("El caracol muere.");

        } else {
            System.out.println("Salió del pozo.");
        }

    }
    
    static int calcularSubidaMaxima(int dia){
        return  (dia >= 20) ? 2 : ((dia >= 10) ? 3 : 4);
    }

    static int calcularSubida(int subidaMaxima, int subidaMinima){
        return (int) (Math.random() * (subidaMaxima - subidaMinima) + subidaMinima);
    }

    static int calcularBajada(int BAJADA_MAXIMA, int BAJADA_MINIMA){
        return (int) (Math.random() * (BAJADA_MAXIMA - BAJADA_MINIMA) + BAJADA_MINIMA);
    }

}



