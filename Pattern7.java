import java.util.Scanner;

public class Pattern7 {
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * * * *
    // * * * * * * *
    // * * * * * * * *
    // * * * * * * *
    // * * * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.err.print("Enter number of rows you want to print : ");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
