import java.util.Scanner;
class Temperaturas {
    public static void main(String[] args) {

        final int NUMERO_TEMPERATURAS = 7;

        double temperaturaDia1 = pedirTemperatura();
        double temperaturaDia2 = pedirTemperatura();
        double temperaturaDia3 = pedirTemperatura();
        double temperaturaDia4 = pedirTemperatura();
        double temperaturaDia5 = pedirTemperatura();
        double temperaturaDia6 = pedirTemperatura();
        double temperaturaDia7 = pedirTemperatura();

        double media = calcularMedia(temperaturaDia1, temperaturaDia2, temperaturaDia3, temperaturaDia4, temperaturaDia5, temperaturaDia6, temperaturaDia7);
        double maxima = calcularMaxima(temperaturaDia1, temperaturaDia2, temperaturaDia3, temperaturaDia4, temperaturaDia5, temperaturaDia6, temperaturaDia7);
        double minima = calcularMinima(temperaturaDia1, temperaturaDia2, temperaturaDia3, temperaturaDia4, temperaturaDia5, temperaturaDia6, temperaturaDia7);
         
        contarHistoria(media, maxima, minima);
    }
    static void contarHistoria(double media, double maxima, double minima){
        System.out.println("La temperatura es: " + media);
        System.out.println("La temperatura es: " + maxima);
        System.out.println("La temperatura es: " + minima);
       
    }
    static double calcularMinima(double temperaturaDia1, double temperaturaDia2, double temperaturaDia3, double temperaturaDia4, double temperaturaDia5, double temperaturaDia6, double temperaturaDia7){
           double laMinima = temperaturaDia1;
           laMinima = temperaturaDia2 < laMinima ? temperaturaDia2 : laMinima;
           laMinima = temperaturaDia3 < laMinima ? temperaturaDia3 : laMinima;
           laMinima = temperaturaDia4 < laMinima ? temperaturaDia4 : laMinima;
           laMinima = temperaturaDia5 < laMinima ? temperaturaDia5 : laMinima;
           laMinima = temperaturaDia6 < laMinima ? temperaturaDia6 : laMinima;
           laMinima = temperaturaDia7 < laMinima ? temperaturaDia7 : laMinima;
           return laMinima;
    }

    static double calcularMaxima(double temperaturaDia1, double temperaturaDia2, double temperaturaDia3, double temperaturaDia4, double temperaturaDia5, double temperaturaDia6, double temperaturaDia7){
           double laMaxima = temperaturaDia1;
           laMaxima = temperaturaDia2 > laMaxima ? temperaturaDia2 : laMaxima;
           laMaxima = temperaturaDia3 > laMaxima ? temperaturaDia3 : laMaxima;
           laMaxima = temperaturaDia4 > laMaxima ? temperaturaDia4 : laMaxima;
           laMaxima = temperaturaDia5 > laMaxima ? temperaturaDia5 : laMaxima;
           laMaxima = temperaturaDia6 > laMaxima ? temperaturaDia6 : laMaxima;
           laMaxima = temperaturaDia7 > laMaxima ? temperaturaDia7 : laMaxima;
           return laMaxima;
      }
    static double calcularMedia(double temperaturaDia1, double temperaturaDia2, double temperaturaDia3, double temperaturaDia4, double temperaturaDia5, double temperaturaDia6, double temperaturaDia7){
        final int DIAS = 7;
        return (temperaturaDia1 + temperaturaDia2 + temperaturaDia3 + temperaturaDia4 + temperaturaDia5 + temperaturaDia6 + temperaturaDia7)/7;
    }

    static double pedirTemperatura() {
        System.out.println("Digame la temperatura");
        return new Scanner(System.in).nextDouble();
    }
}