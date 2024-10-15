import java.util.Scanner;


class HolaMundo{

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int miEdad = 18;
        String miNombre = "Martin";
        double miDinero = 12.30;

        System.out.println("Hola!\nSoy "+miNombre+"!\nTengo "+miEdad+" años!\nY tan solo dispongo de "+miDinero+" Euros...\n\nPero cuentame de ti!");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = myObj.nextLine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos años tienes?");
        Integer edad = scanner.nextInt();

        System.out.println("\nWoah! entonces tienes "+edad+" años, "+nombre+"!\n\n");

        Scanner escaneo = new Scanner(System.in);
        System.out.println("No crees que eso es genial?");
        String randominputnoimporta = escaneo.nextLine();

        double examenFinal,examenParcial,evaluacionContinua,notaProfesor;

        System.out.println("Bueno ahora si podemos empezar.\nTengo diferentes cosas que tengo que contar para poder pasar\n\nEntre todas mis preocupaciones estan las notas de programacion:\n");
        System.out.println("El Examen Final,\nEl Examen Parcial,\nLa Evaluacion Continua,\nY la Nota de Participacion.\n\nComo crees que me va a ir con las notas?\n");

        Scanner nota1 = new Scanner(System.in);
        System.out.println("Examen Final");
        examenFinal = nota1.nextDouble();
        
        Scanner nota2 = new Scanner(System.in);
        System.out.println("Examen Parcial");
        examenParcial = nota2.nextDouble();

        Scanner nota3 = new Scanner(System.in);
        System.out.println("Evaluacion Continua");
        evaluacionContinua = nota3.nextDouble();

        Scanner nota4 = new Scanner(System.in);
        System.out.println("Nota Participacion");
        notaProfesor = nota4.nextDouble();

        Double total = examenFinal + examenParcial + notaProfesor + evaluacionContinua;
        //System.out.println(total);
        Double average = total / 4;

        System.out.println("Si fuera a sacar esas notas, mi primedio seria de "+average);


    }
}
