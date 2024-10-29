package src;

class RetoForIf {
    public static void main(String[] args) {

        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                // PATRON NUMERO 1:

                // if (
                // // El código desde aqui *********************************
                // i==2 && j==2
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
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
                // (i == dimension / 2 + 3 || i == dimension / 2 + 4 || i == dimension / 2 + 2
                // ||i == dimension / 2 + 1 || i == dimension / 2 || i == dimension / 2 - 1 || i
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

                // PATRON NUMERO 5:

                // if (
                // // El código desde aqui *********************************
                // i==11 && j==11
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }

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

                // PATRON NUMERO 10:

                // if (
                // //El código desde aqui *********************************
                // false
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }

                // PATRON NUMERO 11:

                // if (
                // //El código desde aqui *********************************
                // !(i==11 && j==11)
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                
                // PATRON NUMERO 12:

                // if (
                // //El código desde aqui *********************************
                // !(i == dimension / 2 + 1 || j == dimension / 2 + 1)
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                
                // PATRON NUMERO 13:

                // if (
                // //El código desde aqui *********************************
                // (i == j -1) || (i == j +1)
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                                
                // PATRON NUMERO 14:

                // if (
                // //El código desde aqui *********************************
                // (i == dimension - 19 || j == dimension - 1) || (i == dimension - 1 || j == dimension - 19)
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                                
                // PATRON NUMERO 15:

                // if (
                // //El código desde aqui *********************************
                // (i == dimension / 2 - 8 || i == dimension / 2 - 7 || i == dimension / 2 - 6
                // ||i == dimension / 2 - 5) || ((j == dimension / 2 - 8 || j == dimension / 2 - 7 || j == dimension / 2 - 6
                // ||j == dimension / 2 - 5))
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                                
                // PATRON NUMERO 16:

                // if (
                // //El código desde aqui *********************************
                // !((1==j || 1==i) || (21==j || 21==i))
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                                
                // PATRON NUMERO 17:

                // if (
                // //El código desde aqui *********************************
                // (i == 2 || i == dimension - 1 || j == 2 || j == dimension - 1) && !(i == 1 || i == dimension || j == 1 || j == dimension)
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                                                
                // PATRON NUMERO 18:

                // if (
                // //El código desde aqui *********************************
                // i==1 && j==1 || i==1 && j==2 || i==1 && j==3 || i==1 && j==4 || i==1 && j==5 
                // || 
                // i==2 && j==1 || i==2 && j==2 || i==2 && j==3 || i==2 && j==4 || i==2 && j==5 
                // ||
                // i==3 && j==1 || i==3 && j==2 || i==3 && j==3 || i==3 && j==4 || i==3 && j==5 
                // ||
                // i==4 && j==1 || i==4 && j==2 || i==4 && j==3 || i==4 && j==4 || i==4 && j==5 
                // ||
                // i==5 && j==1 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4 || i==5 && j==5 
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                                                
                // PATRON NUMERO 19:

                // if (
                // //El código desde aqui *********************************
                // (i + j) % 2 == 0
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                                                                        
                // PATRON NUMERO 19 VARIABLE:

                // if (
                // //El código desde aqui *********************************
                // ((i / 2) + (j / 2)) % 2 == 0
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }

                // PATRON NUMERO 20:

                // if (
                // //El código desde aqui *********************************
                // (i + j) % 4 == 0
                // // El código hasta aquí *********************************
                // ) {
                // System.out.print("(*)");
                // } else {
                // System.out.print(" . ");
                // }
                // }
                // System.out.println();
                // }
                
                // PATRON NUMERO 21:

                

                if (
                //El código desde aqui *********************************
                
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

