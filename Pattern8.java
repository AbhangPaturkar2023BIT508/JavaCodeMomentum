import java.util.Scanner;

public class Pattern8 {
    // _________*
    // ________**
    // _______***
    // ______****
    // _____*****
    // ____******
    // ___*******
    // __********
    // _*********
    // **********
    // _*********
    // __********
    // ___*******
    // ____******
    // _____*****
    // ______****
    // _______***
    // ________**
    // _________*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows you want to print : ");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print("_");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }

            for (int k = rows - 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
