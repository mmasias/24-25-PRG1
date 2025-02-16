import java.util.Scanner;
public class AdivinaNumero {
    
      public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        
             final int MIN = 1, MAX = 100, INTENTOS = 10, CALIENTE = 5, TIBIO = 10, LIMITE_TRAMPA = 2, MAX_CAMBIO = 5;
                int numeroPensado = generarNumero(MIN, MAX), intentosRestantes = INTENTOS, intentosCalientes = 0, turno = 0;
                boolean trampaRealizada = false, adivinado = false;
        
                System.out.println("Adivina el número entre " + MIN + " y " + MAX + ". Tienes " + INTENTOS + " intentos.");
        
                while (intentosRestantes > 0 && !adivinado) {
                    turno++;
                    System.out.print("Intentos restantes: " + intentosRestantes + ". Tu intento #" + turno + ": ");
                    int intentoUsuario = scanner.nextInt();
                    intentosRestantes--;
        
                    if (intentoUsuario == numeroPensado) {
                        adivinado = true;
                        System.out.println("¡Felicidades! Adivinaste el número en el intento #" + turno + ".");
                    } else {
                        int diferencia = Math.abs(numeroPensado - intentoUsuario);
                        darPistas(diferencia, CALIENTE, TIBIO);
                        intentosCalientes = diferencia <= CALIENTE ? intentosCalientes + 1 : 0;
        
                        if (intentosCalientes >= LIMITE_TRAMPA && !trampaRealizada) {
                            numeroPensado = hacerTrampa(numeroPensado, MIN, MAX, MAX_CAMBIO);
                            trampaRealizada = true;
                            System.out.println("¡Achoo! El ordenador hace trampa...");
                        }
                    }
                }
        
                if (!adivinado) System.out.println("Te quedaste sin intentos. El número era: " + numeroPensado);
                scanner.close();
            }
        
            static int generarNumero(int min, int max) {
                return (int) (Math.random() * (max - min + 1)) + min;
            }
        
            static void darPistas(int diferencia, int caliente, int tibio) {
                System.out.println(diferencia <= caliente ? "¡Caliente!" : diferencia <= tibio ? "¡Tibio!" : "¡Frío!");
            }
        
            static int hacerTrampa(int numeroPensado, int min, int max, int maxCambio) {
                return Math.max(min, Math.min(max, numeroPensado + (Math.random() < 0.5 ? 1 : -1) * (int) (Math.random() * maxCambio) + 1));
            }
        }