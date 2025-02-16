class Mapas {
  public static void main(String[] args) {
    int[][] matriz = {{ 0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0 },
                      { 0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0 },
                      { 0,0,2,2,2,1,1,1,1,1,0,0,0,2,0,0,0,0,0,2,0 },
                      { 0,0,0,0,2,2,2,2,2,2,1,1,1,1,1,1,1,0,0,0,0 }
                    };
   imprime(matriz);                   
}  
static void imprime(int[][] matriz){

    for (int fila=0;fila<=matriz.length;fila++){
        for(int columna=0;columna<=matriz[fila].length;columna++ ){
            System.out.print( parse(matriz[fila][columna]));
        }
        System.out.println();
        
    }  
}
}


static String parse(int valor){
    final String [] TILES = {
        " ",
        "[#]",
        "---",
        
    };
        
            
 
}
