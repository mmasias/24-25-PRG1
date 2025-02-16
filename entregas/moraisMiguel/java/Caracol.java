import java.util.Scanner;
class Caracol{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        final int MAXIMO = 41;
        final int MINIMO = 1;
        final int DEPTH = 40;
        final String BASE = "|_____________________|";
        final String TOP = "|_____           _____|";
        final String WALL = "|_:.:.:.:.:.:.:.:.:.:_|";
        final String WATER = "|_###################_|";
        final String SNAIL = "|        _@)_/        |";
        final String CAR = "|_____  ô======ô  _____|";

        int day = 0;
        int waterDepth = 5;
        int snailDepth = (int) (Math.random()*(MAXIMO-MINIMO)+MINIMO);
        boolean carChance = (Math.random()<=0.35);


        System.out.println("el caracol cae " + snailDepth + " metros al inicio");
        System.out.println("profundidad " + snailDepth + " nivel del agua " + waterDepth + " dia " + day);
        System.out.println(carChance?CAR:TOP);

        for(int i=0; i<=DEPTH; i++){

            if(snailDepth==i){
                System.out.println(SNAIL + i);
                i=i+1;
            }

            if(i>DEPTH-waterDepth){
                System.out.println(WATER + i);
            } else {
                System.out.println(WALL + i);
            }     

        }
        System.out.println(BASE);

        do{
            final int MAX_ASCENSION = 4;
            final int MIN_ASCENSION = 1;
            int ascension;
            ascension = (int) ((Math.random()*(MAX_ASCENSION - MIN_ASCENSION + 1))+ MIN_ASCENSION);

            int ascensionUpdate;
             ascensionUpdate
                    = day == 10 && ascension > 3 ? 3
                            : day == 20 && ascension > 2 ? 2
                                    : ascension;

            final int MAX_DESCENT = 2;
            final int MIN_DESCENT = 0;
            int descent;
            descent = (int) ((Math.random()*(MAX_DESCENT - MIN_DESCENT + 1)) + MIN_DESCENT);
    }while(day<50);
    }
}