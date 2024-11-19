import java.util.Scanner;
class Adivinancia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvnido al juego de adivinancia");

        final int MAXIMO = 100;
        final int MINIMO = 0;
        
        
        boolean estaJuagando = true;
        int  turno = 0;
        
        while (estaJuagando) {
            turno++;
            
            System.out.println("Elige un numero enrtre 1y 100 ");
            int usuario = entrada.nextInt();
            System.out.println("Elegiste " + usuario);
            int ordenador = (int)(Math.random()* MAXIMO-MINIMO +1)+MINIMO;
            System.out.println("El ordednador eligio " +ordenador);
            boolean adivino = usuario == ordenador;
            if (adivino){
                System.out.println("adivinaste ");
            }else{
                System.out.println("No adivinaste");

            }
            
         }
        
        





        entrada.close();
    }
}
    

