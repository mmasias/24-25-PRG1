import java.util.Scanner;

class alchemy{
    public static void main(String[]args){

        // use booleans for unlocks
        // use two ints with switch for selection
        // run the selection process as a separate static
        // run the fusing system on a separate static with a quintillion if checks (I wanna kill myself)

        Scanner input = new Scanner(System.in);

        int seleccion;
        int estado = 0;

        String listaElementos;

        while(estado == 0){

            System.out.println("1.elegir elementos");
            System.out.println("2.combinar");
            System.out.println("3.fin");

            seleccion = input.nextInt();
            estado = seleccion;
        }

        while(estado == 1){

            System.out.println("lista de elementos: ");

            for(int listado = 0; listado < 29; listado++){
                System.out.println(listaElementos);
            }
            
        }
    }

    static void listaElementos(int listado, String listaElementos){

        switch(listado){

            case 1:
                listaElementos = "aire";
            case 2:
                listaElementos = "agua";
            case 3:
                listaElementos = "tierra";
            case 4:
                listaElementos = "fuego";
            default:
                listaElementos = "fin";
            return;
        }
    }
}