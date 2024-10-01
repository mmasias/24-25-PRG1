class HolaMundo{

    public static void main(String[]args){
        System.out.println("==========================");
        System.out.println("|Hola Mundo              |");
        System.out.println("|Hoy comere macarrones :D|");
        System.out.println("|Adios Mundo!            |");
        System.out.println("==========================");

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 12;
        dinero = 100;
        nombre = "Federico";
        unChar = 'x';
        System.out.println(edad);
        System.out.println(dinero);
        System.out.println(nombre);

        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y " + dinero + " euros");

        System.out.println(unChar);

        System.out.println("Pero por culpa de la inflación...");

        double dineroNuevo;

        dineroNuevo = dinero - dinero*0.4;

        System.out.println("Ahora solo tengo " + dineroNuevo + " euros.");

        double dineroTrasBitcoin;

        dineroTrasBitcoin = dineroNuevo + 100000000;

        /** Intente hacer exponente pero dado que es un double y no un int me dio error */

        System.out.println("Milagrosamente, ya que inverti en bitcoin hace 15 años, ahora tengo la gran suma de " + dineroTrasBitcoin + " euros.");

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
