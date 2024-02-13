public class SumArrPuzzel {

    public static void SumArray(int arr[], int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    sum += arr[j];
                }
            }
            a[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 1, 2 };
        int s = 5;
        SumArrPuzzel.SumArray(a, s);
        for (int i = 0; i < s; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
