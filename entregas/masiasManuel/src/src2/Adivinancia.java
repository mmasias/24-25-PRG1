import java.util.Scanner;
class Adivinancia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvnido al juego de adivinancia");

        final int MAXIMO = 100;
        final int MINIMO = 0;
        
        
        boolean estaJuagando = true;
        int  turno = 0;
        
        int ordenador = (int)(Math.random()* MAXIMO-MINIMO +1)+MINIMO;
       
        while (estaJuagando) {
            turno++;
            
            System.out.println("Elige un numero enrtre 1y 100 ");
            int usuario = entrada.nextInt();
            System.out.println("Elegiste " + usuario);
            String resultado ;
            resultado = (usuario == ordenador) ? "adivinaste" 
                      : (usuario > MAXIMO) ? "Error "
                      : "No adivinaste";

            System.out.println(resultado); 
            
            
            
            

        }
       
       
        entrada.close();


       }
   }
    
        
            
            
            



    

