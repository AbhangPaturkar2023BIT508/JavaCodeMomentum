import java.util.Scanner;

public class AutomorphicNumber {
    // 5 = 25 -- Automorphic
    // 25 = 125 -- Automorphic
    // 6 = 36 -- Automorphic
    // 8 = 64 -- NotAutomorphic
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number to check Automorphic : ");
        int num = scan.nextInt();
        int square = num * num;
        boolean notAutomorphic = false;
        int tempSquare = square;

        while (num > 0) {
            if (num % 10 != tempSquare % 10) {
                notAutomorphic = true;
            }
            num = num / 10;
            tempSquare = tempSquare / 10;
        }
        System.out.println("Square is " + square);
        if (notAutomorphic) {
            System.out.println("Number is not An Automorphic");
        } else {
            System.out.println("Number is An Automorphic");
        }

        scan.close();
    }
}
