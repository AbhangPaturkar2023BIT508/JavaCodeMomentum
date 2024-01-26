import java.util.Scanner;

public class SunnyNumber {
    // N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9.
    // Hence 80 is a sunny number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number to check sunny or not : ");
        int num = scan.nextInt();
        double squareRoot = Math.sqrt(num + 1);
        boolean isInt = (squareRoot - Math.floor(squareRoot) == 0) ? true : false;

        if (isInt) {
            System.out.println("Number is Sunny Number");
        } else {
            System.out.println("Number is not Sunny Number");
        }

        scan.close();
    }
}
