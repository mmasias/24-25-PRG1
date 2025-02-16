package RetosForIf;
class RetoForIf15 {
    public static void main(String[] args) {

        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if ( 
                  i==2 || j==2 || i==3 || j==3 || i==4 || j==4 || i==5 || j==5
                  
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