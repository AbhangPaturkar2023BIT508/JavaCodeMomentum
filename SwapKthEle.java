// Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.

public class SwapKthEle {
    void swapKth(int arr[], int n, int k) {
        // code here
        for (int i = 0, j = (n - 1); i < n && j >= 0; i++, j--) {
            if (i == (k - 1)) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        int n = 7, k = 3;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        SwapKthEle obj = new SwapKthEle();
        obj.swapKth(arr, n, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
