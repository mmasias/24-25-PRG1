class Matrices{
    public static void main(String[] args) {
       
        int[] t;// t-> referencia no hay arraid (inicializado) 
        
        t = new int[30]; // 29 valores de numeros enteros, todos guardan el valor 0

        t[30] = 666; // seria el número 31 deberia ser el número 29
        t[29]= 666; //el elemento 30 guarda el valor de 666

        for (int i=0; i<t.length  ;i++){
            t[i]= (int)Math.random()*10;//añade valores a todos los elementos
        }

        int[] tt = t; // tt se refiere al array de t

        tt[1]=1; // modifica el elemento del array al que se refiere t y tt

        tt= new int[3]; // cambia la referencia de tt a otro array

        tt[1]; // al crear un nuevo array todos los elementos tienen valor 0

        // t.length -> acceder al tamaño del array

        -------------
        int[] t = new int[] {1, 2, 3, 4}; //t se refiere a un array de 4 elementos que da a los valores en el {} el elemeto 0 = 1
    

        int[] tt = new int[] {1, 2, 3, 4};//tt se refiere a un array de 4 elementos que da a los valores en el {} el elemeto 0 = 1

        if (t ==tt){
            //no funciona se refieren a diferentes array
        }

        t = tt; // t pasa a referirse al array de tt

        if (t ==tt){
            //si funciona por que van hacia el mismo array
        }
        ----------------------------------
        int[][] t = new int [10][100]; // la variable se refiere a 10 huecos y cada hueco a 100 -> total 11 referencias | 1001 espacios

        t[5][45] = 666; // el 5 es una referencia al n hueco q elegimos y el 45 a loas 100 huecos de cada uno
        ------------------------------
        int[] x;
        x = new int []{1,2,3,4};

        t[0] = x

        t[0][5] //No existe el valor por que ahora t 0 solamemte tiene 4 huecos (por que lleva al array x)
        --------------------
        int[][] x = {
            {1,2,3},
            null, //referencia a donde no hay nada  pero existe
            {3,2,3,4,5},
            {5,6,7},
        }

        



    }
}