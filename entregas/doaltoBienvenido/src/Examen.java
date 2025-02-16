import java.util.Scanner;

public class Examen {
    public static void main(String[] args) 
    {
        Scanner imput = new Scanner(System.in);

        final String CONFIGURACION = "[1] Configuracion";
        final String EJECUCUCION_DEL_TEST = "[2] Ejecucion del test";
        final String SALIR_DEL_SISTEMA = "[3] Salir del sistema";
        final String TEXTO_DIFICULTAD_FACIL = "[1] Facil";
        final String TEXTO_DIFICULTAD_NORMAL = "[2] Normal";
        final String TEXTO_DIFICULTAD_DIFICIL = "[3] Dificil";
        final int DIFICULTAD_FACIL = 1;
        final int DIFICULTAD_MEDIA = 2;
        final int DIFICULTAD_DIFICIL = 3;
        final int VALOR_MINIMO_DIFICULTAD_FACIL = 1;
        final int VALOR_MAXIMO_DIFICULTAD_FACIL = 6;
        final int VALOR_MINIMO_DIFICULTAD_NORMAL = 1;
        final int VALOR_MAXIMO_DIFICULTAD_NORMAL = 10;
        final int VALOR_MINIMO_DIFICULTAD_DIFICIL = 4;
        final int VALOR_MAXIMO_DIFICULTAD_DIFICIL = 10;
        int imputUsuario;
        int seleccionNivelDificultad = 0;
        int seleccionPrimerFactor = 0;
        int numeroPreguntas = 0;
        int variableMultiplicacion;
        int respuestaUsuario;
        double contadorPuntos = 0;

        do{
            System.out.println("================================");
            System.out.println("Seleccione una de las 3 opciones");
            System.out.println("================================");
            System.out.println(CONFIGURACION); 
            System.out.println(EJECUCUCION_DEL_TEST); 
            System.out.println(SALIR_DEL_SISTEMA);
            
            imputUsuario = imput.nextInt();

            if (imputUsuario == 1) {

                System.out.println("================================");
                System.out.println("Eliga un numero entre el 2 y el 10");
                seleccionPrimerFactor = imput.nextInt();
                
                System.out.println("Eliga una dificultad");
                System.out.println(TEXTO_DIFICULTAD_FACIL); 
                System.out.println(TEXTO_DIFICULTAD_NORMAL); 
                System.out.println(TEXTO_DIFICULTAD_DIFICIL);
                seleccionNivelDificultad = imput.nextInt();

                if (seleccionNivelDificultad == 1) {
                    System.out.println("Has elejido la dificultad facil");
                    seleccionNivelDificultad = DIFICULTAD_FACIL;
                } else if (seleccionNivelDificultad == 2) {
                    System.out.println("Has elejido la dificultad media");
                    seleccionNivelDificultad = DIFICULTAD_MEDIA;
                } else if (seleccionNivelDificultad == 3) {
                    System.out.println("Has elejido la dificultad alta");
                    seleccionNivelDificultad = DIFICULTAD_DIFICIL;
                } else {
                    System.out.println("Selecciona una opcion valida");
                }

                System.out.println("Configuracion aplicada correctamente.");

            }else if (imputUsuario == 2) 
            {
                if (seleccionNivelDificultad == DIFICULTAD_FACIL) 
                {
                    for(numeroPreguntas = 1; numeroPreguntas <= 5; numeroPreguntas++ )
                    {
                        variableMultiplicacion = (int) (Math.random()*VALOR_MAXIMO_DIFICULTAD_FACIL + VALOR_MINIMO_DIFICULTAD_FACIL - 1) + VALOR_MINIMO_DIFICULTAD_FACIL;
                        System.out.println(seleccionPrimerFactor + "x" + variableMultiplicacion); 
                        respuestaUsuario = imput.nextInt();
                        if (respuestaUsuario == (seleccionPrimerFactor * variableMultiplicacion)) 
                        {
                            contadorPuntos = contadorPuntos + 2;
                        }else 
                        {
                            contadorPuntos = contadorPuntos -0.5;
                        }
                        System.out.println("Tienes " + contadorPuntos + " puntos");
                    }
                    contadorPuntos = 0;
                    System.out.println("Test Terminado.");
                }else if (seleccionNivelDificultad == DIFICULTAD_MEDIA) 
                {
                    for(numeroPreguntas = 1; numeroPreguntas <= 5; numeroPreguntas++ )
                    {
                        variableMultiplicacion = (int) (Math.random()*VALOR_MAXIMO_DIFICULTAD_NORMAL + VALOR_MINIMO_DIFICULTAD_NORMAL - 1) + VALOR_MINIMO_DIFICULTAD_NORMAL;
                        System.out.println(seleccionPrimerFactor + "x" + variableMultiplicacion); 
                        respuestaUsuario = imput.nextInt();
                        if (respuestaUsuario == (seleccionPrimerFactor * variableMultiplicacion)) 
                        {
                            contadorPuntos = contadorPuntos + 2;
                        }else 
                        {
                            contadorPuntos = contadorPuntos -0.5;
                        }
                        System.out.println("Tienes " + contadorPuntos + " puntos");
                    }
                    contadorPuntos = 0;
                    System.out.println("Test Terminado.");
                }else if (seleccionNivelDificultad == DIFICULTAD_DIFICIL) 
                {
                    for(numeroPreguntas = 1; numeroPreguntas <= 5; numeroPreguntas++ )
                    {
                        variableMultiplicacion = (int) (Math.random()*VALOR_MAXIMO_DIFICULTAD_DIFICIL + VALOR_MINIMO_DIFICULTAD_DIFICIL - 1) + VALOR_MINIMO_DIFICULTAD_DIFICIL;
                        System.out.println(seleccionPrimerFactor + "x" + variableMultiplicacion); 
                        respuestaUsuario = imput.nextInt();
                        if (respuestaUsuario == (seleccionPrimerFactor * variableMultiplicacion)) 
                        {
                            contadorPuntos = contadorPuntos + 2;
                        }else 
                        {
                            contadorPuntos = contadorPuntos -0.5;
                        }
                        System.out.println("Tienes " + contadorPuntos + " puntos");
                    }
                    contadorPuntos = 0;
                    System.out.println("Test Terminado.");
                }

            }else if (imputUsuario == 3) 
            {
                System.out.println("Saliendo del programa...");
            } else 
            {
                System.out.println("Selecciona una opcion valida");
            }

        }while (imputUsuario != 3);
    }
}
