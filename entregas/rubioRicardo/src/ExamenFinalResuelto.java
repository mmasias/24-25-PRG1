import java.util.Scanner;

class CalcularPreguntas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] matrizCarne = new int[9];
        int sumaPares;
        int sumaImpares;
        int preguntaUno;
        int preguntaDos;
        int preguntaTres;
        
        
        System.out.println("Ingrese el primer digito de su carne: "); 
        (matrizCarne[0])= scanner.nextInt();

        System.out.println("Ingrese el segundo digito de su carne: "); 
        (matrizCarne[1])= scanner.nextInt();

        System.out.println("Ingrese el tercer digito de su carne: "); 
        (matrizCarne[2])= scanner.nextInt();

        System.out.println("Ingrese el cuarto digito de su carne: "); 
        (matrizCarne[3])= scanner.nextInt();

        System.out.println("Ingrese el quinto digito de su carne: "); 
        (matrizCarne[4])= scanner.nextInt();

        System.out.println("Ingrese el sexto digito de su carne: "); 
        (matrizCarne[5])= scanner.nextInt();

        System.out.println("Ingrese el septimo digito de su carne: "); 
        (matrizCarne[6])= scanner.nextInt();

        System.out.println("Ingrese el octavo digito de su carne: "); 
        (matrizCarne[7])= scanner.nextInt();

        System.out.println("Ingrese el noveno digito de su carne: "); 
        (matrizCarne[8])= scanner.nextInt();

        System.out.println("Ingrese el decimo digito de su carne: "); 
        (matrizCarne[9])= scanner.nextInt();

        sumaPares = calcularPar(matrizCarne);
        sumaImpares= calcularImpar(matrizCarne);
        
        preguntaUno = (sumaPares / 6) + 1;
        preguntaDos = (sumaImpares / 6) + 1;
        preguntaTres = ((sumaPares + sumaImpares) / 6) + 1;

        if (preguntaUno == preguntaDos) {
            preguntaDos = preguntaDos + 1;
            
        }

        if (preguntaDos == preguntaTres) {
            preguntaDos = preguntaDos + 1;
            
        }
        System.out.println("tu pregunta numero 1 es: " + preguntaUno);
        System.out.println("tu pregunta numero 2 es: " + preguntaDos);
        System.out.println("tu pregunta numero 3 es: " + preguntaTres);

        
        scanner.close();
       
        
    }

    static int calcularPar(int[] matrizCarne) {
        int suma = matrizCarne[8] + matrizCarne[6] + matrizCarne[4] + matrizCarne[2] +matrizCarne[0];
        return suma;
    }

    static int calcularImpar(int[] matrizCarne) {
        int suma = matrizCarne[9] + matrizCarne[7] + matrizCarne[5] + matrizCarne[3] +matrizCarne[1];
        return suma;
    }
}