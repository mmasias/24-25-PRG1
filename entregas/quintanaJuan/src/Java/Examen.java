public class Examen{
    public static void main(String[] args){
        int [] carnet = {2,0,2,4,0,2,1,2,3,4};

        int sumaImpares = carnet[0] + carnet[2] + carnet[4] + carnet[6] + carnet[8];
        int sumaPares = carnet[1] + carnet[3] + carnet[5] + carnet[7] + carnet[9];

        System.out.println("Suma impares:"+sumaImpares);
        System.out.println("Suma pares:" +sumaPares);

        int pregunta1 = (sumaPares % 6) +1;
        int pregunta2 = (sumaImpares % 6) +1;
        int pregunta3 = ((sumaImpares + sumaPares) %6) +1;

        if( pregunta3 == pregunta2){
            pregunta3= pregunta3 +1;
        }
    
        System.out.println("Pregunta 1º:"+pregunta1);
        System.out.println("Pregunta 2º:"+pregunta2);
        System.out.println("Pregunta 3º:"+pregunta3);
    }
}