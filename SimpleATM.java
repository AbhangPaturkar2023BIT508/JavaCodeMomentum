import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 1000, withdraw = 0, deposit = 0, choice = 0;
        while (true) {

            System.out.println("1. Withdraw\n2. Deposit\n3. Balance Check\n4. Exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw : ");
                    withdraw = scan.nextInt();
                    if (withdraw > 0 && balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please Collect Your Money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to Deposit : ");
                    deposit = scan.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Your Money has been successfully Deposited");
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance : " + balance);
                    break;

                case 4:
                    System.exit(0);
            }

        }

    }
}
