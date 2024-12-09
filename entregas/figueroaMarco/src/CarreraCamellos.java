import java.util.Scanner;
class CarreraCamellos {


    public static void main(String[] args) {
        boolean enCarrera = true;
        int turno = 0;
        int avance = 0;

        int Po
        
        Scanner input = new Scanner(System.in);
            while (enCarrera) {
                turno++;

                int inputUsuario = input.nextInt();
                double probablidad = Math.random();

                if (inputUsuario == 1 && probablidad<=0.6) {avance=1;} else
                if (inputUsuario == 1 && probablidad<=0.4) {avance=2;} else
                if (inputUsuario == 1 && probablidad<=0.3) {avance=4;} else
                if (inputUsuario == 1 && probablidad<=0.1) {avance=6;} else
            }
        }
    
}