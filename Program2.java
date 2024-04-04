import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        char ch;
        int f = 1, num;
        int[] arr = new int[10];
        int arrSum = 0;
        int rows, cols;
        int[][] matrix1 = new int[100][100];
        int[][] matrix2 = new int[100][100];
        int[][] sum = new int[100][100];

        do {
            System.out.println("1. Factorial\n2. Array Element Sum\n3. Matrix Addition\n4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Factorial
                    System.out.println("--FACTORIAL--");
                    System.out.print("Enter a Number: ");
                    num = scanner.nextInt();

                    for (int i = 1; i <= num; i++) {
                        f *= i;
                    }

                    System.out.println("Factorial of " + num + " is " + f);
                    break;

                case 2: // Array Element Sum
                    System.out.println("--ARRAY ELEMENT SUM--");
                    System.out.println("Enter 10 elements for the array:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Enter arr[" + i + "]: ");
                        arr[i] = scanner.nextInt();
                    }

                    for (int value : arr) {
                        arrSum += value;
                    }

                    System.out.println("The sum of all the entered elements is " + arrSum);
                    break;

                case 3: // Matrix Addition
                    System.out.println("--MATRIX ADDITION--");
                    System.out.print("Enter the number of rows: ");
                    rows = scanner.nextInt();
                    System.out.print("Enter the number of columns: ");
                    cols = scanner.nextInt();

                    System.out.println("Enter elements of the first matrix:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print("Enter element (" + (i + 1) + ", " + (j + 1) + "): ");
                            matrix1[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Enter elements of the second matrix:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print("Enter element (" + (i + 1) + ", " + (j + 1) + "): ");
                            matrix2[i][j] = scanner.nextInt();
                        }
                    }

                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            sum[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }

                    System.out.println("Sum of the matrices:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(sum[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4: // Exit
                    break;

                default: // Default
                    System.out.println("Invalid Choice...!");
            }
            System.out.print("\nDo you want to repeat (Y | N): ");
            ch = scanner.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
    }
}
