import java.util.Random;
import javax.swing.JOptionPane;
class interactiverps{
    public static void main(String[] args) {
        Object[] items = { "Rock", "Paper", "Sissors" };
        String[] results = {"Win!","Lose","Draw"};
        int victories = 0;
        int loses = 0;
        int games = 0;
        String pluralLoss = "Loss";

            while (victories < 3){
                JOptionPane.showInputDialog(null,"Rock Paper Sissors!", "Input",JOptionPane.QUESTION_MESSAGE, null,items, items[0]);
                java.util.Random random = new java.util.Random();
                int choice = random.nextInt(results.length); 
                System.out.println(results[choice]);
                System.out.println("choice: "+choice);
                
                if (choice == 0) {
                    victories= victories+1;
                 System.out.println("vic: "+victories);
                }
                if (choice == 1) {
                     loses= loses+1;
                    System.out.println("los: "+loses);
                }
                JOptionPane.showMessageDialog(null, results[choice], "results", 2);
                games=games+1;
                
            }
        if (loses>1){
            pluralLoss = "Loses";
        }
        JOptionPane.showMessageDialog(null, "You WIN!!!\n["+3+"] Wins and \n["+loses+"] "+pluralLoss+" \n in ["+games+"] games", null, 1);
            }
            }
        
    
