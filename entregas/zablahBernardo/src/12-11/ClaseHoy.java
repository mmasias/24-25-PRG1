class ClaseHoy{
    public static void main(String[] args) {
        final String BIENVENDIO = "Bienvenido";
        saludar(BIENVENDIO);
        System.out.println();
        System.out.println();

        double miPromedio;
        miPromedio = calcularPromedio(4,6.5,9,10);
        System.out.println(miPromedio);
    }    
    
    private static void saludar(String amigo) {
    System.out.println("Hola " + amigo);
    }
    
    private static double calcularPromedio(double parcial, double examen, double continua, double notaProfesor) {
        double promedio;
        promedio = examen * 0.5 + parcial * 0.25 + continua * 0.2 + notaProfesor * 0.05;
        return promedio;
    }
}
