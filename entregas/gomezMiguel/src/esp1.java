public class esp1 {
    public static void main(String[] args) {


        int mayor = 0;
        for (int i = 1; i <=20;  i++) {
            int numero = (int)(Math.random() * 50) + 1;
            System.out.println("Numero aleatorio: " + i + " : " + numero);
            if (numero > mayor) {
                mayor = numero;
                }


            }

            System.out.println("El numero mayor es:" + mayor);







        }
    }


        


