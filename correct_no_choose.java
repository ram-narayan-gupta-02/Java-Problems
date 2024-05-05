import java.util.Random;
import java.util.Scanner;

public class correct_no_choose {
    public static void main(String[] args) {

        System.out.println("Please Enter your choice between from 1 to 200");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        // random number genrate 1 to 200
        int computerChoice = rand.nextInt(1, 200);
        // System.err.println("computer choice : " + computerChoice);
        System.out.print("Take number form user : ");

        // take user input
        int userChoice = sc.nextInt();

        int count = 1;

        if (computerChoice == userChoice) {
            System.out.println("User won!!! number of try chances : " + count);
        } else if (computerChoice > userChoice) {
            System.out.println("Enter greater number please!!!");
        } else if (computerChoice < userChoice) {
            System.out.println("Enter smaller number please!!!");
        }

        while (computerChoice > userChoice || computerChoice < userChoice) {
            
            count+=1;

            System.out.print("Enter number : ");
            userChoice = sc.nextInt();

            if (computerChoice > userChoice) {
                System.out.println("Enter greater number please!!!");
            } else if (computerChoice < userChoice) {
                System.out.println("Enter smaller number please!!!");
            } else {
                System.out.println("user won!!!");
            }
        }
        System.out.println("total number of try chances : " + count);
        sc.close();
    }
}
