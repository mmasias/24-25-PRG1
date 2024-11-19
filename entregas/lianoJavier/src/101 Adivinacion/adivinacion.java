class adivinacion {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        int resultado = tiraDado(NUMERO_MINIMO, NUMERO_MAXIMO);
        int numeroAAdivinar = tiraDado(NUMERO_MINIMO, NUMERO_MAXIMO);
        daPista(resultado, numeroAAdivinar);
    }

    static int tiraDado(int numeroMinimo, int numeroMaximo) {
        return (int) (Math.random() * (numeroMaximo - numeroMinimo) + numeroMinimo);
    }

    private static void daPista(int resultado, int numeroAAdivinar) {
        String mensaje = "acertó!";
        if (numeroAAdivinar > resultado) {
            mensaje = "es menor";
        } else if (numeroAAdivinar < resultado) {
            mensaje = "es mayor";
        }
        System.out.println(mensaje);
    }
}
