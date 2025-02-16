package RetosForIf;

class RetoForIf17 {
    public static void main(String[] args) {
        int dimension = 21;

        for (int j = 1; j <= dimension; j++) {
            for (int i = 1; i <= dimension; i++) {
                // Excluimos las coordenadas específicas
                if ((i == 2 || i == dimension-1 || j == 2 || j == dimension-1) && 
                    !(i == 1 && j == 2) && !(i == 2 && j == 1) && 
                    !(i == 20 && j == 1) && !(i == 1 && j == 20)) {
                    System.out.print("█"); // Borde verde
                } else {
                    System.out.print(" "); // Espacio en blanco
                }
            }
            System.out.println();
        }   
    }
}