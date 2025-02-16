class ClaseHoy {
    public static void main(String[] args) {

        boolean estaContento = Math.random() <= 0.5;
        String miAmigo = "Luis";
        String miAmigo2 = "Maria";

        double miPromedio;

        miPromedio = calcularPromadio(4.5, 6.5, 9.3, 10.0);

        saludar(miAmigo, miAmigo2);

        if (estaContento) {
            cantar();
        } else {
            quejarse();
        }

        despedirse();
    }

    private static double calcularPromadio(double examenParcial, double examenFinal, double evaluacionContinua, double profesor) {
        double promedio;
        promedio = examenFinal*0.5+examenParcial*0.24+evaluacionContinua*0.20+profesor*0.05;
        return promedio;
    }

    private static void saludar(String aQuien, String aQuien2) {
        System.out.println("Hola " + aQuien + " y " + aQuien2);
        System.out.println(":) :) :) :) :)");
        System.out.println("Es un gran dia!!!");
    }

    private static void quejarse() {
        System.out.println("Que examen más complejo");
    }

    private static void despedirse() {
        System.out.println("Adios mundo cruel");
    }

    private static void cantar() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("LA - ");
        }
        System.out.println();
    }

}
