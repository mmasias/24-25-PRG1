package RetosForIf;
class RetoForIf12 {
    public static void main(String[] args) {

        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if ( 
                    i!= 11 && j!=11 // tuve que pedirle ayuda a chatgpt ;(
                    //  i<11 && j<1 || i>11 && j>11 || i>11 && j<11 || i<11 && j>11 aca se me ocurrio hacerlo manual 
                    
                    
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