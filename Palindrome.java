import java.util.Scanner;

public class Palindrome {

    static int numberPalindrome(int num) {
        int temp = num, palNum = 0;
        while (num > 0) {
            int digit = num % 10;
            palNum = palNum + (10 * digit);
            num = num / 10;
        }

        if (temp == palNum) {
            return temp;
        } else {
            return 0;
        }
    }

    static String stringPalindrome(String str) {
        String temp = str, palStr = "";
        int strLen = temp.length();
        for (int i = strLen - 1; i >= 0; i--) {
            palStr = palStr + temp.charAt(i);
        }

        if (temp.equals(palStr)) {
            return temp;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        System.err.println("1. Number Palindrome \t 2. String Palindrome");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Number : ");
                int num = scan.nextInt();
                int palNum = numberPalindrome(num);
                if (palNum != 0) {
                    System.out.println("Entered Number is Palindrome...");
                } else {
                    System.out.println("Entered Number is not a Palindrome...");
                }
                break;

            case 2:
                scan.nextLine();
                System.out.println("Enter String : ");
                String str = scan.nextLine();
                String palStr = stringPalindrome(str);
                if (palStr != null) {
                    System.out.println("Entered String is Palindrome...");
                } else {
                    System.out.println("Entered String is not a Palindrome...");
                }
                break;
        }
    }
}
