import java.util.Random;
import java.util.Scanner;

/*
rock = 0
paper = 1
scissor = 2
 */

public class rps_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("choose 0 for rock, 1 for paper and 2 for scissor : ");
        int userChoice = sc.nextInt();
        Random rand = new Random();
        int computerChoice = rand.nextInt(2);
        
        if (computerChoice == 0) { 
            System.out.println("computer choose : Rock");
        } else if (computerChoice == 1) {
            System.out.println("computer choose : paper");
        } else if (computerChoice == 2) {
            System.out.println("computer choose : scissor");
        }
            
            if (computerChoice == userChoice) {
                System.out.println("Draw match");
            } else if (computerChoice == 0 && userChoice == 2 || userChoice == 1 && computerChoice == 0
                || userChoice == 2 && computerChoice == 1) {
            System.out.println("You win");
        } else {
            System.out.println("computer win");
        }
        sc.close();


    }
}