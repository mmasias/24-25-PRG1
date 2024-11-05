public class Examen {
    public static void main(String args[]) {
    //candies de cada nino
        int c1 = 0;
      int c2 = 0;
            int c3 = 0;
    
    //bolsas llenas?
        boolean b1 = false;
      boolean b2 = false;
        boolean b3 = false;
    
    //control del edificio
      int p = 1;   //piso actual
        int v = 0;   //casas visitadas
    
      //max candies x bolsa
        int max = 20;
    
        while(true){  //bucle principal del edificio
      System.out.println("\n=== Piso " + p + " ===");
            
        int i = 1;
        while(i <= 4){  //bucle de casas del piso
          v = v + 1;
      System.out.println("\nVisitando casa " + i + " del piso " + p);
                    
        //ver si hay suerte
          double suerte = Math.random() * 100 + 1;
        if((int)suerte <= 70){
      System.out.println("¡La casa está abierta!");
                        
          //nino 1
            if(b1 == false){
        double s2 = Math.random() * 100 + 1;
          if((int)s2 <= 80){
              int n = (int)(Math.random() * 3 + 1);
            c1 = c1 + n;
        System.out.println("Niño 1 recibió " + n + " caramelos");
                                
              if(c1 >= max){ b1 = true; c1 = max;
        System.out.println("¡La bolsa del niño 1 está llena!"); }
            }
          }
                        
        //nino 2
          if(b2 == false){
              double s2 = Math.random() * 100 + 1;
            if((int)s2 <= 80){
        int n = (int)(Math.random() * 3 + 1);
            c2 = c2 + n;
        System.out.println("Niño 2 recibió " + n + " caramelos");
                                
            if(c2 >= max){ b2 = true; c2 = max;
              System.out.println("¡La bolsa del niño 2 está llena!"); }
            }
          }
                        
          //nino 3
        if(b3 == false){
            double s2 = Math.random() * 100 + 1;
          if((int)s2 <= 80){
              int n = (int)(Math.random() * 3 + 1);
            c3 = c3 + n;
        System.out.println("Niño 3 recibió " + n + " caramelos");
                                
            if(c3 >= max){ b3 = true; c3 = max;
              System.out.println("¡La bolsa del niño 3 está llena!"); }
            }
          }
        }
        else{ System.out.println("Casa cerrada, seguimos adelante..."); }
                    
        //si todas las bolsas estan llenas salimos
        if(b1 && b2 && b3){ System.out.println("\n¡Todas las bolsas están llenas! Terminamos la búsqueda."); break; }
                    
          i = i + 1;
        }
                
        //salir si todas las bolsas estan llenas
        if(b1 && b2 && b3){ break; }
                
        //salir si llegamos al ultimo piso
        if(p == 5){ break; }
                
        p = p + 1;
      }
            
      //print final
        System.out.println("\n=== Resultados Finales ===");
      System.out.println("Casas visitadas: " + v);
        System.out.println("Niño 1: " + c1 + " caramelos" + (b1 ? " (Bolsa llena)" : ""));
      System.out.println("Niño 2: " + c2 + " caramelos" + (b2 ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + c3 + " caramelos" + (b3 ? " (Bolsa llena)" : ""));
        }
    }
