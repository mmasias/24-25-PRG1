public class Repaso {

public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);

    int posicionPrimero=0;
    int posicionSegundo=0;

    int posicion;
    final String CAMELLO= ",--,^" ;
    final String PISTA= "X";

    final int MAXIMO =4;
    final int MINIMO=1;

    final int FINAL = 20;

   

    boolean enCarrera= true;
    int turno= 0;
    int avance ;


    while (enCarrera){
        turno ++;
        avance= (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;
        

        avance= (int)(Math.random()*MAXIMO-MINIMO+1)+MINIMO;
       
        System.out.println("Turno"+ turno);
        System.out.println(PISTA.repeat(posicion);
        enCarrera=posicion>=FINAL;
        entrada.nextLine();
    }
   

    entrada.close();

}
    
}
