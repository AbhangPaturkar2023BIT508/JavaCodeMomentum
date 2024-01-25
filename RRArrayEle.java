import java.util.Scanner;

public class RRArrayEle {
    public static void main(String[] args) {
        int array[] = { 0, 2, 4, 6, 8, 10 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many number you want to rotate right : ");
        int rotateCount = scan.nextInt();

        for (int i = 0; i < rotateCount; i++) {
            int j, last;
            last = array[array.length - 1];
            for (j = array.length - 2; j >= 0; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = last;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        scan.close();
    }
}
