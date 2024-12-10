public class RetoNuevo {
         public static void main(String[] args) {
            final int NUMERO_MININMO = 1;
            final int NUMERO_MAXIMO = 100;
            final int INTENTOS_MAXIMOS = 10;
    
            Random random = new Random();
            int numeroPensado = random.nextInt(NUMERO_MAXIMO - NUMERO_MININMO + 1) + NUMERO_MININMO;
            int intentos = INTENTOS_MAXIMOS;
            boolean trampaActivada = false;
    
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("¡Bienvenido al juego 'Adivina el número que estoy pensando'!");
            System.out.println("El número está entre " + NUMERO_MININMO + " y " + NUMERO_MAXIMO + ". Tienes " + intentos + " oportunidades para adivinarlo.");
    
            for (int intento = 1; intento <= intentos; intento++) {
                System.out.print("Intento " + intento + ": Introduce un número: ");
                int adivinanza = scanner.nextInt();
    
                if (adivinanza < NUMERO_MININMO || adivinanza > NUMERO_MAXIMO) {
                    System.out.println("Por favor, introduce un número entre " + NUMERO_MININMO + " y " + NUMERO_MAXIMO + ".");
                    intento--;
                    continue;
                }
    
                if (adivinanza == numeroPensado) {
                    System.out.println("¡Felicidades! Adivinaste el número en el intento " + intento + ". 🎉");
                    return;
                }
    
                int diferencia = Math.abs(numeroPensado - adivinanza);
    
                System.out.println(
                        diferencia <= 5 ? "¡Caliente!" :
                        diferencia <= 10 ? "Tibio." : "Frío.");
                System.out.println(adivinanza < numeroPensado ? "Pista: El número es mayor." : "Pista: El número es menor.");
    
                if (diferencia <= 5) {
                    trampaActivada = trampaActivada ? true : false;
                    if (trampaActivada) {
                        int ajuste = random.nextInt(5) + 1;
                        numeroPensado = (numeroPensado + ajuste <= NUMERO_MAXIMO) ? numeroPensado + ajuste : numeroPensado - ajuste;
                        System.out.println("¡Atchís! (El ordenador hizo trampa 😏)");
                        trampaActivada = false;
                    } else {
                        trampaActivada = true;
                    }
                } else {
                    trampaActivada = false;
                }
            }
    
            System.out.println("¡Oh no! No lograste adivinar el número. Era: " + numeroPensado);
        }
    }
        