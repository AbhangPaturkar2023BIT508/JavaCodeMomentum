public class Main {
    static int findMissingNumber(int[] arr, int n) {
        int total = (n + 1) * (n + 2) / 2;
        for (int num : arr) {
            total -= num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println("Missing number: " + findMissingNumber(numbers, n));
    }
}
