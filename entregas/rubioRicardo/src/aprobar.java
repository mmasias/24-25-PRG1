import java.util.Scanner;
 class aprobar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        boolean isGradeApproved;
        boolean isGradeValid;

        System.out.println("Ingresa la calificación:");
        grade = scanner.nextInt();
        scanner.nextLine();

        isGradeApproved = grade >= 5;
        isGradeValid = grade <= 0 || grade >= 10;

        if(isGradeValid) {
            System.out.println("numero no valido");
        } else if (isGradeApproved){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobada");
        }

        scanner.close();
        
    }
    
 }
