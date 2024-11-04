import java.util.Scanner;

public class ExamenAutomaticoPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String CONFIGURACION = "[1] Configuracion";
        final String EJECUCUCION_DEL_TEST = "[2] Ejecucion del test";
        final String SALIR_DEL_SISTEMA = "[3] Salir del sistema";
        final String STRING_DIFICULTAD_FACIL = "[1] Dificultad Facil";
        final String STRING_DIFICULTAD_MEDIA = "[2] Dificultad Media";
        final String STRING_DIFICULTAD_ALTA = "[3] Dificultad Alta";
        int seleccionUsuarioMenuPrincipal = 0;
        int seleccionPrimerFactor = 0;
        int seleccionNivelDificultad = 0;
        final int LIMITE_INFERIOR_DIFICULTAD_FACIL = 1;
        final int LIMITE_SPUERIOR_DIFICULTAD_FACIL = 6;
        final int LIMITE_INFERIOR_DIFICULTAD_MEDIA = 1;
        final int LIMITE_SUPERIOR_DIFICULTAD_MEDIA = 10;
        final int LIMITE_INFERIOR_DIFICULTAD_ALTA = 1;
        final int LIMITE_SUPERIOR_DIFICULTAD_ALTA = 20;
        final int DIFICULTAD_FACIL = 1;
        final int DIFICULTAD_MEDIA = 2;
        final int DIFICULTAD_ALTA = 3;
        int numeroPreguntas = 0;
        int variableMultiplicacion;
        int respuestaUsuario;
        double contadorPuntos = 0;

        do {
            System.out.println(CONFIGURACION);
            System.out.println(EJECUCUCION_DEL_TEST);
            System.out.println(SALIR_DEL_SISTEMA);
            seleccionUsuarioMenuPrincipal = scanner.nextInt();

            if (seleccionUsuarioMenuPrincipal == 1) {
                System.out.println("Elije de que numero quieres estudiar las tablas");
                seleccionPrimerFactor = scanner.nextInt();
                System.out.println("Elije el nivel de dificultad deseado:");
                System.out.println(STRING_DIFICULTAD_FACIL);
                System.out.println(STRING_DIFICULTAD_MEDIA);
                System.out.println(STRING_DIFICULTAD_ALTA);
                seleccionNivelDificultad = scanner.nextInt();

                if (seleccionNivelDificultad == 1) {
                    System.out.println("Has elejido la dificultad facil");
                    seleccionNivelDificultad = DIFICULTAD_FACIL;
                } else if (seleccionNivelDificultad == 2) {
                    System.out.println("Has elejido la dificultad media");
                    seleccionNivelDificultad = DIFICULTAD_MEDIA;
                } else if (seleccionNivelDificultad == 3) {
                    System.out.println("Has elejido la dificultad alta");
                    seleccionNivelDificultad = DIFICULTAD_ALTA;
                } else {
                    System.out.println("Selecciona una opcion valida");
                }

                System.out.println("Configuracion aplicada correctamente.");


            } else if (seleccionUsuarioMenuPrincipal == 2) {
                if (seleccionNivelDificultad == DIFICULTAD_FACIL) {
                    for(numeroPreguntas = 1; numeroPreguntas <= 5; numeroPreguntas++ ){
                        variableMultiplicacion = (int) (Math.random() * LIMITE_SPUERIOR_DIFICULTAD_FACIL - LIMITE_INFERIOR_DIFICULTAD_FACIL + 1) + LIMITE_INFERIOR_DIFICULTAD_FACIL;
                        System.out.println(seleccionPrimerFactor + "x" + variableMultiplicacion);
                        respuestaUsuario = scanner.nextInt();
                        if (respuestaUsuario == (seleccionPrimerFactor*variableMultiplicacion)) {
                            contadorPuntos = contadorPuntos + 2;
                        } else {
                            contadorPuntos = contadorPuntos - 0.5;
                        }
                        System.out.println("Tienes " + contadorPuntos + " puntos");
                    }
                    contadorPuntos = 0;
                    System.out.println("Test Terminado.");

                } else if (seleccionNivelDificultad == DIFICULTAD_MEDIA) {
                    for(numeroPreguntas = 1; numeroPreguntas <= 5; numeroPreguntas++ ){
                        variableMultiplicacion = (int) (Math.random() * LIMITE_SUPERIOR_DIFICULTAD_MEDIA - LIMITE_INFERIOR_DIFICULTAD_MEDIA + 1) + LIMITE_INFERIOR_DIFICULTAD_MEDIA;
                        System.out.println(seleccionPrimerFactor + "x" + variableMultiplicacion);
                        respuestaUsuario = scanner.nextInt();
                        if (respuestaUsuario == (seleccionPrimerFactor*variableMultiplicacion)) {
                            contadorPuntos = contadorPuntos + 2;
                        } else {
                            contadorPuntos = contadorPuntos - 0.5;
                        }
                        System.out.println("Tienes " + contadorPuntos + " puntos");
                    }
                    contadorPuntos = 0;
                    System.out.println("Test Terminado.");

                } else if (seleccionNivelDificultad == DIFICULTAD_ALTA) {
                    for(numeroPreguntas = 1; numeroPreguntas <= 5; numeroPreguntas++ ){
                        variableMultiplicacion = (int) (Math.random() * LIMITE_SUPERIOR_DIFICULTAD_ALTA - LIMITE_INFERIOR_DIFICULTAD_ALTA + 1) + LIMITE_INFERIOR_DIFICULTAD_ALTA;
                        System.out.println(seleccionPrimerFactor + "x" + variableMultiplicacion);
                        respuestaUsuario = scanner.nextInt();
                        if (respuestaUsuario == (seleccionPrimerFactor*variableMultiplicacion)) {
                            contadorPuntos = contadorPuntos + 2;
                        } else {
                            contadorPuntos = contadorPuntos - 0.5;
                        }
                        System.out.println("Tienes " + contadorPuntos + " puntos");
                    }
                    contadorPuntos = 0;
                    System.out.println("Test Terminado.");

                }
            } else if (seleccionUsuarioMenuPrincipal == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Selecciona una opcion valida");
            }
        } while (seleccionUsuarioMenuPrincipal != 3);

        scanner.close();
    }
}
