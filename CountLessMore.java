// Given a sorted array Arr of size N and a value X, find the number of array elements 
// less than or equal to X and elements more than or equal to X. 

public class CountLessMore {

    int[] getMoreAndLess(int[] arr, int n, int x) {
        int a[] = new int[2];
        int lessCount = 0, moreCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                lessCount++;
            }
            if (arr[i] >= x) {
                moreCount++;
            }
        }

        a[0] = lessCount;
        a[1] = moreCount;

        return a;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        int n = 7, x = 9;

        CountLessMore obj = new CountLessMore();
        int a[] = obj.getMoreAndLess(arr, n, x);

        for (int i = 0; i < 2; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
