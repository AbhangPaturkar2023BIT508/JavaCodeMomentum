import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("How many number you want to print : ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i = 1; i <= x; i++) {
            int num = i;
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count <= 2) {
                System.out.print(i + " ");
            }
        }
    }
}