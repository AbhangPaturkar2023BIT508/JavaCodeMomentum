import java.util.Scanner;

public class LRArrayEle {
    public static void main(String[] args) {
        int array[] = { 0, 2, 4, 6, 8, 10 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many number you want to rotate left : ");
        int rotateCount = scan.nextInt();

        for (int i = 0; i < rotateCount; i++) {
            int j, first;
            first = array[0];
            for (j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[j] = first;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        scan.close();
    }
}
