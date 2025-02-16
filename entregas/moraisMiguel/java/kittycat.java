import java.util.Scanner;
class kittycat{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        final String life = "BATH!";
        final String bath = "you are a terrible person";
        final String dryCat1 = " A_A";
        final String dryCat2 = "(o.o)";
        final String dryCat3 = " >^<";
        final String shower1 = "  | ";
        final String shower2 = " _|_";
        final String shower3 = " '''";

        int choice;
        int bathCounter = 0;
        int showerCounter = 0;

        System.out.println("life(1) or bath(2) for dry cat?");

        choice = input.nextInt();

        if(choice == 1){
            while(bathCounter<20){
                System.out.println(life);
                bathCounter++;
            }
            System.out.println(shower1);
            System.out.println(shower2);
            while(showerCounter<7){
                System.out.println(shower3);
                showerCounter++;
            }
            
            System.out.println(dryCat1);
            System.out.println(dryCat2);
            System.out.println(dryCat3);
        }

        if(choice == 2){
            System.out.println(bath);
            System.out.println(dryCat1);
            System.out.println(dryCat2);
            System.out.println(dryCat3);
        }

    }
}