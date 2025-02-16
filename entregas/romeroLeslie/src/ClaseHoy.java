public class ClaseHoy {
    public static void main(String[] args) {

        boolean estaContento= Math.random()<=0.5;
        String miAmigo = "Fulano";
        String miAmigo2 = "Fulanito";
        
        saludar(miAmigo, miAmigo2);
        double miPromedio;


        miPromedio = calcularPromedio(examenParcial:4.5,examenFinal:6.5,evaluacionContinua:9.3, profesor:10.0);


        if (estaContento) {
            cantar();
        }else{
            quejarse();
        }
       
        despedirse();

    }

    private static double calcularPromedio (double examenParcial, double examenFinal, double evaluacionContinua, double profesor) {
        double promedio;
        promedio = examenFinal*0.5 + examenFinal*0.24 + evaluacionContinua*0.20 + profesor*0.05;
        return promedio;
    }

    private static void saludar(String aQuien ,String aQuien2){
        System.out.println("Hola  " + aQuien + " y " + aQuien2);
        System.out.println(":) :) :)");
        System.out.println("Es un gran dia");
    }

    
 
    private static void quejarse(){
        System.out.println("Que examen mas compelejo");

    }
    private static void despedirse(){
        System.out.println("Adios mundo cruel");

    }

    private static void cantar(){
          int i;
          for ( i=0;i<10; i++){

          System.out.println("LA LA -");
        }
    }
  
    
 }
