import java.util.Scanner;

class JuegosFor {
    public static void main(String[] args) {
        
        System.out.println("Patrón de diagonales usando FOR:");
        for (int i = 1; i <= 10; i++) {  
            System.out.println("/".repeat(i));  
        }

        System.out.println("\nContando hasta 10 usando WHILE:");
        int numero = 1;  
        while (numero <= 10) {
            System.out.println("Número: " + numero);
            numero++;  
        }

        System.out.println("\nContando desde 500 hasta 510 usando DO-WHILE:");
        int j = 500;
        do {
            System.out.println("Número: " + j);
            j++;
        } while (j <= 510);  

        System.out.println("\nDibujando un triángulo usando FOR:");
        for (int k = 1; k <= 10; k++) {  
            System.out.println("*".repeat(k)); 
        }

        System.out.println("\nDibujando un triángulo invertido usando FOR:");
        for (int l = 15; l >= 1; l--) {  
            System.out.println("*".repeat(l)); 
        }
    }
}
