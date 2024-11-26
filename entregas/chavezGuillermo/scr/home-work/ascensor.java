import  java.util.Scanner;
class ascensor{
    public static void main(String[] args) {
        final int PISOS=10;
        int pisoActual=0;
        int destino=7;
        int diferencia=0;
        String textura="|   |";
        String ascensor="[ "+pisoActual+" ]";

        Scanner entrada= new Scanner (System.in);
        System.out.println("a que piso vamo? de 0 a"+PISOS+" :");
        destino=entrada.nextInt();
        System.err.println("destino: "+destino);
        entrada.close();
    }
}