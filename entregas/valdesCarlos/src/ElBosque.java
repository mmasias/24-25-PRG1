import java.util.Scanner;
class ElBosque{
    public static void main(String[] args){
    
        int exploradores = 3;
        int raciones = 50;
        int dia = 0;

        final int MAXIMA_RACION = 1;
        final int MINIMA_RACION = 5;
        final double PROBABILIDAD_RACIONES = 0.5;
        final double PROBABILIDAD_EXPLORADOR_PERDERSE = 0.2;

        boolean estanVivos = true;
        darBienvenida(exploradores, raciones);

        while(estanVivos){
            dia++;
            System.out.println("Dia: "+ dia);
            raciones = raciones-exploradores;
            if(Math.random() < PROBABILIDAD_RACIONES){
                int racionesEncontradas = (int)(Math.random()*(MAXIMA_RACION-MINIMA_RACION+1)+MINIMA_RACION);
                System.out.println("Se han encontrado " + racionesEncontradas + " raciones en el día " + dia);
            } else{
                System.out.println("No se han encontrado raciones");
            }

            if(Math.random() < PROBABILIDAD_EXPLORADOR_PERDERSE){
                exploradores -= 1;
                System.out.println("Se ha perdido un explorador en el día " + dia);
            } else{
                System.out.println("No se ha perdido ningun explorador");
            }

            mostrarEstado(exploradores, raciones);
            estanVivos = exploradores > 0 && raciones >= exploradores;
            System.out.println("--------------------------");
        }
        
    }

    static void darBienvenida(int exploradores, int raciones){
        System.out.println("Bienvenidos al juego de supervivencia en el bosque");
        System.out.println("Comienza el juego con " + exploradores + " exploradores y con " + raciones + " raciones" );

    }

    static void mostrarEstado(int exploradores, int raciones) {
        System.out.println("Estado actual:");
        System.out.println("Exploradores: " + exploradores);
        System.out.println("Raciones: " + raciones);
    }
}
