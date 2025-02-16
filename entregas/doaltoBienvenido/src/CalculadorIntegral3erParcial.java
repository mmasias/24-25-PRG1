import java.util.Scanner;

public class CalculadorIntegral3erParcial 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("CALCULAR LA INTEGRAL DEFINIDA");
        System.out.println("=============================");

        double a;
        double b;
        int numeroRectangulos;
        double resultadoIntegral;

        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();

        System.out.println("Ingrese el numero de rectangulos: ");
        numeroRectangulos = entrada.nextInt();

        resultadoIntegral = calcularIntegral(a, b, numeroRectangulos);
        System.out.println("El valor aproximado de la integral es: " + resultadoIntegral);
    }

    private static double funcionIntegral(double x) 
    {
        return 5 * (Math.sin(x / 1.59) + 0.33 * Math.sin(3 * x / 1.59) + 0.2 * Math.sin(5 * x / 1.59));
    }

    private static double calcularIntegral(double a, double b, int numeroRectangulos) 
    {
        double anchoRectangulo = (b - a) / numeroRectangulos;
        double areaTotal = 0;

        for (int indiceRectangulo = 0; indiceRectangulo < numeroRectangulos; indiceRectangulo++) {
            double x = a + indiceRectangulo * anchoRectangulo;
            areaTotal += funcionIntegral(x) * anchoRectangulo;
        }

        return areaTotal;
    }
}

