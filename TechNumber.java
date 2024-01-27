import java.util.Scanner;

public class TechNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to check techNum or not : ");
        int num = scan.nextInt();
        int tempNum = num;
        int digitCount = 0;
        int squareOfSum = 0;

        while (tempNum > 0) {
            tempNum = tempNum / 10;
            digitCount++;
        }

        if (digitCount % 2 == 0) {
            tempNum = num;
            int firstHalf = tempNum / (int) Math.pow(10, digitCount / 2);
            int secondHalf = tempNum % (int) Math.pow(10, digitCount / 2);
            squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
        }

        if (num == squareOfSum) {
            System.out.println("Number is TechNumber");
        } else {
            System.out.println("Number is Not TechNumber");
        }
        scan.close();
    }
}
