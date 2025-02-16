import java.util.Scanner;

public class Herradura {
    static int puntuacion1 = 0, puntuacion2 = 0;

    
    public static void main(String[] args) {
    int numeroLanzamientos = 1;
    int maximo=50;
    String nombreJugador1 = "Naneh";
    String nombreJugador2 = "Armand";
    int tramo1 = 0, tramo2 = 0;
     
      do {
        tramo1 = probabilidadAcierto();
        tramo2 = probabilidadAcierto();
        ganador(tramo1,tramo2);
        System.out.println("Lanzamiento N." + 
        numeroLanzamientos+": "+ nombreJugador1 + "[Tramo "+tramo1+"]"+
        " "+ nombreJugador2 + "[Tramo "+ tramo2 + "]");
        System.out.println(nombreJugador1 + "=" +  puntuacion1+" "+ nombreJugador2 + "=" + puntuacion2);
        numeroLanzamientos ++;
        
    }while(puntuacion1<maximo && puntuacion2<maximo);
    if (puntuacion1>=50){
        System.out.println("Ha obtenido el triunfo " + nombreJugador1);
      } else if (puntuacion2>=50){
        System.out.println("Ha obtenido el triunfo " + nombreJugador2);
      }
    }
    public static int probabilidadAcierto(){
        int tramo = 0;
        double probabilidad = Math.random();
        if( probabilidad <0.1 ) {
            tramo=1;
        } else if ( probabilidad<0.22){
            tramo=2;
        
        } else {
            tramo=3; 
        }
        return tramo; 
    }

    public static void ganador (int jugador1, int jugador2){
       
    if ( jugador1 == jugador2){
           puntuacion1 ++;
           puntuacion2 ++;
    } else if ( jugador1> jugador2) {
           puntuacion2=puntuacion2 + (jugador2==1?5:3);
    } else{
           puntuacion1=puntuacion1+ (jugador1==1?5:3);
    }
    }
} 


    
        
        
    
