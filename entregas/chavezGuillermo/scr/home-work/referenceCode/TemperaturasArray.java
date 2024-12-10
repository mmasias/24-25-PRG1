import java.util.Scanner;

class Temperaturas {
    public static void main(String[] args) {

        double[] temperaturas = new double[7];

        for (int dia = 0; dia < 7; dia++) {
            temperaturas[dia] = pedirTemperatura();
        }

        double media = calcularMedia(temperaturas);
        double maxima = calcularMaxima(temperaturas);
        double minima = calcularMinima(temperaturas);

        contarHistoria(media, maxima, minima);
    }

    static void contarHistoria(double media, double maxima, double minima) {
        System.out.println("EL HOMBRE DEL TIEMPO");
        System.out.println("La media fue [" + media + "]");
        System.out.println("La máxima fue [" + maxima + "]");
        System.out.println("La mínima fue [" + minima + "]");
    }

    static double calcularMinima(double[] valores) {
        final int DIAS = 7;
        double laMinima = valores[0];
        for (int i = 1; i < DIAS; i++) {
            laMinima = laMinima > valores[i] ? valores[i] : laMinima;
        }
        return laMinima;
    }

    static double calcularMaxima(double[] valores) {
        final int DIAS = 7;
        double laMaxima = valores[0];
        for (int i = 1; i < DIAS; i++) {
            laMaxima = laMaxima < valores[i] ? valores[i] : laMaxima;
        }
        return laMaxima;
    }

    static double calcularMedia(double[] valores) {
        final int DIAS = 7;
        double total = 0;
        for (int i = 0; i < DIAS; i++) {
            total = total + valores[i];
        }
        return total / DIAS;
    }

    static double pedirTemperatura() {
        System.out.println("Digame la temperatura");
        double temperatura;
        temperatura = new Scanner(System.in).nextDouble();
        return temperatura;
    }
}