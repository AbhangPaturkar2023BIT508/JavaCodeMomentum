import java.util.Scanner;

class Bank {
    private long accNo;
    private String custName;
    private String bankName;
    private String accType;
    private float balance;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bank Name      : ");
        bankName = scanner.nextLine();
        System.out.print("Enter Customer Name  : ");
        custName = scanner.nextLine();
        System.out.print("Enter Account Number : ");
        accNo = scanner.nextLong();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Account Type   : ");
        accType = scanner.nextLine();
        System.out.print("Enter Amount         : ");
        balance = scanner.nextFloat();
        System.out.println("\nAccount Created Successfully");
    }

    public void printData() {
        System.out.println("\nBank Name            : " + bankName);
        System.out.println("Customer Name        : " + custName);
        System.out.println("Account Number       : " + accNo);
        System.out.println("Account Type         : " + accType);
        System.out.println("Available Balance    : " + balance);
    }

    public void creditAmt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Your Account Number    : ");
        long acNo = scanner.nextLong();
        if (acNo == accNo) {
            System.out.print("Enter Amount to Credit       : ");
            float amt = scanner.nextFloat();
            if (amt > 0) {
                balance += amt;
                System.out.println("Amount Credited Successfully...");
                System.out.println("Available Balance : " + balance);
            } else {
                System.out.println("Please Enter Valid Amount");
            }
        } else {
            System.out.println("Account Number Not Match..!!");
        }
    }

    public void debitAmt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Your Account Number    : ");
        long acNo = scanner.nextLong();
        if (acNo == accNo) {
            System.out.print("Enter Amount to Debit : ");
            float amt = scanner.nextFloat();
            if (amt > 0 && amt < balance - 2000) {
                balance -= amt;
                System.out.println("Amount Debited Successfully...");
                System.out.println("Available Balance : " + balance);
            } else {
                if (amt < 0) {
                    System.out.println("Please Enter Valid Amount");
                } else {
                    System.out.println("Insufficient Balance to Debit");
                }
            }
        } else {
            System.out.println("Account Number Not Match..!!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank obj = new Bank();
        int choice;

        do {
            System.out.println("\n1.Create Account");
            System.out.println("2.Display Details");
            System.out.println("3.Credit Amount");
            System.out.println("4.Debit Amount");
            System.out.println("5.Exit");
            System.out.print("\nEnter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    obj.getData();
                    break;
                case 2:
                    obj.printData();
                    break;
                case 3:
                    obj.creditAmt();
                    break;
                case 4:
                    obj.debitAmt();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter Valid Choice...!");
            }
        } while (choice != 5);
    }
}
