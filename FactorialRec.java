import java.util.Scanner;

public class FactorialRec {
    static int factorialRec(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (num * factorialRec(num - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int fact = factorialRec(num);

        System.out.println("Factorial of " + num + " is " + fact);
        scan.close();
    }
}
