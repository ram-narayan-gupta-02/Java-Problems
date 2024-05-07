import java.util.*;

// Error and Exception***

class CanNotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Can not Devide by zero(0)";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Max input Exception because fix length is 100000 number()";
    }
}
class MaxMultiplyException extends Exception{
    @Override
    public String toString(){
        return "Max input Exception because fix length is 100000 number()";
    }
}

// Methods of custom calculator***

class custom_calculator{
    double Add(double a, double b) throws MaxInputException {
        if (a >= 100000 || b >= 100000){
            throw new MaxInputException();
        }
        return a + b;
    }

    double Sub(double a, double b) throws MaxInputException {
        if (a >= 100000 || b >= 100000){
            throw new MaxInputException();
        }
        return a - b;
    }

    double Mul(double a, double b) throws MaxInputException {
        if (a >= 100000 || b >= 100000 && a*b >= 100000){
            throw new MaxInputException();
        }
        return a * b;
    }

    double Div(double a, double b) throws MaxInputException, CanNotDivideByZeroException {
        if(b == 0){
            throw new CanNotDivideByZeroException();
        }
        if (a >= 100000 || b >= 100000){
            throw new MaxInputException();
        }
        return a / b;
    }

    double Mod(double a, double b) throws MaxInputException {
        if (a >= 100000 || b >= 100000){
            throw new MaxInputException();
        }
        return a % b;
    }
}

// Methods calling***

public class calculator_with_error_excecption {
    public static void main(String[] args) throws MaxInputException, CanNotDivideByZeroException{
        Scanner sc = new Scanner(System.in);

        // System.out.print("Select only one option.\n1. Addition\n2. Subtraction\n3.
        // Multiplication\n4. Divition\n");

        while (true) {
            System.out.print(
                    "1. Press 1 for Addition.\n2. Press 2 for Subtration.\n3. Press 3 for Multiplication.\n4. Press 4 for Divition.\n5. Press 5 for Modulus.\nChoose your choice : ");
            int choice = sc.nextInt();

            if (choice >= 6) {
                System.out.println("Sorry! your choice is greater than 4 so you're exit the loop.....");
                break;
            }

            System.out.print("Entetr number first : ");
            double num1 = sc.nextDouble();
            System.out.print("Entetr number second : ");
            double num2 = sc.nextDouble();

            if (choice == 1) {
                custom_calculator t1 = new custom_calculator();
                System.out.println("The Sum of two number : " + t1.Add(num1, num2));
            } else if (choice == 2) {
                custom_calculator t2 = new custom_calculator();
                System.out.println("The Subtarct of two number : " + t2.Sub(num1, num2));
            } else if (choice == 3) {
                custom_calculator t3 = new custom_calculator();
                System.out.println("The Mulitilication of two number : " + t3.Mul(num1, num2));
            } else if (choice == 4) {
                custom_calculator t4 = new custom_calculator();
                System.out.println("The Divition of two number : " + t4.Div(num1, num2));
            } else if (choice == 5) {
                custom_calculator t5 = new custom_calculator();
                System.out.println("The Modulus of two number : " + t5.Mod(num1, num2));
            }

            System.out.print("Let's do next calculation? [YES(1)/NO(0)] : ");
            int Next_cal = sc.nextInt();
            if (Next_cal == 0) {
                break;
            }
        }
        sc.close();
    }
}