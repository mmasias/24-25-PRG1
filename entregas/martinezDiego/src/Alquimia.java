import java.util.Scanner;

public class Alquimia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elementosDescubiertos = new String[100];
        elementosDescubiertos[0] = "aire";
        elementosDescubiertos[1] = "agua";
        elementosDescubiertos[2] = "tierra";
        elementosDescubiertos[3] = "fuego";
        int numeroDeElementosDescubiertos = 4;

        String[][] combinaciones = {
            { "aire", "agua", "burbujas" },
            { "aire", "tierra", "polvo" },
            { "aire", "fuego", "chispas" },
            { "agua", "tierra", "barro" },
            { "agua", "fuego", "vapor" },
            { "tierra", "fuego", "cenizas" }
        };

        boolean jugando = true;
        while (jugando) {
            System.out.println("---------------------");
            System.out.println("1. Lista de elementos");
            System.out.println("2. Combinar elementos");
            System.out.println("---------------------");
            
            int eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {
                case 1:
                    System.out.println("Elementos descubiertos: ");
                    System.out.println("------------------------");
                    for (int i = 0; i < numeroDeElementosDescubiertos; i++) {
                        System.out.println(elementosDescubiertos[i]);
                    }
                    System.out.println("------------------------");
                    break;

                case 2:
                    System.out.println("Selecciona el primer elemento:");
                    String primerElemento = scanner.nextLine();
                    System.out.println("Selecciona el segundo elemento:");
                    String segundoElemento = scanner.nextLine();

                    String nuevoElemento = null;
                    for (int i = 0; i < combinaciones.length; i++) {
                        if ((combinaciones[i][0].equals(primerElemento) && combinaciones[i][1].equals(segundoElemento)) ||
                            (combinaciones[i][0].equals(segundoElemento) && combinaciones[i][1].equals(primerElemento))) {
                            nuevoElemento = combinaciones[i][2];
                            break;
                        }
                    }

                    if (nuevoElemento != null) {
                        boolean yaDescubierto = false;
                        for (int i = 0; i < numeroDeElementosDescubiertos; i++) {
                            if (elementosDescubiertos[i].equals(nuevoElemento)) {
                                yaDescubierto = true;
                                break;
                            }
                        }

                        if (!yaDescubierto) {
                            elementosDescubiertos[numeroDeElementosDescubiertos] = nuevoElemento;
                            numeroDeElementosDescubiertos++;
                            System.out.println("Has descubierto un nuevo elemento: " + nuevoElemento);
                        } else {
                            System.out.println("Ya has descubierto este elemento antes.");
                        }
                    } else {
                        System.out.println("La combinación no produjo ningún nuevo elemento.");
                    }
                    break;

                default:
                    jugando = false;
                    break;
            }
        }
        scanner.close();
    }
}

