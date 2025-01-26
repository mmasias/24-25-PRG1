import java.util.Scanner;

class CalculadoraDePreguntas {
    public static void main(String[] args) {
        int numeroCarne = new Scanner(System.in).nextInt();
        int[] digitos = dividirCarne(numeroCarne);
        int[] preguntas = calcularPreguntas(digitos);
        mostrarPreguntas(preguntas);
    }

    static int[] dividirCarne(int numeroCarne) {
        int[] digitos = new int[11];

        for (int i = 1; i < 11; i++) {
            digitos[i] = numeroCarne % 10;
            numeroCarne = numeroCarne / 10;
        }
        return digitos;
    }

    static int[] calcularPreguntas(int[] digitos) {
        int[] preguntas = new int[3];

        preguntas[0] = (sumaPares(digitos) % 6) + 1;

        preguntas[1] = (sumaImpares(digitos) % 6) + 1;
        while (preguntas[0] == preguntas[1]) {
            preguntas[1]++;
            preguntas[1] = (preguntas[1] > 6) ? 1 : preguntas[1];
        }

        preguntas[2] = ((sumaPares(digitos) + sumaImpares(digitos)) % 6) + 1;
        while (preguntas[2] == preguntas[0] || preguntas[2] == preguntas[1]) {
            preguntas[2]++;
            if (preguntas[2] > 6) {
                preguntas[2] = 1;
            }
        }

        return preguntas;
    }

    static int sumaPares(int[] digitos) {
        int suma = 0;
        for (int i = 1; i < digitos.length; i++) {
            suma = suma + ((i % 2) == 0 ? digitos[i] : 0);
        }
        return suma;
    }

    static int sumaImpares(int[] digitos) {
        int suma = 0;
        for (int i = 1; i < digitos.length; i++) {
            suma = suma + ((i % 2) == 0 ? 0 : digitos[i]);
        }
        return suma;
    }

    static void mostrarPreguntas(int[] preguntas) {
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println((i + 1) + "º pregunta: [" + preguntas[i] + "]");
        }
    }

}