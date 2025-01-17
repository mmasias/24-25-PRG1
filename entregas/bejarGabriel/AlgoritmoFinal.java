public class AlgoritmoFinal {
    public static void main(String[] args) {
        int[] numCarnet = {2, 0, 2, 4, 0, 2, 0, 0, 4, 3};
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < carne.length; i++) {
            if (i % 2 == 0){
                sumaPares += carne[i];
            } else{
                sumaImpares += carne [i];
            }
        }
        System.out.println("Suma de los digitos en posiciones pares: " + sumaPares);
        System.out.println("Suma de los digitos en posiciones impares: " + sumaImpares);

        int numero1 = (sumaPares % 6) + 1;
        int numero2 = (sumaImpares % 6) + 1;
        int numero3 = ((sumaPares + sumaImpares) % 6) + 1;
    }
}
