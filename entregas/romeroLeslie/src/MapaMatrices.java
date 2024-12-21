public class MapaMatrices {
    public static void main(String[] args) {

    int[][] matrizPlaya ={

        {2,2,2,2,5,5,5,5,2,2,2},
        {2,5,2,2,5,7,5,2,2,5,2},
        {2,1,2,3,4,4,6,7,8,9,8},
        {2,2,2,3,4,0,6,7,8,9,4},
        {2,2,4,3,4,7,7,7,4,9,8},
        {5,5,3,3,4,0,6,7,8,9,0},
        {2,2,3,3,4,6,9,7,8,9,5},
        {2,5,8,3,4,1,6,7,8,9,2},
        {2,2,6,3,4,0,6,7,8,9,2},
        {2,2,7,3,4,4,6,7,8,9,2},

    };

    imprime (matrizPlaya);

        
    }

    static void imprime (int[][]matrizPlaya){
    
       
      for (int fila=0; fila <matrizPlaya.length;fila++){
        for (int columna=0; columna<matrizPlaya[fila].length;columna++){
             System.out.print(parse(matrizPlaya [fila][columna]));
        }
        System.out.println();
    }
    
}

static String parse(int valor){
<<<<<<< HEAD
    final String[]ICONOS = {"*I*", "~~~" ,"O^O", "...", "---", "*/*", "^^^", "w^w", "===", " --/" };
    return ICONOS[valor];
}

}
=======
    final String[]ICONOS = {"*l*", "~~~" ,"O^O", "...", "---", "*/*", "^^^", "w^w", "===", " --/", " <^>-" };
    return ICONOS[valor];
}

}
>>>>>>> 2f800921414013ec83dd2ce3c7a642288bd0434a
