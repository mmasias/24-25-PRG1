import java.util.Scanner;

class Temperaturas {
    public static void main(String[] args) {

        double dia1 = pedirTemperatura();
        double dia2 = pedirTemperatura();
        double dia3 = pedirTemperatura();
        double dia4 = pedirTemperatura();
        double dia5 = pedirTemperatura();
        double dia6 = pedirTemperatura();
        double dia7 = pedirTemperatura();

        double media = calcularMedia(dia1, dia2, dia3, dia4, dia5, dia6, dia7);
        double maxima = calcularMaxima(dia1, dia2, dia3, dia4, dia5, dia6, dia7);
        double minima = calcularMinima(dia1, dia2, dia3, dia4, dia5, dia6, dia7);

        contarHistoria(media, maxima, minima);
    }

    static void contarHistoria(double media, double maxima, double minima) {
        System.out.println("EL HOMBRE DEL TIEMPO");
        System.out.println("La media fue [" + media + "]");
        System.out.println("La máxima fue [" + maxima + "]");
        System.out.println("La mínima fue [" + minima + "]");
    }

    static double calcularMinima(double dia1, double dia2, double dia3, double dia4, double dia5, double dia6,
            double dia7) {
        double laMinima = dia1;
        laMinima = dia2 < laMinima ? dia2 : laMinima;
        laMinima = dia3 < laMinima ? dia3 : laMinima;
        laMinima = dia4 < laMinima ? dia4 : laMinima;
        laMinima = dia5 < laMinima ? dia5 : laMinima;
        laMinima = dia6 < laMinima ? dia6 : laMinima;
        laMinima = dia7 < laMinima ? dia7 : laMinima;
        return laMinima;
    }

    static double calcularMaxima(double dia1, double dia2, double dia3, double dia4, double dia5, double dia6,
            double dia7) {
        double laMaxima = dia1;
        laMaxima = dia2 > laMaxima ? dia2 : laMaxima;
        laMaxima = dia3 > laMaxima ? dia3 : laMaxima;
        laMaxima = dia4 > laMaxima ? dia4 : laMaxima;
        laMaxima = dia5 > laMaxima ? dia5 : laMaxima;
        laMaxima = dia6 > laMaxima ? dia6 : laMaxima;
        laMaxima = dia7 > laMaxima ? dia7 : laMaxima;
        return laMaxima;
    }

    static double calcularMedia(double dia1, double dia2, double dia3, double dia4, double dia5, double dia6,
            double dia7) {
        final int DIAS = 7;
        return (dia1 + dia2 + dia3 + dia4 + dia5 + dia6 + dia7) / DIAS;
    }

    static double pedirTemperatura() {
        System.out.println("Digame la temperatura");
        double temperatura;
        temperatura = new Scanner(System.in).nextDouble();
        return temperatura;
    }
}