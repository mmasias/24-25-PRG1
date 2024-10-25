package src;

class RetoForIf {
    public static void main(String[] args) {

        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
        for (int i = 1; i <= dimension; i = i + 1) {

        // PATRON NUMERO 1: 

        //         if (
        //         // El código desde aqui *********************************
        //         i==2 && j==2
        //         // El código hasta aquí *********************************
        //         ) {
        //             System.out.print("(*)");
        //         } else {
        //             System.out.print(" . ");
        //         }
        //     }
        //     System.out.println();
        // }

        // PATRON NUMERO 2:

        // if (
        // // El código desde aqui *********************************
        // i == dimension - 19
        // // El código hasta aquí *********************************
        // ) {
        // System.out.print("(*)");
        // } else {
        // System.out.print(" . ");
        // }
        // }
        // System.out.println();
        // }

        // PATRON NUMERO 3:

        // if (
        // // El código desde aqui *********************************
        // j == dimension - 1
        // // El código hasta aquí *********************************
        // ) {
        // System.out.print("(*)");
        // } else {
        // System.out.print(" . ");
        // }
        // }
        // System.out.println();
        // }

        // PATRON NUMERO 4:

        // if (
        // // El código desde aqui *********************************
        // (i == dimension / 2 + 3 || i == dimension / 2 + 4 || i == dimension / 2 + 2 ||i == dimension / 2 + 1 || i == dimension / 2 || i == dimension / 2 - 1 || i
        // == dimension / 2 - 2)
        // // El código hasta aquí *********************************
        // ) {
        // System.out.print("(*)");
        // } else {
        // System.out.print(" . ");
        // }
        // }
        // System.out.println();
        // }

        //PATRON NUMERO 5:

    //             if (
    //             // El código desde aqui *********************************
    //             i==11 && j==11
    //             // El código hasta aquí *********************************
    //             ) {
    //                 System.out.print("(*)");
    //             } else {
    //                 System.out.print(" . ");
    //             }
    //      }
    //      System.out.println();
    //  }

        // PATRON NUMERO 6:

        // if (
        // // El código desde aqui *********************************
        // i == dimension / 2 + 1 || j == dimension / 2 + 1
        // // El código hasta aquí *********************************
        // ) {
        // System.out.print("(*)");
        // } else {
        // System.out.print(" . ");
        // }
        // }
        // System.out.println();
        // }

        // PATRON NUMERO 7:

        // if (
        // // El código desde aqui *********************************
        // (i == j)
        // // El código hasta aquí *********************************
        // ) {
        // System.out.print("(*)");
        // } else {
        // System.out.print(" . ");
        // }
        // }
        // System.out.println();
        // }

        // PATRON NUMERO 8:

        // if (
        // // El código desde aqui *********************************
        // i + j == dimension + 1
        // // El código hasta aquí *********************************
        // ) {
        // System.out.print("(*)");
        // } else {
        // System.out.print(" . ");
        // }
        // }
        // System.out.println();}
        // }

        // PATRON NUMERO 9:

        // if (
        // // El código desde aqui *********************************
        // (i == j) || (i + j == dimension + 1)
        // // El código hasta aquí *********************************
        // ) {
        // System.out.print("(*)");
        // } else {
        // System.out.print(" . ");
        // }
        // }
        // System.out.println();
        // }

        //PATRON NUMERO 10:

            if (
        //El código desde aqui *********************************
        i == 2 || i == dimension - 1 || j == 2 || j == dimension - 1
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