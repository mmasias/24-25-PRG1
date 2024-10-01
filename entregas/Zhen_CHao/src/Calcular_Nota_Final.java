public class Calcular_Nota_Final {

    public static void main(String[] args) {

      double  examenFinal;
      double evaluacionContinua;
      double examenParcial ; 
      double evaluacionProfe;

    examenFinal = 9*50;
    evaluacionContinua = 8*20;
    examenParcial = 7*25;
    evaluacionProfe = 3*5;

    double notaFinal = (examenFinal +evaluacionContinua + examenParcial +evaluacionProfe)/100;
    System.out.println("Su nota final es "+notaFinal);

}
}
