class ForIf {

    public static void main(String[] args) {
        int n = 5; // Altura del triángulo
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
}



//int n = 5; // Altura del triángulo
//for (int i = 1; i <= n; i++) {
//    for (int j = 1; j <= i; j++) {
//        System.out.print("*");
//    }
//    System.out.println();
//}


//int n = 5; // Tamaño del cuadrado
//for (int i = 1; i <= n; i++) {
//    for (int j = 1; j <= n; j++) {
//        // Imprimir asteriscos en los bordes
//        if (i == 1 || i == n || j == 1 || j == n) {
//            System.out.print("*");
//        } else {
//            System.out.print(" ");
//        }
//    }
//    System.out.println(); // Salto de línea después de cada fila
//}

