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
		int minutosColaVacia = 0;
		int numeroPersonasAtendidas = 0;
		int numeroItemsVendidos = 0;

		for (tiempo = 0; tiempo < HORAS_ABIERTO * MINUTOS_POR_HORA; tiempo++) {
			boolean colaVacia;
			boolean llegaAlguien = Math.random() <= PROBABILIDAD_DE_LLEGADA;
			if (llegaAlguien) {
				cola++;
			}
			
			boolean caja1Vacia = caja1 == 0;
			colaVacia = cola <= 0;
			if (caja1Vacia && !colaVacia) {
				cola--;
				numeroPersonasAtendidas++;
				caja1 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1)
						+ MINIMOS_ITEMS);
			} else if (!caja1Vacia) {
				caja1--;
				numeroItemsVendidos++;
			}

			boolean caja2Vacia = caja2 == 0;
			colaVacia = cola <= 0;
			if (caja2Vacia && !colaVacia) {
				cola--;
				numeroPersonasAtendidas++;
				caja2 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1)
						+ MINIMOS_ITEMS);
			} else if (!caja2Vacia) {
				caja2--;
				numeroItemsVendidos++;
			}

			boolean caja3Vacia = caja3 == 0;
			colaVacia = cola <= 0;
			if (caja3Vacia && !colaVacia) {
				cola--;
				numeroPersonasAtendidas++;
				caja3 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1)
						+ MINIMOS_ITEMS);
			} else if (!caja3Vacia) {
				caja3--;
				numeroItemsVendidos++;
			}

			boolean caja4Vacia = caja4 == 0;
			colaVacia = cola <= 0;
			if (caja4Vacia && !colaVacia) {
				cola--;
				numeroPersonasAtendidas++;
				caja4 = (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1)
						+ MINIMOS_ITEMS);
			} else if (!caja4Vacia) {
				caja4--;
				numeroItemsVendidos++;
			}
			if (colaVacia && !llegaAlguien) {
				minutosColaVacia++;
			}
			String caja = "[ ] ",
					persona = "_o_ ";

			System.out.println("Tiempo: " + (tiempo / MINUTOS_POR_HORA + HORA_DE_APERTURA < 10 ? (tiempo / MINUTOS_POR_HORA + HORA_DE_APERTURA + "0") : (tiempo / MINUTOS_POR_HORA + HORA_DE_APERTURA) ) + (tiempo % MINUTOS_POR_HORA < 10 ? (tiempo % MINUTOS_POR_HORA + "0") : (tiempo % MINUTOS_POR_HORA))); 
			System.out.println("Cola: " + persona.repeat(cola));
			System.out.println("Caja 1: " + caja.repeat(caja1));
			System.out.println("Caja 2: " + caja.repeat(caja2));
			System.out.println("Caja 3: " + caja.repeat(caja3));
			System.out.println("Caja 4: " + caja.repeat(caja4));
		}
			System.out.println("");
			System.out.println("RESUMEN");
			System.out.println("===============================================");
			System.out.println("Minutos con la cola vacia: " + minutosColaVacia);
			System.out.println("Número de personas en cola al final del día: " + cola);
			System.out.println("Número de personas atendidas hoy: " + numeroPersonasAtendidas);
			System.out.println("Número de items vendidos hoy: " + numeroItemsVendidos);
			System.out.println("===============================================");

	}
}
