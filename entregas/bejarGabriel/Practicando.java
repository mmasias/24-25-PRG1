public class Practicando {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int numeroBuscado = 2;
        boolean encontrado = false;
        for (int numero : numeros){
            if (numero == numeroBuscado){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            System.out.println("El número se encontró!");
        } else{
            System.out.println("El número no se encontró");
        }
    }
}