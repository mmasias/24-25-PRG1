class RetoForIf {
    public static void main(String[] args) {

        int dimension = 21;
        String figura;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui *********************************
                    (j==5 || j==13) && (i==4 || i ==20)
                // El código hasta aquí *********************************
                ) {
                    figura = "(*)";
                } else {
                    figura = " . ";
                }
                System.out.print(figura);
            }
            System.out.println();
        }
    }
}