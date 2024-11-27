import  java.util.Scanner;
class ascensor{
    public static void main(String[] args){
        final int PISOS=10;
        int pisoActual=0;
        int destino=0;
        int diferencia=0;
        String textura="|   |";
        String ascensor="[ "+destino+" ]";
        boolean tieneDestino=false;
        boolean enProgreso=false;
        

        do{
            System.err.println("no hay destino actual..");
            Scanner entrada= new Scanner (System.in);
            System.out.println("a que piso vamo? de 0 a "+PISOS+" :");
            destino=entrada.nextInt();
            System.err.println("destino: "+destino);
            //entrada.close();
            tieneDestino=true;
            enProgreso=true;
        }
        while (tieneDestino=false);

        do{
            if(enProgreso=true){
                for(int i=PISOS;i>pisoActual;){
                    System.out.println(textura+i);
                    i=i-1;
                }
                System.out.println(ascensor+pisoActual);
                
                for(int i=pisoActual;i>0;){
                    System.out.println(textura+i); 
                    i=i-1;
                }
                
                if(destino>pisoActual){
                    pisoActual=pisoActual+1;
                }
                if(destino<pisoActual){
                    pisoActual=pisoActual-1;
                }
                if(pisoActual==destino){
                    tieneDestino=false;
                    System.out.println("Ha llegado al destino!");
                }
            enProgreso=false;
            }
            Scanner seguir = new Scanner(System.in);
            System.out.println("\nPreciona Enter para seguir: ");
            String j=seguir.nextLine();
            enProgreso=true;      
        }
        while(tieneDestino=true);

    }
}