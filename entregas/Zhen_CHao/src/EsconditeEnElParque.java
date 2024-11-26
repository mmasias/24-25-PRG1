import java.util.Scanner;

public class EsconditeEnElParque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int MAXIMO = 6;
        final int MINIMO = 1;
        int ProbabilidadEscondite = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;
        
        System.out.println("Donde quiere esconder al niño 1-Árbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan");
        
        
        
        
        entrada.close();
    }
}
