import java.util.Scanner;

class Integral {
    public static void main(String[] args) {
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double integral = 0;
        final double PASO = 0.001;
        for (double x = a; x <= b; x = x + PASO) {
            integral = integral + PASO * funcion(x);
        }
        System.out.println("La integral entre [" + a + "] y [" + b + "] es :" + integral);
    }

    static double funcion(double x) {
        return 5 * (Math.sin(x / 1.59) + 0.33 * Math.sin(3 * x / 1.59) + 0.2 * Math.sin(5 * x / 1.59));
    }
}