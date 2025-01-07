import java.util.Scanner;
public class CarreraCamellos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final String CAMELLO = ",--,*";
        final String PISTAS = "X";
        final  int MAXIMO = 4 ; 
        final  int MINIMO = 1; 
        final  int FINAL = 20;

       
        boolean enCarrera = true;
        int avance = 0;
        int turno = 0 ;
        int posicionPrimero = 0; 
        int posicionSegundo = 0; 

        while(enCarrera){
            turno++;


             avance = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;
            posicionPrimero = posicionPrimero+avance;

             avance = (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;
            posicionSegundo = posicionSegundo+avance;

            System.out.println("===".repeat(FINAL+1));
            System.out.println("TURNO:"+turno);
            System.out.println(PISTAS.repeat(posicionPrimero)+CAMELLO);
            System.out.println(PISTAS.repeat(posicionSegundo)+CAMELLO);
            enCarrera = posicionPrimero<FINAL;
            entrada.nextLine();


        }

        if (posicionPrimero>posicionSegundo) {
            System.out.println("Gano el primero");
        }else if(posicionPrimero==posicionSegundo){
            System.out.println("empate");
        }else{
            System.err.println("gano el segundo");
        };

        

        entrada.close();
    }
}
