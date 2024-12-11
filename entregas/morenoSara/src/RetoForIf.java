public class RetoForIf{

    public static void main (String[] args){
        
        int dimension = 21;
        String figura;
        
        for(int j=1; j <= dimension; j = j + 1){
            for(int i = 1; i <= dimension; i = i + 1){
                if(
                    j==2
                ){
                    figura = "(*)";
                } else {
                    figura = ".";
                }
                System.out.println(figura);
            }
            System.out.println();
        }
    }
}