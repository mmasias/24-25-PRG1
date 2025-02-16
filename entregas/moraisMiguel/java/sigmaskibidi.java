import java.util.Scanner;
class sigmaskibidi{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        String categoria;

        int puntos;

        puntos = input.nextInt();

        switch(puntos){

            case 1:
                categoria = "uno";
                break;
            case 2:
                categoria = "dos";
                break;
            default:
                categoria = "valor erroneo";
        }

        System.out.println(categoria);

    }
}