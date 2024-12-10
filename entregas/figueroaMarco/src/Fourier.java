import java.util.Scanner;

class Fourier {
    public static void main(String[] args) {
        final int CANTIDAD_RECTANGULOS_INTEGRAL = 1000;
        System.out.println("Ingresa el limite de integracion alto:");
        int limiteIntegracionAlto = pedirNumeroUsuario();
        System.out.println("Ingresa el limite de Integracion bajo");
        int limiteIntegracionBajo = pedirNumeroUsuario();
        double largoDeRectangulos = (limiteIntegracionAlto - limiteIntegracionBajo) / CANTIDAD_RECTANGULOS_INTEGRAL;
        double valorInicial = 0.5 * (calcularFuncion(limiteIntegracionBajo) + calcularFuncion(limiteIntegracionAlto));
        double valorSiendoOperado = 0.0;
        double valorDeRegla = 0.0;
        for(int i = 0;i < largoDeRectangulos; i++ ){
            valorSiendoOperado += valorInicial + calcularFuncion(limiteIntegracionBajo + i) / largoDeRectangulos;
        }
        valorDeRegla = valorSiendoOperado + valorInicial;

        System.out.println("El valor de la integral es de:" + valorDeRegla);

    }

    public static double calcularFuncion(int numeroAEvaluar) {
        int valorOperado = numeroAEvaluar;
        double funcion = 5 * (Math.sin(valorOperado / 1.59) + 0.33 * Math.sin((3 * valorOperado) / 1.59) + 0.2 * Math.sin((5 * valorOperado) / 1.59));
        return funcion;
    }

    public static int pedirNumeroUsuario() {
        System.out.println("Ingresa el numero solicitado anteriormente");
        Scanner input = new Scanner(System.in);
        int numeroUsuario = input.nextInt();

        input.close();
        return numeroUsuario;
    }

    
}