class CalculaNotaFinal {

    public static void main(String[] args){



        /** valor de notas:
         * examen parcial  25%
         * examen final 50%
         * evaluacion del profesor 5%
         * evaluacion continua 20%
         */

        double examenParcial;
        double examenFinal;
        double evaluacionProfesor;
        double evaluacionContinua;
        /**notas sobre 10 */
        examenParcial = 8;
        examenFinal = 7;
        evaluacionContinua = 9;
        evaluacionProfesor = 6;

        System.out.println("Si he sacado en mis parciales una media de " + examenParcial + " puntos, en mi final saque " + examenFinal + " puntos, " + evaluacionContinua + " fue lo que obtuve en mi evaluacion continua, y la nota que me puso mi profesor en su evaluacion personal fue de " + evaluacionProfesor + ", tengo una nota media de:");

        double mediaFinal;

        mediaFinal = examenFinal * 0.5 + examenParcial * 0.25 + evaluacionContinua * 0.2 + evaluacionProfesor * 0.05;

        System.out.println(mediaFinal + " puntos sobre 10"); 

    }


}