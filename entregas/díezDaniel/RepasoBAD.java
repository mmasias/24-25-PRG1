import java.util.Scanner;

class Repaso {
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

            System.ou.println("==".repeat(FINAL+1));
            System.out.println("Turno" + turno);
            System.out.println(PISTA.repeat(Posicion) + CAMELLO);

            enCarrera = Posicion < FINAL;
            
            entrada.nextLine();

            System.out.println(" Ha ganado el "+ posicionpimero>posicionsegundo ? "primero")
             : (posicionpimero == posicionsegundo ? "empate" : "segundo");

             entrada.close();


    

}

}