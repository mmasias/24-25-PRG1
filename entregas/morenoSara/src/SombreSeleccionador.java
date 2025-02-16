import java.util.Scanner;

public class SombreSeleccionador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int primeraPregunta;
        int segundaPregunta;
        int terceraPregunta;
        int cuartaPregunta;
        int quintaPregunta;

        final int RESPUESTA_GRYFFINDOR = 1;
        final int RESPUESTA_SLYTHERIN = 2;
        final int RESPUESTA_HUFFLEPUFF = 3;
        final int RESPUESTA_REVENCLAW = 4;
        


        final int PUNTO_POR_PREGUNTA = 1;

        int marcadorGryffindor = 0;
        int marcadorSlytherin = 0;
        int marcadorHufflepuff = 0;
        int marcadorRavenclaw = 0;

        introducciónJuego();
        entrada.nextLine();
        
        primeraPregunta();
        primeraPregunta = entrada.nextInt();

        if (primeraPregunta == RESPUESTA_GRYFFINDOR) {
            marcadorGryffindor ++;
        }else if (primeraPregunta == RESPUESTA_SLYTHERIN) {
            marcadorSlytherin ++;
        }else if (primeraPregunta == RESPUESTA_HUFFLEPUFF) {
            marcadorHufflepuff ++;
        }else if (primeraPregunta == RESPUESTA_REVENCLAW) {
            marcadorRavenclaw ++;
        }
        segundaPregunta();
        segundaPregunta= entrada.nextInt();

        if (segundaPregunta == RESPUESTA_GRYFFINDOR) {
            marcadorGryffindor ++;
        }else if (segundaPregunta == RESPUESTA_SLYTHERIN) {
            marcadorSlytherin ++;
        }else if (segundaPregunta == RESPUESTA_HUFFLEPUFF) {
            marcadorHufflepuff++;
        }else if (segundaPregunta == RESPUESTA_REVENCLAW) {
            marcadorRavenclaw++;
        }
        terceraPregunta();
        terceraPregunta= entrada.nextInt();
        if (terceraPregunta == RESPUESTA_GRYFFINDOR) {
            marcadorGryffindor ++;
        }else if (terceraPregunta == RESPUESTA_SLYTHERIN) {
            marcadorSlytherin++;
        }else if (terceraPregunta == RESPUESTA_HUFFLEPUFF) {
            marcadorHufflepuff++;
        }else if (terceraPregunta == RESPUESTA_REVENCLAW) {
            marcadorRavenclaw ++;
        }
        cuartaPregunta();
        cuartaPregunta= entrada.nextInt();
        if (cuartaPregunta == RESPUESTA_GRYFFINDOR) {
            marcadorGryffindor++;
        }else if (cuartaPregunta == RESPUESTA_SLYTHERIN) {
            marcadorSlytherin++;
        }else if (cuartaPregunta == RESPUESTA_HUFFLEPUFF) {
            marcadorHufflepuff++;
        }else if (cuartaPregunta == RESPUESTA_REVENCLAW) {
            marcadorRavenclaw++;
        }
        quintaPregunta();
        quintaPregunta= entrada.nextInt();
        if (quintaPregunta == RESPUESTA_GRYFFINDOR) {
            marcadorGryffindor++;
        }else if (quintaPregunta == RESPUESTA_SLYTHERIN) {
            marcadorSlytherin++;
        }else if (quintaPregunta == RESPUESTA_HUFFLEPUFF) {
            marcadorHufflepuff++;
        }else {
            marcadorRavenclaw ++;
        }   

        if (marcadorGryffindor > marcadorHufflepuff){
            if (marcadorGryffindor > marcadorRavenclaw) {
                if (marcadorGryffindor > marcadorSlytherin) {
                    System.out.println("El sombreo ha decidido que serás de la casa de Gryffindor.");
                }else{
                    System.out.println("El sombreo ha decidido que serás de la casa de Slytherin.");
                }
            }else{
                if (marcadorRavenclaw > marcadorSlytherin) {
                    System.out.println("El sombreo ha decidido que serás de la casa de Ravenclaw.");
                }else{
                    System.out.println("El sombreo ha decidido que serás de la casa de Slytherin.");
                }

            }
            
        }else{
            if (marcadorHufflepuff > marcadorRavenclaw) {
                if (marcadorHufflepuff > marcadorSlytherin) {
                    System.out.println("El sombreo ha decidido que serás de la casa de Hufflepuff.");
                       
                }else{
                    System.out.println("El sombreo ha decidido que serás de la casa de Slytherin.");
                }
            }else{
                if (marcadorRavenclaw > marcadorSlytherin) {
                    System.out.println("El sombreo ha decidido que serás de la casa de Ravenclaw.");
                }else{
                    System.out.println("El sombreo ha decidido que serás de la casa de Slytherin.");
                }
            }
            
            
        }
        entrada.close();
  
        
    }

        

    static void introducciónJuego(){
        System.out.println("Bienvenido al sombrero seleccionador!");
        System.out.println("A continuación debe responder a las siguientes 5 preguntas, para seleccionar su casa.");
    }
    static void primeraPregunta(){
        System.out.println("¿Qué cualidad valoras más en ti mismo?");
        System.out.println("1.Coraje");
        System.out.println("2.Ambición");
        System.out.println("3.Lealtad");
        System.out.println("4.Inteligencia");
    }
    static void segundaPregunta(){
        System.out.println("¿Qué harias si un amigo está en peligro?");
        System.out.println("1.Correrías a ayudarlo sin pensar");
        System.out.println("2.Buscarías una forma estratégica de salvarlo");
        System.out.println("3.Permanecerías con él sin importar el riesgo");
        System.out.println("4.Pensarías rápidamente en la solución más lógica");
    }
    static void terceraPregunta(){
        System.out.println("¿Qué actividad disfrutas más en tu tiempo libre?");
        System.out.println("1.Participar en aventuras emocionantes");
        System.out.println("2.Planea tu próximo gran logo");
        System.out.println("3.Pasar tiempo con tus amigos y familiares");
        System.out.println("4.Leer libros o aprender algo nuevo");
    }
    static void cuartaPregunta(){
        System.out.println("¿Cómo te describen tus amigos?");
        System.out.println("1.Valiente y decidido");
        System.out.println("2.Ambicioso y persuasivo");
        System.out.println("3.Amable y confiable");
        System.out.println("4.Ingenioso y curioso");
    }
    static void quintaPregunta(){
        System.out.println("¿Qué prefieres en una situación difícil?");
        System.out.println("1.Actuar con valentía, sin importar el resultado");
        System.out.println("2. Buscar la forma de salir victorioso");
        System.out.println("3.Mamtener la calma y apoyar a los demás");
        System.out.println("4.Analizar todas las opciones posibles");
    }
    

}

    