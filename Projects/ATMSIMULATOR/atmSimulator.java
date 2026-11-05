package Projects.ATMSIMULATOR;

import java.util.Scanner;

public class atmSimulator {

    private int balance = 10000;
    public String pinNumber = "1234";

    public void getBalance() {
        System.out.println("Your Balance : " + balance);
    }

    public void depositMoney(int money) {
        balance += money;
        System.out.println("Amount Deposited Sucessfully.....");
        System.out.println("Your Balance : " + balance);
    }

    public void withdrawMoney(int money) {
        balance -= money;
        System.out.println("Amount Withdrawed Sucessfully.....");
        System.out.println("Your Balance : " + balance);
    }

    public void changePIN(String userpin) {
           
            pinNumber = userpin;
            System.out.println("PIN changed Sucessfully.....");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        atmSimulator as = new atmSimulator();
        boolean is_running = true;
        int userInput;
        int depositMoney;
        int withdrawMoney;
        String userpin;

        while (is_running) {
            System.out.println("==== ATM MACHINE ====\n");

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Change PIN");
            System.out.println("5. EXIT");

            System.out.println("Enter the PIN to Access the ATm : ");

            String pin = input.nextLine();

            if (pin == as.pinNumber) {

                System.out.println("choose any options (1-5)");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        as.getBalance();
                        break;

                    case 2:
                        System.out.println("Enter the Money to deposit:");
                        depositMoney = input.nextInt();
                        if (depositMoney > 0) {
                            as.depositMoney(depositMoney);
                        } else
                            System.out.println("cannot be Deposited.\nEnter a amount greater than 0");
                        break;

                    case 3:
                        System.out.println("Enter the Money to Withdrawal:");
                        withdrawMoney = input.nextInt();
                        if (withdrawMoney <= as.balance && withdrawMoney > 0) {
                            as.withdrawMoney(withdrawMoney);
                        } else
                            System.out.println("Insufficient Balance.. \n");
                        break;

                    case 4:
                        System.out.println("Enter the PIN :");
                        userpin = input.nextLine();
                        if (userpin.length() == 4) {
                            as.changePIN(userpin);
                        }
                        break;

                    case 5:
                        is_running = false;
                        break;

                    default:
                        System.out.println("Enter a valid input");
                        break;
                }
            } else {
                System.out.println("Enter the correct PIN to Access ATM");
            }
        }

        input.close();
    }
}