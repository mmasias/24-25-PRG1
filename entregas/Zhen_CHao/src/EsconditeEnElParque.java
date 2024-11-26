import java.util.Scanner;

public class EsconditeEnElParque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int MAXIMO = 6;
        final int MINIMO = 1;
        final int ARBOL = 1;
        final int BANCO = 2;
        final int ARBUSTO = 3;
        final int COLUMPIO = 4;
        final int CASETA = 5;
        final int TOBOGAN = 6;
        final double PROBABILIDAD_OCULTARSE = 0.1;
        boolean encontradoEnEstaBusqueda = false;
        boolean intentosRestantes = 12 ; 
        
        final int PROBABILIDAD_NIÑO_1 = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;;
        int PROBABILIDAD_NIÑO_2 = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;;
        int PROBABILIDAD_NIÑO_3 = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;; 
        boolean encontradoNiño1 =false,encontradoNiño2 =false,encontradoNiño3 =false;

        while (intentosRestantes > 0 && !(encontradoNiño1 && encontradoNiño2 && encontradoNiño3)){
        System.out.println("Donde quiere buscar 1-Árbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan");
        int respuestaUsuario = entrada.nextInt();

            if (PROBABILIDAD_NIÑO_1 == respuestaUsuario && !encontradoNiño1){
                if (Math.random() < PROBABILIDAD_OCULTARSE) {
                    System.out.println("¡El niño en el lugar " + respuestaUsuario + " se ha movido!");
                    } else {
                        encontradoNiño1 = true;
                        System.out.println("¡Has encontrado al primer niño en el lugar " + respuestaUsuario + "!");
                        encontradoEnEstaBusqueda = true;
                }

            }
            if (PROBABILIDAD_NIÑO_2 == respuestaUsuario && !encontradoNiño1){
                if (Math.random() < PROBABILIDAD_OCULTARSE) {
                    System.out.println("¡El niño en el lugar " + respuestaUsuario + " se ha movido!");
                    } else {
                        encontradoNiño2 = true;
                        System.out.println("¡Has encontrado al primer niño en el lugar " + respuestaUsuario + "!");
                        encontradoEnEstaBusqueda = true;
                }

            }
            if (PROBABILIDAD_NIÑO_3 == respuestaUsuario && !encontradoNiño1){
                if (Math.random() < PROBABILIDAD_OCULTARSE) {
                    System.out.println("¡El niño en el lugar " + respuestaUsuario + " se ha movido!");
                    } else {
                        encontradoNiño3 = true;
                        System.out.println("¡Has encontrado al primer niño en el lugar " + respuestaUsuario + "!");
                        encontradoEnEstaBusqueda = true;
                }

            }
        
        }
        
        
        entrada.close();
    }
}
