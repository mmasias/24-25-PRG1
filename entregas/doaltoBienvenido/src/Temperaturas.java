import java.util.Scanner;
class Temperaturas {
    public static void main(String[] args) {
        double lunes = pedirTemperatura();
        double martes = pedirTemperatura();
        double miercoles = pedirTemperatura();
        double jueves = pedirTemperatura();
        double viernes = pedirTemperatura();
        double sabado = pedirTemperatura();
        double domingo = pedirTemperatura();
        double temperaturaMedia = calcularMedia(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        double temperaturaMaxima = calcularMaxima(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        double temperaturaMinima = calcularMinima(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        contarHistoria(temperaturaMedia, temperaturaMaxima, temperaturaMinima);
    }
    static void contarHistoria(double temperaturaMedia, double temperaturaMaxima, double temperaturaMinima) {
        System.out.println("EL HOMBRE DEL TIEMPO");
        System.out.println("La temperatura media fue [" + temperaturaMedia + "]");
        System.out.println("La temperatura máxima fue [" + temperaturaMaxima + "]");
        System.out.println("La mínima fue [" + temperaturaMinima + "]");
    }
    static double calcularMinima(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado,
            double domingo) {
        double laMinima = lunes;
        laMinima = martes < laMinima ? martes : laMinima;
        laMinima = miercoles < laMinima ? miercoles : laMinima;
        laMinima = jueves < laMinima ? jueves : laMinima;
        laMinima = viernes < laMinima ? viernes : laMinima;
        laMinima = sabado < laMinima ? sabado : laMinima;
        laMinima = domingo < laMinima ? domingo : laMinima;
        return laMinima;
    }
    static double calcularMaxima(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado,
            double domingo) {
        double laMaxima = lunes;
        laMaxima = martes > laMaxima ? martes : laMaxima;
        laMaxima = miercoles > laMaxima ? miercoles : laMaxima;
        laMaxima = jueves > laMaxima ? jueves : laMaxima;
        laMaxima = viernes > laMaxima ? viernes : laMaxima;
        laMaxima = sabado > laMaxima ? sabado : laMaxima;
        laMaxima = domingo > laMaxima ? domingo : laMaxima;
        return laMaxima;
    }
    static double calcularMedia(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado,
            double domingo) {
        final int DIAS = 7;
        return (lunes + martes + miercoles + jueves + viernes + sabado + domingo) / DIAS;
    }
    static double pedirTemperatura() {
        System.out.println("Digame la temperatura");
        double temperatura;
        temperatura = new Scanner(System.in).nextDouble();
        return temperatura;
    }
}