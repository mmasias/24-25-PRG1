public class PruebaMétodosEstaticos {
    
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        int resultadoSuma = PruebaMétodosEstaticos.sumar(5, 3);
        int resultadoResta = PruebaMétodosEstaticos.restar(5, 3);
        int resultadoMultiplicacion = PruebaMétodosEstaticos.multiplicar(5, 3);
        double resultadoDivision = PruebaMétodosEstaticos.dividir(5, 3);
        
        System.out.println("Resultado de la suma: " + resultadoSuma); 
        System.out.println("Resultado de la resta: " + resultadoResta); 
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
    }
}