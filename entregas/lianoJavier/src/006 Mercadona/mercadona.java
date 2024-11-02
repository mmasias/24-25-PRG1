class mercadona {
	public static void main(String[] args) {
		final int MINUTOS_POR_HORA = 60;
		final int HORA_DE_APERTURA = 9;
		final int HORAS_ABIERTO = 12;
		final double PROBABILIDAD_DE_LLEGADA = 0.4;
		final int MINIMOS_ITEMS = 5, MAXIMOS_ITEMS = 15;

		int cola = 0;
		int tiempo;
		int caja1 = 0;
		int caja2 = 0;
		int caja3 = 0;
		int caja4 = 0;

		for (tiempo = 0; tiempo > HORAS_ABIERTO * MINUTOS_POR_HORA; tiempo++) {
			boolean colaVacia = cola == 0;
			boolean llegaAlguien = Math.random() <= PROBABILIDAD_DE_LLEGADA;
			if (llegaAlguien) {
				cola++;
			}

			boolean caja1Vacia = caja1 == 0;
			if (caja1Vacia && !colaVacia) {
				cola--;
				caja1 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1) - MINIMOS_ITEMS);
			}

			boolean caja2Vacia = caja2 == 0;
			if (caja2Vacia && !colaVacia) {
				cola--;
				caja2 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1) - MINIMOS_ITEMS);
			}

			boolean caja3Vacia = caja3 == 0;
			if (caja3Vacia && !colaVacia) {
				cola--;
				caja3 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1) - MINIMOS_ITEMS);
			}

			boolean caja4Vacia = caja4 == 0;
			if (caja4Vacia && !colaVacia) {
				cola--;
				caja4 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1) - MINIMOS_ITEMS);
			}
		}

	}
}
