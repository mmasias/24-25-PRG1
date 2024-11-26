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
        
        
        final int NIÑO_1 = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;;
        int NIÑO_2 = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;;
        int NIÑO_3 = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;; 

        System.out.println("Donde quiere buscar 1-Árbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan");
        int respuestaUsuario = entrada.nextInt();

        if (respuestaUsuario == ARBOL && NIÑO_1 == ARBOL ) {
            System.out.println("");
            
        }
        
        
        
        
        entrada.close();
    }
}
