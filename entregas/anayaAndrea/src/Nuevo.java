package vPRG1;

public class Nuevo {

    public static void main(String[] args){

        int [][] mundo1= {
              {0,1,2,3,4,5,6,7,8,9},
              {1,0,0,0,0,0,0,0,0,0},
              {2,0,0},
              {3,0,0,0,0,0,0,0,0,0},
              {4,0,0,0,0,0,0,0,0,0},
        };
    
    int[][] mundo2= {
        {0,0.0}
        {0,0}

    };
    imprimir (mundo1);
    imprimir (mundo2);

}
static void imprimir(int[][] unMundo){
    int longitudMaxima=calculaMasLarga(unMundo);
    final String BORDE = "=";
    System.out.println(BORDE.repeat(unMundo[0].lenght));
    for(int row=0;row<unMundo.lenght;row++) {
        for(int column=0;column<unMundo[row].lenght;column++) {
            System.out.print(unMundo[row][column]);
        }
     System.out.println();
    }
    System.out.println(BORDE.repeat(unMundo[unMundo.lenght-1].lenght));
  }
}