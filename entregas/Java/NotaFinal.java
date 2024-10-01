
class NotaFinal {

    public static void main(String[] args) {

        double evFinal, evContinua, evParcial, evProfesor;

        evFinal = 8;
        evContinua = 2;
        evParcial = 3;
        evProfesor = 0;

        final double EV_FINAL_PONDERACION = 0.50;
        final double EV_CONTINUA_PONDERACION = 0.20;
        final double EV_PARCIAL_PONEDERACION = 0.25;
        final double EV_PROFESOR_PONDERACION = 0.05;

        double notaFinal;

        notaFinal
                = evFinal * EV_FINAL_PONDERACION
                + evContinua * EV_CONTINUA_PONDERACION
                + evParcial * EV_PARCIAL_PONEDERACION
                + evProfesor * EV_PROFESOR_PONDERACION;

        System.out.println("nota final: " + notaFinal);

    }
}
