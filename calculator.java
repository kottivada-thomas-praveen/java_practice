import java.util.Scanner;

public class calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        calculator operation = new calculator();

        System.out.println("Enter the Mode of calculation :");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        int input = userInput.nextInt();

        if (input == 1) {
            System.out.println("Enter the two numbers to add:\nfirst Number: ");
            int addInput = userInput.nextInt();
            System.out.println("Enter the second Number:");
            int addInput2 = userInput.nextInt();

            int result = operation.add(addInput, addInput2);
            System.out.printf("%d + %d = "+result,addInput,addInput2);
        }

        else if (input == 2) {
            System.out.println("Enter the two numbers to Subtract:\nfirst Number: ");
            int addInput = userInput.nextInt();
            System.out.println("Enter the second Number:");
            int addInput2 = userInput.nextInt();

            int result = operation.sub(addInput, addInput2);
            System.out.printf("%d - %d = "+result,addInput,addInput2);
        }

        else if (input == 3) {
            System.out.println("Enter the two numbers to Multiply:\nfirst Number: ");
            int addInput = userInput.nextInt();
            System.out.println("Enter the second Number:");
            int addInput2 = userInput.nextInt();

            int result = operation.mul(addInput, addInput2);
            System.out.printf("%d * %d = "+result,addInput,addInput2);
        }

        else if (input == 4) {
            System.out.println("Enter the two numbers to Divide:\nfirst Number: ");
            int addInput = userInput.nextInt();
            System.out.println("Enter the second Number:");
            int addInput2 = userInput.nextInt();

            if (addInput == 0 || addInput2 == 0) {
                System.err.println("Cannot divisible by 0");
            }

            else{
                int result = operation.div(addInput, addInput2);
            System.out.printf("%d / %d = "+result,addInput,addInput2);
            }
        }

        else {
            System.out.println("Invalid selection... \nPlease enter the above operations (1-4)");
        }

        userInput.close();

    }
}
