import java.util.Scanner;
import java.util.Random;


public class JuegoCalculoRapido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugarDeNuevo = true;
        int numeroDePreguntas = 5;

        System.out.println("¡Bienvenido a Cálculo Rápido!");

        while (jugarDeNuevo) {
            int respuestasCorrectas = 0;
            long inicioTiempo = System.currentTimeMillis();

            for (int i = 0; i < numeroDePreguntas; i++) {
                int numero1 = random.nextInt(20) + 1;
                int numero2 = random.nextInt(20) + 1;
                int operacion = random.nextInt(3); 

                int respuestaCorrecta = 0;
                String simboloOperacion = "";

                switch (operacion) {
                    case 0: 
                        respuestaCorrecta = numero1 + numero2;
                        simboloOperacion = "+";
                        break;
                    case 1: 
                        respuestaCorrecta = numero1 - numero2;
                        simboloOperacion = "-";
                        break;
                    case 2: 
                        respuestaCorrecta = numero1 * numero2;
                        simboloOperacion = "*";
                        break;
                }

                System.out.println("¿Cuánto es " + numero1 + " " + simboloOperacion + " " + numero2 + "?");
                int respuestaUsuario = scanner.nextInt();

                if (respuestaUsuario == respuestaCorrecta) {
                    respuestasCorrectas++;
                    System.out.println("Correcto.");
                } else {
                    System.out.println("Incorrecto. La respuesta correcta era " + respuestaCorrecta);
                }


                
            }

        }




    }


    
}
