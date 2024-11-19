import java.util.Scanner;

public class Halloween {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      String inputUsuario;

      final int MAX_CARAMELOS = 20;
      final int MAX_PISOS = 4;
      final int MAX_CASAS = 4;
      final double P_ABIERTA = 0.7;
      final double P_CARAMELOS = 0.8;
      final int MAX_CARAMELOS_POR_CASA= 3;
      final int MIN_CARAMELOS_POR_CASA = 1;

      int caramelosNino1 = 0,  caramelosNino2 = 0, caramelosNino3 = 0;
    
      boolean bolsaNino1 = false, bolsaNino2 = false, bolsaNino3 = false;
    
      int pisoActual = 0; 
      int casasVisitadas = 0; 
      int numeroCaramelos;
      double danCaramelos;
      
      do { 
        pisoActual++;
        System.out.println("\n=== Piso " + pisoActual + " ==="); 
        for (int i = 1; i <= MAX_CASAS; i++) {
          casasVisitadas++;
          System.out.println("\nVisitando casa " + i + " del piso " + pisoActual);
         
          double casaAbierta = Math.random();
          if(casaAbierta <= P_ABIERTA) {
            System.out.println("¡La casa está abierta!");
            danCaramelos = Math.random();
            
            if(!bolsaNino1){
              if(danCaramelos <= P_CARAMELOS){
                numeroCaramelos = (int)(Math.random() * (MAX_CARAMELOS_POR_CASA - MIN_CARAMELOS_POR_CASA + 1)) + MIN_CARAMELOS_POR_CASA;
                caramelosNino1 += numeroCaramelos;
                System.out.println("Niño 1 recibió " + numeroCaramelos + " caramelos");      
                if (caramelosNino1 >= MAX_CARAMELOS) { 
                  bolsaNino1 = true;
                  caramelosNino1 = MAX_CARAMELOS; 
                  System.out.println("¡La bolsa del niño 1 está llena!"); 
                }
              } 
            }
                        
            if(!bolsaNino2) {
              if(danCaramelos <= P_CARAMELOS) {
                numeroCaramelos = (int)(Math.random() * (MAX_CARAMELOS_POR_CASA - MIN_CARAMELOS_POR_CASA + 1)) + MIN_CARAMELOS_POR_CASA;
                caramelosNino2 += numeroCaramelos;
                System.out.println("Niño 2 recibió " + numeroCaramelos + " caramelos");          
                if(caramelosNino2 >= MAX_CARAMELOS) { 
                  bolsaNino2 = true;
                  caramelosNino2 = MAX_CARAMELOS;
                  System.out.println("¡La bolsa del niño 2 está llena!"); 
                }
              }
            }
                        
            if(!bolsaNino3) {
              if(danCaramelos <= P_CARAMELOS) {
                numeroCaramelos = (int)(Math.random() * (MAX_CARAMELOS_POR_CASA - MIN_CARAMELOS_POR_CASA + 1)) + MIN_CARAMELOS_POR_CASA;
                caramelosNino3 += numeroCaramelos;
                System.out.println("Niño 3 recibió " + numeroCaramelos + " caramelos");          
                if(caramelosNino3 >= MAX_CARAMELOS) { 
                  bolsaNino3 = true;
                  caramelosNino3 = MAX_CARAMELOS;
                  System.out.println("¡La bolsa del niño 3 está llena!"); 
                }
              }
            }
          }
          else { 
            System.out.println("Casa cerrada, seguimos adelante..."); 
          }
          inputUsuario = scanner.nextLine();
        }             
      } while ((pisoActual <= MAX_PISOS) && !(bolsaNino1 && bolsaNino2  && bolsaNino3));

      if(bolsaNino1 && bolsaNino2 && bolsaNino3) { 
        System.out.println("\n¡Todas las bolsas están llenas! Terminamos la búsqueda.");
      }

      System.out.println("\n=== Resultados Finales ===");
      System.out.println("Casas visitadas: " + casasVisitadas );
      System.out.println("Niño 1: " + caramelosNino1 + " caramelos" + (bolsaNino1 ? " (Bolsa llena)" : ""));
      System.out.println("Niño 2: " + caramelosNino2 + " caramelos" + (bolsaNino2 ? " (Bolsa llena)" : ""));
      System.out.println("Niño 3: " + caramelosNino3+ " caramelos" + (bolsaNino3 ? " (Bolsa llena)" : ""));
    }
}
