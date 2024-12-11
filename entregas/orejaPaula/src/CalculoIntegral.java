import java.util.Scanner;
class CalculoIntegral {
    
    private static final double FACTOR1 = 1.59;
    private static final double FACTOR2 = 0.33;
    private static final double FACTOR3 = 0.2;
    private static final double MULTIPLICADOR = 5;
    
    public static double funcion(double x) {
        return MULTIPLICADOR * (Math.sin(x / FACTOR1) 
                + FACTOR2 * Math.sin(3 * x / FACTOR1) 
                + FACTOR3 * Math.sin(5 * x / FACTOR1));
    }
    public static double integrar(double a, double b, int n) {
        double dx = (b - a) / n; 
        double suma = 0.0;
        int i = 0;
        do {
            double x = a + i * dx; 
            suma += funcion(x) * dx; 
            i++;
        } while (i < n);
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        double a, b;
        int n;
        
        System.out.print("Introduce el valor de a (limite inferior): ");
        a = sc.nextDouble();
        System.out.print("Introduce el valor de b (limite superior): ");
        b = sc.nextDouble();
        if (a > b) {
            System.out.println("El limite inferior no puede ser mayor que el superior. Intercambiando valores...");
            double temp = a; 
            a = b;
            b = temp;
        }
        System.out.print("Introduce el numero de divisiones (mayor n, mayor precision): ");
        n = sc.nextInt();
        
        n = n > 0 ? n : 1000; 
       
        double resultado = integrar(a, b, n);
       
        if (resultado > 0) {
            System.out.printf("El area bajo la curva en el intervalo [%.2f, %.2f] es positiva: %.6f%n", a, b, resultado);
        } else if (resultado < 0) {
            System.out.printf("El area bajo la curva en el intervalo [%.2f, %.2f] es negativa: %.6f%n", a, b, resultado);
        } else {
            System.out.printf("El area bajo la curva en el intervalo [%.2f, %.2f] es cero: %.6f%n", a, b, resultado);
        }
        sc.close();
    }
}