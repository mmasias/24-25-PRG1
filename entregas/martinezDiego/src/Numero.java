import java.util.Scanner;

class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        System.out.println("introduce 5 numeros");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if(numeros[i]> mayor){
                mayor = numeros[i];
                
            }
        }
        System.out.println("el mumero mas grande es " + mayor);
     
        scanner.close();
    }

}