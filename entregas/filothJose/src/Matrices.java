import java.util.Random;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz={
        {0,1,2,3,4,5,6,7,0,0,0,0,0,9,7,6,5,5,4,5,2,4,5,7,8,9,0,0,0,0,0,0}
        {1,2,4,4,4,6,7,8,9,0,1,4,5,6,7,4,2,4,7,8,1,3,5,6,7,9,3,0,3,0,4,0}
        {1,2,2,4,7,9,0,0,0,0,0,8,7,6,5,9,3,4,6,2,3,4,6,8,4,1,3,4,6,4,3,5}
        {1,2,5,7,9,6,4,5,7,3,4,6,8,9,0,0,0,0,0,5,3,2,3,7,8,3,4,5,8,2,1,3}
        {1,2,5,8,6,3,9,0,8,6,3,3,5,6,5,3,4,5,6,6,9,7,6,4,3,2,4,5,8,4,5,7}
        {1,2,4,6,9,0,8,6,4,6,8,9,0,0,0,0,0,8,6,7,4,5,7,9,7,5,3,4,7,6,4,3}
        {1,2,4,4,5,0,9,8,8,7,6,5,4,3,2,3,3,2,3,3,2,2,3,4,5,6,7,8,9,3,2,5}
        {2,0,0,0,0,0,6,6,6,6,6,6,6,6,4,4,4,4,4,3,3,3,3,3,2,4,3,3,3,5,5,8}
        {1,1,1,1,1,1,1,1,1,1,1,1,5,5,5,5,5,5,5,5,5,5,8,8,8,8,8,8,8,8,8,8}
        {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}
        };
imprime(matriz);
    }
static void imprime(int[][]matriz){
System.out.println("===".repeat(matriz[0].length));
for (int fila=0;fila<=matriz.length;fila++){
    for(int columna=0;columna<=matriz[fila].length;columna++){
        System.out.print(parse(matriz[fila][columna]));
        }
    System.out.println();
    
  }
  System.out.println("===".repeat(matriz[0].length));
}
static String parse(int valor){
    final String[] TILES = {
        "   ",
        "[#]",
        " . ",
        "_ _",
        "'''",
        ":::",
        ", '",
        "/'/",
        "'|'",
        ".|.",
   };
   return TILES(valor);
}
}



    












      
