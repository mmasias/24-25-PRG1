class JuegosFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("/".repeat(10)); 
            }
        }

        int i = 0;
        while (i < 10) {
            i = i + 1;
        }

        i = 0;
        do {
            i = i + 1;
        } while (i < 10);
    }
}
