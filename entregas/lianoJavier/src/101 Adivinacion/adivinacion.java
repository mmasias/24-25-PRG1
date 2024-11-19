

class adivinacion {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        int resultado = tiraDado(NUMERO_MINIMO, NUMERO_MAXIMO);
}

    static int tiraDado(int numeroMinimo, int numeroMaximo) {
        return (int) (Math.random() * (numeroMaximo - numeroMinimo) + numeroMinimo);
    }
}
