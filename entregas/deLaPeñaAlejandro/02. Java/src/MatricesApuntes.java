class MatricesApuntes {
    public static void main(String[] args) {
        
        int[] x = new int[5];

        int[] t;
        t = new int[30];

        //Asignar un valor a 30
        t[29] = 666;
        //Tenemos 31 valores al empezar desde 0, por eso ponemos 29 para definir el valor 30.

        for(int i=0; i<t.length;i++){
            t[i] = (int) Math.random()*10;
        }

        int[] tt = t;
        tt[1] = 6;
        tt = new int[3];
        
        //Ahora tt[1] = 0 ya que hemos declarado un nuevo array por lo que el valor regresa a ser 0.

        if(t == tt){

        }

        int[] ttt = new int[] {1, 2, 3, 4};

        int[] tttt = new int[] {1, 2, 3, 4};

        if ( ttt==tttt){
            //No se ejecuta porque no son iguales(Diferentes Referencias).
        }

        ttt = tttt;
        if (ttt==tttt){
            //Si se ejecuta ya que ahora si tienen la misma referencia.
        }

        int[][] ttttt = new int [10][100];
        //Son 10 espacios/referencias y cada una va a almacenar 100 valores dando lugar a 1001 valores enteros.
        ttttt[5][45] = 666;
        //Ocurre lo mismo que antes siempre hay que restarle 1 al valor asignado ya que empezamos desde 0.
        ttttt[0] = x;
        //Ambas guardan referencias por lo que es totalmente valido.
        int[][] xx = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            null
        };
        System.out.println(xx.length + " - " + xx[0].length + " - " + xx[1].length);
        int[][] matriz = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        //System.out.println(matriz.length + " - " + matriz[0].length + " - " + matriz[1].length);
        for(int fila=0; fila<matriz.length; fila++){
            for(int columna=0; columna<matriz[fila].length; columna++){
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
