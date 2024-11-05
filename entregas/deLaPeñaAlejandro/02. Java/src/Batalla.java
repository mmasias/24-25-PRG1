import java.util.Scanner;

class Batalla {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int poderGuerrero = 20, poderVampiro = 10;
        int ataqueGuerrero = 2, ataqueVampiro = 4;
        double exitoGuerrero = 0.5, exitoVampiro = 0.5;

        int turno = 0;
        boolean viven = (poderGuerrero * poderVampiro) > 0;

        while(viven){
            turno++;

            poderVampiro = poderVampiro - (Math.random()<exitoGuerrero?ataqueGuerrero:0);
            poderGuerrero = poderGuerrero - (Math.random()<exitoVampiro?ataqueVampiro:0);

            System.out.println("Turno [" + turno + "]: HP Guerrero [" + poderGuerrero + "] - HP Vampiro [" + poderVampiro + "]");

            viven = (poderGuerrero * poderVampiro) > 0;
            entrada.nextLine();
        }

        System.out.println("Ha ganado el " + (poderGuerrero>poderVampiro?"Guerrero":"Vampiro"));

        entrada.close();
    }
}