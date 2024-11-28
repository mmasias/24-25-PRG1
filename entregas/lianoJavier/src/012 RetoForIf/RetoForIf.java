class RetoForIf {
    public static void main(String[] args) {

        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui *********************************
                  !(i==1 || i == 21 || j == 1 || j == 21) && !(i >= 3 && i <= 19 && j >= 3 && j <= 19)
                // El código hasta aquí *********************************
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
