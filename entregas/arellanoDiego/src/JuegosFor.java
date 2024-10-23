class JuegosFor {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("/"); 
            }
            System.out.println(); 
        }

       
        int i = 0;
        while (i < 10) {
            System.out.println("Valor de i en while: " + i);
            i = i + 1; 
        }

       
        i = 500;
        do {
            System.out.println("Valor de i en do-while: " + i);
            i = i + 1;
        } while (i < 510);
    }
}
