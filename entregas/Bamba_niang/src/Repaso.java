import java.util.Scanner;

class Repaso{
   public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);

       
       int posicionPrimero = 1;
       int posicionSegundo = 6;
       int avance;

       final String CAMELLO = ",---,";
       final String PISTA = "XXXXXXXXXXX";

       
       
       
       final int MAXIMO = 4;
       final int MINIMO = 1;
       
       final int FINAL = 20;

       boolean enCarrera  = true;
       int turno = 0;
       while(enCarrera) {
        turno++;

        avance = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;
        posicionPrimero = posicionPrimero + avance;

        avance = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;
        posicionSegundo = posicionSegundo + avance;

        System.out.println("===".repeat(FINAL+1));



        System.out.println("Turno"+ turno);
        System.out.println(PISTA.repeat(posicionPrimero) + CAMELLO);
        System.out.println(PISTA.repeat(posicionSegundo) + CAMELLO);
         enCarrera = (posicionPrimero > FINAL || posicionSegundo > FINAL);
         entrada.nextLine();

       }
       

       System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primero" : (posicionPrimero == posicionSegundo) ? "Empate" : "ultimo"));



       entrada.close();
   }
}