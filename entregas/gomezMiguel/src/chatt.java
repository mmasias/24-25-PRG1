public class chatt {
    public static void main(String[] args) {
     int numero=67;
     if (esImpar(numero)){
        System.out.println("El número es impar " + numero);    
     }else{
        System.out.println("El número es par " + numero);
     }
    }

    public static boolean esImpar(int numero){
    return numero % 2 == 0;
}
}
