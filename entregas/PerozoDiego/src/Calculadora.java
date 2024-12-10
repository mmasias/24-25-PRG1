package src;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculadora = true;

        while (calculadora) {
            System.out.println("Selecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            double num1, num2, resultado = 0;

            if (opcion == 1) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("La respuesta de la suma es: " + resultado);
            } else if (opcion == 2) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 - num2;
                System.out.println("La respuesta de la resta es: " + resultado);
            } else if (opcion == 3) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 * num2;
                System.out.println("La respuesta de la multiplicación es: " + resultado);
            } else if (opcion == 4) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La respuesta de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
            } else {
                System.out.println("Por favor, introduce un número válido.");
                continue;
            }
            
            boolean respuestaValida = false;
            while (!respuestaValida) {
                System.out.println("¿Te gustaría seguir utilizando la calculadora?");
                System.out.println("1 = Sí, 2 = No");
                int respuesta = scanner.nextInt();
                if (respuesta == 1) {
                    respuestaValida = true;
                } else if (respuesta == 2) {
                    System.out.println("Gracias por utilizarme.");
                    calculadora = false;
                    respuestaValida = true;
                } else {
                    System.out.println("Por favor pon un número de los indicados.");
                }
            }
        }

        scanner.close();
    }
}
