

public class loooooool {
    public static void main(String[] args) {
        int cara = 0;
        int cruz = 0;
        System.out.println("Volado");

        for(int i = 1;i<=10; i++){
            int res = (int)(Math.random()*2);
            if(res == 0){
                System.out.println("Tu resultado es "+ cara);
                cara++;
            }else{
                System.out.println("Te salio"+ cruz);
                cruz++;
            }


        }
        System.out.println("Cara salioo un total de " + cara);
        System.out.println("Cruz salio un total de " + cruz);
    }
}
