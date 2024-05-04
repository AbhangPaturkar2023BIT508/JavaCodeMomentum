import java.util.Scanner;

class Array {
    public static void display(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int linearSearch(int array[], int key) {
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int findLargest(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public static int findSmallest(int array[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int binarySearch(int array[], int key) {
        if (array.length > 0) {
            int start = 0, end = array.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (array[mid] == key) {
                    return mid;
                }
                if (array[mid] > key) {
                    start = mid + 1;
                } else if (array[mid] < key) {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }

    public static void reverseArray(int array[]) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRightWithCopy(int array[], int startIndex) {
        System.out.println(array.length);
        array = new int[array.length + 1];
        System.out.println(array.length);
        for (int i = array.length - 1; i >= startIndex; i--) {
            array[i + 1] = array[i];
        }
    }

    public static void main(String[] args) {
        System.out.print("How many element you want to store : ");
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        int array[] = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("\nEnter element " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        System.out.print("From which index you have to rotateRight : ");
        // Scanner scan = new Scanner(System.in);
        int ind = scan.nextInt();
        rotateRightWithCopy(array, ind);

        // int ar[] = {};
        // reverseArray(ar);
        display(array);
        // System.out.println(binarySearch(ar, 10));
        // System.out.println(findSmallest(ar));

        // int array[] = new int[1];
        // array[0] = 10;
        // // array[1] = 20;
        // display(array);
        // array = new int[2];
        // array[0] = 10;
        // // array[1] = 20;
        // display(array);
        // array.

    }
}