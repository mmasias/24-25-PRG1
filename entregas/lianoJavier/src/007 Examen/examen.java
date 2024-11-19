import java.util.Scanner;

class examen {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int configuracion = 1;
		final int examen = 2;
		final int salir = 3;

		final int facil = 1;
		final int normal = 2;
		final int avanzado = 3;

		int primerDigito = 1;
		int segundoDigito = 1;
		int eleccionDificultad = 1;

		System.out.println("=== Menú Inicio ===");
		System.out.println("[1] Configuración");
		System.out.println("[2] Examen");
		System.out.println("[3] Salir");
		System.out.println("Elige una opción: {1, 2 o 3}");

		int eleccionMenu;

		do {
			eleccionMenu = entrada.nextInt();
		} while (!(eleccionMenu >= 1 && eleccionMenu <= 3));

		if (eleccionMenu == configuracion) {

			boolean primerDigitoIncorrecto;

			do {
				System.out.println("Elige un número entre el 2 y el 10");
				primerDigito = entrada.nextInt();
				primerDigitoIncorrecto = !(primerDigito >= 2 && primerDigito <= 10);
				if (primerDigitoIncorrecto) {
					System.out.println("Número fuera del rango.");
					System.out.println("Vuelve a intentar:");
				}
			} while (primerDigitoIncorrecto);

			System.out.println("Seleccione la dificultad:");
			System.out.println("[1] Fácil");
			System.out.println("[2] Normal");
			System.out.println("[3] Avanzado");
			System.out.println("Elige una opción: {1, 2 o 3}");

			boolean eleccionDificultadincorrecta;
			do {
				eleccionDificultad = entrada.nextInt();
				eleccionDificultadincorrecta = !(eleccionDificultad >= 1 && eleccionDificultad <= 3);
			} while (eleccionDificultadincorrecta);

		}

		boolean acierta;
		int minimo;
		int maximo;
		double puntos = 0;
		if (eleccionMenu == examen) {
			System.out.println("Vamos a empezar el examen. ¿Entendido?");
			System.out.println("(Presiona {enter} para continuar)");

			for (int pregunta = 1; pregunta <= 5; pregunta++) {
				System.out.println("Pregunta: " + pregunta);

				if (eleccionDificultad == facil) {
					minimo = 1;
					maximo = 6;
					segundoDigito = (int) (Math.random() * (maximo - minimo + 1) - minimo);
				}

				if (eleccionDificultad == normal) {
					minimo = 1;
					maximo = 10;
					segundoDigito = (int) (Math.random() * (maximo - minimo + 1) - minimo);
				}

				if (eleccionDificultad == avanzado) {
					minimo = 4;
					maximo = 10;
					segundoDigito = (int) (Math.random() * (maximo - minimo + 1) - minimo);
				}

				System.out.println(
						"¿Qué da " + primerDigito + " * " + segundoDigito + " como resultado?");

				acierta = primerDigito * segundoDigito == entrada.nextInt();

				if (acierta) {
					System.out.println("¡Correcto!");
					puntos += 2;
				} else {
					System.out.println("Patinaste. :o Va no te desilusiones. :3");
					puntos -= 0.5;
				}
			}
		}
		System.out.println((puntos > 5 ?  "¡Aprobaste! :3 " :  "¡Más suerte a la proxima :/! ") + "Tuviste un total de " + puntos + " puntos.");

		entrada.close();
	}
}
