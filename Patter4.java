import java.util.Scanner;

public class Patter4 {

    // _____*
    // ____* *
    // ___* * *
    // __* * * *
    // _* * * * *
    // * * * * * *
    // _* * * * *
    // __* * * *
    // ___* * *
    // ____* *
    // _____*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of rows : ");
        int rows = scan.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print("_");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("_");
            }
            for (int k = rows - i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}
