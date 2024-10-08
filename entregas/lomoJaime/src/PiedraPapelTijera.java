import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.Random;
class PiedraPapelTijera{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        final int PAPEL = 1;
        final int PIEDRA = 2;
        final int TIJERAS = 3;
        final String ELECCIONPIEDRA = "Has elegido piedra";
        final String ELECIONPAPEL = "Has elegido papel";
        final String ELECCIONTIJERA = "Has elegido tijera";
        final String MENSAJE_GANASTE = "Has ganado";
        final String MENSAJE_PERDISTE = "Has perdido";
        final String MENSAJE_EMPATE = "Has ganado";
        int eleccion;
        int maquina =(int)(Math.random()*(3-1)+1);
        System.out.println("Vamos a jugar al piedra papel o tijera  ");
        System.out.println("Dime que sacas: ");
        System.out.println("Pon un 1 si es papel, un 2 si es piedra y 3 si es tijeras");
         eleccion = scanner.nextInt();
         String primer_resultado = eleccion == 1 ? ELECIONPAPEL
            : eleccion == 2 ? ELECCIONPIEDRA
            : ELECCIONTIJERA;
             System.out.println("La eleccion de la maquina es " +maquina);
        String resultado = eleccion == maquina ? MENSAJE_EMPATE
                : eleccion == 1 && maquina == 3 ? MENSAJE_PERDISTE
                : eleccion == 2 && maquina == 1 ? MENSAJE_PERDISTE
                : eleccion == 3 && maquina == 2 ? MENSAJE_PERDISTE
                : MENSAJE_GANASTE;
        System.out.println(resultado);
    }      

}