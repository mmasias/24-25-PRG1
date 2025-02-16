import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final int CONFIGURACION = 1;
        final int TEST = 2;
        final int SALIR = 3;

        int eleccionUsuario;
        int operacionElegida = 0;
        int primerFactor = 0;
        int nivelDificultad = 0;

        boolean examinandose = true;

        
        
        while (examinandose) {
            eleccionUsuario = 0;
            while (eleccionUsuario == 0) {

                System.out.println("-----------EXAMEN TABLAS DE MULTIPLICAR-----------");
                System.out.println("");
                System.out.println("1.Configuración del examen.");
                System.out.println("");
                System.out.println("2.Realizar Test.");
                System.out.println("");
                System.out.println("3.Salir del examen.");
                System.out.println("");
                System.out.println("--------------------------------------------------");
                eleccionUsuario = scanner.nextInt();

                if (eleccionUsuario == CONFIGURACION) {
                    primerFactor = configuraciónPrimerFactor();
                    nivelDificultad = configuraciónNivelDificultad();
                    operacionElegida = configuraciónOperacion();
                    eleccionUsuario = 0;
                }else if (eleccionUsuario == TEST) {
                    if (primerFactor == 0 || nivelDificultad == 0 || operacionElegida == 0) {
                        System.out.println("Configura primero el examen.");
                        examinandose = false;
                    }else{
                        preguntasTest(nivelDificultad, primerFactor, operacionElegida);
                    }
                    eleccionUsuario = 0;
                }else{ 
                    examinandose = false;
                }
            } 
        }
        
    
        scanner.close();
    }
    static int configuraciónPrimerFactor (){

        Scanner scanner = new Scanner(System.in);
        
        int primerFactor;
        System.out.println("-----------CONFIGURACIÓN DEL EXAMEN-----------");
        System.out.println("Elige un número entre el 2 y el 10 para seleccionar la tabla de multiplicar que se te pregintará:");
        System.out.println("");

        primerFactor = scanner.nextInt();

        return (primerFactor);

    }
    static int configuraciónNivelDificultad (){
        Scanner scanner = new Scanner(System.in);

        int nivelDificultadElige;

        System.out.println("Elige el nivel de dificultad:");
        System.out.println("");
        System.out.println("1.Fácil");
        System.out.println("");
        System.out.println("2.Normal");
        System.out.println("");
        System.out.println("3.Avanzado");
        System.out.println("");
        System.out.println("---------------------------------------------");
        nivelDificultadElige = scanner.nextInt();
        
        return (nivelDificultadElige);
    }
    static int configuraciónOperacion (){
        Scanner scanner = new Scanner(System.in);
        
        int operacionElegida;

        System.out.println("Elige la operación con la que te quieres evaluar:");
        System.out.println("");
        System.out.println("1.Suma");
        System.out.println("");
        System.out.println("2.Multiplicaión");
        System.out.println("");
        System.out.println("3.Aleatorio");
        System.out.println("");
        System.out.println("---------------------------------------------");

        operacionElegida = scanner.nextInt();

        return (operacionElegida);
    }   
    static void preguntasTest ( int  nivelDificultad,int primerFactor, int operacionElegida){
        Scanner scanner = new Scanner(System.in);

        final int FACIL = 1;
        final int NORMAL = 2;
        final int DIFÍCIL = 3;

        final int SUMA = 1;
        final int MULTIPLICAR = 2;
        final int ALEATORIO = 3;

        int segundoFactor;
        int resultadoTest;
        int operacionAleatoria= 0;

        double puntuacionUsuario = 0;
        
        boolean preguntando = true;
        
        if (nivelDificultad == FACIL) {
            int maximo = 6;
            int minimo = 1;
            int numeroPregunta = 0;


            while (preguntando) {
                numeroPregunta ++;
                int solucionPregunta;
                int respuestaUsurario;

                if (operacionElegida == MULTIPLICAR ) {
                    segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                    System.out.println("Cuanto es:"+ primerFactor + " x "+ segundoFactor);
                }else if (operacionElegida == SUMA) {
                    segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                    System.out.println("Cuanto es:"+ primerFactor + " + "+ segundoFactor);
                }else{
                    operacionAleatoria = (int) (Math.random() * MULTIPLICAR - SUMA + 1) + MULTIPLICAR;

                    if (operacionAleatoria == MULTIPLICAR ) {
                        segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                        System.out.println("Cuanto es:"+ primerFactor + " x "+ segundoFactor);
                        operacionAleatoria = MULTIPLICAR;
                    }else{
                        segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                        System.out.println("Cuanto es:"+ primerFactor + " + "+ segundoFactor);
                        operacionAleatoria = SUMA;
                    }
                }

                respuestaUsurario = scanner.nextInt();

                if (operacionElegida == MULTIPLICAR || operacionAleatoria == MULTIPLICAR) {
                    solucionPregunta = primerFactor*segundoFactor;

                }else{
                    solucionPregunta = primerFactor+segundoFactor;
                }
                
                if (numeroPregunta == 5) {
                    preguntando = false;
                }
                if (respuestaUsurario == solucionPregunta) {
                    puntuacionUsuario = puntuacionUsuario + 2;
                }else{
                    puntuacionUsuario = puntuacionUsuario - 0.5;
                }
            }
    
        }else if (nivelDificultad == NORMAL) {
            int maximo = 10;
            int minimo = 1;
            int numeroPregunta = 0;

            while (preguntando) {
                numeroPregunta ++;
                int solucionPregunta;
                int respuestaUsurario;

                if (operacionElegida == MULTIPLICAR ) {
                    segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                    System.out.println("Cuanto es:"+ primerFactor + " x "+ segundoFactor);
                }else if (operacionElegida == SUMA) {
                    segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                    System.out.println("Cuanto es:"+ primerFactor + " + "+ segundoFactor);
                }else{
                    operacionAleatoria = (int) (Math.random() * MULTIPLICAR - SUMA + 1) + MULTIPLICAR;

                    if (operacionAleatoria == MULTIPLICAR ) {
                        segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                        System.out.println("Cuanto es:"+ primerFactor + " x "+ segundoFactor);
                        operacionAleatoria = MULTIPLICAR;
                    }else{
                        segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                        System.out.println("Cuanto es:"+ primerFactor + " + "+ segundoFactor);
                        operacionAleatoria = SUMA;
                    }
                }

                respuestaUsurario = scanner.nextInt();

                if (operacionElegida == MULTIPLICAR || operacionAleatoria == MULTIPLICAR) {
                    solucionPregunta = primerFactor*segundoFactor;

                }else{
                    solucionPregunta = primerFactor+segundoFactor;
                }

                if (numeroPregunta == 5) {
                    preguntando = false;
                }
                if (respuestaUsurario == solucionPregunta) {
                    puntuacionUsuario = puntuacionUsuario + 2;
                }else{
                    puntuacionUsuario = puntuacionUsuario - 0.5;
                }
            }
            
        }else {
            int maximo = 10;
            int minimo = 4;
            int numeroPregunta = 0;

            while (preguntando) {
                numeroPregunta ++;
                int solucionPregunta;
                int respuestaUsurario;

                if (operacionElegida == MULTIPLICAR ) {
                    segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                    System.out.println("Cuanto es:"+ primerFactor + " x "+ segundoFactor);
                }else if (operacionElegida == SUMA) {
                    segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                    System.out.println("Cuanto es:"+ primerFactor + " + "+ segundoFactor);
                }else{
                    operacionAleatoria = (int) (Math.random() * MULTIPLICAR - SUMA + 1) + MULTIPLICAR;

                    if (operacionAleatoria == MULTIPLICAR ) {
                        segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                        System.out.println("Cuanto es:"+ primerFactor + " x "+ segundoFactor);
                        operacionAleatoria = MULTIPLICAR;
                    }else{
                        segundoFactor = (int) (Math.random() * maximo - minimo + 1) + minimo;
                        System.out.println("Cuanto es:"+ primerFactor + " + "+ segundoFactor);
                        operacionAleatoria = SUMA;
                    }
                }

                respuestaUsurario = scanner.nextInt();

                if (operacionElegida == MULTIPLICAR || operacionAleatoria == MULTIPLICAR) {
                    solucionPregunta = primerFactor * segundoFactor;

                }else{
                    solucionPregunta = primerFactor + segundoFactor;
                }

                if (numeroPregunta == 5) {
                    preguntando = false;
                }
                if (respuestaUsurario == solucionPregunta) {
                    puntuacionUsuario = puntuacionUsuario + 2;
                }else{
                    puntuacionUsuario = puntuacionUsuario - 0.5;
                }


            }
        }

        System.out.println("Puntuación:" + puntuacionUsuario);
        if (puntuacionUsuario > 5) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }
        
    }
}