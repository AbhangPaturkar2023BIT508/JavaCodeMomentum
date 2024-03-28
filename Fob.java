public class Main {
    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        int count = 10;
        fibonacci(count);
    }
}
