public class JuegosFor {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.println("*".repeat(i));
            }
            System.out.println();
        }
/*       
        //While
 
        int i=0;
        while (i<10){
            ....
            ....
            i=i+1;
        }

        //Do while
        int i=500;
        do {
            .....
            i=i+1;
        }while(i<10);
*/
    }
}
