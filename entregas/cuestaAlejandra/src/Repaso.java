import java.util.Scanner;

class Repaso{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int posicion = 0;

    final String CAMELLO = ",--,^";
    final String PISTA = "...";

    final int FINAL =20;

    boolean enCarrera = true;
    int turno = 0;

    while (enCarrera) {
        turno++;

        int avance = (int)(Math.random() * MAXIMO - MINIMO + 1)+ MINIMO;
        posicionPrimero = posicionPrimero + avance;

        avance = (int)(Math.random() * MAXIMO - MINIMO + 1)+ MINIMO;
        posicionSegundo = posicionSegundo + avance;

        System.out.println("===" .repeat(20));
        System.out.println("Turno:" + turno);
        System.out.println(PISTA.repeat(posicionSegundo)+CAMELLO);
        enCarrera = posicionPrimero<FINAL;
        entrada.nextLine();
    
    }  
      System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primero" : "segundo" ));

      entrada.close();

    }
}