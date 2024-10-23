import java.util.Scanner;

public class Repaso {
public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        int posicionPrimero = 0;
        int posicionsegundo =0;
    
        final String CAMELLO = ",--,^";
        final String PISTA = "X";

        final int MAXIMO = 4;
        final int MINIMO = 1;
        
        final int FINAL = 20;

        boolean enCarrera = true;
        int turno = 0;
        int avance;
        
        

        while (enCarrera) {
            turno++;
            avance = (int) (Math.random()* MAXIMO-MINIMO+1)+MINIMO;
            posicionPrimero = posicionPrimero + avance;

            avance = (int) (Math.random() * MAXIMO-MINIMO+1)+MINIMO;
            posicionsegundo = posicionsegundo + avance;

            System.out.println("==".repeat(FINAL+1));
            System.out.println("Turno" + turno);
            System.out.println(PISTA.repeat(posicionPrimero) + CAMELLO);
            System.out.println(PISTA.repeat(posicionsegundo) + CAMELLO);

            enCarrera = posicionPrimero < FINAL;
            
            entrada.nextLine();

            System.out.println(" Ha ganado el "+ (posicionPrimero>posicionsegundo ? "primero"
             : (posicionPrimero == posicionsegundo ? "empate" : "segundo")));

             entrada.close();


        }

}    
}
