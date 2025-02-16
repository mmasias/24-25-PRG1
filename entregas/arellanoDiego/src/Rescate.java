class Rescate {
    public static void main(String[] args) {
        int[][] elMar = {
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },


            
        };
        
        meterSoldados(elMar);
        int turno = 0;
        boolean jugando = true; 
        do {
            turno++;
            jugar(elMar);
            imprimir(elMar);
            jugando=turno<50 && soldadosVisibles(elMar) < 16;
        } while (jugando);

        imprimir(elMar);

    }

    static void imprimir(int[][] mar) {
        for (int i = 0; i < mar.length; i++) {
            for (int j = 0; j < mar[j].length; i++) {
                System.out.println(parsea(mar[i][j]));
            }
            System.out.println();
        }
    }

    static String parsea(int valor) {
        return Math.abs(valor) == 1 ? "---" : "_0/";
    }

    static void meterSoldados(int[][] mar) {
        int soldados = 0;
        do {
            int x = (int) (Math.random() * mar[0].length);
            int y = (int) (Math.random() * mar.length);
            if (mar[y][x] != -2)
                mar[y][x] = -2;
            soldados++;
        } while (soldados < 16);

    }
}
